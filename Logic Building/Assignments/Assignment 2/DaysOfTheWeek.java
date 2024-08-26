/*
********************************************* Question 2: Days of the Week  *********************************************

Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or WeekEnd. 

*/ 
 
import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number 1 to 7: ");
        int n = scanner.nextInt();
        
        switch(n){
            case 1:
                System.out.println("Monday");
                switch(n){
                    case 1: case 2: case 3: case 4: case 5:
                        System.out.println("It's a WeekDay.");
                        break;
                }
                break;
				
            case 2:
                System.out.println("Tuesday");
                switch (n) {
                    case 1: case 2: case 3: case 4: case 5:
                        System.out.println("It's a WeekDay.");
                        break;
                }
                break;
				
            case 3:
                System.out.println("Wednesday");
                switch (n) {
                    case 1: case 2: case 3: case 4: case 5:
                        System.out.println("It's a WeekDay.");
                        break;                
                }
                break;
				
            case 4:
                System.out.println("Thursday");
                switch (n) {
                    case 1: case 2: case 3: case 4: case 5:
                        System.out.println("It's a WeekDay.");
                        break;
                }
                break;
				
            case 5:
                System.out.println("Friday");
                switch (n) {
                    case 1: case 2: case 3: case 4: case 5:
                        System.out.println("It's a WeekDay.");
                        break;
                }
                break;
				
            case 6:
                System.out.println("Saturday");
                switch (n) {
                    case 6: case 7:
                        System.out.println("It's the WeekEnd.");
                        break;
                }
                break;
				
            case 7:
                System.out.println("Sunday");
                switch (n) {
                    case 6: case 7:
                        System.out.println("It's the WeekEnd.");
                        break;
                }
                break;
				
            default:
                System.out.println("Invalid input!");
                break;
        }
        
    }
}

