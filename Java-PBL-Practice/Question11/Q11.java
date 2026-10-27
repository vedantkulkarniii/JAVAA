/*
 * Question 11: Input an array of n numbers. Count and print all the prime numbers 
 * entered in the array.
 * 
 * Sample Input:
 * Enter number of elements: 6
 * Enter elements: 2 4 5 8 11 15
 * 
 * Sample Output:
 * Prime numbers in the array: 2 5 11
 * Total prime numbers: 3
 */

import java.util.Scanner;

public class Q11 {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        
        // Check for factors up to square root of num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
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
        
        int primeCount = 0;
        System.out.print("Prime numbers in the array: ");
        
        // Check and print prime numbers
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                primeCount++;
            }
        }
        
        System.out.println("\nTotal prime numbers: " + primeCount);
        
        sc.close();
    }
}
