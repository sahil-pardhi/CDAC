
//**********************************Snippet 15**********************************

/*
public class Snippet15 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
}  
    

1.	Error:   incompatible types: possible lossy conversion from double to int
             int result = num1 + num2;
2.	Explaination:
	- num1 is an int and num2 is a double.
    - num1 + num2 when performing the operation, the int is implicitly converted to a double, so the result is of type double.
      int result: You cannot directly assign a double result to an int variable without an explicit cast because this conversion can lose the decimal part.
3.	Fixing the Error:
	- Typepast the double result to int this will convert the double result to int, but it will not show the decimal part.

*/

//**********************************Corrected Code**********************************

public class Snippet15 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = (int)(num1 + num2); 
 System.out.println(result); 
 } 
} 

