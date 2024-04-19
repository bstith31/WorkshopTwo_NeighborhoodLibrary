package com.ps;
///Testing this instead of manually adding this in main, can add additional categories for testing too.
public class BookManager {

    public static Book[] initializeLibrary(){
        Book[] brianlibrary = new Book[20];
        String[] bookTitles = {
                "Book 1", "Book 2", "Book 3", "Book 4", "Book 5", "Book 6", "Book 7", "Book 8", "Book 9", "Book 10",
                "Book 11", "Book 12", "Book 13", "Book 14", "Book 15", "Book 16", "Book 17", "Book 18", "Book 19", "Book 20"
        };
        String[] isbns = {
                "1111-1111-1111", "1111-1111-1112", "1111-1111-1113", "1111-1111-1114", "1111-1111-1115", "1111-1111-1116",
                "1111-1111-1117", "1111-1111-1118", "1111-1111-1119", "1111-1111-1120", "1111-1111-1121", "1111-1111-1122",
                "1111-1111-1123", "1111-1111-1124", "1111-1111-1125", "1111-1111-1126", "1111-1111-1127", "1111-1111-1128",
                "1111-1111-1129", "1111-1111-1130", "1111-1111-1131"
        };
        boolean[] checkedOut = new boolean[21]; // All initialized to false

        for (int i = 0; i < brianlibrary.length; i++) {
            brianlibrary[i] = new Book(i, isbns[i], bookTitles[i], checkedOut[i], "None");
        }
        return brianlibrary;
    }
}
