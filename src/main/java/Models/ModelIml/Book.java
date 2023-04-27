package Models.ModelIml;

import Models.Interfaces.BookInterface;

public class Book implements BookInterface {

    private int Id;
    private String Title;
    private String Author;
    private boolean Availability;

    public Book(int Id, String Title, String Author){
        this.Id = Id;
        this.Title = Title;
        this.Author = Author;
        this.Availability = true;
    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public void setId(int id) {
        this.Id = id;

    }

    @Override
    public String getTitle() {
        return Title;
    }

    @Override
    public void setTitle(String title) {
        Title = title;

    }

    @Override
    public String getAuthor() {
        return Author;
    }

    @Override
    public void setAuthor(String author) {
        Author = author;

    }

    @Override
    public boolean setAvailability() {
        return Availability;
    }

    @Override
    public void setAvailability(boolean availability) {
        Availability = availability;
    }
}
