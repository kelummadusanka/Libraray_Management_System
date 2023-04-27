package Services.Interfaces;

import Models.Interfaces.BorrowedBookInterface;

import java.util.Date;
import java.util.List;

public interface BorrowServiceInterface {
    void addBorrowBook(int bookId, int memberId, Date BorrowedDate, Date DueDate);
    void returnBorrowedBook(int bookId, int memberId, Date ReturnDate);
    List<BorrowedBookInterface> getAllBorrowedBooks();
    List<BorrowedBookInterface> getOverdueBorrowedBooks();
    List<BorrowedBookInterface> getBorrowedBooksByMemberId(int memberId);
}

