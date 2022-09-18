import java.util.Arrays;
import java.util.List;

public class country {

    private static String CountryName;
    private static String gold;
    private static String silver;
    private static String bronze;
    private static String totalMedals;

    public country(String CountryName, String gold, String silver, String bronze, String totalMedals) {
        this.CountryName = CountryName;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.totalMedals = totalMedals;
    }

    public country() {

    }

    public static String getCountryNameName() {

        return CountryName;
    }

    public static String getGold() {

        return gold;
    }

    public void addGoldMedal(){
        gold += 1;
    }

    public static String getSilver() {

        return silver;
    }

    public void addSilverMedal(){

        silver += 1;
    }

    public static String getBronze() {

        return bronze;
    }

    public void addBronzeMedal(){

        bronze += 1;
    }

    public static String getTotalMedals() {

        return totalMedals;
    }

    public static List<country> getCountryList() {
        return Arrays.asList(COUNTRIES);
    }

    public static final country[] COUNTRIES = new country[] {

    }

    @Override
    public String toString() {

        return country + "  Gold:" + gold + "  Silver:" + silver + "  Bronze:" + bronze;
    }
}