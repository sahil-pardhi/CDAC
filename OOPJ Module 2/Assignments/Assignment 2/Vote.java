import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("Eligible for voting.");
        } else if (age < 0) {
            System.out.println("Enter a valid age...");
        } else {
            System.out.println("Not eligible for voting.");
        }

        sc.close();
    }
}
