import java.util.*;

public class PositiveNum{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		if(n>=0){
			System.out.println(n + "is a Positive Number");
		}else{
			System.out.println(n + "is not a Positive Number");
		}
	
	}
}