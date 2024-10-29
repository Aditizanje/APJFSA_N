package Javaprogram;

public class NarrowingTypeCasting {	    
	    // Declare variables
	    double doubleVar = 40.0;
	    long longVar = 80;

	    public void typeCasting() {
	        // Printing values before type casting
	        System.out.println("Before Type Casting Double: " + doubleVar);
	        System.out.println("Before Type Casting Long: " + longVar);

	        // Type casting
	        int x = (int) doubleVar; // Double to Integer
	        int y = (int) longVar;   // Long to Integer

	        // Printing values after type casting
	        System.out.println("After Type Casting Double: " + x);
	        System.out.println("After Type Casting Long: " + y);
	    }

	    public static void main(String[] args) {
	        NarrowingTypeCasting obj = new NarrowingTypeCasting();
	        obj.typeCasting();
	    }
	}
       /*OUTPUT:Before Type Casting Double: 40.0
               Before Type Casting Long: 80
               After Type Casting Double: 40
               After Type Casting Long: 80*/


