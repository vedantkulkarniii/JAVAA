/*
 * Question 8: Write a Java program to find the largest and smallest elements in an array.
 * 
 * Sample Input:
 * Enter number of elements: 5
 * Enter elements: 45 12 78 23 67
 * 
 * Sample Output:
 * Largest element: 78
 * Smallest element: 12
 */

import java.util.Scanner;

public class Q8 {
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
        
        // Initialize largest and smallest with first element
        int largest = arr[0];
        int smallest = arr[0];
        
        // Find largest and smallest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        
        sc.close();
    }
}
