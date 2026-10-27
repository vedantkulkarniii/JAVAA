/*
 * Question 14: Input an array of n numbers. Display the inputted numbers present 
 * at every odd index of the array. Calculate the total sum and average of those 
 * numbers (at odd index positions).
 * 
 * Note: Array indices start from 0, so odd indices are 1, 3, 5, 7, ...
 * 
 * Sample Input:
 * Enter number of elements: 6
 * Enter elements: 10 20 30 40 50 60
 * 
 * Sample Output:
 * Elements at odd indices: 20 40 60
 * Sum: 120
 * Average: 40.0
 */

import java.util.Scanner;

public class Q14 {
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
        
        int sum = 0;
        int count = 0;
        
        System.out.print("Elements at odd indices: ");
        
        // Process elements at odd indices
        for (int i = 1; i < n; i += 2) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
            count++;
        }
        
        System.out.println();
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No elements at odd indices");
        }
        
        sc.close();
    }
}
