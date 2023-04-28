package Databases.Factory;

import Databases.Adapters.InbuildBookDbAdapter;
import Repositories.BookRepository;

public class BookDbFactory {
    public static BookRepository createBookRepository(String name){
        switch (name){
            case "inBuild":
                return new InbuildBookDbAdapter();
            default:
                return null;
        }
    }
}
