import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CalculateStudentAverages {

    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {
            Map<String, double[]> studentMarks = readStudentMarks(inputFileName);
            Map<String, Double> studentAverages = calculateAverages(studentMarks);
            createOutputFile(outputFileName, studentAverages);
            System.out.println("Averages calculated and written to " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, double[]> readStudentMarks(String fileName) throws IOException {
        Map<String, double[]> studentMarks = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 2) {
                    continue;
                }
                String name = parts[0].trim();
                double[] marks = new double[parts.length - 1];
                for (int i = 1; i < parts.length; i++) {
                    marks[i - 1] = Double.parseDouble(parts[i].trim());
                }
                studentMarks.put(name, marks);
            }
        }
        return studentMarks;
    }

    private static Map<String, Double> calculateAverages(Map<String, double[]> studentMarks) {
        Map<String, Double> studentAverages = new HashMap<>();
        for (Map.Entry<String, double[]> entry : studentMarks.entrySet()) {
            double[] marks = entry.getValue();
            double sum = 0;
            for (double mark : marks) {
                sum += mark;
            }
            double average = sum / marks.length;
            studentAverages.put(entry.getKey(), average);
        }
        return studentAverages;
    }

    private static void createOutputFile(String fileName, Map<String, Double> studentAverages) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, Double> entry : studentAverages.entrySet()) {
                bw.write(entry.getKey() + ": " + String.format("%.2f", entry.getValue()));
                bw.newLine();
            }
        }
    }
}
