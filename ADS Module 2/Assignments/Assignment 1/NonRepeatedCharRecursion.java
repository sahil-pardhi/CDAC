import java.util.Scanner;

class NonRepeatedCharRecursion {

    public static int findFirstUnique(String s, int index) {
        if (index >= s.length()) {
            return -1;
        }
        
        char c = s.charAt(index);
        String remainingString = s.substring(0, index) + s.substring(index + 1);
        
        if (!remainingString.contains(String.valueOf(c))) {
            return index; 
        } else {
            return findFirstUnique(s, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
        String s = sc.next();
        
        int index = findFirstUnique(s, 0);
        
        if (index != -1) {
            System.out.println(s.charAt(index)); 
        } else {
            System.out.println("null"); 
        }
        
        sc.close();
    }
}
