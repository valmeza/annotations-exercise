/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    @SuppressWarnings({"all","unchecked"})
    private List books;

    @SuppressWarnings({"all","unchecked"})
    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @SuppressWarnings({"all","unchecked"})
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    @SuppressWarnings({"all","unchecked"})
    public List<String> publishedBooks() {
        return books;
    }

    @SuppressWarnings({"all","unchecked"})
    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public String fullName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
