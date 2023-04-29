package Databases.InbuildDtabases;

import Models.Interfaces.BorrowedBookInterface;
import Models.ModelIml.BorrowedBook;
import Models.ModelIml.Member;

import java.time.LocalDate;
import java.util.*;


public class InbuildBookBorrowedDatabse {

    List<BorrowedBookInterface> borrowedBookList;

    public InbuildBookBorrowedDatabse() {
        borrowedBookList = new ArrayList<>();
        Date now = new Date();

        // Create a Calendar instance and add 7 days
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DATE, 7);

        // Get the new date after adding 7 days
        Date dueDate = calendar.getTime();

        BorrowedBook book1 = new BorrowedBook(1, 1, 1, now, dueDate);
        BorrowedBook book2 = new BorrowedBook(2, 2, 2, now, dueDate);
        BorrowedBook book3 = new BorrowedBook(3, 3, 3, now, dueDate);
        BorrowedBook book4 = new BorrowedBook(4, 4, 4, now, dueDate);
        BorrowedBook book5 = new BorrowedBook(5, 5, 5, now, dueDate);

        save(book1);
        save(book2);
        save(book3);
        save(book4);
        save(book5);
    }


    public boolean save(BorrowedBookInterface borrowedbook){
        return borrowedBookList.add(borrowedbook);
    }
    public BorrowedBookInterface getBorrowedBook(int bookId){
        return borrowedBookList.stream().filter(b->b.getBookId()==bookId).findFirst().orElse(null);
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

    public List<BorrowedBookInterface> getBorrwedbooksOfMember(int memberId){
        return null;
    }


}
