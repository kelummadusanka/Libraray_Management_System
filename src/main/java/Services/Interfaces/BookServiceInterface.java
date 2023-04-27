package Services.Interfaces;

import Models.Interfaces.BookInterface;

import java.util.List;

public interface BookServiceInterface {
    void addBook(int id, String title, String author);
    void removeBook(int bookId);
    List<BookInterface> getAllBooks();
    List<BookInterface> getAvailableBooks();
    BookInterface getBookById(int bookId);
}
