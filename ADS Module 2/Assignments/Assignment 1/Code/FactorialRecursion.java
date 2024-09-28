import java.util.Scanner;

public class FactorialRecursion{
	int fact = 1;
	
	public int calFact(int num){
		if(num > 1){
			fact = fact * num;
			calFact( num - 1 );
		}
		return fact;
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for calculating factorial : ");
		int num = sc.nextInt();
		int result;
		FactorialRecursion f = new FactorialRecursion();
		result = f.calFact(num);
		System.out.println("Factorial of " + num + " : " + result );
	}
	

}