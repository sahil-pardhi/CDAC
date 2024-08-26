
//**********************************Snippet 17**********************************

/*
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
}  
    

1.	Error : illegal start of expression
			int result = a ** b;
                        ^
2.	Explaination:
	- The use of ** for exponentiation, which is not a valid operator in Java.
3.	Fixing the Error:
	- To perform exponentiation, use the Math.pow method. 
	- This method returns a double, so use a double for the result or typecast the result to int if you need an integer result.

*/

//**********************************Corrected Code**********************************

public class Snippet17 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        double result = Math.pow(a, b);  
        System.out.println(result); 
    } 
}

