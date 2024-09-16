package constructor.gettersetter.tostring.example;

//Program.java
import java.util.Scanner;

public class Program3 {

 public static void main(String[] args) {
     BMIUtil util = new BMIUtil();
     BMI tracker = null;
     Scanner sc = new Scanner(System.in);
     
     int choice;
     do {
         util.menuList();
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 tracker = util.acceptRecord();
                 break;
             case 2:
                 if (tracker != null) {
                     util.printRecord(tracker);
                 } else {
                     System.out.println("Please enter weight and height first.");
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

