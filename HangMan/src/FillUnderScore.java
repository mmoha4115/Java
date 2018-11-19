public class FillUnderScore {
//     will take a char and a movie and a empty underscore str
//     will return a filled underscore str with the location the char appears in movie
    public int [] LocationOfChar(String movie,char letter){
        int count = 0;
        int [] loc = new int[movie.length()];
        int index = 0;
        count = movie.indexOf(letter,count);
        loc[index] = count;
        index++;
//        go through movie and if char found add location to  loc array
        while (count != -1){
            count = movie.indexOf(letter,count+1);
            loc[index] = count;
            index++;
        }

        return loc;
    }

    public String FillunderScore(int [] locations , String underScore, char letter){
        int counter = 0;
        int count = locations[counter];
        char [] chars = underScore.toCharArray();
        while (count != -1){counter++;
            chars[count] = letter;
            count = locations[counter];
        }
        return String.valueOf(chars);
    }

    public static void main(String [] args) {

    }
    }
