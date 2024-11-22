package Javaprogram;

public class ArrayIndexOutOfBounds {
	 public static void main(String[] args) {
	        int[] numbers = {10, 20, 30};

	        try {
	            // Attempt to access an invalid index
	            System.out.println("Accessing element at index 3: " + numbers[3]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Handle the exception
	            System.out.println("Error: Array index is out of bounds.");
	            System.out.println("Exception Message: " + e.getMessage());
	        }

	        System.out.println("Program continues after exception handling.");
	    }
}
/*OUTPUT:
Error: Array index is out of bounds.
Exception Message: Index 3 out of bounds for length 3
Program continues after exception handling.
*/