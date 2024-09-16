package Demo;

public class Shorts {

	public static void main(String[] args) {
		
		

		//	b. Write a program to test how many bytes are used to represent a short value using the BYTES field. (Hint: Use Short.BYTES).
		int bytesUsed = Short.BYTES;
        System.out.println(" Number of bytes used to represent a short value: " + bytesUsed);
		
		//	c. Write a program to find the minimum and maximum values of short using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Short.MIN_VALUE and Short.MAX_VALUE).
        System.out.println("Range of Short from : " + Short.MIN_VALUE);
        System.out.println("Range of Short To : " + Short.MAX_VALUE);

        
        //	d. Declare a method-local variable number of type short with some value and convert it to a String using the toString method. (Hint: Use Short.toString(short)).
        short number =123;
        String str = Short.toString(number);
        System.out.println("short to string: "+str );
        
        //	e. Declare a method-local variable strNumber of type String with some value and convert it to a short value using the parseShort method. (Hint: Use Short.parseShort(String)).
        String a = "123";
        short st = Short.parseShort(a);
        System.out.println("String to Short: " + st );
        
        //	f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a short value. (Hint: parseShort method will throw a NumberFormatException)
        
        /*
          String b = "Ab12Cd3";
        short sh = Short.parseShort(b);
        System.out.println("String to Short: " + sh );
        Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"

         */
      

        //  g. Declare a method-local variable number of type short with some value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(short)).
        short c =123;
        Short st1 = Short.valueOf(c);
        System.out.println("Short to Wrapper: "+st1);
        
        //  h. Declare a method-local variable strNumber of type String with some short value and convert it to the corresponding wrapper class using Short.valueOf(). (Hint: Use Short.valueOf(String)).
        String d = "123";
        Short st2 = Short.valueOf(d);
        System.out.println("Short to Wrapper: "+st2);

        
        
        //i. Experiment with converting a short value into other primitive types or vice versa and observe the results.     
        short e = 321;
        long var = Short.valueOf(e);
        System.out.println("Short to long: "+ var);


	}

}
