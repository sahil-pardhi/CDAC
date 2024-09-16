package methods.fields.example;

public class MainTollBoothRevenueManager {
	
	public static void main(String[] args) {
		TollBoothRevenueManager tollBooth = new TollBoothRevenueManager();

	    // Set the toll rates for each vehicle type
	    tollBooth.setTollRates();

	    // Accept the number of vehicles passing through the toll booth
	    tollBooth.acceptRecord();

	    // Display the total vehicles and revenue collected
	    tollBooth.printRecord();
	}
	
	
}
