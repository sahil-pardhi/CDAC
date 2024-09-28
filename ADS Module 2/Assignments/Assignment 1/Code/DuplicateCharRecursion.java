import java.util.Scanner;

public class DuplicateCharRecursion {

    public static void findDuplicates(char[] arr, int index) {
        if (index >= arr.length - 1) {
            return; 
        }

        char currentChar = arr[index];

        for (int i = index + 1; i < arr.length; i++) {
            if (currentChar == arr[i]) {
                System.out.print(currentChar + " ");
                break; 
            }
        }

  
        findDuplicates(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
        String s = sc.next();
        char[] arr = s.toCharArray(); 

        findDuplicates(arr, 0); 
    }
}
