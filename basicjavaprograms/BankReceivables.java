import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BankReceivables {
    public static void main(String[] args) {
        // Sample data for HDFC and ICICI receivables
        String hdfcData = "HDFC|1000000";
        String iciciData = "ICICI|750000";

        // Create output files
        String hdfcFileName = "HDFC_Receivables.txt";
        String iciciFileName = "ICICI_Receivables.txt";

        try {
            // Write HDFC data to the output file
            BufferedWriter hdfcWriter = new BufferedWriter(new FileWriter(hdfcFileName));
            hdfcWriter.write(hdfcData);
            hdfcWriter.close();
            System.out.println("HDFC receivables data has been written to " + hdfcFileName);

            // Write ICICI data to the output file
            BufferedWriter iciciWriter = new BufferedWriter(new FileWriter(iciciFileName));
            iciciWriter.write(iciciData);
            iciciWriter.close();
            System.out.println("ICICI receivables data has been written to " + iciciFileName);

        } catch (IOException e) {
            System.err.println("Error occurred while writing the data to the output files.");
            e.printStackTrace();
        }

        // Read the data from the HDFC file using string token
        try {
            System.out.println("\nReading HDFC data from file: " + hdfcFileName);
            StringTokenizer hdfcTokenizer = new StringTokenizer(hdfcData, "|");
            String hdfcBank = hdfcTokenizer.nextToken();
            String hdfcReceivables = hdfcTokenizer.nextToken();
            System.out.println("Bank: " + hdfcBank);
            System.out.println("Receivables: " + hdfcReceivables);
        } catch (Exception e) {
            System.err.println("Error occurred while reading HDFC data.");
            e.printStackTrace();
        }

        // Read the data from the ICICI file using string token
        try {
            System.out.println("\nReading ICICI data from file: " + iciciFileName);
            StringTokenizer iciciTokenizer = new StringTokenizer(iciciData, "|");
            String iciciBank = iciciTokenizer.nextToken();
            String iciciReceivables = iciciTokenizer.nextToken();
            System.out.println("Bank: " + iciciBank);
            System.out.println("Receivables: " + iciciReceivables);
        } catch (Exception e) {
            System.err.println("Error occurred while reading ICICI data.");
            e.printStackTrace();
        }
    }
}
