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
    ArrayList<Loan> loans;
    
    public Library() {
        books = new ArrayList<>();
        magazines = new ArrayList<>();
        journals = new ArrayList<>();
        authors = new ArrayList<>();
        students = new ArrayList<>();
        loans= new ArrayList();
        
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
    
}


