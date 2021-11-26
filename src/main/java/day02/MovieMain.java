package day02;

import java.nio.file.Path;

public class MovieMain {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        movieService.fillListWIthMovies(movieService.MovieServiceStart(Path.of("src/main/resources/movies.csv")));
        movieService.WriteOut();
    }
}
