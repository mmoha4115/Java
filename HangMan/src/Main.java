import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        get a random movie
        //create a randomMovie object
        RandomMovie movies = new RandomMovie();
        // get amovie
        String movie = movies.ArandomMovie();
//        get an empty string filled by underscore
        // create a createunderscore object
        CreateUnderScore emptystr = new CreateUnderScore();
        // get underscoredstr
        String underScoredStr = emptystr.UnderscoreMovie(movie);
//        start a while loop to keep getting input char from user
        // stop when underScoredstr == movie or guess == 0
        int guesses = 10;
        int counter = 0;
//        keep track of entered characters
        char[] usedChars = new char[50];
        while (underScoredStr != movie || guesses != 0) {
            boolean usedCharsTracker = false;
//            get input from user
            System.out.println("You have " + guesses + " left.");
            System.out.println("Please Enter a letter: ");
            Scanner scanner = new Scanner(System.in);
            char guess = scanner.next().charAt(0);
            System.out.println(guess);
            System.out.println(movie);
            System.out.println(underScoredStr);

//            check if guess char already guessed
            for (char c : usedChars) {
                if (c == guess) {
                    usedCharsTracker = true;
                    guesses++;
                    System.out.println("You already Entered: " + guess);
                    break;
                }
            }
            if (usedCharsTracker == false) {
                usedChars[counter] = guess;
//                create a fillunderscore object
                FillUnderScore hangman = new FillUnderScore();
                // get location of character in movie
                int[] locationsOfChar = hangman.LocationOfChar(movie, guess);
                // fill hangman with character loc
                underScoredStr = hangman.FillunderScore(locationsOfChar, underScoredStr, guess);
                guess--;
            }
            guess--;
            System.out.println(underScoredStr);

            }

        }
    }


