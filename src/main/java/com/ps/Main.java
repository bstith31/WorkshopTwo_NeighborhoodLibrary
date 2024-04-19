package com.ps;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.HashMap;
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int userInput;

        Book[] library = new Book[21];
        library [0] = new Book(0, "1111-1111-1111", "Book 1",  false, "None");
        library [1] = new Book(0, "1111-1111-1112", "Book 2",  false, "None");
        library [2] = new Book(0, "1111-1111-1113", "Book 3",  false, "None");
        library [3] = new Book(0, "1111-1111-1114", "Book 4",  false, "None");
        library [4] = new Book(0, "1111-1111-1115", "Book 5",  false, "None");
        library [5] = new Book(0, "1111-1111-1116", "Book 6",  false, "None");
        library [6] = new Book(0, "1111-1111-1117", "Book 7",  false, "None");
        library [7] = new Book(0, "1111-1111-1118", "Book 8",  false, "None");
        library [8] = new Book(0, "1111-1111-1119", "Book 9",  false, "None");
        library [9] = new Book(0, "1111-1111-1120", "Book 10",  false, "None");
        library [10] = new Book(0, "1111-1111-1121", "Book 11",  false, "None");
        library [11] = new Book(0, "1111-1111-1122", "Book 12",  false, "None");
        library [12] = new Book(0, "1111-1111-1123", "Book 13",  false, "None");
        library [13] = new Book(0, "1111-1111-1124", "Book 14",  false, "None");
        library [14] = new Book(0, "1111-1111-1125", "Book 15",  false, "None");
        library [15] = new Book(0, "1111-1111-1126", "Book 16",  false, "None");
        library [16] = new Book(0, "1111-1111-1127", "Book 17",  false, "None");
        library [17] = new Book(0, "1111-1111-1128", "Book 18",  false, "None");
        library [18] = new Book(0, "1111-1111-1129", "Book 19",  false, "None");
        library [19] = new Book(0, "1111-1111-1130", "Book 20",  false, "None");
        library [20] = new Book(0, "1111-1111-1131", "Book 21",  false, "None");

        Map <Integer,String> availableBooks;

//        do{

        System.out.println("Welcome to Brian's Book Buddies!!! I hope you'll enjoy our selection!");
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hey there, " + name + "! What would you like to do? Please select from one of the following options");
        System.out.print(" 1. Home Screen\n" +
                " 2. Look up available books\n" +
                " 3. Show checked out books\n" +
                " 4. Check in a book\n" +
                " 5. Exit menu\n" +
                " Please enter your choice: ");

        userInput = scanner.nextInt();


//        } while
    }
}