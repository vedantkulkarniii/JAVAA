/*
 * Question 2(c): Write a program to print the following pattern:
 * 
 * #
 * @@
 * ###
 * @@@@
 * 
 * Sample Output:
 * #
 * @@
 * ###
 * @@@@
 */

public class Q2c {
    public static void main(String[] args) {
        int rows = 4;
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing characters
            for (int j = 1; j <= i; j++) {
                // Alternate between # and @
                if (i % 2 == 1) {
                    System.out.print("#");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
    }
}
