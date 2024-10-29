package Javaprogram;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter student's marks (0-100): ");
        int marks = sc.nextInt();

        // Validate input (check if marks are within the range of 0-100)
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Please enter marks in the range of 0 to 100.");
        } else {
            // Determine grade based on marks
            if (marks > 90) {
                System.out.println("The student's grade is: A");
            } else if (marks > 80) {
                System.out.println("The student's grade is: B");
            } else if (marks > 70) {
                System.out.println("The student's grade is: C");
            } else if (marks > 60) {
                System.out.println("The student's grade is: D");
            } else {
                System.out.println("The student's grade is: Failed...");
            }
        }

        // Close the scanner to prevent resource leaks
        sc.close();
    }

}
    /*OUTPUT:Enter student's marks (0-100): 90
             The student's grade is: B*/

