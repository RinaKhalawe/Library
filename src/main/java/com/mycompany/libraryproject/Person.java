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
public class Person implements Serializable {
    private int id;
    private String name;
    private String address;
    private BirthDate bDate;
    
    public Person(){
        
    }

    public Person(int id, String name, String address, BirthDate bDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bDate = bDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BirthDate getbDate() {
        return bDate;
    }

    public void setbDate(BirthDate bDate) {
        this.bDate = bDate;
    }

    public String getInfo() {
        return "\n Id : " + id + ", Name : " + name + ", Address : " + address + ", Birth Date : " + bDate.getInfo();
    }

    
    
}
