package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crystaladkins on 7/11/17.
 */
public class Library {

    private List<Book> allBooks;

    public static void main(String[] arguments) {

        //Test to make sure it is actually running and saving our books to the arraylist.
        Library library = new Library();
        library.listBooks();
    }

    //Constructor for creating the Library
    public Library () {
        allBooks = new ArrayList<>();
        setupLibrary();

    }

    private void setupLibrary() {
        //Remember our list holds book objects, so we have to add new books when we're adding to the list
        allBooks.add(new Book("Hitchhikers Guide to the Galaxy"));
        allBooks.add(new Book("A Brief History of Time"));
        allBooks.add(new Book("Harry Potter and The Philosopher's Stone"));
        allBooks.add(new Book("The Hobbit"));
    }

    //Prints all books that are added to our allBooks ArrayList
    protected void listBooks(){
        //Think of this as "For Each Book (I'm going to name book so I can reference it) in the Arraylist allBooks I want to"
        for (Book book : allBooks) {
            System.out.println(book.getTitle());
        }
    }
}
