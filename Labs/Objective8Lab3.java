public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 0;

    for (int i = 1; i<21; i++) {
      counter = counter + 1;

      if(counter % 2 == 0) {
        System.out.println(counter + " is even");
      } else {
        System.out.println(counter + " is odd");
      }
    }
  }
}