import java.util.Scanner;

class Lesson_33_Activity_Two {
    public static void randomize(int[] x) {
        for (int i = 0; i < x.length; i ++) {
            x[i] = (int)((Math.random() * 90.0) + 10.0);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[1000];
        randomize(list);
    }
}
