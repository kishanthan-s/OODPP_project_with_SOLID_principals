import java.util.ArrayList;
import java.util.Date;

public class Library {

    private ArrayList<book.Book> books;// applying encapsulation
    private Date dueDate;

    public Library() {
        books = new ArrayList<book.Book>();
    }

    public void addBook(book.Book book) {
        books.add(book);
    }

    public boolean removeBook(String ISBN) {
        for (book.Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                break;
            }
        }
        return false;
    }

    public void displayBooks() {
        for (book.Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Availability: " + book.availability);
            // System.out.println("Date: " + book.date);
            System.out.println();
        }
    }


    public void displayBorrowedBooks() {
        for (book.Book book : books) {
            if (!book.isAvailable()) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Date borrowed: " + book.getBorrowInfo().getBorrowedDate());
                System.out.println("Due Date: " + book.getBorrowInfo().getDueDate());
                System.out.println();
            }
        }
    }


    public void overdueBooks() {
        Date currentDate = new Date();
        for (book.Book book : books) {
            if (book.getBorrowInfo().getDueDate().compareTo(currentDate) < 0) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Date borrowed: " + book.getBorrowInfo().getBorrowedDate());
                System.out.println("Due Date: " + book.getBorrowInfo().getDueDate());
            }
        }
    }



    public book.Book getBook(String isbn) {
        for (book.Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;  // Book not found
    }

    // Getters and Setters for the private variables
    //public so that other classes can retrieve the collection of books held by the library.
    public ArrayList<book.Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<book.Book> books) {
        this.books = books;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
