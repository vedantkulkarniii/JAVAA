/*
 * Question 16: Input a lower range and upper range from the user. Print all the 
 * Armstrong numbers within that range. You can use the method isArmstrong(int n) 
 * for checking for an Armstrong number.
 * 
 * Armstrong Number: A number that is equal to the sum of its own digits each raised 
 * to the power of the number of digits.
 * Example: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * 
 * Sample Input:
 * Enter lower range: 1
 * Enter upper range: 1000
 * 
 * Sample Output:
 * Armstrong numbers between 1 and 1000:
 * 1 2 3 4 5 6 7 8 9 153 370 371 407
 */

import java.util.Scanner;

public class Q16 {
    
    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = 0;
        
        // Count number of digits
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        
        // Calculate sum of digits raised to power of number of digits
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        return sum == original;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();
        
        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();
        
        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");
        
        // Find and print Armstrong numbers in range
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        
        sc.close();
    }
}
