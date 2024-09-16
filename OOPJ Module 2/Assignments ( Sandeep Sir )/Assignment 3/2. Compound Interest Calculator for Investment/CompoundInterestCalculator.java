package methods.fields.example;

import java.util.Scanner;

public class CompoundInterestCalculator {
	
	double principal;
	double annualInterestRate;
	int numOfCompounds;
	int years;
	
	public void acceptRecord() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principal : ");
		principal = sc.nextDouble();
		
		System.out.println("Enter annual interest rate : ");
		annualInterestRate = sc.nextDouble();
		
		System.out.println("Enter number of compounds : ");
		numOfCompounds = sc.nextInt();
		
		System.out.println("Enter years : ");
		years = sc.nextInt();		
	}
	
	public double calculateFutureValue() {
        double ratePerPeriod = annualInterestRate / numOfCompounds / 100;
        double futureValue = principal * Math.pow(1 + ratePerPeriod, numOfCompounds * years);
        return futureValue;
    }

    // Method to print the result
    public void printRecord() {
        double futureValue = calculateFutureValue();
        double totalInterest = futureValue - principal;
        System.out.println("\n--- Compound Interest Details ---");
        System.out.println("Future Value: " + (float) futureValue);
        System.out.println("Total Interest Earned: " + (float) totalInterest);
	
	
}
}
