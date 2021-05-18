import java.util.Scanner;
public class Lesson_5_Activity_Three {
 public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a radius:");
        double r = scan.nextDouble();
        System.out.println("Circumference: " + (2 * 3.14) * r);
        System.out.println("Area: " + (3.14 * r) * r);
 }
}
