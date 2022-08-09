package classes.and.objects;

import java.util.Objects;

public class Book {
    String name;
    Author author;
    int publishYear;

    public Book(String name, Author author, int publishYear) throws AuthorNotFilled {

        if (Objects.isNull(author)) {
            throw new AuthorNotFilled();
        }

        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public Book setPublishYear(int publishYear) {
        this.publishYear = publishYear;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publishYear=" + publishYear +
                '}';
    }
}
