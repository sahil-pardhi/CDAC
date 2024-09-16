package methods.fields.example;

import java.util.Scanner;

public class BMI {

	double weight;
    double height;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (in kg): ");
        weight = sc.nextDouble();

        System.out.print("Enter height (in meters): ");
        height = sc.nextDouble();
    }

    public double calculateBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public void printRecord() {
        double bmi = calculateBMI();
        String classification = classifyBMI(bmi);
        System.out.println("\n--- BMI Details ---");
        System.out.println("BMI: " + (float) bmi);
        System.out.println("Classification: " + classification);
    }
}

