import java.util.Scanner;

public class Game {
    public String getMovie(){
//        get a random movie
        RandomMovie movies = new RandomMovie();
        return movies.ArandomMovie();
    }
    public String get_Movie(String movie){
//        get underscore string of a movie
        CreateUnderScore underMovies = new CreateUnderScore();
        return underMovies.UnderscoreMovie(movie);
    }

    public int [] getLocationOfLetter(String movie,char letter){
//        get location(s) of letter in movie name
        FillUnderScore search = new FillUnderScore();
        return search.LocationOfChar(movie,letter);
    }

    public String addLetter(String underMovie, int [] locationsOfLetter, char letter){
//        add letter to underscore string
        FillUnderScore fillLetter = new FillUnderScore();
        return fillLetter.FillunderScore(locationsOfLetter,underMovie,letter);
    }

    public boolean inusedletter(char [] usedletters, char letter){
//        keep track if all letter are added
        boolean found = false;
        for (char c: usedletters){
            if (c == letter){
                found = true;
            }
        }return found;
    }

    public boolean exit(String movie, String underMovie){
//        checks if movie and undermovie are matched in a char level
//        the "==" and "Objects.equal" did not work for me - they were either all ways false or true
        char [] charMovie = movie.toCharArray();
        char [] charUnderMovie = underMovie.toCharArray();
        int counter = 0;
        for (int i = 0;i<charMovie.length;i++){
            if (charMovie[i] == charUnderMovie[i]){
                counter++;
            }
        }
        if (counter == charMovie.length){
            return true;
        }else {return false;}
    }




    public static void main(String [] args) {
        Game game = new Game();
        String movie = game.getMovie();
        String underMovie = game.get_Movie(movie);
//        track incorrect letters, usedletter
        char[] usedLetter = new char[27];
        boolean inUsedLetters = false;
        int counter = 0;
        boolean gameover = false;
        int wrongletters=0;
        while (!gameover) {
            System.out.printf("You are guessing: %s%n", underMovie);
            System.out.printf("You have guessed (%d) wrong letters: %n", wrongletters);
            System.out.print("Guess a letter: ");
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.next().charAt(0);
//            checks if letter already used
            inUsedLetters = game.inusedletter(usedLetter, letter);
//            if not used then
            if (!inUsedLetters) {
//                adds letter to used
                usedLetter[counter] = letter;
//                preps next index of usedletter
                counter++;
//                finds location of letter in movie name
                int[] locationOfLetter = game.getLocationOfLetter(movie, letter);
//                if letter not in movie name return -1 else
                if (locationOfLetter[0] != -1) {
//                    adds letter to any location found in movie name
                    underMovie = game.addLetter(underMovie, locationOfLetter, letter);
//                    else - wrongletter is incremented to show how many wrongletter used
                }else{wrongletters++;}
//                notify user of using letter previously
            }else {System.out.println(letter + " has been used.");}
//            outside if function
//            update gameover ie. check if all letters found
            gameover = game.exit(movie,underMovie);
        }System.out.println("Thank you playing");
    }
}

