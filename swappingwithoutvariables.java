package Javaprogram;

public class swappingwithoutvariables {
	
	    public static void main(String[] args) {
	        int x = 5; // Example values
	        int y = 10;
	        
	        // Before swapping
	        System.out.println("Before swapping: x = " + x + ", y = " + y);
	        
	        // Swapping without using a third variable
	        x = x + y; // x becomes 15 (5 + 10)
	        y = x - y; // y becomes 5 (15 - 10)
	        x = x - y; // x becomes 10 (15 - 5)
	        
	        // After swapping
	        System.out.println("After swapping: x = " + x + ", y = " + y);
	    }
	

}
