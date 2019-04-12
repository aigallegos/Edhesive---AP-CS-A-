import java.util.Scanner;

class Lesson_33_Activity_Four {
    public static void reverse(int[] x) {
        int[] arr = new int[x.length];
        int c = 0;
        for (int i = 0; i < x.length; i ++) {
            arr[(x.length - 1) - i] = x[i];
        }
        for (int i = 0; i < x.length; i ++) {
            x[i] = arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[10];
        for (int i = 0; i < list.length; i ++) {
            list[i] = scan.nextInt();
        }
        reverse(list);
    }
}
