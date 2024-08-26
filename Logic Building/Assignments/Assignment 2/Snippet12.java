
//**********************************Snippet 12**********************************

 /*
public class Snippet12 { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
}    
 

1.	Error: code is going to infinite loop
2.	Explaination:
	- Infinite loop comes because the while loop's condition is always true, and there is no exit condition in the loop. 
	  This means that the loop will continue to execute indefinite number of time, printing "Infinite Loop" without stopping.
3.	Fixing the Error:
	- To avoid an infinite loop, use break statement to exit the loop when needed.
	- The break statement immediately exits the loop when it is encountered, so in this case, the loop will only
   	  execute once before terminating.

*/
//**********************************Corrected Code**********************************

public class Snippet12 { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 break;
 } 
 } 
}

