package linkedlist;
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

        ArrayList<Flight> indigoFlights = new ArrayList<>();
        indigoFlights.add(new Flight("IN001", "Delhi", "Mumbai"));
        indigoFlights.add(new Flight("IN002", "Mumbai", "Chennai"));

        ArrayList<Flight> vistraFlights = new ArrayList<>();
        vistraFlights.add(new Flight("VS001", "Bangalore", "Hyderabad"));
        vistraFlights.add(new Flight("VS002", "Chennai", "Delhi"));

        ArrayList<Flight> indigo2Flights = new ArrayList<>();
        indigo2Flights.add(new Flight("IN003", "Kolkata", "Mumbai"));
        indigo2Flights.add(new Flight("IN004", "Delhi", "Chennai"));

        ArrayList<Flight> allFlights = new ArrayList<>();
        allFlights.addAll(indigoFlights);
        allFlights.addAll(vistraFlights);
        allFlights.addAll(indigo2Flights);

        MergeSortFlight mergeSortFlight = new MergeSortFlight(allFlights);
        mergeSortFlight.sort();

        // Display the sorted source fields
        for (Flight flight : allFlights) {
            System.out.println(flight.getSource());
        }
    }
}

class MergeSortFlight {
    private List<Flight> flights;

    public MergeSortFlight(List<Flight> flights) {
        this.flights = flights;
    }

    public void sort() {
        mergeSort(0, flights.size() - 1);
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
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
