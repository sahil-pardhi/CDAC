import java.util.Scanner;

public class GCDRecursion{

	public static int findGCD(int a, int b){
	
		if(a % b == 0){
			return b;
		}else{
			return findGCD(b, a%b);
		}
	
	}
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = findGCD(a, b);
		System.out.println("GCD : " + result);
	}
	
}