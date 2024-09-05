import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select your choice to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Select your choice: ");
        int num = sc.nextInt();
        
        double area;

        switch (num) {
            case 1:
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                area = Math.PI * radius * radius;
                break;
                
            case 2:
                System.out.print("Enter the side length: ");
                double side = sc.nextDouble();
                area = side * side;
                break;
                
            case 3:
                System.out.print("Enter the length: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width: ");
                double width = sc.nextDouble();
                area = length * width;
                break;
                
            case 4:
                System.out.print("Enter the base: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                break;
                
            default:
                System.out.println("Invalid number selected.");
                return;         }
        
        System.out.println("The area is: " + area);
        
        sc.close();
    }
}
