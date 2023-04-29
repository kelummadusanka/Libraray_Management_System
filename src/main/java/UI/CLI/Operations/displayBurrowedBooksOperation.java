package UI.CLI.Operations;

import Models.Interfaces.BookInterface;
import Models.Interfaces.BorrowedBookInterface;
import Services.Implemetaions.LibraryServices;
import UI.CLI.Operation;

import java.util.List;

public class displayBurrowedBooksOperation implements Operation {
    private final LibraryServices libraryServices;
    public  displayBurrowedBooksOperation(LibraryServices libraryServices){
        this.libraryServices = libraryServices;
    }
    @Override
    public void execute() {
        List<BorrowedBookInterface> books = libraryServices.getAllBorrowedBooks();
        if (books == null) {
            System.out.println("No Borrowed books Available.");
            return;
        }


        System.out.format("\n%-10s | %-10s | %-10s | %-15s | %s%n","Record Id", "Book Id", "Member Id", "Borrowed Date", "Due Date");
        System.out.format("%-10s | %-10s | %-10s | %-15s | %s%n", "----------", "----------", "----------", "---------------", "---------------");

        for (BorrowedBookInterface book : books) {
                System.out.format("%-10s | %-10s | %-10s | %-15s | %s%n", book.getRecordId(), book.getBookId(), book.getMemberId(), book.getBorrowDate(), book.getDueDate());
        }

    }
}
