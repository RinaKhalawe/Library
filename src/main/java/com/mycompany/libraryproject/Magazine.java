/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author TTC
 */
public class Magazine extends Book {

    private int issueNo;
    private LocalDate releaseDate;

    public Magazine(int issueNo, LocalDate releaseDate, String title, int no, String genre, String version, Author author, BirthDate bdate) {
        super(title, no, genre, version, author, bdate);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Magazine => " + "issueNo :" + issueNo + ", releaseDate :" + releaseDate + super.getInfo();
    }
    

}
