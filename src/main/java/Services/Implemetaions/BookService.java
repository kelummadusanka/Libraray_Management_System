package Services.Implemetaions;

import Models.Interfaces.BookInterface;
import Models.ModelIml.Book;
import Repositories.BookRepository;
import Services.Interfaces.BookServiceInterface;

import java.util.List;

public class BookService implements BookServiceInterface {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(int id, String title, String author) {
        BookInterface book = new Book(id, title, author);
        bookRepository.addBook(book);
    }

    @Override
    public void removeBook(int bookId) {
        bookRepository.removeBook(bookId);
    }

    @Override
    public List<BookInterface> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public List<BookInterface> getAvailableBooks() {
        return bookRepository.getAvailableBooks();
    }

    @Override
    public BookInterface getBookById(int bookId) {
        return bookRepository.getBookById(bookId);
    }


}
