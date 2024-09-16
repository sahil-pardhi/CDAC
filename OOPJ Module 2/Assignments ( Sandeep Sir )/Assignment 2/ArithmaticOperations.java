package Demo;

public class ArithmaticOperations {
		    public static void main(String[] args) {
		        // Parsing command line arguments
		        if (args.length < 3) {
		            System.out.println("Usage: <num1> <operator> <num2>");
		            return;
		        }
		        
		        int num1 = Integer.parseInt(args[0]);
		        char operator = args[1].charAt(0);
		        int num2 = Integer.parseInt(args[2]);

		        int result = 0;

		        // Using switch-case to perform the arithmetic operation
		        switch (operator) {
		            case '+':
		                result = num1 + num2;
		                break;
		            case '-':
		                result = num1 - num2;
		                break;
		            case '*':
		                result = num1 * num2;
		                break;
		            case '/':
		                if (num2 != 0) {
		                    result = num1 / num2;
		                } else {
		                    System.out.println("Division by zero is not allowed.");
		                    return;
		                }
		                break;
		            default:
		                System.out.println("Invalid operator. Use +, -, *, or /.");
		                return;
		        }

		        // Output the result
		        System.out.println("Result: " + result);
		    }
		
	}

