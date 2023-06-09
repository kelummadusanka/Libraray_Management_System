package Repositories;

import Models.Interfaces.BorrowedBookInterface;
import Models.ModelIml.BorrowedBook;

import java.util.Date;
import java.util.List;

public interface BorrowedBookRepository {
    BorrowedBookInterface getBorrowedBookById(int bookId);
    void addBorrowedBook(BorrowedBookInterface borrowedBook);
    void returnBorrowedBook(int bookId, Date returnDate);
    List<BorrowedBookInterface> getAllBorrowedBooks();
    List<BorrowedBookInterface> getOverdueBorrowedBooks();
    List<BorrowedBookInterface> getBorrowedBooksByMemberId(int memberId);
}