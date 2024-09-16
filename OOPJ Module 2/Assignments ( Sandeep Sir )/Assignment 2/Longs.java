package Demo;

public class Longs {

	public static void main(String[] args) {

//		b. Write a program to test how many bytes are used to represent a long value using the BYTES field. (Hint: Use Long.BYTES).

		System.out.println("Bytes for Long: " + Long.BYTES);

//		c. Write a program to find the minimum and maximum values of long using the MIN_VALUE and MAX_VALUE fields. (Hint: Use Long.MIN_VALUE and Long.MAX_VALUE).
		System.out.println("Range of long from: " + Long.MIN_VALUE);
		System.out.println("Range of long to: " + Long.MAX_VALUE);

//			d. Declare a method-local variable number of type long with some value and convert it to a String using the toString method. (Hint: Use Long.toString(long)).
		long n = 741;
		String str = Long.toString(n);
		System.out.println(str);

//			e. Declare a method-local variable strNumber of type String with some value and convert it to a long value using the parseLong method. (Hint: Use Long.parseLong(String)).
		String strNumber = "852";
		long lg = Long.parseLong(strNumber);
		System.out.println(lg);

//			f. Declare a method-local variable strNumber of type String with the value "Ab12Cd3" and attempt to convert it to a long value. (Hint: parseLong method will throw a NumberFormatException).
		/*
		 * String strNumber = "Ab12Cd3"; long lg = Long.parseLong(strNumber);
		 * System.out.println(lg); Exception in thread "main"
		 * java.lang.NumberFormatException: For input string: "Ab12Cd3"
		 */
//			g. Declare a method-local variable number of type long with some value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(long)).
		long number = 564;
		Long l = Long.valueOf(number);
		System.out.println(l);

//			h. Declare a method-local variable strNumber of type String with some long value and convert it to the corresponding wrapper class using Long.valueOf(). (Hint: Use Long.valueOf(String)).
		String str1 = "10010";
		Long a = Long.valueOf(str1);
		System.out.println(a);

//			i. Declare two long variables with values 1123 and 9845, and add them using a method from the Long class. (Hint: Use Long.sum(long, long)).
		long b = 1123;
		long c = 9845;
		System.out.println(Long.sum(b, c));

//			j. Declare two long variables with values 1122 and 5566, and find the minimum and maximum values using the Long class. (Hint: Use Long.min(long, long) and Long.max(long, long)).
		long d = 1122;
		long e = 5566;
		System.out.println(Long.min(d, e));
		System.out.println(Long.max(d, e));

//			k. Declare a long variable with the value 7. Convert it to binary, octal, and hexadecimal strings using methods from the Long class. (Hint: Use 
		long x = 10;

		System.out.println(Long.toBinaryString(x));
		System.out.println(Long.toOctalString(x));
		System.out.println(Long.toHexString(x));

	}

}
