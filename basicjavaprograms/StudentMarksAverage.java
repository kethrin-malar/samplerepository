import java.io.*;
import java.util.Scanner;

public class StudentMarksAverage {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            int[] marks = readMarksFromFile(inputFile);
            double average = calculateAverage(marks);
            writeAverageToFile(outputFile, average);
            System.out.println("Average calculated and written to the output file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static int[] readMarksFromFile(String inputFile) throws IOException {
    int numMarks = 0;
    
    try (Scanner scanner = new Scanner(new File(inputFile))) {
        while (scanner.hasNextInt()) {
            numMarks++;
            scanner.nextInt();
        }
    }

    int[] marks = new int[numMarks];
    
    try (Scanner newScanner = new Scanner(new File(inputFile))) {
        newScanner.useDelimiter("\\D+");
        for (int i = 0; i < numMarks; i++) {
            marks[i] = newScanner.nextInt();
        }
    }

    return marks;
}


    public static double calculateAverage(int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }

    public static void writeAverageToFile(String outputFile, double average) throws IOException {
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            writer.println("Average: " + average);
        }
    }
}
