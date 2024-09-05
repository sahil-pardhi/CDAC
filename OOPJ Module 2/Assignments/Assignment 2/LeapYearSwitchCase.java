import java.util.Scanner;

public class LeapYearSwitchCase{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year to check whether it is Leap Year or not : ");
		int year = sc.nextInt();
		
		boolean db4 = ( year % 4 == 0 );
		boolean db400 = ( year % 400 == 0 );
		boolean db100 = ( year % 100 == 0 );
		
		int value = (db4 ? 1 : 0) + (db400 ? 2 : 0) + (db100 ? 4 : 0);
	
			switch(value){
			
			case 1:
			case 7:
				System.out.println("Leap Year");
				break;
			default:
				System.out.println("Not a Leap Year");
			
			
			}
	
	}

}