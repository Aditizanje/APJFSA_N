package Javaprogram;

public class ArithmeticExceptionDemo {
	 public static void main(String[] args) {
	        int a = 20;
	        int b = 0;

	        try {
	            // Attempt division
	            int result = a / b;
	            System.out.println("Result: " + result);
	        } catch (java.lang.ArithmeticException e) { // Explicitly refer to the built-in class
	            // Handle division by zero
	            System.out.println("Cannot divide by zero.");
	        }

	        System.out.println("Program executed successfully.");
	    }

}
/*OUTPUT:
Cannot divide by zero.
Program executed successfully.
*/