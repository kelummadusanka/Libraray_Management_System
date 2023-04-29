package UI.CLI.Operations;

import Services.Implemetaions.LibraryServices;
import UI.CLI.Operation;

import java.util.Scanner;

public class addNewBookOperation implements Operation {
    private final LibraryServices libraryServices;

    public  addNewBookOperation(LibraryServices libraryServices){
        this.libraryServices = libraryServices;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Id: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline character

        System.out.print("Enter the Name of the Book: ");
        String title = scanner.nextLine().trim();
        while (title.isEmpty()) {
            System.out.print("Please enter a non-empty book title: ");
            title = scanner.nextLine().trim();
        }

        System.out.print("Enter the name of the Author: ");
        String author = scanner.nextLine().trim();
        while (author.isEmpty()) {
            System.out.print("Please enter a non-empty author name: ");
            author = scanner.nextLine().trim();
        }

        libraryServices.addBook(id, title, author);
        System.out.println("Book added successfully!");
    }

}
