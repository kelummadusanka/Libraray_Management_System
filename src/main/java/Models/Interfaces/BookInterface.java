package Models.Interfaces;

public interface BookInterface {
    int getId();
    void setId(int id);
    String getTitle();
    void setTitle(String title);
    String getAuthor();
    void setAuthor(String author);
    boolean setAvailability();
    void setAvailability(boolean availability);
}