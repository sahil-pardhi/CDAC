
//**********************************Snippet 16**********************************

/*
public class Snippet16 { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4; 
        System.out.println(result); 
    } 
} 
    

1.	Expected Output : 2.5
	Original Output : 2.0
2.	Explaination:
	- We Can see that num and 4 are integers, then the division is calculates using integer vlaue. The result of 10 / 4 is 2,but we want 2.5
3.	Fixing the Error:
	- To get the correct result of 2.5, we have to take at least one of the operands in the division as double by just 
	  giving d after operand so that it will considered as double value.


*/
//**********************************Corrected Code**********************************

public class Snippet16 { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4d; 
        System.out.println(result); 
    } 
}

