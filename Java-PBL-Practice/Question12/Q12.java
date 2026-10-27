/*
 * Question 12: Write a Java program to input a sentence and count the number of vowels in it.
 * 
 * Sample Input: Hello World
 * Sample Output: Number of vowels: 3
 * (Vowels: e, o, o)
 */

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        int vowelCount = 0;
        
        // Convert to lowercase for easy comparison
        sentence = sentence.toLowerCase();
        
        // Count vowels
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        
        sc.close();
    }
}
