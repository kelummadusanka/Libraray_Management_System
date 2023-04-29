package Databases.Adapters;

import Databases.InbuildDtabases.InBuildBookDatabase;
import Models.Interfaces.BookInterface;
import Repositories.BookRepository;

import java.util.List;

public class InbuildBookDbAdapter implements BookRepository {
    private final InBuildBookDatabase bookDb;

    public InbuildBookDbAdapter(InBuildBookDatabase bookDb){
        this.bookDb = bookDb;

    }

    @Override
    public void addBook(BookInterface book) {

        bookDb.savebooks(book);
    }

    @Override
    public void removeBook(int id) {

        bookDb.deleteBook(id);

    }

    @Override
    public List<BookInterface> getAllBooks() {
        return bookDb.getAllAvailableBooks();
    }

    @Override
    public List<BookInterface> getAvailableBooks() {
        return bookDb.getAllAvailableBooks();
    }

    @Override
    public BookInterface getBookById(int id) {
        return bookDb.getBookbyId(id);
    }

    @Override
    public void updateBook(int bookId, BookInterface book) {
        bookDb.updateBook(book);
    }
}
