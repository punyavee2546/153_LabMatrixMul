import java.util.Comparator;

public class SortbyDirector implements Comparator<movie>{
    @Override
    public int compare(movie o1, movie o2) {
        if (o1.getDiretor().compareTo(o2.getDiretor()) != 0) {
            return o1.getDiretor().compareTo(o2.getDiretor());
        }
        else {
            if (o1.getYearRelease() > o2.getYearRelease()) {
                return 1;
            }
            else if (o1.getYearRelease() < o2.getYearRelease()) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }
    
}
