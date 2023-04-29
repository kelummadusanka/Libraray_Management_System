package Databases.Adapters;

import Databases.InbuildDtabases.InbuildBookBorrowedDatabse;
import Models.Interfaces.BookInterface;
import Models.Interfaces.BorrowedBookInterface;
import Models.ModelIml.BorrowedBook;
import Repositories.BorrowedBookRepository;

import java.util.Date;
import java.util.List;

public class InbuildBorrowDbBookAdapter implements BorrowedBookRepository {

    private final InbuildBookBorrowedDatabse inbuildBookBorrowedDatabse;

    public InbuildBorrowDbBookAdapter(InbuildBookBorrowedDatabse inbuildBookBorrowedDatabse){
        this.inbuildBookBorrowedDatabse = inbuildBookBorrowedDatabse;
    }


    @Override
    public BorrowedBookInterface getBorrowedBookById(int bookId) {
        return inbuildBookBorrowedDatabse.getBorrowedBook(bookId);
    }

    @Override
    public void addBorrowedBook(BorrowedBookInterface borrowedBook) {

        inbuildBookBorrowedDatabse.save(borrowedBook);

    }

    @Override
    public void returnBorrowedBook(int bookId, Date returnDate) {

        BorrowedBookInterface returnBook = getBorrowedBookById(bookId);
        returnBook.setReturnDate(returnDate);
        inbuildBookBorrowedDatabse.update(returnBook);

    }

    @Override
    public List<BorrowedBookInterface> getAllBorrowedBooks() {
        return inbuildBookBorrowedDatabse.getNotReturnBooks();
    }

    @Override
    public List<BorrowedBookInterface> getOverdueBorrowedBooks() {
        return inbuildBookBorrowedDatabse.getOverDueBooks();
    }

    @Override
    public List<BorrowedBookInterface> getBorrowedBooksByMemberId(int memberId) {
        return null;
        //return inbuildBookBorrowedDatabse;
    }
}
