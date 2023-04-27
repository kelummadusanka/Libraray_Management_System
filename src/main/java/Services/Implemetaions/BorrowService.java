package Services.Implemetaions;

import Models.Interfaces.BookInterface;
import Models.Interfaces.BorrowedBookInterface;
import Models.ModelIml.Book;
import Models.ModelIml.BorrowedBook;
import Repositories.BookRepository;
import Repositories.BorrowedBookRepository;
import Repositories.MemberRepository;
import Services.Interfaces.BorrowServiceInterface;

import java.util.Date;
import java.util.List;


public class BorrowService implements BorrowServiceInterface {

    private final BookRepository bookRepository;
    private final MemberRepository memberRepository;
    private final BorrowedBookRepository borrowRepository;

    public BorrowService(BookRepository bookRepository, MemberRepository memberRepository,
                         BorrowedBookRepository borrowRepository) {
        this.bookRepository = bookRepository;
        this.memberRepository = memberRepository;
        this.borrowRepository = borrowRepository;
    }

    @Override
    public void addBorrowBook(int bookId, int memberId, Date BorrowedDate, Date ReturnDate) {
        BookInterface book = bookRepository.getBookById(bookId);
        int recordId =5;

        if(book!= null){
            BorrowedBookInterface borrowedBook = new BorrowedBook(recordId, bookId, memberId, BorrowedDate, ReturnDate);
            borrowRepository.addBorrowedBook(borrowedBook);
        }
    }

    @Override
    public void returnBorrowedBook(int bookId, int memberId, Date ReturnDate) {

            borrowRepository.returnBorrowedBook(ReturnDate);

    }

    @Override
    public List<BorrowedBookInterface> getAllBorrowedBooks() {
        return borrowRepository.getAllBorrowedBooks();
    }

    @Override
    public List<BorrowedBookInterface> getOverdueBorrowedBooks() {
        return borrowRepository.getOverdueBorrowedBooks();
    }

    @Override
    public List<BorrowedBookInterface> getBorrowedBooksByMemberId(int memberId) {
        return borrowRepository.getBorrowedBooksByMemberId(memberId);
    }
}