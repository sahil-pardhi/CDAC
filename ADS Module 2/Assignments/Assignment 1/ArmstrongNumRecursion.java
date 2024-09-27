import java.util.Scanner;

public class ArmstrongNumRecursion {

    static int length(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + length(num / 10);
    }

    static int armstrongSum(int num, int len) {
        if (num == 0) {
            return 0;
        }
        int rem = num % 10;
        return (int) Math.pow(rem, len) + armstrongSum(num / 10, len);
    }

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter teh number : ");
        int num = sc.nextInt();
        int len = length(num); 
        int armstrongValue = armstrongSum(num, len); 

        if (num == armstrongValue) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
