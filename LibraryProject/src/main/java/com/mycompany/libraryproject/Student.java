/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryproject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author TTC
 */
public class Student extends Person {
    private String major;
    private ArrayList<Loan> loans;
    
    

    public Student( int id, String name, String adress, BirthDate bDate,String major,Loan loans) {
        super(id, name, adress, bDate);
        this.major = major;
        this.loans = new ArrayList<>();
        
    }

    public Student(int id, String name, String adress,String major,  BirthDate bDate) {
        super(id, name, adress, bDate);
        this.major = major;
        this.loans = null;
    }
    

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public ArrayList<Loan> getLoans() {
        return loans;
    }
    public void addLoan(Loan loan) {
        loans.add(loan);
    }
    
    
    public Boolean returnBook(){
        return true ;
    }
    public Boolean checkLoan(){
        return false;
    }
    public List<Loan> checkBookLoans() {
        ArrayList<Loan> result = new ArrayList<>();
        
            for (Loan loan : loans) {
                if (loan.getDueDate() == null) {
                    result.add(loan);
                }
                
            }
        
        return result;
    }

    
}
