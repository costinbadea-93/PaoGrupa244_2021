package service;

import model.Book;
import model.Library;
import repository.actions.LibraryRepository;
import repository.actionsImpl.LibraryRepositoryImpl;

import java.util.List;


public class LibraryService {

    private LibraryRepository libraryRepository  = new LibraryRepositoryImpl();

    public List<Book> retrieveAllLibraryBooks() {
        return  libraryRepository.retrieveAllLibraryBooks();
    }

    public int addNewLibrary(Library library) {
       return libraryRepository.addNewLibrary(library);
    }
}
