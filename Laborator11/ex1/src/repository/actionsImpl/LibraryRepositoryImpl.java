package repository.actionsImpl;

import model.Book;
import model.Library;
import repository.actions.LibraryRepository;
import utils.DbConnection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static utils.Queries.INSERT_NEW_LIBRARY;
import static utils.Queries.RETRIEVE_ALL_LIBRARY_BOOKS;

public class LibraryRepositoryImpl implements LibraryRepository {
    private DbConnection dbConnection = DbConnection.getInstance();
    @Override
    public List<Book> retrieveAllLibraryBooks() {
       List<Book> bookList = new ArrayList<>();
       try{
           PreparedStatement preparedStatement = dbConnection.getDBConnection().prepareStatement(RETRIEVE_ALL_LIBRARY_BOOKS);
           ResultSet resultSet = preparedStatement.executeQuery();
           while (resultSet.next()) {
               Book book = new Book(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4));
               bookList.add(book);
           }
       }catch (SQLException e) {
           e.printStackTrace();
       }
       return bookList;
    }

    @Override
    public List<Book> retrieveBooksForLibrary(String libraryLocation) {
        return null;
    }

    @Override
    public int addNewLibrary(Library library) {
       ResultSet resultSet;
       try{
           PreparedStatement preparedStatement = dbConnection.getDBConnection().prepareStatement(INSERT_NEW_LIBRARY, Statement.RETURN_GENERATED_KEYS);
           preparedStatement.setString(1, library.getLibraryLocation());
           preparedStatement.executeUpdate();
           resultSet = preparedStatement.getGeneratedKeys();
           resultSet.next();
           return Integer.parseInt(resultSet.getString(1));
       }catch (SQLException e) {
         e.printStackTrace();
         throw new RuntimeException("Some problem ocurred during adding library");
       }
    }

    @Override
    public int addBook(Book book) {
        return 0;
    }
}
