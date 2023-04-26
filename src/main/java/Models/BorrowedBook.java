package Models;

import java.util.Date;

public interface BorrowedBook {
    int getId();
    void setId(int id);
    Date getBorrowDate();
    void setBorrowDate(Date borrowDate);
    Date getReturnDate();
    void setReturnDate(Date returnDate);
    int getBookId();
    void setBookId(int bookId);
    int getMemberId();
    void setMemberId(int memberId);
}
