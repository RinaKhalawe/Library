/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TTC
 */
public class Student extends Person {
    private String major;
    private List<Book> borrowedBooks;
    
    

    public Student( int id, String name, String address, BirthDate bDate,String major) {
        super(id, name, address, bDate);
        this.major = major;
        this.borrowedBooks = new ArrayList<>();
        
    }

    /*public Student(int id, String name, String address,BirthDate bDate,String major) {
    super(id, name, address, bDate);
    this.major = major;
    
    }*/

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 3) {
            borrowedBooks.add(book);
            book.inLoan(true);
        } else {
            System.out.println("You have already borrowed 3 books. Return a book to borrow a new one.");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.inLoan(false);
    }

    @Override
    public String toString() {
        return "Student=> "+ super.getInfo()+ ", major = " + major ;
    }

    

}
