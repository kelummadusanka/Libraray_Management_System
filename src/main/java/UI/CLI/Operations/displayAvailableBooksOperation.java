package UI.CLI.Operations;

import Models.Interfaces.BookInterface;
import Services.Implemetaions.LibraryServices;
import UI.CLI.Operation;

import java.util.List;

public class displayAvailableBooksOperation implements Operation {
    private final LibraryServices libraryServices;
    public  displayAvailableBooksOperation(LibraryServices libraryServices){
        this.libraryServices = libraryServices;
    }

    @Override
    public void execute() {
        List<BookInterface> books = libraryServices.getAllBooks();
        System.out.format("\n%-10s | %-30s | %s%n","Book Id", "Title", "Author");
        System.out.format("%-10s | %-30s | %s%n", "----------", "------------------------------", "-------------------");

        for (BookInterface book : books) {
            System.out.format("%-10s | %-30s | %s%n", book.getId(), book.getTitle(), book.getAuthor());
        }

    }
}
