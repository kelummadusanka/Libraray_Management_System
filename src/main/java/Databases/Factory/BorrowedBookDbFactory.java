package Databases.Factory;

import Databases.Adapters.InbuildBorrowDbBookAdapter;
import Databases.InbuildDtabases.InbuildBookBorrowedDatabse;
import Repositories.BorrowedBookRepository;

public class BorrowedBookDbFactory {
    public static BorrowedBookRepository createBorrowedBookRepository(String DbType){
        switch (DbType){
            case "inBuild":
                return new InbuildBorrowDbBookAdapter(new InbuildBookBorrowedDatabse());
            default:
                return null;
        }

    }
}
