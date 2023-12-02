/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

import java.util.Date;

/**
 *
 * @author TTC
 */
public class Magazine extends Book {
    private int issueNo;
    private Date releaseDate;

    public Magazine(int issueNo, Date releaseDate, String title, int no, String genre, String version, Author author, BirthDate bdate,boolean isAvailable,Loan loans) {
        super(title, no, genre, version, author, bdate,isAvailable,loans);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

   

    
    
}
