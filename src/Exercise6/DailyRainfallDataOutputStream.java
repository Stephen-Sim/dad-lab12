package Exercise6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DailyRainfallDataOutputStream {

	public static void main(String[] args) {
        // Create two Station objects
        Station station1 = new Station(2421003, "Melaka Pindah", "Alor Gajah", new int[] { 0, 0, 0, 0, 0, 2 });
        Station station2 = new Station(2222002, "Durian Tunggal", "Alor Gajah", new int[] { 2, 0, 0, 0, 0, 37 });

        try {
            // Write the data of each station to a file
            writeStationToFile(station1);
            writeStationToFile(station2);
            System.out.println("Data writing completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeStationToFile(Station station) throws IOException {
        // Generate the file name based on the station name
        String fileName = station.getName() + ".dat";

        try {
            // Create a DataOutputStream to write data to the file
            DataOutputStream outputStream = new DataOutputStream(new 
            		FileOutputStream(fileName));

            // Write the station information to the file
            outputStream.writeInt(station.getId()); 
            outputStream.writeUTF(station.getName()); 
            outputStream.writeUTF(station.getDistrictName()); 

            // Write the daily rainfall values to the file
            for (int dailyRainfall : station.getDailyRainFall()) {
                outputStream.writeInt(dailyRainfall); 
            }
            
            // close the input stream
            outputStream.close();
        } finally {
            // Print a message that the station has been written to the file
            System.out.println("Data for station " + station.getId() + " is written to the file " + fileName);
        }
    }
}
