package Demo;

public class Integers {

	public static void main(String[] args) {

		
//		b. Write a program to test how many bytes are used to represent an int value using the BYTES field. (Hint: Use Integer.BYTES).
       System.out.println("Bytes for Integer: "+ Integer.BYTES);

//		c. Write a program to find the minimum and maximum values of int using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Integer.MIN_VALUE and Integer.MAX_VALUE).
       System.out.println("Range of Integer From: "+ Integer.MIN_VALUE);
       System.out.println("Range of Integer To: "+ Integer.MAX_VALUE);

//		d. Declare a method-local variable number of type int with some value and convert it to a String using the toString method. (Hint: Use Integer.toString(int)).
       int number = 123;
       String str =Integer.toString(number);
       System.out.println("Integer to String: " + str);

//		e. Declare a method-local variable strNumber of type String with some value and convert it to an int value using the parseInt method. (Hint: Use Integer.parseInt(String)).
       String strNumber = "123";
       int a = Integer.parseInt(strNumber);
       System.out.println("String to Int: " + a);
      
//		f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to an int value. (Hint: parseInt method will throw a NumberFormatException).
       /*
      String strNumber1 = "Ab12Cd3";
      int b = Integer.parseInt(strNumber1);
      System.out.println("String to Int: " + b);
      Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
		*/
       
//		g. Declare a method-local variable number of type int with some value and convert it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(int)).
      int n1 =123;
      Integer wrapNum = Integer.valueOf(n1);
      System.out.println("Wrapping number: " + wrapNum);
      
      
//      h. Declare a method-local variable strNumber of type String with some integer value and convert it to the corresponding wrapper class using Integer.valueOf(). (Hint: Use Integer.valueOf(String)).
	  String strNumber2 = "123";
      Integer n2 = Integer.parseInt(strNumber2);
      System.out.println("Wrapping number: " + n2);
      
 //     i. Declare two integer variables with values 10 and 20, and add them using a method from the Integer class. (Hint: Use Integer.sum(int, int)).
	   int x=10;
      int y= 20;
      System.out.println("Addition of two Int " +Integer.sum(x, y));
      
 //     j. Declare two integer variables with values 10 and 20, and find the minimum and maximum values using the Integer class. (Hint: Use Integer.min(int, int) and Integer.max(int, int)).
      int l=10;
      int m= 20;
      System.out.println(Integer.min(l, m));
      System.out.println(Integer.max(l, m));
      
 //    k. Declare an integer variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Integer class. (Hint: Use Integer.toBinaryString(int), Integer.toOctalString(int), and Integer.toHexString(int)).
      int o = 7;
      System.out.println("Binary : " + Integer.toBinaryString(o));
      System.out.println("Octal : " + Integer.toOctalString(o));
      System.out.println("HexaDecimal : " + Integer.toHexString(o));






	}

}
