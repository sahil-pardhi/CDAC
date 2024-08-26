
//**********************************Snippet 13**********************************

 /*
public class Snippet13 { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
} 
    
 

1.	Error: Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
2.	Explaination:
	- In the code, the String variable str is initialized to null, and then the code attempts to call the length() 
	  method on it, which causes the exception.
3.	Fixing the Error:
	- To slove the NullPointerException, you need to ensure that str is not null before calling any methods on it.

*/

//**********************************Corrected Code**********************************

public class Snippet13 { 
 public static void main(String[] args) { 
 String str = "Hello";                     //valid String
 System.out.println(str.length()); 
 } 
}

