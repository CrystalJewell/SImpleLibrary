package com.company;

/**
 * Created by crystaladkins on 7/11/17.
 */
public class Book {

    private String title;
    private boolean isBorrowed;

    //Constructor to create a new book
    public Book (String bookTitle) {

        title = bookTitle;
        isBorrowed = false;
    }

    //Allows isBorrowed to be set to the opposite of what it currently is
    public void setBorrowed(boolean borrowed) {
        isBorrowed = !borrowed;
    }

    //Gets title of current book
    public String getTitle() {
        return title;
    }

    //Returns if the book is borrowed or not
    public boolean isBorrowed() {
        return isBorrowed;
    }
    
}
