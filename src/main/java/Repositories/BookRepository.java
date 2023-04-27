package Repositories;

import Models.Interfaces.BookInterface;

import java.util.List;

public interface BookRepository {
    void addBook(BookInterface book);
    void removeBook(int id);
    List<BookInterface> getAllBooks();
    List<BookInterface> getAvailableBooks();
    BookInterface getBookById(int id);
    void updateBook(int bookId, BookInterface book);
}
