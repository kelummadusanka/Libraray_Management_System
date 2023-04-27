package Services.Interfaces;

import Models.Interfaces.BookInterface;

import java.util.List;

public interface BookServiceInterface {
    void addBook(int id, String title, String author);
    void removeBook(int bookId);
    List<BookInterface> getAvailableBooks();

    List<BookInterface> getAllBooks();
    BookInterface getBookById(int bookId);
}
