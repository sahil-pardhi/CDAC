/*
********************************************* Question 4: Discount Calculation  *********************************************
 
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 

Additionally, if the user has a membership card, increase the discount by 5%.

*/

import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount (Rs.): ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String membershipYN = scanner.next();

        double discount;

        if (totalAmount >= 1000) {
            discount = 0.20;
        } else if (totalAmount >= 500) {
            discount = 0.10;
        } else {
            discount = 0.05;
        }

        if (membershipYN.equalsIgnoreCase("yes")) {
            discount += 0.05;
        }

        double discountAmount = totalAmount * discount;

        double finalAmount = totalAmount - discountAmount;

        System.out.println("Original Amount: Rs." + totalAmount);
        System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Amount to Pay: Rs." + finalAmount);

    }
}
