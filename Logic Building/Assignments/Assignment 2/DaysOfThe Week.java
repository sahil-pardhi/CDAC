/*
********************************************* Question 2: Days of the Week  *********************************************

Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. 

*/ 
 
import java.util.Scanner;
 
 public class DaysOfTheWeek{
	 
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number from 1 to 6 : ");
		int n = sc.nextInt();
		
		switch(n){
			
			case 1:
				System.out.println("Monday");
				break;
			
			case 2:
				System.out.println("Tuesday");
				break;
				
			case 3:
				System.out.println("Wednesday");
				break;
				
			case 4:
				System.out.println("Thursday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
				
			case 6:
				System.out.println("Saturday");
				break;
			
			case 7:
				System.out.println("Sunday");
				break;
			
			default : 
				System.out.println("Enter the valid number");
			
		}
		
	}
	 
 }
