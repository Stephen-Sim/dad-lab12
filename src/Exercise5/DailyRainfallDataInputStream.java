package Exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DailyRainfallDataInputStream {

	public static void main(String[] args) {
		// File where the data are stored
		String fileName = "simpang_ampat.dat";

        try {
        	// Create a DataInputStream to read data from file
        	DataInputStream inputStream = new DataInputStream(new 
        			FileInputStream(fileName));
            
        	int totalRainfall = 0;
        	int count = 0;

        	while (inputStream.available() > 0) {
        	    // read the int data and store it in 'data'
        	    int data = inputStream.readInt();

        	    totalRainfall += data;
        	    count++;

        	    System.out.println("Day " + count + " Rainfall: " + data);
        	}

        	double average = (double) totalRainfall / count;
        	System.out.println("Average Rainfall: " + average);
        	
        	// Close the input stream
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
