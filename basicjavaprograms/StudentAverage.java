import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentAverage {

    public static void main(String[] args) {
        String input = "varun,82,83,84\nmike,89,34,64";
        String outputFileName = "average_output.txt";

        try {
            calculateAndWriteAverages(input, outputFileName);
            System.out.println("Averages calculated and written to " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void calculateAndWriteAverages(String input, String outputFileName) throws IOException {
        String[] lines = input.split("\n");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {
            for (String line : lines) {
                String[] parts = line.split(",");
                if (parts.length < 2) {
                    continue; 
                }

                String name = parts[0].trim();
                double sum = 0;
                int count = 0;

                for (int i = 1; i < parts.length; i++) {
                    try {
                        int mark = Integer.parseInt(parts[i].trim());
                        sum += mark;
                        count++;
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid mark: " + parts[i].trim());
                        
                    }
                }

                if (count > 0) {
                    double average = sum / count;
                    bw.write(name + ": " + String.format("%.2f", average));
                    bw.newLine();
                } else {
                    System.err.println("No valid marks found for student: " + name);
                }
            }
        }
    }
}