package Javaprogram;

//Parent class: Shape
class shape {
String color;

// Constructor
shape(String color) {
	 this.color = color;
   System.out.println("Shape constructor called");
}

// Method
void displayColor() {
   System.out.println("Color: " + color);
}
}

//Child class: Circle
class Circle extends shape {
double radius;

// Constructor
Circle (String color, double radius) {
   super(color); // Invoking parent class constructor using super
   this.radius = radius;
   System.out.println("Circle constructor called");
}
// Method
void displayCircleInfo() {
   super.displayColor(); // Invoking parent class method using super
   System.out.println("Radius: " + radius);
}
}
public class superkeyword {

public static void main(String[] args) {
	 Circle circle = new Circle("Red", 5.0);
   circle.displayCircleInfo();
}
}
/*OUTPUT:
Shape constructor called
Circle constructor called
Color: Red
Radius: 5.0
*/