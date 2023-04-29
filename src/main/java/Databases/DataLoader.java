package Databases;

import Databases.Factory.BookDbFactory;
import Databases.Factory.BorrowedBookDbFactory;
import Repositories.BookRepository;
import Repositories.BorrowedBookRepository;
import Repositories.MemberRepository;

public class DataLoader implements DataLoaderInterface{

    private String BookDbType;
    private String BorrowedBookDbType;

    public DataLoader(String BookDbType, String BorrowedBookDbType){
        this.BookDbType = BookDbType;
        this.BorrowedBookDbType = BorrowedBookDbType;

    }

    @Override
    public BookRepository getBookRepositray() {
        return BookDbFactory.createBookRepository(BookDbType);
    }

    @Override
    public BorrowedBookRepository getBorrowedBookRepository() {
        return BorrowedBookDbFactory.createBorrowedBookRepository(BorrowedBookDbType);
    }

    @Override
    public MemberRepository getMemberRepository() {
        return null;
    }
}
