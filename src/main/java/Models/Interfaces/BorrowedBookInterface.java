package Models.Interfaces;

import java.util.Date;

public interface BorrowedBookInterface {
    int getRecordId();
    void setRecordId(int id);
    Date getBorrowDate();
    void setBorrowDate(Date borrowDate);
    Date getReturnDate();
    void setReturnDate(Date returnDate);
    int getBookId();
    void setBookId(int bookId);
    int getMemberId();
    void setMemberId(int memberId);
    Date getDueDate();
    void setDueDate(Date dueDate);
}
