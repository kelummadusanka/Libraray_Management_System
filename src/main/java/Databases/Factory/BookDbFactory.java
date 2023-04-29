package Databases.Factory;

import Databases.Adapters.InbuildBookDbAdapter;
import Databases.InbuildDtabases.InBuildBookDatabase;
import Repositories.BookRepository;

public class BookDbFactory {
    public static BookRepository createBookRepository(String name){
        switch (name){
            case "inBuild":
                return new InbuildBookDbAdapter(new InBuildBookDatabase());
            default:
                return null;
        }
    }
}
