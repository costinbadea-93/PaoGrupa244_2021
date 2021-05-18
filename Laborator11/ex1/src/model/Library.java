package model;


public class Library {
    private int libraryId;
    private String libraryLocation;

    public Library(Integer libraryId, String libraryLocation) {
        this.libraryId = libraryId;
        this.libraryLocation = libraryLocation;
    }

    public Library(String libraryLocation){
        this.libraryLocation = libraryLocation;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryLocation() {
        return libraryLocation;
    }

    public void setLibraryLocation(String libraryLocation) {
        this.libraryLocation = libraryLocation;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryId=" + libraryId +
                ", libraryLocation='" + libraryLocation + '\'' +
                '}';
    }
}
