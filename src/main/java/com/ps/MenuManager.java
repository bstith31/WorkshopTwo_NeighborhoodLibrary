package com.ps;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuManager {

    //Option 1 to display available books
    public static void displayAvailableBooks(Scanner scanner){

        System.out.println("Here is list of our currently available books: ");
        boolean booksAvailable = false;
        for (Book book : BookManager.initializeLibrary()) {
            if (!book.isCheckedOut()) {
                System.out.println(book.getTitle());
                booksAvailable = true;
            }
        }
        if (!booksAvailable) {
            System.out.println("Books all checked out");
        }
    }

    //Option 2 to display checked out books
    public static void displayCheckedOutBooks(Scanner scanner) {

        System.out.println("Here is a list of our currently checked out books: ");
        boolean anyCheckOut = false;
        for (Book book : BookManager.initializeLibrary()) {
            if (book.isCheckedOut()) {
                System.out.println(book.getTitle());
                anyCheckOut = true;
            }
        }
        if (!anyCheckOut) {
            System.out.println("No books are currently checked out.");

        }
    }

    public static void checkInBook(Scanner scanner) {

        System.out.println("Please enter the ID of the book you want to check in: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        Book[] library = BookManager.initializeLibrary();
        for (Book book : library) {
            if (book.getId() == bookId) {
                if (book.isCheckedOut()) {
                    book.setCheckedOut(false);
                    book.setPersonCheckOut("None");
                    System.out.println("Book checked in successfully.");
                } else {
                    System.out.println("This book is not checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void checkOutBook(Scanner scanner) {

        System.out.println("Which of my favorite books do you want to take home with you?");
    }

}
