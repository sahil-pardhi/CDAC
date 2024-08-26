
//**********************************Snippet 11**********************************

 /*
public class Snippet11 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
}   
 

1.	Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
2.	Explaination:
	- In this code, the array arr is defined with three elements {1, 2, 3}. So the indices for this array is  0, 1, and 2 (if we consider this code).
    - Here, code tries to access arr[5], which is out of range of indices (0-2). So there is no element at index 5, a 
	   ArrayIndexOutOfBoundsException is shown.
3.	Fixing the Error:
	- To avoid this error, ensure that you are accessing a valid index within the bounds of the array.

*/
//**********************************Corrected Code**********************************

public class Snippet11 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[2]); 
 } 
}

