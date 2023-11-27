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
public class Student extends Person {
    private String major;
    private final List<Loan> loans;

    public Student(String major, int id, String name, String adress, BirthDate bDate) {
        super(id, name, adress, bDate);
        this.major = major;
        this.loans = new ArrayList<>();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public List<Loan> getLoans() {
        return loans;
    }
    
    public Boolean returnBook(){
        return true ;
    }
    public Boolean checkLoan(){
        return false;
    }

    
}
