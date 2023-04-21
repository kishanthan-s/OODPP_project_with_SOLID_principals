import java.util.Date;
public class BorrowInfo {


        private String Name;
        private Date borrowedDate;
        private Date dueDate;

        public BorrowInfo(String Name, Date borrowedDate, Date dueDate) {
            this.Name = Name;
            this.borrowedDate = borrowedDate;
            this.dueDate = dueDate;
        }

        public String getBorrowerName() {
            return Name;
        }

        public void setBorrowerName(String borrowerName) {
            this.Name = borrowerName;
        }

        public Date getBorrowedDate() {
            return borrowedDate;
        }

        public void setBorrowedDate(Date borrowedDate) {
            this.borrowedDate = borrowedDate;
        }

        public Date getDueDate() {
            return dueDate;
        }

        public void setDueDate(Date dueDate) {
            this.dueDate = dueDate;
        }


}
