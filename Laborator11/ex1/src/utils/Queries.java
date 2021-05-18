package utils;

public class Queries {
    public static final String RETRIEVE_ALL_LIBRARY_BOOKS = "SELECT b.bookId,b.bookAuthor,b.bookName,b.libraryId FROM pao2021.library lib\n" +
            "inner join pao2021.book b\n" +
            "on lib.libraryId = b.libraryId;";
    public static final String INSERT_NEW_BOOK = "INSERT INTO book(bookId, bookName, bookAuthor, libraryId) values (null,?,?,?)";
    public static final String INSERT_NEW_LIBRARY = "INSERT INTO library(libraryId,libraryLocation) values (null,?)";
}
