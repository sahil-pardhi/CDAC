
//**********************************Snippet 7**********************************

/*
public class Snippet7 { 
 public static void main(String[] args) { 
 int x = "Hello"; 
 System.out.println(x); 
 } 
} 
  

1.	Error:  incompatible types: String cannot be converted to int
			int x = "Hello";
2.	Explaination:
	- The code is attempting to assign a String value ("Hello") to an int variable (x).String and int are 
	  not same datattypes, means a String cannot be directly converted to an int. 
3.	Fixing the Error:
	- Consider a proper integer value to x:
*/

//**********************************Corrected Code**********************************

public class Snippet7 { 
 public static void main(String[] args) { 
 int x = 10;                          // Consider an integer value
 System.out.println(x); 
 } 
}