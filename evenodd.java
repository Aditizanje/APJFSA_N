
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Use conditional operator to check if even or odd
        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is " + result);
    }
}
