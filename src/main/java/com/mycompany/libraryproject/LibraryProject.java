/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.libraryproject;

//import java.time.LocalDate;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author TTC
 */
public class LibraryProject {

    public static void main(String[] args) {
        System.out.println("Welcome to my library ");
        Library l1 = new Library();
        LocalDate loanDate = null;
        LocalDate dueDate = null;

        int choice;
        boolean found = false;
        int no;
        int id;
        Scanner input = new Scanner(System.in);
        System.out.println("The Library Menu :");
        do{
        System.out.println("""
                           1. Add Books
                           2. Add Student
                           3. search Book By Title
                           4. search Book By no
                           5. search Book By Author Name
                           6. Check Book Loan
                           7. Loan Book
                           8. EXIT """);

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
                System.out.print("Enter book author Info: ");
                Author author = new Author(input.nextInt(), input.next(), input.next(), new BirthDate(input.nextInt(), input.nextInt(), input.nextInt()));
                System.out.print("Enter book publish year : ");
                BirthDate date = new BirthDate(input.nextInt(), input.nextInt(), input.nextInt());
                Book book = (new Book(title, number, genre, version, author, date));
                l1.addBook(book);
                System.out.println("Book added successfully!");
            }

            case 2 -> {
                System.out.print("Enter student id: ");
                id = input.nextInt();
                System.out.print("Enter student name: ");
                String name = input.next();
                System.out.print("Enter student address: ");
                String address = input.next();
                System.out.print("Enter student major: ");
                String major = input.next();
                System.out.print("Enter student birth date : ");
                BirthDate bdate = new BirthDate(input.nextInt(), input.nextInt(), input.nextInt());
                l1.addStudent(new Student(id, name, address, bdate, major));
                System.out.println("Student added successfully!");
            }

            case 3 -> {
                System.out.println("Enter your Book title :");
                String title = input.next();
                for (int i = 0; i < l1.books.size(); i++) {
                    Book b = l1.books.get(i);
                    if (title.equals(b.getTitle())) {
                        found = true;
                        System.out.println("Book with this " + title + " is Exist \n");
                        break;
                    } else {
                        System.out.println("Book with this " + title + " is not Exist\n");
                    }
                    break;
                }
            }

            case 4 -> {
                System.out.println("Enter your Book no :");
                no = input.nextInt();
                for (int i = 0; i < l1.books.size(); i++) {
                    Book b = l1.books.get(i);
                    if (no == b.getNo()) {
                        System.out.println("Book with " + no + " is Exist!\n");
                        break;
                    } else {
                        found = true;
                        System.out.println("Book with this " + no + " is not Exist\n");
                        
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
                        System.out.println("Book with Author " + name + " is Exist!\n");
                        found = true;
                        break;
                    } else {
                        
                        System.out.println("Book with Author " + name + " is not Exist\n");
                        
                    }
                    break;
                }
            }

            case 6 -> {
                System.out.println("Enter book no :");
                no = input.nextInt();
                id = input.nextInt();
                for (int i = 0; i < l1.books.size(); i++) {
                    Book b1 = l1.books.get(i);
                    if (no == b1.getNo()) {
                        for (int j = 0; j < l1.students.size(); j++) {
                            Student s1 = l1.students.get(j);
                            if (id == s1.getId() && (l1.loans.size() < 3)) {
                                System.out.println("the student can loan books");
                            } else {
                                System.out.println("the student has exceed no of book loans or invalid student id ! ");
                            }
                            break;
                        }
                    }else 
                        System.out.println("invalid book no ! or book is in loan ");
                }
                break;
            }
            case 7 -> {
                System.out.println("Enter book no :");
                no = input.nextInt();
                System.out.println("Enter student id :");
                id = input.nextInt();
                for (int i = 0; i < l1.books.size(); i++) {
                    Book b1 = l1.books.get(i);
                    if (no != b1.getNo()) {
                        System.out.println("Book is not exist ");
                        for (int j = 0; j < l1.students.size(); j++) {
                            Student s1 = l1.students.get(j);
                            if (id == s1.getId()) {
                                s1.borrowBook(b1);
                                Loan e = new Loan(b1, s1, loanDate, dueDate);
                                l1.loans.add(e);
                                System.out.println(l1.loans.toString());
                                System.out.println(s1.getBorrowedBooks());
                                System.out.println("Loans Done !");
                                l1.books.remove(b1);
                            }

                        }
                    }
                }
                break;
            }

            case 8 -> {
                System.exit(0);
            }
            default ->
                System.out.println("Invalid choice !!!");

        }

    }while(true);
        
}
}
