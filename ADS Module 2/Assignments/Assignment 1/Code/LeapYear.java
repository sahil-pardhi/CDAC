import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year to check whether it is a leap year or not: ");
        int year = sc.nextInt();

        // Corrected leap year condition
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.println(isLeapYear);
    }
}
