public class LibraryBook extends Book{
    private boolean availForBorrow;

    LibraryBook(String isbn, String title, String author, String publihser, int year, int numberOfPages) {
        super(isbn, title, author, publihser, year, numberOfPages);
        this.availForBorrow = true;
    }
    
    public boolean isAvailable(){
        return availForBorrow;
    }

    public void setBookAvilableFalse(){
        availForBorrow = false;
    }

    public void setBookAvilableTrue(){
        availForBorrow = true;
    }

}}
