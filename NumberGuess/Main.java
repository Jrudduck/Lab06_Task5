import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        int guess = 0;
        int myNumber = 1 + (int) ((Math.random() * (10 - 1)));
        boolean guessValid = false;


        //input
        System.out.println("Welcome! Let's play a game.\nTry to guess my number!\nEnter a whole number [1-10]");
        do {
            if (scan.hasNextInt()) {
                guess = scan.nextInt();
                if (10 >= guess && guess > 0) {
                    guessValid = true;
                    scan.nextLine();
                } else {
                    System.out.println("You have inputted an invalid value. Please enter a whole number [1-10].");
                    scan.nextLine();
                }
            } else {
                System.out.println("Please enter a valid whole number [1-10}");
                scan.nextLine();
            }
        } while (!guessValid);


        //process
        if (guess == myNumber) {
            System.out.println("My number was " + myNumber + "\nYour guess was correct!");
        }
        if (guess > myNumber) {
            System.out.println("My number was " + myNumber + "\nYour guess was too high.");
        } else {
            System.out.println("My number was " + myNumber + "\nYour guess was too low.");
        }
    }
}