package Javaprogram;

public class AutoboxingExample {
    public static void main(String[] args) {
        
        // Autoboxing: converting primitive types to wrapper objects
        int num = 100;
        Integer numObj = num; // Autoboxing 'int' to 'Integer'
        
        char letter = 'A';
        Character letterObj = letter; // Autoboxing 'char' to 'Character'
        
        double decimal = 10.5;
        Double decimalObj = decimal; // Autoboxing 'double' to 'Double'

        boolean flag = true;
        Boolean flagObj = flag; // Autoboxing 'boolean' to 'Boolean'
        
        // Printing the wrapper objects
        System.out.println("Integer object: " + numObj);
        System.out.println("Character object: " + letterObj);
        System.out.println("Double object: " + decimalObj);
        System.out.println("Boolean object: " + flagObj);

        // Performing operations with autoboxed objects
        numObj += 50; // Unboxing, operation, and autoboxing again
        System.out.println("Updated Integer object after addition: " + numObj);
    }
}
/*OUTPUT:
Integer object: 100
Character object: A
Double object: 10.5
Boolean object: true
Updated Integer object after addition: 150
*/
