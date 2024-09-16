package constructor.gettersetter.tostring.example;
import java.util.Scanner;

public class BMIUtil {


	    // Method to accept record from the user
	    public BMI acceptRecord() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter weight in kilograms: ");
	        double weight = sc.nextDouble();
	        
	        System.out.print("Enter height in meters: ");
	        double height = sc.nextDouble();
	        
	        return new BMI(weight, height);
	    }

	    // Method to print the record
	    public void printRecord(BMI tracker) {
	        System.out.println("BMI Details");
	        System.out.println(tracker.toString());
	    }

	    // Method to display the menu
	    public void menuList() {
	        System.out.println("BMI Menu");
	        System.out.println("1. Enter weight and height");
	        System.out.println("2. Show BMI details");
	        System.out.println("3. Exit");
	    }
	}
