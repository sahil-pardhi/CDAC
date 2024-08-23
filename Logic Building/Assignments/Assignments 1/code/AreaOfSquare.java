import java.util.*;

class AreaOfSquare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Side of Square : ");
		int side = sc.nextInt();
		long area = side*side;
		
		System.out.println("Area of Square is : " + area);
		
	}
}