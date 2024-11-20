package Javaprogram;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input: elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Finding the largest element
        int largest = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}
/*Output:
Enter the size of the array: 5
Enter the elements of the array:
12
34
55
87
95
The largest element in the array is: 95
*/
