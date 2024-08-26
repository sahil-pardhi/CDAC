
//**********************************Snippet 3**********************************

/*
public class Snippet3 { 
 public static int main(String[] args) { 
 System.out.println("Hello, World!"); 
 return 0; 
 }   
}

1.	Error: Main method must return a value of type void in class Snippet3,
  ^
2.	Explaination:
	- In Java, the error is coming because the Java runtime environment (JRE) expects the main method in a class to
	  have a void return type, not int.
	- The main method should have a return type of void because this is the only way that the JRE recognizes as
	  the starting point of the application.
3.	Fixing the Error:
	- Ensure the main method is declared as public static void main(String[] args).

*/


//**********************************Corrected Code**********************************

public class Snippet3 { 
 public static void main(String[] args) {        //make return type as void
 System.out.println("Hello, World!"); 
 //return 0;                                    //no return statement needed because return is void
 }   
}





