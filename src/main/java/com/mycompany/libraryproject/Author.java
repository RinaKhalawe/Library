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
public class Author extends Person implements Serializable{
   
    public Author(int id, String name, String address, BirthDate bDate) {
    super(id, name, address, bDate);
    }
    
    @Override
    public String getInfo(){
      return "Author => "+ super.getInfo();
    }
    
    
}
