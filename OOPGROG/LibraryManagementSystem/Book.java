package OOPROG.LibraryManagementSystem;

import java.util.ArrayList;

public class Book {   
    private ArrayList<String> title = new ArrayList<String>();
    private ArrayList<String> author = new ArrayList<String>();
    private ArrayList<String> isbn = new ArrayList<String>();
    private ArrayList<Integer> copies = new ArrayList<Integer>();
    private ArrayList<Integer> borrows = new ArrayList<Integer>();

    public Book() {
        title.add("Java Programming");
        author.add("J.E. Ebarita");
        isbn.add("1-2345-6789-0123");
        copies.add(5);
        borrows.add(0);

        title.add("Motto Toy");
        author.add("J.G. Baran");
        isbn.add("978-3-16-148410-0");
        copies.add(3);
        borrows.add(0);

        title.add("e-Youth");
        author.add("J.M. Jamisola");
        isbn.add("978-3-16-148409-7");
        copies.add(6);
        borrows.add(0);
    }


    public void addBook(String title, String author, String isbn, int copies) { 
        this.title.add(title);
        this.author.add(author);
        this.isbn.add(isbn);
        this.copies.add(copies);
        this.borrows.add(0); // default value for borrows
    }


    public void borrowBook(String title, int copies) {
        for (int i = 0; i < getTitleSize(); i++) {
            if (title.equalsIgnoreCase(this.title.get(i))) {
                this.copies.set(i, this.copies.get(i) - copies);
                borrows.set(i, borrows.get(i) + copies);
                System.out.println("\nYou have borrowed " + copies + " copies of \"" + this.title.get(i) + "\"");
            }
        }
    }

    public void returnBook(String title, int copies) {
        for (int i = 0; i < getTitleSize(); i++) {
            if (title.equalsIgnoreCase(this.title.get(i))) {
                if (borrows.get(i) != 0) {
                    this.copies.set(i, this.copies.get(i) + copies);
                    borrows.set(i, borrows.get(i) - copies);
                    System.out.println("\nYou have returned " + copies + " copies of \"" + this.title + "\"");
                } else {
                    System.out.println("\nAll books with this title have been returned");
                    return;
                }
            }
        }
    }

    public void getDetails() {
        System.out.println("=======================================================================================");
        System.out.println("[Library]\n");
        for (int i = 0; i < getTitleSize(); i++) {
            System.out.println("\"" + title.get(i)  + "\"" + " by " + author.get(i) + "\tISBN: " + isbn.get(i) + "\t\tAvailable Copies: " + copies.get(i));
        }
        System.out.println("=======================================================================================");
    }

    // getters
    public int getTitleSize() {
        return title.size();
    }

    // checkers for isbn
    public boolean isbnExists(String isbn) {
        boolean exists = false;
        String s1 = isbn.replaceAll("\\D", "");
        for (int i = 0; i < this.isbn.size(); i++) {
            String s2 = this.isbn.get(i).replaceAll("\\D", "");
            if (s1.equals(s2)) {
                exists = true;
            }
        }
        return exists;
    }

    public boolean isbnNumLength(String isbn) {
        int nums = 0;
        for (char c : isbn.toCharArray()) {
            if (Character.isDigit(c)) {
                nums++;
            }
        }
        if (nums == 13) {
            return true;
        } else {
            return false;
        }
    }

    // book checking
    public boolean doesBookExist(String title) {
        boolean exists = false;
        for (int i = 0; i < this.title.size(); i++) {
            if (title.equalsIgnoreCase(this.title.get(i))) {
                exists = true;
            } else {
                System.out.println("Book not found!");
            }
        }
        return exists;
    }

    public boolean isCopiesEnough(int nums) {
        boolean enough = false;
        for (int i = 0; i < copies.size(); i++) {
            if (copies.get(i) >= nums) {
                enough = true;
            } else if (copies.get(i) == 0) {
                System.out.println("\nBook out of stock.");
            } else {
                System.out.println("\nNot enough copies available. You can borrow " + copies.get(i) + " copies."); 
            }
        }
        return enough;
    }

    public boolean isBorrowedEnough(int nums) {
        boolean enough = false;
        for (int i = 0; i < borrows.size(); i++) {
            if (borrows.get(i) >= nums) {
                enough = true;
            } else {
                System.out.println("\nYou have " + (nums - borrows.get(i) + " more than you borrowed."));
                System.out.println("Please return the excess book to the rightful owner.");
            }
        }
        return enough;
    }
}