/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;
import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

/**
 *
 * @author TTC
 */
public class Library {
    ArrayList<Book> books;
    ArrayList<Magazine> magazines;
    ArrayList<Journal> journals;
    ArrayList<Author> authors;
    ArrayList<Student> students;
    
    public Library() {
        books = new ArrayList<>();
        magazines = new ArrayList<>();
        journals = new ArrayList<>();
        authors = new ArrayList<>();
        students = new ArrayList<>();
        
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addJournal(Journal journal) {
        journals.add(journal);
    }
    public void addMagazine(Magazine magazine) {
        magazines.add(magazine);
    }
    public void addAuthor(Author author) {
        authors.add(author);
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
        ArrayList<Loan> result = new ArrayList<>();
        for (Student student : students) {
            for (Loan loan : student.getLoans()) {
                if (loan.getDueDate() == null) {
                    result.add(loan);
                }
            }
        }
        return result;
    }
    public void borrowBook(Student student, Book book) throws LoanLimitExceeded, BookNotAvailable {
        // Check if the student has already borrowed 3 books
        if (student.getLoans().size() >= 3) {
            throw new LoanLimitExceeded("The student has already borrowed 3 books and cannot borrow any more.");
        }

        // Check if the book is available for loan
        if (!book.isAvailable()) {
            throw new BookNotAvailable("The book is not available for loan at this time.");
        }

        // Create a loan record and add it to the student's loan list and the book's loan list
        Loan loan = new Loan(student, book,LocalDate.now(),LocalDate.now().plusDays(5));
        student.addLoan(loan);
        book.addLoan(loan);
    }
}


