/*
 * Question 10: Input a sentence, and input a character from the user. 
 * Count the frequency of that character in the sentence string.
 * 
 * Sample Input:
 * Enter a sentence: Hello World
 * Enter a character: o
 * 
 * Sample Output:
 * Frequency of 'o': 2
 */

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        int frequency = 0;
        
        // Count frequency of the character
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ch) {
                frequency++;
            }
        }
        
        System.out.println("Frequency of '" + ch + "': " + frequency);
        
        sc.close();
    }
}
