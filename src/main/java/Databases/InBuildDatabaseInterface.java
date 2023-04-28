package Databases;

import Models.Interfaces.BookInterface;

public interface InBuildDatabaseInterface {
    void addBook(BookInterface bookInterface);
    void deleteBook(int bookId);

}
