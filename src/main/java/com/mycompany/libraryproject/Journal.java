/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;

/**
 *
 * @author TTC
 */
public class Journal extends Book {

    private int conferenceNo;
    private String conferenceName;

    public Journal(int conferenceNo, String conferenceName, String title, int no, String genre, String version, Author author, BirthDate bdate) {
        super(title, no, genre, version, author, bdate);
        this.conferenceNo = conferenceNo;
        this.conferenceName = conferenceName;
    }

    public int getConferenceNo() {
        return conferenceNo;
    }

    public void setConferenceNo(int conferenceNo) {
        this.conferenceNo = conferenceNo;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    @Override
    public String toString() {
        return "Journal=> " + "conferenceNo = " + conferenceNo + ", conferenceName = " + conferenceName + super.getInfo();
    }
    

}
