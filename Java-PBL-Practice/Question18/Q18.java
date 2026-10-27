/*
 * Question 18: Input a sentence and make every starting letter of every word 
 * to capital letter.
 * 
 * Sample Input: hello world from java
 * Sample Output: Hello World From Java
 */

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String result = "";
        boolean capitalizeNext = true;
        
        // Process each character
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            if (ch == ' ') {
                result += ch;
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result += Character.toUpperCase(ch);
                    capitalizeNext = false;
                } else {
                    result += Character.toLowerCase(ch);
                }
            }
        }
        
        System.out.println("Result: " + result);
        
        sc.close();
    }
}
