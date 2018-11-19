public class CreateUnderScore {
//    Takes a movie and returns an empty underscored string
    public String UnderscoreMovie(String movie) {
         char [] newString = new char[movie.length()];
         char [] movieChar = movie.toCharArray();
        for (int i = 0; i < movie.length(); i++) {
            if (movieChar[i] != ' '){
                newString[i] = '_';
            }else {
                newString[i] = ' ';
            }
        }
        return String.valueOf(newString);
    }

    public static void main(String [] args) {
//        CreateUnderScore sb = new CreateUnderScore();
//        RandomMovie rm = new RandomMovie();
//        String str = sb.UnderscoreMovie(rm.ArandomMovie());
//        System.out.println("movie "+str+"length is "+str.length());


        //Notes
//    CreateUnderScore emptyUnderMovie = new CreateUnderScore();
//    RandomMovie movie = new RandomMovie();
//    System.out.println(emptyUnderMovie.UnderscoreMovie(movie.ArandomMovie()));
//    ??
//        String myName = "domanokz";
//        char[] myNameChars = myName.toCharArray();
//        System.out.println(myNameChars);
//        myNameChars[4] = 'x';
//        System.out.println(myNameChars);
//        myName = String.valueOf(myNameChars);
//        System.out.println(myName);
    }
    }
