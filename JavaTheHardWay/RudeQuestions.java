import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, hobby;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is yout name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? Thats not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.println( "Finally whats your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude  quesstions, " );
    System.out.println( name + "." );

    System.out.println( "Whats your favorite hobby?" );
    hobby = keyboard.next();

    System.out.println( "That a nice " + hobby + " to have.")



    //1. The program convert an int value into a double
    //2. The program converts int and double into string
    //3. Putting strings where int or double belong will make the program blow up
  }
}
