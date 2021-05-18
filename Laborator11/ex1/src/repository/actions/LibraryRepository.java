package repository.actions;


import model.Book;
import model.Library;

import java.util.List;

public interface LibraryRepository {

    /**
     *
     * @return a list with all books
     */
    List<Book> retrieveAllLibraryBooks();

    /**
     *
     * @param libraryLocation
     * @return a list of books for a specific library
     */
    List<Book> retrieveBooksForLibrary(String libraryLocation);

    /**
     *
     * @param library
     * @return
     */
    int addNewLibrary(Library library);

    /**
     *
     * @param book
     * @return
     */
    int addBook(Book book);
}
