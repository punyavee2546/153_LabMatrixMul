public interface BorrowAble {
    public boolean checkOut(Book b, int yy, int mm, int dd );

    public int returnitem(Book b, int yy, int mm, int dd);
}
