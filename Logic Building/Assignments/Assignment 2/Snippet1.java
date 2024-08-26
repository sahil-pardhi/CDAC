
//**********************************Snippet 1**********************************

/*
public class Main { 
 public void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
}  


1.	Error: class Main is public, so we have to declared a file named as Main.java
2.	Explaination:
	- In Java, if a class is declared as ‘public’ , so file name and class name must be same as 'Snippet1.java'.
	- The file should be named ‘Snippet1.java’ if you have a public class named ‘Snippet1’.
	- The main method should be public static void main(String[] args), not public void main(String[] args). As we teached the main method is the entry point for a Java code execution and 
	  `static` keyword signifies that the `main` method belongs to the class itself, rather than an instance of the class. This makes it possible to call the `main` method without creating an object of the class.
3.	Fixing the Error:
	- Save the file as Snippet1.java.
	- Ensure the main method is declared as public static void main(String[] args).

*/


//**********************************Corrected Code**********************************

public class Snippet1 {                           // changed file name
 public static void main(String[] args) {         // added static keyword in main method
	System.out.println("Hello, World!"); 
 } 
}

 



