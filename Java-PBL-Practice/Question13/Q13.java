/*
 * Question 13: Input a string and change every vowel to the previous consonant. 
 * 'a' should be changed to 'z'.
 * 
 * Example:
 * a -> z, e -> d, i -> h, o -> n, u -> t
 * A -> Z, E -> D, I -> H, O -> N, U -> T
 * 
 * Sample Input: Hello World
 * Sample Output: Hdlln Wnrld
 */

import java.util.Scanner;

public class Q13 {
    
    // Method to get previous consonant
    public static char getPreviousConsonant(char vowel) {
        switch (vowel) {
            case 'a':
            case 'A':
                return (vowel == 'a') ? 'z' : 'Z';
            case 'e':
            case 'E':
                return (vowel == 'e') ? 'd' : 'D';
            case 'i':
            case 'I':
                return (vowel == 'i') ? 'h' : 'H';
            case 'o':
            case 'O':
                return (vowel == 'o') ? 'n' : 'N';
            case 'u':
            case 'U':
                return (vowel == 'u') ? 't' : 'T';
            default:
                return vowel;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String result = "";
        
        // Process each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                result += getPreviousConsonant(ch);
            } else {
                result += ch;
            }
        }
        
        System.out.println("Result: " + result);
        
        sc.close();
    }
}
