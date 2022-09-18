public class LibraryArchive extends Book{
    LibraryArchive(String isbn, String title, String author, String publihser, int year, int numberOfPages) {
        super(isbn, title, author, publihser, year, numberOfPages);
    }

    public String toString(){
        return super.toString().replaceAll("Title name", "Archive Resource");
    }  
}
