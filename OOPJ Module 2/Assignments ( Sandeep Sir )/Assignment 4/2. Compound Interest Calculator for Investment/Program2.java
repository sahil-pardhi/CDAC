package constructor.gettersetter.tostring.example;

//Program.java
import java.util.Scanner;

public class Program2 {

 public static void main(String[] args) {
     CompoundInterestCalculatorUtil util = new CompoundInterestCalculatorUtil();
     CompoundInterestCalculator calculator = null;
     Scanner sc = new Scanner(System.in);
     
     int choice;
     do {
         util.menuList();
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 calculator = util.acceptRecord();
                 break;
             case 2:
                 if (calculator != null) {
                     util.printRecord(calculator);
                 } else {
                     System.out.println("Please enter investment details first.");
                 }
                 break;
             case 3:
                 System.out.println("Exiting the program.");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     } while (choice != 3);
 }
}
