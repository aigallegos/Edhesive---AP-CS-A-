import java.util.Scanner;

class Lesson_30_Activity {
    public static String [] list = {"every", " near  ing ", "      checking", "food ", "stand", "value      "};
    public static void main(String[] args) {
        String[] list2 = new String[list.length];
        for (int i = 0; i < list.length; i ++) {
            for (int a = 0; a < list[i].length(); a ++) {
                if (list[i].charAt(a) != ' ') {
                    list2[i] += list[i].charAt(a);
                }
            }
            list[i] = list2[i].substring(4, list2[i].length());
        }
    }
}
