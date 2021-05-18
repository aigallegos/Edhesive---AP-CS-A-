import java.util.Scanner;
import java.lang.Math;

public class Lesson_7_Activity_Two {
    public static void main (String[] args ) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println ("Please enter a three digit number:");
        a = scan.nextInt();
        int b;
        b = (a / 100);
        int c;
        c = ((a - (b * 100)) / 10);
        int d;
        d = ((a - (b * 100)) - (c * 10));
        System.out.println("Here are the digits:");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b + "+" + c + "+" + d + "=" + (b + c + d));
    }
}
