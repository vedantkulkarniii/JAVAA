/*
 * Question 17: Input a string of words. Print the palindrome words in the array, 
 * if any, otherwise display all the words.
 * 
 * Palindrome: A word that reads the same forwards and backwards (e.g., mom, dad, level)
 * 
 * Sample Input: mom is at home with dad
 * Sample Output:
 * Palindrome words: mom dad
 * 
 * Sample Input: hello world java
 * Sample Output:
 * No palindrome words found
 * All words: hello world java
 */

import java.util.Scanner;

public class Q17 {
    
    // Method to check if a word is palindrome
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string of words: ");
        String sentence = sc.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        String palindromes = "";
        int palindromeCount = 0;
        
        // Check each word for palindrome
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i].toLowerCase())) {
                palindromes += words[i] + " ";
                palindromeCount++;
            }
        }
        
        // Display result
        if (palindromeCount > 0) {
            System.out.println("Palindrome words: " + palindromes.trim());
        } else {
            System.out.println("No palindrome words found");
            System.out.print("All words: ");
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
