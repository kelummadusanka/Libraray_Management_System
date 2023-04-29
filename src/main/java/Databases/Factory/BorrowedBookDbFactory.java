package Databases.Factory;

import Databases.Adapters.InbuildBorrowDbBookAdapter;
import Repositories.BorrowedBookRepository;

public class BorrowedBookDbFactory {
    public static BorrowedBookRepository createBorrowedBookRepository(String DbType){
        switch (DbType){
            case "inBuild":
                return new InbuildBorrowDbBookAdapter();
            default:
                return null;
        }

    }
}
