import java.util.Scanner;
import java.lang.Math; 

class Lesson_22_Activity_One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String x = scan.nextLine();
        int c = 0;
        while (c != x.length()) {
            System.out.println(x.charAt(c));
            c ++;
        }
    }
}
