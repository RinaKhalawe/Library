/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

import java.io.Serializable;


/**
 *
 * @author TTC
 */
public class Book implements Serializable,Display {

    private String title;
    private int no;
    private String genre;
    private String version;
    private Author author;
    private BirthDate bdate;
  
    public Book(){
        
    }

    public Book(String title, int no, String genre, String version, Author author, BirthDate bdate) {
        this.title = title;
        this.no = no;
        this.genre = genre;
        this.version = version;
        this.author = author;
        this.bdate = bdate;
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

    @Override
    public String getInfo() {
        return "Book => " + title + "\n No : " + no + "\n Genre : " + genre + "\n Version : " + version + "\n Publish Date : " + bdate.getInfo() + "\n Author Info : " + author.getInfo();
    }

    @Override
    public Boolean inLoan(boolean par) {
        return true;
    }

}
