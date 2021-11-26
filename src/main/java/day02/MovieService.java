package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    private List<Movie> movieList = new ArrayList<>();


    public List<String> MovieServiceStart(Path path) {
        List<String> lines;
        try {
             lines = Files.readAllLines((path));
        } catch (IOException ioe) {
            throw new IllegalStateException("cannot read file", ioe);
        }

        return lines;
    }

    public void fillListWIthMovies(List<String> lines) {
        for (String rows : lines
        ) {
            String[] temp = rows.split(";");
            movieList.add(new Movie(temp[0], Integer.parseInt(temp[1]), temp[2]));
        }
    }
    public void WriteOut (){
        for (Movie movie:movieList
             ) {
            System.out.println(movie.getTitle());
        }
    }
}

