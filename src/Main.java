import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            displayMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    removeBook(scanner, library);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    borrowBook(scanner, library);
                    break;
                case 5:
                    returnBook(scanner, library);
                    break;
                case 6:
                    library.displayBorrowedBooks();
                    break;
                case 7:
                    library.overdueBooks();
                    break;
                case 8:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

    }

    private static void displayMenu() {
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Display Books");
        System.out.println("4. Borrow Book");
        System.out.println("5. Return Book");
        System.out.println("6. Display Borrowed Books");
        System.out.println("7. Display Overdue Books");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addBook(Scanner scanner, Library library) {
        scanner.nextLine(); // to consume the newline character
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Enter availability: ");
        boolean availability = scanner.nextBoolean();
        library.addBook(new book.Book(title, author, ISBN, availability));
        System.out.println("Book added successfully.");
    }

    private static void removeBook(Scanner scanner, Library library) {
        scanner.nextLine(); // to consume the newline character
        System.out.print("Enter ISBN: ");
        String ISBN = scanner.nextLine();
        boolean success = library.removeBook(ISBN);
        if (success) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void borrowBook(Scanner scanner, Library library) {
        scanner.nextLine(); // to consume the newline character
        System.out.print("Enter ISBN number: ");
        String ISBN = scanner.nextLine();
        BorrowBook borrower = new BorrowBook();
        boolean success = borrower.borrowBook(ISBN, library);
        if (success) {
            System.out.println("Book successfully borrowed!");
        } else {
            System.out.println("Book could not be borrowed.");
        }
    }

    private static void returnBook(Scanner scanner, Library library) {
        scanner.nextLine(); // to consume the newline character
        System.out.print("Enter ISBN number: ");
        String ISBN = scanner.nextLine();
        ReturnBook returner = new ReturnBook();
        boolean success = returner.returnBook(ISBN, library);
        if (success) {
            System.out.println("Book successfully returned!");
        } else {
            System.out.println("Book could not be returned.");
        }


    }

}
