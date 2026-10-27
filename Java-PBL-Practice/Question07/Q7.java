/*
 * Question 7: Write a Java program to print the multiplication table of a given number.
 * 
 * Sample Input: 5
 * Sample Output:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * 5 x 4 = 20
 * 5 x 5 = 25
 * 5 x 6 = 30
 * 5 x 7 = 35
 * 5 x 8 = 40
 * 5 x 9 = 45
 * 5 x 10 = 50
 */

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("\nMultiplication table of " + num + ":");
        
        // Print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        sc.close();
    }
}
