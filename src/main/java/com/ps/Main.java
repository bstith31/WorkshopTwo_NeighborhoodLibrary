package com.ps;
import java.util.Scanner;
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int userInput;

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