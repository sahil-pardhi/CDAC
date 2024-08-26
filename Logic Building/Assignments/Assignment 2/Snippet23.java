
//**********************************Snippet 23**********************************

/*
public class Snippet23 { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
            case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
}    
    
1.	Explaination:
	- In the provided switch statement, the default case is executed after "Value is 2" due to the not adding 
	  break statements. Without break statements, the control flows through each case block sequencly. 
3.	Fixing the Error:
	- you need to add break statements at the end of each case block. 

*/
//**********************************Corrected Code**********************************

public class Snippet23 { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
                break; 
            case 2: 
                System.out.println("Value is 2"); 
                break; 
            case 3: 
                System.out.println("Value is 3"); 
                break; 
            default: 
                System.out.println("Default case"); 
                break; 
        } 
    }  
}


