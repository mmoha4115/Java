import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import  java.lang.*;

// write your code here
//        System.out.println("Enter your address:  ");
//        Scanner scanner = new Scanner(System.in);
//        String address = scanner.nextLine();
//        System.out.println("You live at: "+address);
//        System.out.println("Enter your grade:  ");
//        int grade = scanner.nextInt();
//        if (grade>90){
//            System.out.println("Wow! you did well!");
//        }else {System.out.println("Not bad, but you can do " +
//                "better next time!");}
//    }


public class Main {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int max = 100;
        int num = 1 + randomNum.nextInt(max);
        int gues = 101;
        int count = 10;
        System.out.println("Try to guess it.");
        while (gues != num && count > 0) {
            System.out.println("You have " + count + " guesses left");
            Scanner scanner = new Scanner(System.in);
            try {
                gues = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Input mismatch = Please Enter an integer");
            }
            count--;
            if (gues > num && count > 0) {
                System.out.println("It's smaller than " + gues);
            } else if (gues < num && count > 0) {
                System.out.println("It's greater than " + gues);
            } else {
                if (count == 0) {
                    System.out.println("OOPS, You ran out of guesses! " + num + " was " +
                            "the correct number.");
                } else {
                    System.out.println("Well done, You guessed correct!!!");
                }
            }
        }
    }
}




