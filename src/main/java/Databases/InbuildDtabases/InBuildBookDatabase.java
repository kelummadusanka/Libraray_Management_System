package Databases.InbuildDtabases;

import Models.Interfaces.BookInterface;
import Models.Interfaces.BorrowedBookInterface;
import Models.Interfaces.MemberInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InBuildBookDatabase {
    List<BookInterface> booksList;

    public InBuildBookDatabase(){
        booksList = new ArrayList<>();
    }

    public boolean savebooks(BookInterface book){
        booksList.add(book);
        return true;
    }


    public BookInterface getBookbyId (int bookId){
        return booksList.stream()
                .filter(book -> book.getId() == bookId)
                .findFirst()
                .orElse(null);
    }

    public List<BookInterface> getAllAvailableBooks(){
        return  booksList.stream().filter(book -> book.getAvailability()).toList();
    }

    public boolean deleteBook(int bookId){
        Optional<BookInterface> bookToRemove = booksList.stream()
                .filter(book -> book.getId() == bookId)
                .findFirst();
        if (bookToRemove.isPresent()) {
            booksList.remove(bookToRemove.get());
            return true;
        }
        return false;
    }

    public boolean updateBook(BookInterface book){
        Optional<BookInterface> bookToUpdate = booksList.stream()
                .filter(b -> b.getId() == book.getId())
                .findFirst();

        if (bookToUpdate.isPresent()) {
            int index = booksList.indexOf(bookToUpdate.get());
            booksList.set(index, book);
            return true;
        }
        return false;
    }



}
