public class SwapUsingTemp {
    public static void main(String[] args) {
        int a = 6, b = 8;

        // Display initial values
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Display swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
