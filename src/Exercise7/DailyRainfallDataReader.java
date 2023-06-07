package Exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DailyRainfallDataReader {
	public static void main(String[] args) {
        // File where the data are stored
        String fileName = "simpang_ampat.dat";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int totalRainfall = 0;
            int count = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                // Parse the line as an integer
                int data = Integer.parseInt(line);

                totalRainfall += data;
                count++;

                System.out.println("Day " + count + " Rainfall: " + data);
            }

            double average = (double) totalRainfall / count;
            System.out.println("Average Rainfall: " + average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
