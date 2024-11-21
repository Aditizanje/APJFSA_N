package Javaprogram;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Trying to divide by zero (which will cause an ArithmeticException)
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block will handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Finally block will always execute, regardless of whether an exception occurred or not
            System.out.println("This is the finally block, it always executes.");
        }

        System.out.println("Program continues after the try-catch-finally block.");
    }
}
/*OUTPUT:
Exception caught: / by zero
This is the finally block, it always executes.
Program continues after the try-catch-finally block.*/
