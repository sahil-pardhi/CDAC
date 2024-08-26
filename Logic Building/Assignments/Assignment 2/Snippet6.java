
//**********************************Snippet 6**********************************
/*
public class Snippet6 { 
 public static void main(String[] args) { 
 int x = y + 10; 
 System.out.println(x); 
 } 
}  


1.	Error:  cannot find symbol
            int x = y + 10;
                    ^
            symbol:   variable y
2.	Explaination:
	- The variable y is used without being declared or initialized before using it. 
	- In Java, all variables must be declared and initialized before they can be used in operations.
	- The main method must take a String[] as an argument.
3.	Fixing the Error:
	- You need to declare and initialize the variable y before using it in the expression. 
	  For example:
	  int y = 5;
*/

//**********************************Corrected Code**********************************

public class Snippet6 { 
 public static void main(String[] args) { 
 int y = 5;                 //initialize y
 int x = y + 10; 
 System.out.println(x); 
 } 
}