import java.text.NumberFormat;

public class movie{
    private String title;
    private String diretor;
    private int yearRelease;
    private long revenue;

    movie(String title, String diretor, int yearRelease, long revenue){
        this.title = title;
        this.diretor = diretor;
        this.yearRelease = yearRelease;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }
    @Override
    public String toString() {
        return String.format("Title: %-50s Diretor: %-30s Release: %-8d Revenue: %s", title, diretor, yearRelease, NumberFormat.getInstance().format(revenue));
    }
}