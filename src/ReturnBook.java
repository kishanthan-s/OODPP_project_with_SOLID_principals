public class ReturnBook {
    public boolean returnBook(String isbn, Library library) {
        book.Book book = library.getBook(isbn);
        if (book != null) {
            book.setAvailability(true);
            //library.removeBook(book.ISBN);
            return true;
        } else {
            return false;
        }
    }
}
