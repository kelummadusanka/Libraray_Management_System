package Databases.Adapters;

import Models.Interfaces.BorrowedBookInterface;
import Models.ModelIml.BorrowedBook;
import Repositories.BorrowedBookRepository;

import java.util.Date;
import java.util.List;

public class InbuildBorrowBookAdapter implements BorrowedBookRepository {


    @Override
    public BorrowedBook getBorrowedBookById(int bookId) {
        return null;
    }

    @Override
    public void addBorrowedBook(BorrowedBookInterface borrowedBook) {

    }

    @Override
    public void returnBorrowedBook(Date returnDate) {

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
