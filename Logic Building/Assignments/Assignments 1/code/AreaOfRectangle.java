import java.util.*;

class AreaOfRectangle{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length : ");
		int l = sc.nextInt();
		
		System.out.println("Enter the breadth : ");
		int b = sc.nextInt();
		
		long area = l*b;
		
		System.out.println("Area of Rectangle is : " + area);
		
	}
}