import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int left = scanner.nextInt();
    int right = scanner.nextInt();
    if (left == 0 && right == 0) {
      System.out.println("Not a moose");
    } else if (left == right){
      System.out.println("Even " + (left + right));
    } else {
      System.out.println("Odd " + Math.max(left, right) * 2);
    }
  }
}