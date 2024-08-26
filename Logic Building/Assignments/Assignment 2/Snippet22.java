
//**********************************Snippet 22**********************************

/*
public class Snippet22 { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
}   
    

1.	Error:  illegal start of type static void displayMessage() {
2.	Explaination:
	- Methods cannot be declared inside other methods. 
	- The code attempts to declare displayMessage within the main method, which is not allowed in Java. 
	- Java methods must be declared at the class level..
3.	Fixing the Error:
	- Methods should be declared directly within the class, not inside other methods.

*/
//**********************************Corrected Code**********************************

public class Snippet22 { 
    public static void main(String[] args) { 
        displayMessage();  
    } 
    
    static void displayMessage() { 
        System.out.println("Message"); 
    } 
}


