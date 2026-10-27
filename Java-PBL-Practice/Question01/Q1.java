/*
 * Question 1: Write a program to input a number and check if it is a Perfect Number or not.
 * Use the Boolean method isPerfect(int n) to check for the given condition.
 * 
 * Perfect Number: A positive integer which is equal to the sum of its positive factors
 * (excluding the number itself).
 * Example: 6 = Factors of 6 = 1, 2, 3 = 1+2+3 = 6
 * 
 * Sample Input: 6
 * Sample Output: 6 is a Perfect Number
 * 
 * Sample Input: 10
 * Sample Output: 10 is not a Perfect Number
 */

import java.util.Scanner;

public class Q1 {
    
    // Method to check if a number is perfect
    public static boolean isPerfect(int n) {
        if (n <= 0) {
            return false;
        }
        
        int sum = 0;
        
        // Find all factors except the number itself
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        // Check if sum of factors equals the number
        return sum == n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
        
        sc.close();
    }
}
