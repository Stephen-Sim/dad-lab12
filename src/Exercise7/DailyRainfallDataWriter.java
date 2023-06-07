package Exercise7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DailyRainfallDataWriter {

    public static void main(String[] args) {
        // Daily rainfall data
        int[] dailyRainfalls = new int[] { 0, 0, 4, 1, 0, 6 };

        // File to store the data
        String fileName = "simpang_ampat.dat";

        try {
        	// create the writer object
        	BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        	
            // Write each daily rainfall value to the file
            for (int dailyRainfall : dailyRainfalls) {
                writer.write(Integer.toString(dailyRainfall));
                writer.newLine();
            }

            System.out.println("Data creation completed.");
            
            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}