package OOPROG.SistemaSaPagdumalaSaLibrarya;

import java.util.Scanner;

public class Kaunaunahan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Libro book = new Libro();
        
        int choice = 0;
        do {
            System.out.println("=========================================");
            System.out.println("Sistema Sa Pagdumala Sa Librarya");
            System.out.println("Unsa imong gusto buhaton?");
            System.out.println("[1] Magpuno ug libro");
            System.out.println("[2] Manghuwam ug libro");
            System.out.println("[3] Magbalik ug libro");
            System.out.println("[4] Motan-aw sa librarya");
            System.out.println("[5] Mogawas");
            System.out.println("=========================================");

            choice = scan.nextInt();
            switch (choice) {
                case 1: //add a new book
                    System.out.println("=========================================");
                    scan.nextLine(); // consumes leftover whitespace from the nextInt()
                    System.out.println("[Magpuno ug Libro]\n");
                    System.out.print("Ibutang ang Tiulo sa Libro: ");
                    String title = scan.nextLine();

                    System.out.print("Ibutang ang Tagsuwat: ");
                    String author = scan.nextLine();

                    String isbn = "";
                    do { // evaluates and validates the isbn
                        System.out.println("Ibutang ang ISBN (International Standard Book Number)(13 digits): ");
                        isbn = scan.nextLine();
                        if (book.isbnExists(isbn)) {
                            System.out.println("Naa nay ingon ani nga ISBN! Palihug butang ug lain");
                        } else if (isbn.length() == 0){
                            System.out.println("Dili pwede blangko ang ISBN!");
                        } else if (!book.isbnNumLength(isbn)){
                            System.out.println("Dapat trese ka numero ang ISBN!");
                        } else {
                            break;
                        }
                    } while (book.isbnExists(isbn) || isbn.length() == 0 || !book.isbnNumLength(isbn)) ;

                    System.out.print("Ibutang ang mga nahabiling kopya: ");
                    int copies = scan.nextInt();

                    book.magpunoUgLibro(title, author, isbn, copies);

                    System.out.println("\nNapuno na ang libro!");

                    System.out.println("=========================================");

                    break;

                case 2: // borrow a book
                    System.out.println("=========================================");
                    scan.nextLine(); // consumes leftover whitespace from the nextInt()
                    System.out.println("[Manghuwam ug libro]\n");

                    String borrowTitle = "";
                    do {
                        System.out.print("Ibutang ang Tiulo sa Libro: ");
                        borrowTitle = scan.nextLine();
                    } while (!book.doesBookExist(borrowTitle));

                    int borrowCopies = 0;
                    do {
                        System.out.print("Ibutang kung pila ka kopya imong hulman: ");
                        borrowCopies = scan.nextInt();
                    } while (!book.isCopiesEnough(borrowCopies));

                    book.manghuwamUgLibro(borrowTitle, borrowCopies);

                    System.out.println("=========================================");
                    break;

                case 3: // return a book
                    System.out.println("=========================================");
                    scan.nextLine(); // consumes leftover whitespace from the nextInt()
                    System.out.println("[Magbalik ug Libro]\n");

                    String returnTitle = "";
                    do {
                        System.out.print("Ibutang ang Tiulo sa Libro: ");
                        returnTitle = scan.nextLine();
                    } while (!book.doesBookExist(returnTitle));

                    int returnCopies = 0;
                    
                    System.out.print("Ibutang kung pila ka libro ang i-uli: ");
                    returnCopies = scan.nextInt();

                    if (!book.isBorrowedEnough(returnCopies))
                        book.ibalikAngLibro(returnTitle, returnCopies);
                    else
                        book.ibalikAngLibro(returnTitle, returnCopies);

                    System.out.println("=========================================");
                    break;
                    
                case 4: // check the books from the library
                    book.mgaDetalye();
                    break;
                    
                case 5: // exit the program
                    System.out.println("Pagawas na...");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Palihug ug pili sa saktong pili-anan");
                    break;
            }
        } while (choice != 5);

        scan.close();
    }
}
