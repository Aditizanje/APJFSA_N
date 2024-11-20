package Javaprogram;

import java.util.Scanner;

public class SmallestElementInArray {
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

        // Finding the smallest element
        int smallest = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Output the smallest element
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
/*Output:
Enter the size of the array: 5
Enter the elements of the array:
45
76
56
12
98
The smallest element in the array is: 12*/
