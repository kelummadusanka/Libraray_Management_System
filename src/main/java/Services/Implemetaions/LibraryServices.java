package Services.Implemetaions;

import Databases.DataLoader;
import Models.Interfaces.BookInterface;
import Models.Interfaces.BorrowedBookInterface;
import Models.ModelIml.Book;
import Models.ModelIml.BorrowedBook;
import Repositories.BookRepository;
import Repositories.BorrowedBookRepository;
import Services.Interfaces.BookServiceInterface;
import Services.Interfaces.BorrowServiceInterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryServices implements BorrowServiceInterface,BookServiceInterface {
    private final BookRepository bookRepository;
    private final BorrowedBookRepository borrowedBookRepository;

    public LibraryServices(DataLoader data){
        this.bookRepository = data.getBookRepositray();
        this.borrowedBookRepository = data.getBorrowedBookRepository();
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
    public List<BookInterface> getAvailableBooks() {

        return bookRepository.getAvailableBooks();
    }

    @Override
    public List<BookInterface> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public BookInterface getBookById(int bookId) {
        return bookRepository.getBookById(bookId);
    }


    //.........................................................

    @Override
    public void addBorrowBook(int bookId, int memberId, Date BorrowedDate, Date DueDate) {
        BookInterface book = bookRepository.getBookById(bookId);
        int recordId =5;

        if(book!= null){
            BorrowedBookInterface borrowedBook = new BorrowedBook(recordId, bookId, memberId, BorrowedDate, DueDate);
            borrowedBookRepository.addBorrowedBook(borrowedBook);
            BookInterface bookToBorrow = bookRepository.getBookById(bookId);
            bookToBorrow.setAvailability(false);
            bookRepository.updateBook(bookId,bookToBorrow);
        }
    }

    @Override
    public void returnBorrowedBook(int bookId, int memberId, Date ReturnDate) {
        BorrowedBookInterface borrowedBook = borrowedBookRepository.getBorrowedBookById(bookId);
        if(borrowedBook!=null){
            borrowedBook.setReturnedState(true);
            borrowedBookRepository.returnBorrowedBook(bookId,ReturnDate);
            BookInterface book = bookRepository.getBookById(bookId);
            book.setAvailability(true);
            bookRepository.updateBook(bookId,book);
        }

    }

    @Override
    public List<BorrowedBookInterface> getAllBorrowedBooks() {
        return borrowedBookRepository.getAllBorrowedBooks();
    }

    @Override
    public List<BorrowedBookInterface> getOverdueBorrowedBooks() {
        List<BorrowedBookInterface> OverdueBorrowedBooks = new ArrayList<>();
        return borrowedBookRepository.getOverdueBorrowedBooks();
    }

    @Override
    public List<BorrowedBookInterface> getBorrowedBooksByMemberId(int memberId) {
        return borrowedBookRepository.getBorrowedBooksByMemberId(memberId);
    }
}
