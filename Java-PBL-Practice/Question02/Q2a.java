/*
 * Question 2(a): Write a program to print the following pattern:
 * 
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * Sample Output:
 * *****
 * ****
 * ***
 * **
 * *
 */

public class Q2a {
    public static void main(String[] args) {
        int rows = 5;
        
        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
