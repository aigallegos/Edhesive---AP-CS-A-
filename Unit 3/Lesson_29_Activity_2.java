import java.util.Scanner;
import java.lang.Math; 

class Lesson_29_Activity_Two {
    public static String [] list = {"every", "nearing", "checking", "food", "stand", "value"};
    public static void main(String[] args) {
        String c = null;
        for (int i = 0; i < list.length; i ++) {
            for (int a = list[i].length() - 1; a >= 0; a --) {
              System.out.print(list[i].charAt(a));
            }
            System.out.println();
        }
    }
}
