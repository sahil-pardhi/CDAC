//Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using if-else to 
// classify the BMI int categories (underweight, normal weight, overweight,etc).

import java.util.Scanner;

public class CalBMI{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your height in feet: ");
		int feet = sc.nextInt();
		
		System.out.println("Enter your height in inches: ");
		int inches = sc.nextInt();
		
		System.out.println("Enter your weight in Kg: ");
		double weight = sc.nextDouble();

			double hm = (feet * 0.3048) + (inches * 0.0254);

			double bmi = weight / (hm * hm);

			String category;
			
			if ( bmi < 18.5 ) {
				category = "Underweight";
			} else if ( bmi >= 18.5 && bmi < 24.9 ) {
				category = "Normal weight";
			} else if ( bmi >= 25 && bmi < 29.9 ) {
				category = "Overweight";
			} else {
				category = "Obesity";
			}

			System.out.printf("Your BMI is " + (float)bmi + " and you are classified as " + category + ".");

					
					
	}
	
}