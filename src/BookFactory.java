public class BookFactory {
    public static book.Book createBook(String title, String author, String isbn, boolean availability) {
        return new book.Book(title, author, isbn, availability);
    }
}

