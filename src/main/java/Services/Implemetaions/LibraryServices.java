package Services.Implemetaions;

import Models.Interfaces.BookInterface;
import Models.Interfaces.BorrowedBookInterface;
import Models.Interfaces.MemberInterface;
import Services.Interfaces.BookServiceInterface;
import Services.Interfaces.BorrowServiceInterface;
import Services.Interfaces.LibraryServiceInterface;

import java.util.Date;
import java.util.List;

public class LibraryServices implements LibraryServiceInterface,BorrowServiceInterface,BookServiceInterface {
    private final BookServiceInterface bookService;
    private BorrowServiceInterface borrowService;
    LibraryServices(BookServiceInterface bookService, BorrowServiceInterface borrowService){
        this.bookService=bookService;
        this.borrowService=borrowService;
    }
    @Override
    public void addBook(int id, String title, String author) {
        bookService.addBook(id,title,author);
    }

    @Override
    public void removeBook(int id) {
        bookService.removeBook(id);
    }

    @Override
    public List<BookInterface> getAllBooks() {
        return null;
    }

    @Override
    public List<BookInterface> getAvailableBooks() {
        return bookService.getAvailableBooks();
    }

    @Override
    public BookInterface getBookById(int bookId) {
        return null;
    }

    @Override
    public void borrowBook(int bookId, int memberId, Date BorrowedDate, Date DueDate) {
        borrowService.addBorrowBook(bookId,memberId,BorrowedDate,DueDate);
    }

    @Override
    public void returnBook(BookInterface book) {

    }

    @Override
    public List<BorrowedBookInterface> getBorrowedBooks() {
        return null;
    }

    @Override
    public List<BorrowedBookInterface> getOverdueBooks() {
        return null;
    }

    @Override
    public void addBorrowBook(int bookId, int memberId, Date BorrowedDate, Date DueDate) {

    }

    @Override
    public void returnBorrowedBook(int bookId, int memberId, Date ReturnDate) {

    }

    @Override
    public List<BorrowedBookInterface> getAllBorrowedBooks() {
        return null;
    }

    @Override
    public List<BorrowedBookInterface> getOverdueBorrowedBooks() {
        return null;
    }

    @Override
    public List<BorrowedBookInterface> getBorrowedBooksByMemberId(int memberId) {
        return null;
    }
}
