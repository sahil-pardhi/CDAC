
//**********************************Snippet 14**********************************

/*
public class Snippet14 { 
 public static void main(String[] args) { 
 double num = "Hello"; 
 System.out.println(num); 
 } 
}  
    
 

1.	Error:  incompatible types: String cannot be converted to double
			double num = "Hello";
						 ^
2.	Explaination:
	- The code is attempting to assign a String value ("Hello") to an double variable (num).String and double are 
	  not same datatypes, means a String cannot be directly converted to an double. 
3.	Fixing the Error:
	- Consider a proper double value to num:

*/

//**********************************Corrected Code**********************************

public class Snippet14 { 
 public static void main(String[] args) { 
 double num = 3.14d; 
 System.out.println(num); 
 } 
}

