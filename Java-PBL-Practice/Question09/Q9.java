/*
 * Question 9: Input a sentence and count the number of words in the sentence, 
 * without using StringTokenizer.
 * 
 * Sample Input: Hello World from Java Programming
 * Sample Output: Number of words: 5
 */

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        // Trim leading and trailing spaces
        sentence = sentence.trim();
        
        int wordCount = 0;
        
        // If sentence is empty, word count is 0
        if (sentence.length() == 0) {
            wordCount = 0;
        } else {
            // Count words by counting spaces
            wordCount = 1; // At least one word if sentence is not empty
            
            for (int i = 0; i < sentence.length(); i++) {
                // If space is found and next character is not space, increment count
                if (sentence.charAt(i) == ' ') {
                    if (i + 1 < sentence.length() && sentence.charAt(i + 1) != ' ') {
                        wordCount++;
                    }
                }
            }
        }
        
        System.out.println("Number of words: " + wordCount);
        
        sc.close();
    }
}
