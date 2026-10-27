/*
 * Question 2(b): Write a program to print the following pattern:
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * Sample Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

public class Q2b {
    public static void main(String[] args) {
        int rows = 5;
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
