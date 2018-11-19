import javax.swing.*;
import java.io.*;
import java.util.*;

public class RandomMovie {
// Returns a random movie from a text file.
//    text file is preselected- need to refractor code to use any file.
    public String ArandomMovie() {
        File file = new File("MovieList.txt");
        Scanner filescanner = null;

        try {
            filescanner = new Scanner(file);
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        int count = 0;
        String [] list = new String[100];
        assert filescanner != null;
        while (filescanner.hasNextLine()){
            String line = filescanner.nextLine();
            list[count] = line;
            count =count + 1;
        }
        Random randomnum = new Random();
         return list[randomnum.nextInt(count)];
//        String m = "a a";
//        return m;
    }


    public static void main(String [] args) {
//        int [] ray = new int[10];
//        System.out.println(ray.length == 0);

//        RandomMovie movie = new RandomMovie();
//        String aMovie = new String();
//        aMovie = movie.ArandomMovie();
//        System.out.println(aMovie.length());

//        char character = (char) aMovie;

//        newString.setCharAt(0,'u');
//        System.out.println(newString);

    }

    }
