import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\n\nEnter the first String:");
    String str = scan.nextLine();
    System.out.println("Enter the pivot String:");
    String pivot = scan.nextLine();
    String firstSub = null;
    String secondSub = null;
    for (int i = 0; i < (str.length() - pivot.length()); i ++) {
      if (str.substring(i, i + pivot.length()).equals(pivot)) {
        firstSub = str.substring(0, i);
        secondSub = str.substring(i + pivot.length(), str.length());
        System.out.println(secondSub + pivot + firstSub);
      }
    }
    if ((firstSub == null)&&(secondSub == null)) {
        System.out.println("Error: Pivot String not found.");
    }
  }
}
