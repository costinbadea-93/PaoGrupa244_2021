import model.Book;
import model.Library;
import service.LibraryService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();

        List<Book> books = libraryService.retrieveAllLibraryBooks();
        System.out.println("Am preluat cartile: ");
        System.out.println(books);

        Library library = new Library("Libraria Arad");
        int libraryId = libraryService.addNewLibrary(library);
        System.out.println("Am adaugat libraria cu id-ul " + libraryId);

    }
}
