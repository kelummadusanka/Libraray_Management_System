import Databases.Adapters.InbuildBookDbAdapter;
import Databases.Adapters.InbuildBorrowBookAdapter;
import Databases.InbuildDtabases.InbuildMemberDatabase;
import Models.Interfaces.BorrowedBookInterface;
import Models.ModelIml.Member;
import Repositories.BookRepository;
import Repositories.BorrowedBookRepository;
import Services.Implemetaions.LibraryServices;
import UI.CLI.CLI;
import UI.Interface.UIInterface;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LibraryServices libraryServices = new LibraryServices(bookRepository, borrowedBookRepository);
        UIInterface ui = new CLI(libraryServices);
        ui.show();
    }
}