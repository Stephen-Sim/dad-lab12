package Exercise6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DailyRainFallDataInputStream {
	
	public static void main(String[] args) {
	    // Read station data from the files
	    Station station1 = readStationFromFile("Melaka Pindah.dat");
	    Station station2 = readStationFromFile("Durian Tunggal.dat");

	    // Display the station data
	    displayStationData(station1);
	    displayStationData(station2);
	}

	private static Station readStationFromFile(String fileName) {
	    try {
	        // Create a DataInputStream to read data from the file
	        DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName));

	        // Read station information from the file
	        int id = inputStream.readInt(); 
	        String name = inputStream.readUTF(); 
	        String districtName = inputStream.readUTF(); 
	        
	        // Read the daily rainfall values from the file
	        int[] dailyRainFall = new int[6];
	        for (int i = 0; i < 6; i++) {
	            dailyRainFall[i] = inputStream.readInt();
	        }
	        
	        // close the input stream
	        inputStream.close();

	        // Create a new Station object with the read data and return it
	        return new Station(id, name, districtName, dailyRainFall);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return null;
	}

	private static void displayStationData(Station station) {
	    System.out.println("Station ID: " + station.getId());
	    System.out.println("Name: " + station.getName());
	    System.out.println("District: " + station.getDistrictName());

	    int totalRainfall = 0;

	    // Display the daily rainfall values
	    for (int i = 0; i < 6; i++) {
	        int dailyRainFall = station.getDailyRainFall()[i];
	        totalRainfall += dailyRainFall;

	        System.out.println("Day " + (i + 1) + " Rainfall: " + dailyRainFall);
	    }

	    // Calculate and display the average rainfall
	    double average = (double) totalRainfall / 6;
	    System.out.println("Average Rainfall: " + average);

	    System.out.println();
	}

}
