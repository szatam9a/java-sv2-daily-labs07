package day02;

public class Movie {
        private String title;
        private int yearOfRelease;
        private String director;

    public Movie(String title, int yearOfRelease, String director) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
