import java.util.*;

public class NegativeNum{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		if(n<0){
			System.out.println(n + " is a Negative Number");
		}else{
			System.out.println(n + " is not a Negative Number");
		}
	
	}
}