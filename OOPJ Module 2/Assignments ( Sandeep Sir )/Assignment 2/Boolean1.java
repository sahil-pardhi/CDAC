package Demo;

public class Boolean1 {

	public static void main(String[] args) {
		
		//b. Declare a method-local variable status of type boolean with the value true and convert it to a String using the toString method. 
		//(Hint: Use Boolean.toString(Boolean) ).
		boolean a = true;
		String b = Boolean.toString(a);
        System.out.println("Status as String: " + b);	        
        
        //c. Declare a method-local variable strStatus of type String with the value "true" and convert it to a boolean using the parseBoolean method. 
        //(Hint: Use Boolean.parseBoolean(String)).
        String c = "true";
        boolean d = Boolean.parseBoolean(c);
        System.out.println("Status as Boolean: " + d);
        
        //d. Declare a method-local variable strStatus of type String with the value "1" or "0" and attempt to convert it to a boolean. 
        //(Hint: parseBoolean method will not work as expected with "1" or "0").
        String e = "0";
        boolean f = "1".equals(e);
        System.out.println("Status as Boolean: " + f);
        
		//e. Declare a method-local variable status of type boolean with the value true and convert it to the corresponding wrapper class using Boolean.valueOf(). 
        //(Hint: Use Boolean.valueOf(boolean)).
        boolean g = true;
        Boolean h = Boolean.valueOf(g);
        System.out.println("Status as Boolean Wrapper: " + h);
        
		//f. Declare a method-local variable strStatus of type String with the value "true" and convert it to the corresponding wrapper class using Boolean.valueOf().
        //(Hint: Use Boolean.valueOf(String)).
        String i = "true";
        Boolean j = Boolean.valueOf(i);
        System.out.println("Status as Boolean Wrapper: " + j);
        
        
		//g. Experiment with converting a boolean value into other primitive types or vice versa and observe the results.

        Boolean statusWrapper = Boolean.valueOf(true);
        
        // Output the wrapper object
        System.out.println("Boolean Wrapper: " + statusWrapper);

        // Convert Boolean to int manually (true -> 1, false -> 0)
        int intStatus = statusWrapper ? 1 : 0;
        System.out.println("Boolean Wrapper to int: " + intStatus);

        // Convert Boolean to double manually
        double doubleStatus = statusWrapper ? 1.0 : 0.0;
        System.out.println("Boolean Wrapper to double: " + doubleStatus);

        // Convert an Integer to a Boolean using custom logic (1 -> true, 0 -> false)
        Integer num = 1;
        Boolean fromIntToBoolean = (num != 0);
        System.out.println("Integer to Boolean Wrapper: " + fromIntToBoolean);

        // Convert a Double to a Boolean using custom logic (1.0 -> true, other values -> false)
        Double numDouble = 0.0;
        Boolean fromDoubleToBoolean = (numDouble == 1.0);
        System.out.println("Double to Boolean Wrapper: " + fromDoubleToBoolean);
        
	}

}
