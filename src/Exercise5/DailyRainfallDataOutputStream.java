package Exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DailyRainfallDataOutputStream {

	public static void main(String[] args) {

	    // Daily rainfall data
	    int[] dailyRainfalls = new int[] { 0, 0, 4, 1, 0, 6 };

	    // File to store the data
	    String fileName = "simpang_ampat.dat";

	    try {
	        // Create a DataOutputStream to write data to the file
	        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName));

	        // Write each daily rainfall value to the file
	        for (int dailyRainfall : dailyRainfalls) {
	            outputStream.writeInt(dailyRainfall);
	        }

	        System.out.println("Data creation completed.");

	        // Close the output stream
	        outputStream.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
