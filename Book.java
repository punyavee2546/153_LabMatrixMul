public class Book {
    protected String isbn; 
    protected String title;
    protected String author;
    protected String publisher;
    protected int year;
    protected int numberOfPages;
    private int currentPageNumber;

    Book (String isbn, String title, String author, String publihser, int year, int numberOfPages){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publihser;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }
    public void turnPageForward(){
        if(currentPageNumber < numberOfPages ){
            currentPageNumber++;
        }
    }

    public void turnPageBackward(){
        if(currentPageNumber > 0 ){
            currentPageNumber--;
        }
    }

    public String getName(){
        return title;
    } 

    public int nowAtPage(){
        return currentPageNumber;
    }

    @Override
    public String toString(){
        return String.format("ISBN: %s\nTitle name: %s\nAuthor name: %s\nPublisher: %s\nYear: %d\nThe number of pages: %d", isbn, title, author, publisher, year, numberOfPages);
    }
}
