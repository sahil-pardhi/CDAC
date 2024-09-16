package methods.fields.example;

import java.util.Scanner;

public class DiscountCal {
	double originalPrice;
	double discountRate;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the original price of the item: ");
		originalPrice = sc.nextDouble();

		System.out.print("Enter the discount rate: ");
		discountRate = sc.nextDouble();
	}

	public double calculateDiscountAmount() {
		double discountAmount = originalPrice * (discountRate / 100);
		return discountAmount;
	}

	public void printRecord() {
		double discountAmount = calculateDiscountAmount();
		double finalPrice = originalPrice - discountAmount;

		System.out.println("\n--- Discount Details ---");
		System.out.println("Discount Amount: " + (float) discountAmount);
		System.out.println("Final Price: " + (float) finalPrice);
	}
}