/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.libraryproject;

//import java.time.LocalDate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TTC
 */
public class LibraryProject {

    public static void main(String[] args) {
        System.out.println("Welcome to my library ");
        Library l1= new Library ();
        int choice;
        boolean found = false;
        int no;
        Scanner input = new Scanner(System.in);
        System.out.println("The Library Menu :");
        System.out.println("""
                           1. Add Books
                           2. Add Student
                           3. search Book By Title
                           4. search Book By no
                           5. search Book By Author Name
                           6. Check Book Loan
                           7. EXIT """);

        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter book title: ");
                String title = input.next();
                System.out.print("Enter book number: ");
                int number = input.nextInt();
                System.out.print("Enter book genre: ");
                String genre = input.next();
                System.out.print("Enter book version: ");
                String version = input.next();
                System.out.print("Enter book author: ");
                Author author = new Author(input.nextInt(), input.next(), input.next(), new BirthDate(input.nextInt(), input.nextInt(), input.nextInt()));
                System.out.print("Enter book date (dd-MM-yyyy): ");
                BirthDate date = new BirthDate(input.nextInt(), input.nextInt(), input.nextInt());
                Book book =(new Book(title, number, genre, version, author, date));
                l1.addBook(book);
                System.out.println("Book added successfully!");
            }

            case 2 -> {
                System.out.print("Enter student id: ");
                int id = input.nextInt();
                System.out.print("Enter student name: ");
                String name = input.next();
                System.out.print("Enter student address: ");
                String address = input.next();
                System.out.print("Enter student major: ");
                String major = input.next();
                System.out.print("Enter student birth date (yyyy-MM-dd): ");
                BirthDate bdate = new BirthDate(input.nextInt(), input.nextInt(), input.nextInt());
                l1.addStudent(new Student(id, name, address, major, bdate));
                System.out.println("Student added successfully!");
            }

            case 3 -> {
                System.out.println("Enter your Book title :");
                String title = input.next();
                for (int i = 0; i < l1.books.size(); i++) {
                    Book b = l1.books.get(i);
                    if (title.equals(b.getTitle())) {
                        found = true;
                        System.out.println("Book with this " + title + " is found\n");
                        break;
                    } else {
                        System.out.println("Book with this " + title + " is not found\n");
                    }
                    break;
                }
            }

            case 4 -> {
                System.out.println("Enter your Book no :");
                no = input.nextInt();
                for (int i = 0; i < l1.books.size(); i++) {
                    Book b = l1.books.get(i);
                    if (no != b.getNo()) {
                        System.out.println("Book with this " + no + " is not exist!\n");
                    } else {
                        found = true;
                        System.out.println("Book with this " + no + " is exist\n");
                        break;
                    }
                    break;
                }
            }
            case 5 -> {
                System.out.println("Enter your Book Author Name :");
                String name = input.next();
                for (int i = 0; i < l1.books.size(); i++) {
                    Book b = l1.books.get(i);
                    if (name.equals(b.getAuthor().getName())) {
                        System.out.println("Book with Author " + name + " is not exist!\n");
                    } else {
                        found = true;
                        System.out.println("Book with Author " + name + " is exist\n");
                        break;
                    }
                    break;
                }
            }

            case 6 -> {
                l1.checkBookLoans();
                
                if (l1.loans.size() < 3) {
                    System.out.println("there is a space to add loans book");
                } else {
                    System.out.println("there is no space to add loans book");
                }
            }
            case 7 -> System.exit(0);

                default -> System.out.println("Invalid choice !!!");
           
        }
       
    }
}
        
    
    
