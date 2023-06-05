import java.util.HashSet;
import java.util.Scanner;

public class Main {
  private static final HashSet<Character> alphabet;

  static {
    alphabet = new HashSet<>();
    for (char c = 'a'; c <= 'z'; c++) {
      alphabet.add(c);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int lines = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < lines; i++){
      String s = scanner.nextLine().toLowerCase();
      String result = pangram(s);
      System.out.println(result);
    }
  }

  private static String pangram(String s) {
    HashSet<Character> copyAlphabet = new HashSet<>(alphabet);
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      copyAlphabet.remove(c);
    }

    if (copyAlphabet.isEmpty()) {
      return "pangram";
    } else {
      StringBuilder missing = new StringBuilder();
      copyAlphabet.stream().sorted().forEach(missing::append);
      return "missing " + missing;
    }
  }
}
