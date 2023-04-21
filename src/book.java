public class book {

    public static class Book {
        private String title;
        private String author;
        private String ISBN;
        boolean availability;

        private BorrowInfo borrowInfo;

        public Book(String title, String author, String ISBN, boolean availability) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.availability = availability;

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public boolean isAvailable() {
            return availability;
        }

        public void setAvailability(boolean availability) {
            this.availability = availability;
        }

        public BorrowInfo getBorrowInfo() {
            return borrowInfo;
        }

        public void setBorrowInfo(BorrowInfo borrowInfo) {
            this.borrowInfo = borrowInfo;
        }

    }

}
