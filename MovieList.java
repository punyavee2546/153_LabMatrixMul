import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MovieList {
    private ArrayList<movie> allMovies = new ArrayList<>();
    private HashMap<String, Long> direReveMap = new HashMap<>();

    MovieList(){
        Path inFile = Paths.get(".","movies.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader s = Files.newBufferedReader(inFile, charset)) {
            String line;
            int i = 0;
            while ((line = s.readLine()) != null) {
                String []dataField = line.split("\t");
                if(dataField[0].equals("name") || dataField[12].equals("0") || dataField[11].equals("0") ||dataField[14].equals("0")) continue;
                allMovies.add(new movie(dataField[0], dataField[7], Integer.parseInt(dataField[3]), Long.parseLong(dataField[12])));
                if(direReveMap.containsKey(allMovies.get(i).getDiretor())){
                    direReveMap.put(allMovies.get(i).getDiretor(), direReveMap.get(allMovies.get(i).getDiretor()) + allMovies.get(i).getRevenue());
                }
                else{
                    direReveMap.put(allMovies.get(i).getDiretor(), allMovies.get(i).getRevenue());
                }
                i++;
            }
            s.close(); 
        } 
        catch (IOException e) { 
            System.out.println(e);
        } 
    }

    public ArrayList<movie> getAllMovies() {
        return allMovies;
    }

    public void setAllMovies(ArrayList<movie> movies) {
        this.allMovies = movies;
    }

    public HashMap<String, Long> getDireReveMap() {
        return direReveMap;
    }

    public void setDireReveMap(HashMap<String, Long> direReveMap) {
        this.direReveMap = direReveMap;
    }

    public void displayByRevenue(){
        Collections.sort(allMovies, new SortbyRevenue());
        display();
    }

    public void displayByDirector(){
        Collections.sort(allMovies, new SortbyDirector());
        display();
    }

    public void displayByYear(){
        Collections.sort(allMovies, new SortbyYearRelease());
        display();
    }

    public void displayRevenueByDirector(){
        for (String key : direReveMap.keySet()){
            System.out.printf("Director: %-30s Revenue: %s\n", key, NumberFormat.getInstance().format(direReveMap.get(key)));
        }
    }

    public void display(){
        for (movie movie : allMovies){
            System.out.println(movie);
        }
    }
}