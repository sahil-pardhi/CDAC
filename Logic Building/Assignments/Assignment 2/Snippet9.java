
//**********************************Snippet 9**********************************

 /*
public class Snippet9 { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} 
 
 
1.	Error: 'class' is a keyword and may not be used as an identifier
2.	Explaination:
	- In Java, class is used to define a class. Since it's a reserved keyword, you cannot use it as the
   	  name of a variable.
	- Keywords are predefined, reserved words used in programming language that have some special meanings to the compiler.  
3.	Fixing the Error:
	- Use a different name for the variable that is not a reserved keyword.
*/

//**********************************Corrected Code**********************************

public class Snippet9 { 
 public static void main(String[] args) { 
 int n = 10; 
 System.out.println(n); 
 } 
}

