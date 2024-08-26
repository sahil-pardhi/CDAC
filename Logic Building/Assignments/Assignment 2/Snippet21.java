
//**********************************Snippet 21**********************************

/*
public class Snippet21 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here 
}  
    

1.	Error:   reached end of file while parsing
2.	Explaination:
	- The compiler expects a closing brace for the Main class, but it has reached the end of the file without finding it. 
	- Java needs that every opening brace { be matched with a closing brace }

*/

//**********************************Corrected Code**********************************

public class Snippet21 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}

