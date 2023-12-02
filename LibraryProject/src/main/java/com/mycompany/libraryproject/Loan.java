/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

import java.time.LocalDate;

/**
 *
 * @author TTC
 */
public class Loan {
    private LocalDate dueDate;
    private Student student;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Loan(Student student, Book book, LocalDate borrowDate, LocalDate returnDate) {
        //this.dueDate = dueDate;
        this.student = student;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = null;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }


    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    
}
