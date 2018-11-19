import java.util.Scanner;

public class Game {
    public String getMovie(){
//        get a random movie
        RandomMovie movies = new RandomMovie();
        String movie = movies.ArandomMovie();
        return movie;
    }
    public String get_Movie(String movie){
//        get underscore string of a movie
        CreateUnderScore underMovies = new CreateUnderScore();
        String undermovie = underMovies.UnderscoreMovie(movie);
        return  undermovie;
    }

    public int [] getLocationOfLetter(String movie,char letter){
//        get location(s) of letter in movie name
        FillUnderScore search = new FillUnderScore();
        int [] listOfLocations = search.LocationOfChar(movie,letter);
        return listOfLocations;
    }

    public String addLetter(String underMovie, int [] locationsOfLetter, char letter){
        FillUnderScore fillLetter = new FillUnderScore();
        String added_Movie = fillLetter.FillunderScore(locationsOfLetter,underMovie,letter);
        return added_Movie;
    }

    

    public static void main(String [] args){
        Game game = new Game();
        String movie = game.getMovie();
        System.out.println(movie);
        String underMovie = game.get_Movie(movie);
//        track incorrect letters, usedletter
        boolean incorrectLetterTracker = false;
        char [] usedLetter = new char[27];
        boolean inUsedLetters = false;

        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        System.out.println(letter);
        int [] locationOfLetter = game.getLocationOfLetter(movie,letter);
        if (locationOfLetter[0]==-1){
            incorrectLetterTracker = true;
        }

        String newUnderMovie = game.addLetter(underMovie,locationOfLetter,letter);
        System.out.println("this is length: "+movie.length()+" of "+movie);
        System.out.println("this is length: "+underMovie.length()+" of "+underMovie);
        System.out.println(newUnderMovie+" is the undermovie filled");

    }

}

