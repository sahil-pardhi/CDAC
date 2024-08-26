
//**********************************Snippet 26**********************************

/*
public class Snippet26 { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5");
				  break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
}   

1.	Error: duplicate case label
            case 5:
2.	Explaination:
	- Each case label within a switch statement must be unique. 
	- The switch statement is designed to select one block of code to execute based on the value of the switch expression. 
	- If multiple case labels have the same value, the compiler cannot decide which block of code to execute, leading to a compilation error.
3.	Fixing the Error:
	- To fix this error, you need to ensure that each case label in the switch statement is unique.


*/
//**********************************Corrected Code**********************************

public class Snippet26 { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5");
				  break; 
            case 6: 
                System.out.println("This is another case 6"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
}

