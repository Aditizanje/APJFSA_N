package Javaprogram;

public class SimpleUnboxing {
    public static void main(String[] args) {
        // Creating wrapper objects
        Integer numObj = 20;    // Autoboxing 'int' to 'Integer'
        Double decimalObj = 15.75; // Autoboxing 'double' to 'Double'
        Character charObj = 'A';   // Autoboxing 'char' to 'Character'

        // Unboxing: converting wrapper objects back to primitive types
        int num = numObj;          // Unboxing 'Integer' to 'int'
        double decimal = decimalObj; // Unboxing 'Double' to 'double'
        char letter = charObj;     // Unboxing 'Character' to 'char'

        // Printing the primitive values
        System.out.println("Primitive int: " + num);
        System.out.println("Primitive double: " + decimal);
        System.out.println("Primitive char: " + letter);
    }
}
/*OUTPUT:
Primitive int: 20
Primitive double: 15.75
Primitive char: A
*/