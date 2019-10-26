public class Objective6Lab4 {
  public static void main(String[] args) {
    int sum, count;
    count = 1;
    sum = 0;

    while(count < 21 ) {
      sum = count + sum;
      count = count + 1;
    }
    System.out.println(sum);
  }
}
