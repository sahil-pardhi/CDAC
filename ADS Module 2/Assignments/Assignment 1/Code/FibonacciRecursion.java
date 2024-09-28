import java.util.Scanner;

public class FibonacciRecursion{

	static int a = 0, b=1;
	
	public void printFib(int num){
		int c;
		if(num >= 3){
			c = a + b;
			System.out.print("," + c);
			a = b;
			b = c;
			printFib(num - 1);
		}
	}
	
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number for calculating fibonacci series : ");
	int num = sc.nextInt();
	
	System.out.print(a + "," + b);
	
	FibonacciRecursion obj = new FibonacciRecursion();
	obj.printFib(num);
	
	}

}