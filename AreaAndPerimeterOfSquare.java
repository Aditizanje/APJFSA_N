package Javaprogram;

public class AreaAndPerimeterOfSquare {
	 // Method to calculate the area of a square
    public void areaOfSquare(float side) {
        float ans = side * side; // calculating area using formula
        System.out.println("Area of Square: " + ans);
    }

    // Method to calculate the perimeter of a square
    public void perimeter(float side) {
        float val = 4 * side; // calculating perimeter using formula
        System.out.println("Perimeter of Square: " + val);
    }

    public static void main(String[] args) {
        AreaAndPerimeterOfSquare obj = new AreaAndPerimeterOfSquare(); // instance of class

        obj.areaOfSquare(4); // Passing value of side as a parameter
        obj.perimeter(4);    // Passing value of side as a parameter
    }
}
