package Models;

import java.util.List;

public interface Library {
    void addBook(Book book);
    void removeBook(Book book);
    List<Book> getAvailableBooks();
    void borrowBook(Book book, Member member);
    void returnBook(Book book, Member member);
    List<BorrowedBook> getBorrowedBooks();
    List<BorrowedBook> getOverdueBooks();
}
