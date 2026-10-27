/*
 * Question 20: Input an array of N numbers. Print the smallest and largest number 
 * in the array. Calculate the sum of the remaining elements of the array.
 * 
 * Sample Input:
 * Enter number of elements: 5
 * Enter elements: 10 20 30 40 50
 * 
 * Sample Output:
 * Smallest number: 10
 * Largest number: 50
 * Sum of remaining elements: 90
 * (Remaining elements: 20, 30, 40)
 */

import java.util.Scanner;

public class Q20 {
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
        
        // Find smallest and largest
        int smallest = arr[0];
        int largest = arr[0];
        int totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        // Calculate sum of remaining elements (exclude smallest and largest)
        int sumOfRemaining = totalSum - smallest - largest;
        
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        System.out.println("Sum of remaining elements: " + sumOfRemaining);
        
        sc.close();
    }
}
