package Demo;

public class DefaultValues {
	int intValue;
    double doubleValue;
    boolean booleanValue;
    char charValue;

    public static void main(String[] args) {
        DefaultValues defaultValues = new DefaultValues();

        System.out.println("Default int value: " + defaultValues.intValue);
        System.out.println("Default double value: " + defaultValues.doubleValue);
        System.out.println("Default boolean value: " + defaultValues.booleanValue);
        System.out.println("Default char value: " + defaultValues.charValue);
}
}
