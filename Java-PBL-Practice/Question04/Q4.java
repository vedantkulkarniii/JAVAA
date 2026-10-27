/*
 * Question 4: You are a librarian in a library. You want to make entry for 10 new books.
 * Take input for the 10 books – Name of the books and name of its author respectively.
 * Arrange the books in alphabetical order. Authors' names should also be arranged 
 * accordingly with the corresponding book.
 * Use the two arrays book[] and author[] to store the book and author names respectively.
 * 
 * Sample Input:
 * Book 1: Java Programming, Author: John Doe
 * Book 2: Data Structures, Author: Jane Smith
 * ... (10 books)
 * 
 * Sample Output:
 * Books in alphabetical order:
 * 1. Data Structures - Jane Smith
 * 2. Java Programming - John Doe
 * ...
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] book = new String[10];
        String[] author = new String[10];
        
        // Input book and author names
        System.out.println("Enter details for 10 books:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter book " + (i + 1) + " name: ");
            book[i] = sc.nextLine();
            System.out.print("Enter author name: ");
            author[i] = sc.nextLine();
        }
        
        // Sort books and authors in alphabetical order using bubble sort
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                // Compare book names (case-insensitive)
                if (book[j].compareToIgnoreCase(book[j + 1]) > 0) {
                    // Swap books
                    String tempBook = book[j];
                    book[j] = book[j + 1];
                    book[j + 1] = tempBook;
                    
                    // Swap corresponding authors
                    String tempAuthor = author[j];
                    author[j] = author[j + 1];
                    author[j + 1] = tempAuthor;
                }
            }
        }
        
        // Display sorted books and authors
        System.out.println("\nBooks in alphabetical order:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + book[i] + " - " + author[i]);
        }
        
        sc.close();
    }
}
