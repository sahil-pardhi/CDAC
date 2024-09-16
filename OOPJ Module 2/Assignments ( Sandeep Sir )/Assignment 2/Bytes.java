package Demo;

public class Bytes {

	public static void main(String[] args) {
		

//		b. Write a program to test how many bytes are used to represent a byte value using the BYTES field. 
	   //(Hint: Use Byte.BYTES).		   
		   int numberOfBytes = Byte.BYTES;
		   System.out.println("Number of bytes used to represent a byte value is: " + numberOfBytes);
		     
	        
//			c. Write a program to find the minimum and maximum values of byte using the MIN_VALUE and MAX_VALUE fields.
	        //(Hint: Use Byte.MIN_VALUE and Byte.MAX_VALUE).
	        byte minValue = Byte.MIN_VALUE;
	        byte maxValue = Byte.MAX_VALUE;
	        System.out.println("Min value of byte: " + minValue);
	        System.out.println("Max value of byte: " + maxValue);

	        //d. Declare a method-local variable number of type byte with some value and convert it to a String using the toString method. (Hint: Use Byte.toString(byte)).
	        byte n = 10;
	        String str = Byte.toString(n);
	        System.out.println("Status as String: " + str);
	        
//	        e. Declare a method-local variable strNumber of type String with some value and convert it to a byte value using the parseByte method.
//          (Hint: Use Byte.parseByte(String)).
	        String str1 = "1";
	        byte b = Byte.parseByte(str1);
	        System.out.println("Status as Byte: " + b);
	        
	        //f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a byte value. 
	        //(Hint: parseByte method will throw a NumberFormatException).
	        /*
	        String strNumber = "Ab12Cd3";
	        byte bt = Byte.parseByte(strNumber);
	        System.out.println("Ststus of Ab12Cd3 : ");
	        //Exception in thread "main" java.lang.NumberFormatException: For input string: "Ab12Cd3"
	        */
	        
	        //g. Declare a method-local variable number of type byte with some value and convert it to the corresponding wrapper class using Byte.valueOf(). 
	        //(Hint: Use Byte.valueOf(byte)).
	        byte number = 12;
	        Byte bt12 = Byte.valueOf(number);
	        System.out.println("Converting byte to its Wrapper: " +bt12);
	        
	        //h. Declare a method-local variable strNumber of type String with some byte value and convert it to the corresponding wrapper class using Byte.valueOf(). 
	        //(Hint: Use Byte.valueOf(String)).
	        String strNumber = "12";
	        Byte bt = Byte.valueOf(strNumber);
	        System.out.println("Converting string to Wrapper byte: " + bt);
	        
	        
	        //i. Experiment with converting a byte value into other primitive types or vice versa and observe the results.      
	        byte bt11 = 11;
	        long lg = Byte.valueOf(bt11);
	        System.out.println("Converting to long: "+lg);


	        
	        




	}

}
