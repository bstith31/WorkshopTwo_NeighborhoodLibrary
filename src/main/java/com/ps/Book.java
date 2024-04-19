package com.ps;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean CheckedOut;
    private String personCheckOut;

    public Book(int id, String isbn, String title, boolean checkedOut, String personCheckOut) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        CheckedOut = checkedOut;
        this.personCheckOut = personCheckOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return CheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        CheckedOut = checkedOut;
    }

    public String getPersonCheckOut() {
        return personCheckOut;
    }

    public void setPersonCheckOut(String personCheckOut) {
        this.personCheckOut = personCheckOut;
    }
}
