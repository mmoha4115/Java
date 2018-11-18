import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextFile {
    public String[] ReadText()  {
        File file = new File("FiveLines.txt");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        int words = 0;
        String[] sentence = new String[10000000];
        int count = 0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
            words += line.split(" ").length;
            sentence[count] = line;
            count++;
//  use the above line to do any calculation,proce..,etc
        }
        System.out.println("The number of words is " +words);
        return sentence;
    }

public static void main(String [] args){
    TextFile file1 = new TextFile();
    file1.ReadText();
    String [] file2 ;
    file2 = file1.ReadText();
    System.out.println(file2[3]);



}
}

