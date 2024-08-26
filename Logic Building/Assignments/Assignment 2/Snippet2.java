
//**********************************Snippet 2**********************************

/*
public class Snippet2 { 
 static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
}  


1.	Error:  Main method not found in class Snippet2, please define the main method as: public static void main(String[] args)
2.	Explaination:
	- In Java, Main method is called by JVM to run the class. JVM is public for any new class that we create so method must be public for jvm to access it.
	- The main method should be public static void main(String[] args), not static void main(String[] args). As we teached the main method is the entry point for a Java code execution and 
	  `public`  so that the JVM can identify the point of program execution.
3.	Fixing the Error:
	- Ensure the main method is declared as public static void main(String[] args).

*/


//**********************************Corrected Code**********************************

public class Snippet2 { 
 public static void main(String[] args) {       //added public (access modifier)
 System.out.println("Hello, World!"); 
 } 
}




