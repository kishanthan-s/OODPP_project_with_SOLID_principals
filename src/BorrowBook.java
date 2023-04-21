import java.util.Calendar;
import java.util.Date;

public class BorrowBook {

    // applying encapsulation
    public boolean borrowBook(String isbn, Library library) {
        book.Book book = library.getBook(isbn);
        if (book != null && book.isAvailable()) {
            book.setAvailability(false);
            //library.removeBook(book.ISBN);
            //book.setBorrowInfo(new Date());
            //book.setBorrowInfo(calculateDueDate());
            book.setBorrowInfo(new BorrowInfo(book.getTitle(), new Date(), calculateDueDate()));

            return true;
        } else {
            return false;
        }
    }

    public Date calculateDueDate() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.SECOND, 30);
        return c.getTime();
    }
}
