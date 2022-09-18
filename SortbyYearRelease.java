import java.util.Comparator;

public class SortbyYearRelease implements Comparator<movie>{

    @Override
    public int compare(movie o1, movie o2) {
        if (o1.getYearRelease() > o2.getYearRelease()){
            return 1;
        }
        else if (o1.getYearRelease() < o2.getYearRelease()){
            return -1;
        }
        else {
            if (o1.getRevenue() > o2.getRevenue()){
                return 1;
            }
            else if (o1.getRevenue() < o2.getRevenue()){
                return -1;
            }
            else {
                return 0;
            }
        }
    }
    
}