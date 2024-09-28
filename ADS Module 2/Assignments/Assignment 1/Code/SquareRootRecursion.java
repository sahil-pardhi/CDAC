import java.util.Scanner;

public class SquareRootRecursion{
	
	static int sqrt(int low, int high, int num){
		
		if(low <= high){
			int mid = (int) (low + high) / 2;
			
			if((mid * mid <= num) && ((mid + 1) * (mid + 1) > num)){
				return mid;
			}
			else if(mid * mid < num){
				return sqrt(mid + 1, high, num);
			}
			else{
				return sqrt(low, mid-1, num);
			}
		}
		return low;
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("Square root of " + num + " : " + sqrt(0, num, num));
		
	}
	
	
}