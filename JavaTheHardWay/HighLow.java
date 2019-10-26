import java.util.Scanner;

public class HighLow {
  public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  int secret, guess;

  secret = 1 + (int)(100*Math.random());

  System.out.println("I'm thinking of a number between 1-100.");
  System.out.println("Try to guess it!");
  System.out.println("> ");
  guess = keyboard.nextInt();

  while (secret != guess) {
    if (guess < secret) {
      guess = keyboard.nextInt();
    }
    if (guess > secret) {
      guess = keyboard.nextInt();
      }

      System.out.println("Sorry, your guess is wrong.");
      System.out.println("Try again. \n ");
      System.out.println(secret);
    }

  System.out.println("You guessed it! What are the odds?!?");

  }
}
