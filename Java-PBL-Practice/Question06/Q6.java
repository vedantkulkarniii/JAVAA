/*
 * Question 6: Input an array of n numbers. Reverse the digits of each number 
 * and store it in another array. Print the reversed numbers.
 * 
 * Sample Input:
 * Enter number of elements: 5
 * Enter elements: 123 456 789 1000 5678
 * 
 * Sample Output:
 * Original array: 123 456 789 1000 5678
 * Reversed array: 321 654 987 1 8765
 */

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] original = new int[n];
        int[] reversed = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        
        // Reverse digits of each number
        for (int i = 0; i < n; i++) {
            int num = original[i];
            int rev = 0;
            
            while (num > 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }
            
            reversed[i] = rev;
        }
        
        // Display original array
        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
        
        // Display reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
