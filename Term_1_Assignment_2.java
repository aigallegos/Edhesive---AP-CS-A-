import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seconds Since Unix Epoch:");
        int x = scan.nextInt();
        x = Math.abs(x);
        int sec = (int) x % (12 * 30 * 24 * 60 * 60);
        x /= 60;
        int minu = (int) x % (12 * 30 * 24 * 60);
        x /= 60;
        int hour = (int) x % (12 * 30 * 24);
        x /= 24;
        int day = (int) x % (12 * 30);
        x /= 30;
        int month = (int) x % (12);
        x /= 12;
        int year = (int) x + 1970;
        System.out.println("\nYear: " + year + "\nMonth: " + month + "\nDay: " + day + "\nHour: " + hour + "\nMin: " + minu + "\nSec: " + sec);
    }
}
