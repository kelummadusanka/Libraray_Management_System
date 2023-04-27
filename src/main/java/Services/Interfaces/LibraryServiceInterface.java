package Services.Interfaces;

import Models.Interfaces.BookInterface;
import Models.Interfaces.BorrowedBookInterface;
import Models.Interfaces.MemberInterface;

import java.util.Date;
import java.util.List;

public interface LibraryServiceInterface {
    void addBook(int id, String title, String author);
    void removeBook(int id);
    List<BookInterface> getAvailableBooks();
    void borrowBook(int bookId, int memberId, Date BorrowedDate, Date DueDate);
    void returnBook(BookInterface book);
    List<BorrowedBookInterface> getBorrowedBooks();
    List<BorrowedBookInterface> getOverdueBooks();
}
