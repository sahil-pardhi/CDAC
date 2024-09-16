package methods.fields.example;

import java.util.Scanner;

public class TollBoothRevenueManager {

    double carTollRate;
    double truckTollRate;
    double motorcycleTollRate;

    int carCount;
    int truckCount;
    int motorcycleCount;

    public void setTollRates() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the toll rate for Cars (₹): ");
        carTollRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Trucks (₹): ");
        truckTollRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for Motorcycles (₹): ");
        motorcycleTollRate = scanner.nextDouble();
    }

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of cars
        System.out.print("Enter the number of Cars: ");
        carCount = scanner.nextInt();

        // Accept the number of trucks
        System.out.print("Enter the number of Trucks: ");
        truckCount = scanner.nextInt();

        // Accept the number of motorcycles
        System.out.print("Enter the number of Motorcycles: ");
        motorcycleCount = scanner.nextInt();
    }

    public double calculateRevenue() {
        double carRevenue = carTollRate * carCount;
        double truckRevenue = truckTollRate * truckCount;
        double motorcycleRevenue = motorcycleTollRate * motorcycleCount;
        return carRevenue + truckRevenue + motorcycleRevenue;
    }

    public void printRecord() {
        int totalVehicles = carCount + truckCount + motorcycleCount;
        double totalRevenue = calculateRevenue();

        System.out.println("\n--- Toll Booth Summary ---");
        System.out.println("Total Vehicles: " + totalVehicles);
        System.out.println("Total Revenue Collected: ₹" + (float) totalRevenue);
    }
}


