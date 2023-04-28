package Databases;

import Databases.Adapters.InbuildBookDbAdapter;
import Databases.Adapters.InbuildBorrowBookAdapter;
import Repositories.BookRepository;
import Repositories.BorrowedBookRepository;
import Repositories.MemberRepository;

public interface DataLoaderInterface {
    BookRepository getBookRepositray();
    BorrowedBookRepository getBorrowedBookRepository();
    MemberRepository getMemberRepository();
}
