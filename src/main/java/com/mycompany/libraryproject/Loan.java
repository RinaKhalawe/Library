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
    private Student student;
    private Book book;
    private LocalDate loanDate;
    private LocalDate dueDate;

        public Loan(Book book, Student student , LocalDate loanDate,LocalDate duDate) {
        this.book = book;
        this.student = student;
        loanDate= LocalDate.now();
        dueDate = loanDate.plusDays(5);
        }

    public Loan(Student student, Book book) {
        this.student = student;
        this.book = book;
    }
        

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
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

    public LocalDate getDueDate() {
    return dueDate;
    }
    
    public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Loan{" + "student=" + student.getInfo() + ", book=" + book.getInfo() + ", loanDate=" + loanDate.toString() + ", dueDate=" + dueDate.toString() + '}';
    }
    
      
    
    
}
