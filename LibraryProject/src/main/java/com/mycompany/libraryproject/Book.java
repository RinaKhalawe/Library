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
public class Book implements Display {
    private String title;
    private int no;
    private String genre;
    private String version;
    private Author author;
    private BirthDate bdate;
    private boolean isAvailable;
    private List<Loan> loans;

    public Book(String title, int no, String genre, String version, Author author, BirthDate bdate,boolean isAvailable,Loan loans) {
        this.title = title;
        this.no = no;
        this.genre = genre;
        this.version = version;
        this.author = author;
        this.bdate = bdate;
        this.isAvailable=true;
        this.loans = new ArrayList<>();
    }

    public Book(String title, int no, String genre, String version, Author author, BirthDate bdate) {
        this.title = title;
        this.no = no;
        this.genre = genre;
        this.version = version;
        this.author = author;
        this.bdate = bdate;
    }

    

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BirthDate getBdate() {
        return bdate;
    }

    public void setBdate(BirthDate bdate) {
        this.bdate = bdate;
    }
    
    public List<Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
        isAvailable = false;
    }

    @Override
    public String getInfo() {
        return "Book{" + "title=" + title + ", no=" + no + ", genre=" + genre + ", version=" + version + ", author=" + author + ", bdate=" + bdate + '}';
    }
    @Override
    public Boolean inLoan(){
        return true; 
    }

    public boolean isAvailable() {
        throw new UnsupportedOperationException("The Book is not available yet!.");
    }
    
    
    
}
