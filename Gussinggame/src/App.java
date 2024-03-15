import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        // Assingning the required integers.
        int answer, guess, score, i;
        int k = 5;
        score = 50;

        // Assingning the classes.
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        answer = r.nextInt(101);

        // Heading of the game.
        System.out.println("!!!Guessing Game!!!");

        // looping.
        for (i = 0; k > i; i++) {
            while (true) {

                System.out.println("Enter the guess number between 1 - 100 : ");
                guess = input.nextInt();

                if (answer == guess) {
                    System.out.println("Congratulation ! You have guessed the right number");
                    System.out.println("Score: " + score);
                    System.exit(0);
                } else if (guess > answer && i != k) {
                    System.err.println("You have guessed too high");
                    k = k - 1;
                    score = (score - 10);

                }

                else if (guess < answer && i != k) {
                    System.out.println("You have guessed too low");
                    k = k - 1;
                    score = (score - 10);

                }

                else if (i == k && guess != answer) {
                    System.out.println("You have reached the maximum number of attemps");
                    System.out.println("The number is : " + answer);
                    System.out.println("Score : " + score);
                    break;

                }

                else {
                    System.out.println("Invalid Input");

                    input.close();

                }

            }
        }
    }
}
