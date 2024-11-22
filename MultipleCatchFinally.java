package Javaprogram;

public class MultipleCatchFinally {
	public static void main(String[] args) {
        try {
            // Simulate code with potential exceptions
            int[] numbers = {10, 20, 30};
            int result = numbers[1] / 0; // ArithmeticException
            System.out.println("Result: " + result);

            int value = numbers[3]; // ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }

        System.out.println("Program continues after exception handling.");
    }

}
/*OUTPUT:
Error: Division by zero is not allowed.
This is the finally block. It always executes.
Program continues after exception handling.
*/
