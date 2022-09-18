import java.util.Comparator;

public class SortbyRevenue implements Comparator<movie>{

    @Override
    public int compare(movie o1, movie o2) {
        if (o1.getRevenue() > o2.getRevenue()){
            return 1;
        }
        else if (o1.getRevenue() < o2.getRevenue()){
            return -1;
        }
        else {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
    
}