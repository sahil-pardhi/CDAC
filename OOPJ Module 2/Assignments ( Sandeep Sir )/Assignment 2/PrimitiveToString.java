package Demo;

public class PrimitiveToString {

	public static void main(String[] args) {
        // Initializing primitive types
        int i = 42;
        double d = 3.14;
        boolean b = true;
        char c = 'A';

        // Converting to String using toString() method of wrapper classes
        String intStr1 = Integer.toString(i);
        String doubleStr1 = Double.toString(d);
        String booleanStr1 = Boolean.toString(b);
        String charStr1 = Character.toString(c);

        // Converting to String using String.valueOf() method
        String intStr2 = String.valueOf(i);
        String doubleStr2 = String.valueOf(d);
        String booleanStr2 = String.valueOf(b);
        String charStr2 = String.valueOf(c);

        // Printing the results
        System.out.println("Using toString(): " + intStr1 + ", " + doubleStr1 + ", " + booleanStr1 + ", " + charStr1);
        System.out.println("Using valueOf(): " + intStr2 + ", " + doubleStr2 + ", " + booleanStr2 + ", " + charStr2);

	}

}
