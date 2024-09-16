package methods.fields.example;

import java.util.Scanner;

public class LoanAmortizationCalculator {
	
	double principal;
	double annualInterestRate;
	int loanTerm;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principal : ");
		principal = sc.nextDouble();
		
		System.out.println("Enter annual interest rate : ");
		annualInterestRate = sc.nextDouble();
		
		System.out.println("Enter loan term : ");
		loanTerm = sc.nextInt();
		
	}
	
	public double calMonthlyPayment() {
		
		double monthlyInterestRate = annualInterestRate / 12 / 100;
		
        int numberOfMonths = loanTerm * 12;
        
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
        
        return monthlyPayment;	
		
	}
	
    public void printRecord() {
        double monthlyPayment = calMonthlyPayment();
        double totalPayment = monthlyPayment * loanTerm * 12;
        System.out.println("\n--- Loan Amortization Details ---");
        System.out.println("Monthly Payment: ₹" + monthlyPayment);
        System.out.println("Total Payment: ₹" + totalPayment);
}
}
