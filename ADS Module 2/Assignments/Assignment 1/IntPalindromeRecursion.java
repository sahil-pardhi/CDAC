import java.util.Scanner;

public class IntPalindromeRecursion
{
    static int rev(int n, int temp)
    {
        if (n == 0)
            return temp;

        temp = (temp * 10) + (n % 10);
        return rev(n / 10, temp);
    }

    static boolean isPalindrome(int n)
    {
        if (n < 0)
            return false;

        int temp = rev(n, 0);
        
        return temp == n;
    }

    public static void main (String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
        int n = sc.nextInt();
        
        boolean result = isPalindrome(n);
        
        System.out.println(result);
    }
}
