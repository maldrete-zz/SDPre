import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, ft, ht, i, p, bmi2, fo, io, po, bmi3;

    System.out.print( "Your height in m: " );
    m = keyboard.nextDouble();

    System.out.print( "Your weight in kg: " );
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );

// height and feet converter
    System.out.print( "Your height in inches: " );
    i = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    p = keyboard.nextDouble();

    bmi2 = (i/39.37) / (p/2.205);
    System.out.println( "Your BMI is " + bmi2 );

// height in feet and inches seperately
    System.out.print( "Your height in (feet only): " );
    fo = keyboard.nextDouble();

    System.out.print( "Your height in (inches only): " );
    io = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    po = keyboard.nextDouble();

    bmi3 = (po/(fo+io))*703;
    System.out.println( "Your BMI is " + bmi3 );
  }
}
