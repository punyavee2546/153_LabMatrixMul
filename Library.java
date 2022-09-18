import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Library implements BorrowAble{
    private ArrayList<Book> allBooks;
    private HashMap<String, LocalDate> borrowHW;

    Library(){
        allBooks = new ArrayList<>();
        borrowHW = new HashMap<String, LocalDate>();
    }

    public Book getBookByIndex(int i){
        return allBooks.get(i);
    }

    public void addBook(Book book){
        allBooks.add(book);
    }

    public void printCatalog(){
        for(Book b : allBooks){
            if(b instanceof LibraryArchive){
                System.out.print((LibraryArchive)b + "\n\n");
            }
            else{
                System.out.print(b + "\n\n");
            }
        }
    }

    public void printBorrow(){
        for (Map.Entry br : borrowHW.entrySet()){
            System.out.println("Title name: " + br.getKey() + " Borrow date: " + br.getValue());
        }
    }   

    @Override
    public boolean checkOut(Book b, int yy, int mm, int dd) {
        if(b.getClass() == LibraryBook.class && ((LibraryBook)b).isAvailable()){
            ((LibraryBook)b).setBookAvilableFalse();
            borrowHW.put(b.title, LocalDate.of(yy, mm, dd));
            return true;
        }
        return false;
    }

    @Override
    public int returnitem(Book b, int yy, int mm, int dd) {

        // check that borrow book exits
        if(borrowHW.containsKey(b.title)){
            int days = (int)borrowHW.get(b.title).until(LocalDate.of(yy, mm, dd), ChronoUnit.DAYS);
            borrowHW.remove(b.title);
            ((LibraryBook)b).setBookAvilableTrue();
            return days;
        }
        else{
            return -1;
        }
        
    }
}

