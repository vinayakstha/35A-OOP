package practice;

import java.util.Scanner;

class Movie {
    private String movieTitle, director;
    private float rating;

    Movie(String movieTitle, String director, float rating) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.rating = rating;
    }

    public String getMovieTitle() {
        return this.movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public float getRating() {
        return rating;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < movies.length; i++) {
            System.out.print("enter movie title: ");
            String title = scanner.nextLine();

            System.out.print("enter director: ");
            String director = scanner.nextLine();

            System.out.print("enter rating: ");
            float rating = scanner.nextFloat();

            scanner.nextLine();

            movies[i] = new Movie(title, director, rating);
        }
        scanner.close();
        Movie highestMovieRating = movies[0];
        for (Movie movie : movies) {
            if (movie.getRating() > highestMovieRating.getRating()) {
                highestMovieRating = movie;
            }
        }
        System.out.println("----------------------------------");
        System.out.println(highestMovieRating.getMovieTitle());
        System.out.println(highestMovieRating.getDirector());
        System.out.println(highestMovieRating.getRating());

    }
}
