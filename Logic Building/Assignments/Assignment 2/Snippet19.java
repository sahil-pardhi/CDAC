

//**********************************Snippet 19**********************************
/*

public class Snippet19 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
}  
    

1.	Error:    class, interface, enum, or record expected
2.	Explaination:
	- I try to divide an integer by 0 it gives an arithmetic exception.
	- Division by zero does not have a meaningful result in mathematics. For integers, dividing by zero is not defined 
	  because you cannot distribute a quantity into zero parts.

*/

//**********************************Corrected Code**********************************

public class Snippet19 { 
   public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        
        if (b != 0) {
            int result = a / b;
            System.out.println(result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }  
}  
  


