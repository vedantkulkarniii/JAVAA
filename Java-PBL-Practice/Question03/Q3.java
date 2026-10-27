/*
 * Question 3: Write a program to input a string and count the number of letters 
 * and special characters in it.
 * 
 * Sample Input: Hello@World123!
 * Sample Output:
 * Number of letters: 10
 * Number of special characters: 2
 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int letterCount = 0;
        int specialCharCount = 0;
        
        // Iterate through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character is a letter
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letterCount++;
            }
            // Check if character is not a letter, digit, or space (special character)
            else if (!Character.isDigit(ch) && ch != ' ') {
                specialCharCount++;
            }
        }
        
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of special characters: " + specialCharCount);
        
        sc.close();
    }
}
