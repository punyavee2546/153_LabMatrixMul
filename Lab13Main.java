import demoMovie.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lab13Main {
    public static void main(String [] args) {
        List<Movie> movies = Movie.getMovieList();
    
        double average = movies.stream()
                     .mapToDouble( Movie::getRating )
                     .average().getAsDouble();
        System.out.println(average);
        
        System.out.println();
        movies.stream()
                  .filter( m -> m.getRating() > 8.5)
                  .forEach(System.out::println);

        System.out.print("Q3 -The top rated movie-\t");
        List<Movie> sortedList = movies.stream() 
                .sorted(Comparator.comparing(Movie::getRating).reversed())
                .collect(Collectors.toList());
                System.out.println(sortedList);

        System.out.print("Q4 -Find movie with the lowest rating- \t");
        Movie lowestRatingMovie = movies.stream()
                  .min(Comparator.comparing(Movie::getRating)).get();
        System.out.println(lowestRatingMovie);

        System.out.println("Q5 -List of action movies, sorted by name -"); 
        List<Movie> actionMovieNames = movies.stream()
            .filter( m -> m.getGenre() == Genre.ACTION)
            .sorted(Comparator.comparing(Movie::getName).reversed())
            .collect(Collectors.toList());
        System.out.println(actionMovieNames);


        System.out.println("Q6 -Top 3 romantic movies-");
        List<Movie> romantic = 
        movies.stream()
            .filter( m -> m.getGenre() == Genre.ROMANTIC)
            .sorted(Comparator.comparing(Movie::getRating).reversed())
            .limit(3)
            .collect(Collectors.toList());
            System.out.println(romantic);

         System.out.println("Q7 -List of horror movie names-");
         movies.stream()
             .filter(m->m.getGenre()==Genre.HORROR)
             .map(Movie::getName)
             .collect(Collectors.toList())
             .forEach(System.out::println);
        
        System.out.println("Q8 -List of movies by Genre");
        Map<Genre, List<Movie>> rrrrr = 
        movies.stream()
        .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(rrrrr);

    }
    
}