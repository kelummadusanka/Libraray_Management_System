package Databases.InbuildDtabases;

import Models.Interfaces.BorrowedBookInterface;
import Models.ModelIml.BorrowedBook;
import Models.ModelIml.Member;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class InbuildBookBorrowedDatabse {

    List<BorrowedBookInterface> borrowedBookList;

    public InbuildBookBorrowedDatabse() {
        borrowedBookList = new ArrayList<>();
        LocalDate now = LocalDate.now();
        //save(new BorrowedBook(1, 1, 1, now, now.plusDays(7)));
    }

    public boolean save(BorrowedBookInterface borrowedbook){
        return borrowedBookList.add(borrowedbook);
    }
    public boolean removeBorrowBook(BorrowedBookInterface book){
        Optional<BorrowedBookInterface> bookToRemove = borrowedBookList.stream()
                .filter(b -> b.getBookId() == book.getBookId())
                .findFirst();

        if (bookToRemove.isPresent()) {
            int index = borrowedBookList.indexOf(bookToRemove.get());
            return borrowedBookList.remove(bookToRemove);

        }
        return false;

    }

    public boolean update(BorrowedBookInterface borrowedBook){
        Optional<BorrowedBookInterface> book = borrowedBookList.stream()
                .filter(b -> b.getBookId() == borrowedBook.getBookId())
                .findFirst();

        if (book.isPresent()) {
            int index = borrowedBookList.indexOf(book.get());
            borrowedBookList.set(index, borrowedBook);
            return true;
        }
        return false;
    }

    public List<BorrowedBookInterface> getNotReturnBooks(){
        return  borrowedBookList.stream().filter(book -> ! book.getReturnedState()).toList();
    }

    public List<BorrowedBookInterface> getOverDueBooks(){
        Date now = new Date();
        return  borrowedBookList.stream().filter(book -> now.before(book.getDueDate())).toList();
    }


}
