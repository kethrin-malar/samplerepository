import java.util.ArrayList;
import java.util.List;

class Flight {
    private String flightNumber;
    private String source;
    private String destination;

    public Flight(String flightNumber, String source, String destination) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }
}

public class MergeSortFlight1 {
    public static void main(String[] args) {
        // Create ArrayLists for Indigo, Vistra, and another Indigo
        ArrayList<Flight> indigoFlights = new ArrayList<>();
        ArrayList<Flight> vistraFlights = new ArrayList<>();
        ArrayList<Flight> indigo2Flights = new ArrayList<>();

        // Add Flight objects to the ArrayLists
        indigoFlights.add(new Flight("IN001", "Delhi", "Mumbai"));
        indigoFlights.add(new Flight("IN002", "Mumbai", "Chennai"));

        vistraFlights.add(new Flight("VS001", "Bangalore", "Hyderabad"));
        vistraFlights.add(new Flight("VS002", "Chennai", "Delhi"));

        indigo2Flights.add(new Flight("IN003", "Kolkata", "Mumbai"));
        indigo2Flights.add(new Flight("IN004", "Delhi", "Chennai"));

        // Merge the ArrayLists into one
        ArrayList<Flight> allFlights = new ArrayList<>();
        allFlights.addAll(indigoFlights);
        allFlights.addAll(vistraFlights);
        allFlights.addAll(indigo2Flights);

        // Sort the merged ArrayList using merge sort based on the source field
        mergeSort(allFlights, 0, allFlights.size() - 1);

        // Display the sorted source fields
        for (Flight flight : allFlights) {
            System.out.println(flight.getSource());
        }
    }

    private static void mergeSort(List<Flight> flights, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(flights, left, mid);
            mergeSort(flights, mid + 1, right);
            merge(flights, left, mid, right);
        }
    }

    private static void merge(List<Flight> flights, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        ArrayList<Flight> leftList = new ArrayList<>(flights.subList(left, left + n1));
        ArrayList<Flight> rightList = new ArrayList<>(flights.subList(mid + 1, mid + 1 + n2));

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftList.get(i).getSource().compareTo(rightList.get(j).getSource()) <= 0) {
                flights.set(k++, leftList.get(i++));
            } else {
                flights.set(k++, rightList.get(j++));
            }
        }

        while (i < n1) {
            flights.set(k++, leftList.get(i++));
        }

        while (j < n2) {
            flights.set(k++, rightList.get(j++));
        }
    }
}
