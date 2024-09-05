package OOPROG.LibraryManagementSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book = new Book();
        
        int choice = 0;
        do {
            System.out.println("=========================================");
            System.out.println("Library Management System");
            System.out.println("What would you like to do?");
            System.out.println("[1] Add Book");
            System.out.println("[2] Borrow Book");
            System.out.println("[3] Return Book");
            System.out.println("[4] Check Library");
            System.out.println("[5] Exit");
            System.out.println("=========================================");

            choice = scan.nextInt();
            switch (choice) {
                case 1: //add a new book
                    System.out.println("=========================================");
                    scan.nextLine(); // consumes leftover whitespace from the nextInt()
                    System.out.println("[Add Book]\n");
                    System.out.print("Enter Book Title: ");
                    String title = scan.nextLine();

                    System.out.print("Enter Author: ");
                    String author = scan.nextLine();

                    String isbn = "";
                    do { // evaluates and validates the isbn
                        System.out.println("Enter ISBN (International Standard Book Number)(13 digits): ");
                        isbn = scan.nextLine();
                        if (book.isbnExists(isbn)) {
                            System.out.println("ISBN already exists! Please enter a different one.");
                        } else if (isbn.length() == 0){
                            System.out.println("ISBN cannot be empty!");
                        } else if (!book.isbnNumLength(isbn)){
                            System.out.println("ISBN should be 13 digits long!");
                        } else {
                            break;
                        }
                    } while (book.isbnExists(isbn) || isbn.length() == 0 || !book.isbnNumLength(isbn)) ;

                    System.out.print("Enter Available Copies: ");
                    int copies = scan.nextInt();

                    book.addBook(title, author, isbn, copies);

                    System.out.println("\nBook added successfully!");

                    System.out.println("=========================================");

                    break;

                case 2: // borrow a book
                    System.out.println("=========================================");
                    scan.nextLine(); // consumes leftover whitespace from the nextInt()
                    System.out.println("[Borrow Book]\n");

                    String borrowTitle = "";
                    do {
                        System.out.print("Enter Book Title: ");
                        borrowTitle = scan.nextLine();
                    } while (!book.doesBookExist(borrowTitle));

                    int borrowCopies = 0;
                    do {
                        System.out.print("Enter Number of Copies to Borrow: ");
                        borrowCopies = scan.nextInt();
                    } while (!book.isCopiesEnough(borrowCopies));

                    book.borrowBook(borrowTitle, borrowCopies);

                    System.out.println("=========================================");
                    break;

                case 3: // return a book
                    System.out.println("=========================================");
                    scan.nextLine(); // consumes leftover whitespace from the nextInt()
                    System.out.println("[Return Book]\n");

                    String returnTitle = "";
                    do {
                        System.out.print("Enter Book Title: ");
                        returnTitle = scan.nextLine();
                    } while (!book.doesBookExist(returnTitle));

                    int returnCopies = 0;
                    
                    System.out.print("Enter Number of Copies to Return: ");
                    returnCopies = scan.nextInt();

                    if (!book.isBorrowedEnough(returnCopies))
                        book.returnBook(returnTitle, returnCopies);
                    else
                        book.returnBook(returnTitle, returnCopies);

                    System.out.println("=========================================");
                    break;
                    
                case 4: // check the books from the library
                    book.getDetails();
                    break;
                    
                case 5: // exit the program
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 5);

        scan.close();
    }
}