/*
********************************************* Question 3: Calculator  *********************************************

Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if else to check if 
division by zero is attempted and display an error message. 

*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
		
		System.out.print("Enter your choice (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result;

        switch(operator){
			
            case '+':
                result = num1 + num2;
                System.out.println("Addtition = " + result);
                break;
				
            case '-':
                result = num1 - num2;
                System.out.println("substaction = " + result);
                break;
				
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication = " + result);
                break;
				
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division = " + result);
                } 
				else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
				
            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
}
