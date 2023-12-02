/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.libraryproject;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TTC
 */
public class LibraryProject {

    public static ArrayList<Loan> main(String[] args) {
        System.out.println("Welcome to my library ");
        ArrayList<Book> book = new ArrayList<>();
        ArrayList<Loan> loan = new ArrayList<>();
        ArrayList<Student> student = new ArrayList<>();
        ArrayList<Library> library = new ArrayList<>();
        ArrayList<Loan> result = new ArrayList<>();
        int choice;
        boolean found = false;
        int no;
        Scanner input = new Scanner(System.in);
        System.out.println("The Library Menu :");
        System.out.println("1. Add Books\n2. Add Student\n3. search Book By Title\n 4. search Book By no\n 5. 4. search Book By Author Name\n 6. Check Book Loan  ");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
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
                book.add(new Book(title, number, genre, version, author, date));
                System.out.println("Book added successfully!");
                break;

            case 2:
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
                student.add(new Student(id, name, address, major, bdate));
                System.out.println("Student added successfully!");
                break;

            case 3:
                System.out.println("Enter your Book title :");
                title = input.next();
                for (int i = 0; i < book.size(); i++) {
                    Book b = book.get(i);
                    if (title.equals(b.getTitle())) {
                        found = true;
                        System.out.println("Book with this " + title + " is found\n");
                        break;
                    } else {
                        System.out.println("Book with this " + title + " is not found\n");
                    }
                    break;
                }

                break;

            case 4:
                System.out.println("Enter your Book no :");
                no = input.nextInt();
                for (int i = 0; i < book.size(); i++) {
                    Book b = book.get(i);
                    if (no != b.getNo()) {
                        System.out.println("Book with this " + no + " is not exist!\n");
                    } else {
                        found = true;
                        System.out.println("Book with this " + no + " is exist\n");
                        break;
                    }
                    break;
                }
                break;
            case 5:
                System.out.println("Enter your Book Author Name :");
                name = input.next();
                for (int i = 0; i < book.size(); i++) {
                    Book b = book.get(i);
                    if (name.equals(b.getAuthor().getName())) {
                        System.out.println("Book with Author " + name + " is not exist!\n");
                    } else {
                        found = true;
                        System.out.println("Book with Author " + name + " is exist\n");
                        break;
                    }
                    break;
                }
                break;

            case 6:

                if (loan.size() < 3) {
                    System.out.println("there is a space to add loans book");
                   
                }
                   break;
                default:
                System.out.println("Invalid choice !!!");
                break;
           
        }
        return null;
    }
}
        
    
    
