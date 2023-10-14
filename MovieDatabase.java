import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private int releaseYear;

    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return title + " (Directed by " + director + ", Released in " + releaseYear + ")";
    }
}

public class MovieDatabase {
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Movie Database Menu:");
            System.out.println("1. Add a Movie");
            System.out.println("2. List All Movies");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter movie title: ");
                    String title = scanner.next();
                    System.out.print("Enter director: ");
                    String director = scanner.next();
                    System.out.print("Enter release year: ");
                    int releaseYear = scanner.nextInt();
                    movieList.add(new Movie(title, director, releaseYear));
                    System.out.println("Movie added successfully!");
                    break;
                case 2:
                    System.out.println("List of Movies:");
                    for (Movie movie : movieList) {
                        System.out.println(movie);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the Movie Database. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
