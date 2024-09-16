package constructor.gettersetter.tostring.example;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
    // Method to accept record from the user
    public CompoundInterestCalculator acceptRecord() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = sc.nextDouble();
        
        System.out.print("Enter the number of times interest is compounded per year: ");
        int numberOfCompounds = sc.nextInt();
        
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        
        return new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
    }

    // Method to print the record
    public void printRecord(CompoundInterestCalculator calculator) {
        System.out.println(" Investment Details");
        System.out.println(calculator.toString());
    }

    // Method to display the menu
    public void menuList() {
        System.out.println("Menu List");
        System.out.println("1. Enter investment details");
        System.out.println("2. Show investment summary");
        System.out.println("3. Exit");
    }
}


