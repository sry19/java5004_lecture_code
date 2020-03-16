package datatypes;

import java.util.Objects;

/**
 * This class represents a book. A book has a title, an author and a price
 */
public class Book {
    private String title;
    private String author;
    private Integer year;

    /**
     * Construct a Book object that has the provided title, author and  price
     *
     * @param title  the title to be given to this book
     * @param author the author of this book
     * @param year   year in which the book was published
     */

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    /**
     * Return the title of this book
     *
     * @return the title of this book
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * Return the author of this book
     *
     * @return the author of this book
     */
    public String getAuthor() {
        return this.author;
    }


    /**
     * Return the year in which this book was published
     *
     * @return the year of publication
     */
    public Integer getYear() {
        return this.year;
    }

    public String toString() {
        return String.format("Title: %s Author: %s Year: %d", this.title, this.author, this.year);
    }


    /**
     * Determines if this book is equal to another object.
     * @param o The object to compare this book to.
     * @return True if the two objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Book)) {
            return false;
        }
        Book other = (Book) o;
        return this.title.equals(other.getTitle())
                && (this.year.equals(other.getYear()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

}