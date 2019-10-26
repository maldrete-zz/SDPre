import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    System.out.println("___Menu___");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
    selection = scanner.nextInt();

    while(selection == 1 || selection == 2 || selection == 3) {
      if(selection == 1) {
        System.out.println("Hello World");
        System.out.println("___Menu___");
        System.out.println("1: Say Hello");
        System.out.println("2: List My favorite foods");
        System.out.println("3: Exit");
        System.out.println();
        selection = scanner.nextInt();
      }
      if(selection == 2) {
        System.out.println("Apple");
        System.out.println("___Menu___");
        System.out.println("1: Say Hello");
        System.out.println("2: List My favorite foods");
        System.out.println("3: Exit");
        System.out.println();
        selection = scanner.nextInt();
      }
      if(selection == 3) {
        System.out.println("Goodbye");
        selection = 4;
      }

    }
    scanner.close();

    }
  }
