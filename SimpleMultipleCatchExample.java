package Javaprogram;

public class SimpleMultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Example 1: ArithmeticException (division by zero)
            int result = 10 / 0; // This will throw ArithmeticException

            // Example 2: ArrayIndexOutOfBoundsException (invalid array index)
            int[] numbers = new int[3];
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a generic Exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always runs.");
        }

        System.out.println("Program continues after the try-catch-finally block.");
    }
}
/*OUTPUT:
Caught an ArithmeticException: / by zero
This is the finally block. It always runs.
Program continues after the try-catch-finally block.*/