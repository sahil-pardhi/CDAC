
//**********************************Snippet 5**********************************

public class Snippet5 { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 

/*
1.	Explaination:
	- Yes, we can have multiple main methods in a class, but they must differ in their parameters, 
	  as shown in provided code. 
	- In this code there are different parameter types:
      i. public static void main(String[] args)
      ii.public static void main(int[] args)
    - This is an example of method overloading in Java, where multiple methods can have the same name but different
   	  parameter types, numbers, or both.
	- When you run the program, the Java Virtual Machine (JVM) specifically looks for the main method having the 
	  String[] args parameter
	- This method behave as the entry point for the program execution. The other main method with the int[] args parameter 
	  will not be automatically called by the JVM during the program's startup.

2.	Output:
	// Main method with String[] args




