/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libraryproject;

//import java.time.LocalDate;
  import java.util.Scanner;

/**
 *
 * @author TTC
 */
public class LibraryProject {

    public static void main(String[] args) {
        System.out.println("Welcome to my library ");
        Book book = new Book();
        Library l1 = new Library();
       // String result;
        
        l1.addBook(book);
        
        Library library = new Library();
        Scanner input = new Scanner(System.in);
        int choice ;
        System.out.println("The Library Menu :");
        System.out.println("1- Add Books");
        System.out.println("2- Add Students ");
        
        do {
        
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        
        switch(choice) {
        case 1 -> {
        System.out.print("Enter book title: ");
        String title = input.next();
        System.out.print("Enter book number: ");
        String author = input.next();
        System.out.print("Enter book genre: ");
        int number = input.nextInt();
        System.out.print("Enter book version: ");
        String genre = input.next();
        System.out.print("Enter book author: ");
        int version = input.nextInt();
        System.out.print("Enter book date (dd-MM-yyyy): ");
        String date = input.next();
        
        
        library.addBook(new Book(title,number,genre,version,author, date));
        System.out.println("Book added successfully!");
        }
        case 2 -> {
        System.out.print("Enter student id: ");
        int studentId = input.nextInt();
        System.out.print("Enter student name: ");
        String studentName = input.next();
        System.out.print("Enter student address: ");
        String studentAddr = input.next();
        System.out.print("Enter student birth date (yyyy-MM-dd): ");
        String studentBirthDate = input.next();
        
        System.out.print("Enter student major: ");
        String studentMajor = input.next();
        
        library.addStudent(new Student(studentId, studentName, studentAddr, studentMajor, studentBirthDate));
        System.out.println("Student added successfully!");
        }
    }
}

 
