/*
 * Question 19: Input a number and print the factorial of the number.
 * 
 * Factorial: Product of all positive integers less than or equal to n
 * Example: 5! = 5 × 4 × 3 × 2 × 1 = 120
 * 
 * Sample Input: 5
 * Sample Output: Factorial of 5 = 120
 */

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            long factorial = 1;
            
            // Calculate factorial
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            
            System.out.println("Factorial of " + num + " = " + factorial);
        }
        
        sc.close();
    }
}
