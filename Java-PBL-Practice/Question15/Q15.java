/*
 * Question 15: Input an array of n numbers. Print the sum of digits of each number.
 * 
 * Sample Input:
 * Enter number of elements: 4
 * Enter elements: 123 456 789 1000
 * 
 * Sample Output:
 * Sum of digits of 123 = 6
 * Sum of digits of 456 = 15
 * Sum of digits of 789 = 24
 * Sum of digits of 1000 = 1
 */

import java.util.Scanner;

public class Q15 {
    
    // Method to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Calculate and print sum of digits for each number
        System.out.println("\nSum of digits:");
        for (int i = 0; i < n; i++) {
            int sum = sumOfDigits(arr[i]);
            System.out.println("Sum of digits of " + arr[i] + " = " + sum);
        }
        
        sc.close();
    }
}
