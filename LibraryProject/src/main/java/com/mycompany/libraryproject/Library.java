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
public class Library {
    public List<Book> books;
    public List<Magazine> magazines;
    public List<Journal> journals;
    public List<Author> authors;
    public List<Student> students;
    
    public Library() {
        books = new ArrayList<>();
        magazines = new ArrayList<>();
        journals = new ArrayList<>();
        authors = new ArrayList<>();
        students = new ArrayList<>();
        
    }
    public List<Book> searchBookByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchBookByNo(int bookNo) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (bookNo == book.getNo()) {
                result.add(book);
                break;
            }
        }
        return result;
    }
    public List<Book> searchBookByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> showAvailableBooks() {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Loan> checkBookLoans() {
        List<Loan> result = new ArrayList<>();
        for (Student student : students) {
            for (Loan loan : student.getLoans()) {
                if (loan.getDueDate() == null) {
                    result.add(loan);
                }
            }
        }
        return result;
    }
}


