package com.ps;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int userInput;
        boolean validChoice = false;

        Book[] brianLibrary = BookManager.initializeLibrary();

        //Initial Book Array
        //
//        Book[] brianlibrary = new Book[21];
//        brianlibrary[0] = new Book(0, "1111-1111-1111", "Book 1", false, "None");
//        brianlibrary[1] = new Book(1, "1111-1111-1112", "Book 2", false, "None");
//        brianlibrary[2] = new Book(11, "1111-1111-1113", "Book 3", false, "None");
//        brianlibrary[3] = new Book(111, "1111-1111-1114", "Book 4", false, "None");
//        brianlibrary[4] = new Book(112, "1111-1111-1115", "Book 5", false, "None");
//        brianlibrary[5] = new Book(121, "1111-1111-1116", "Book 6", false, "None");
//        brianlibrary[6] = new Book(211, "1111-1111-1117", "Book 7", false, "None");
//        brianlibrary[7] = new Book(113, "1111-1111-1118", "Book 8", false, "None");
//        brianlibrary[8] = new Book(131, "1111-1111-1119", "Book 9", false, "None");
//        brianlibrary[9] = new Book(311, "1111-1111-1120", "Book 10", false, "None");
//        brianlibrary[10] = new Book(114, "1111-1111-1121", "Book 11", false, "None");
//        brianlibrary[11] = new Book(141, "1111-1111-1122", "Book 12", false, "None");
//        brianlibrary[12] = new Book(411, "1111-1111-1123", "Book 13", false, "None");
//        brianlibrary[13] = new Book(115, "1111-1111-1124", "Book 14", false, "None");
//        brianlibrary[14] = new Book(151, "1111-1111-1125", "Book 15", false, "None");
//        brianlibrary[15] = new Book(511, "1111-1111-1126", "Book 16", false, "None");
//        brianlibrary[16] = new Book(116, "1111-1111-1127", "Book 17", false, "None");
//        brianlibrary[17] = new Book(161, "1111-1111-1128", "Book 18", false, "None");
//        brianlibrary[18] = new Book(611, "1111-1111-1129", "Book 19", false, "None");
//        brianlibrary[19] = new Book(117, "1111-1111-1130", "Book 20", false, "None");
//        brianlibrary[20] = new Book(171, "1111-1111-1131", "Book 21", false, "None");

       // Map<Integer, String> availableBooks;

        System.out.println("Welcome to Brian's Book Buddies!!! I hope you'll enjoy our selection!");
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hey there, " + name + "! What would you like to do? Please select from one of the following options");

        do {
            System.out.print(" 1. Look up available books\n" +
                    " 2. Show checked out books\n" +
                    " 3. Check in a book\n" +
                    " 4. Exit menu\n" +
                    " Please enter your choice: ");

            try {
                userInput = scanner.nextInt();
                scanner.nextLine();
                switch (userInput) {
                    case 1:
                        validChoice = true;
                        System.out.println("Here is list of our currently available books: ");
                        boolean booksAvailable = false;
                        for (Book book : brianLibrary){
                            if (!book.isCheckedOut()) {
                                System.out.println(book.getTitle());
                                booksAvailable = true;
                            }
                        }
                        if (!booksAvailable){
                            System.out.println("Books all checked out");
                        }
                        break;
                    case 2:
                        validChoice = true;
                        System.out.println("Here is a list of our currently checked out books: ");
                        boolean anyCheckOut = false;
                        for (Book book : brianLibrary){
                            if (book.isCheckedOut()) {
                                System.out.println(book.getTitle());
                                anyCheckOut = true;
                            }
                        }
                        if (!anyCheckOut){
                            System.out.println("No books are currently checked out.");
                        }
                        break;
                    case 3:
                        validChoice = true;
                        System.out.println("I'm glad one of my favorite books is coming back home!");
                        break;
                    case 4:
                        validChoice = true;
                        break;
                    default:
                        System.out.println("I'm sorry, it looks like you read the options wrong, please choose a valid option");
                }

            } catch (InputMismatchException e) {
                System.out.println("I'm sorry, it looks like you read the options wrong, please choose a valid option");
            }
        } while (!validChoice) ;

        System.out.println("Thank you so much, " + name + "! Please remember to take care and enjoy your book! " +
                "Please also remember to return it when you're finished with it and come back to checkout a new one! " +
                "HAPPY READING!!!");

        }

}
