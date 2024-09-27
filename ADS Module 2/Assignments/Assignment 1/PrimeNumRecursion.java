import java.util.Scanner;

public class PrimeNumRecursion {

    static boolean isPrime(int num, int i) {
        if (num <= 2) {
            return num == 2; 
        }
        if (num % i == 0) {
            return false;  
        }
        if (i * i > num) {
            return true; 
        }

   
        return isPrime(num, i + 1);
    }

    public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if (isPrime(num, 2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
