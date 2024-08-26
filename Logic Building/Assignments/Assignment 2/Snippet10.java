
//**********************************Snippet 10**********************************

 /* 
public class Snippet10 { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
}  
 

1.	Error: non-static method display() cannot be referenced from a static context display();
		   non-static method display(int) cannot be referenced from a static context display(5);
2.	Explaination:
	- Static methods belong to the class itself and can be called without creating an instance of the class.
    - Non-static methods belong to an instance of the class, so you need to create an object of the class 
	  to call these methods.
3.	Fixing the Error:
	- Create an instance of the class and use it to call the non-static methods.

*/
//**********************************Corrected Code**********************************

public class Snippet10 { 

 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 
 Snippet10 obj = new Snippet10();
 
 obj.display(); 
 obj.display(5); 
 } 
}

