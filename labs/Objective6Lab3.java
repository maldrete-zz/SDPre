public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 0;
    String even = " is even", odd = " is odd";

    while(counter <= 20) {
      if (counter % 2 == 0) {
        System.out.println(counter + even);
      }
      else {
        System.out.println(counter + odd);
      }
      counter = counter + 1;
    }
  }
}
