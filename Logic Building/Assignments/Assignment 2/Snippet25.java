
//**********************************Snippet 25**********************************

/*
public class Snippet25 { 
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}   
    

1.	Error:  patterns in switch statements are a preview feature and are disabled by default.
			switch(score) {
			constant label of type int is not compatible with switch selector type double
            case 100:
            constant label of type int is not compatible with switch selector type double
            case 85:
2.	Explaination:
	- The code does not compile because Java's switch statement does not support floating-point types (float or double) as the expression type. 
	- The switch statement can only handle byte, short, char, int, enum types, String and certain classes of wrapper types that represent these primitive types.. 
	- The semicolon marks the end of a statement and tells the Java compiler where one statement ends and the next begins.
3.	Fixing the Error:
	- Changed double to int by changing score from double to int, the switch statement can now handle it correctly.

*/

//**********************************Corrected Code**********************************

public class Snippet25 { 
    public static void main(String[] args) { 
        int score = 85;  // Change from double to int
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}

