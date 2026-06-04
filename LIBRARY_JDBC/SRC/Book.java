package LIBRARY_JDBC.SRC;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private String language;

    public Book() {
    }

    public Book(int id, String name, String author,
                String publisher, String language) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}