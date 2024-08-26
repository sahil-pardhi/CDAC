
//**********************************Snippet 24**********************************

 /*  
public class Snippet24 { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
            case 2: 
                System.out.println("Level 2"); 
            case 3: 
                System.out.println("Level 3"); 
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
}     
 
1.	Explaination:
	- In the provided switch statement, the default case is executed after "Value is 2" due to the not adding 
	  break statements. Without break statements, the control flows through each case block sequencly. 
3.	Fixing the Error:
	- you need to add break statements at the end of each case block. 


//**********************************Corrected Code**********************************
*/
public class Snippet24 { 
     public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
                break; 
            case 2: 
                System.out.println("Level 2"); 
                break; 
            case 3: 
                System.out.println("Level 3"); 
                break; 
            default: 
                System.out.println("Unknown level"); 
                break; 
        } 
    } 
}


