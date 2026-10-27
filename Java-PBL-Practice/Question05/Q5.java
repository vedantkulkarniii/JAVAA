/*
 * Question 5: Write a program to print all Fibonacci numbers from 1 to 200.
 * 
 * Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * 
 * Sample Output:
 * Fibonacci numbers from 1 to 200:
 * 1 1 2 3 5 8 13 21 34 55 89 144
 */

public class Q5 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        
        System.out.println("Fibonacci numbers from 1 to 200:");
        
        // Print Fibonacci numbers within range
        while (second <= 200) {
            if (second >= 1) {
                System.out.print(second + " ");
            }
            
            // Calculate next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
        
        System.out.println();
    }
}
