public class Lesson_34_Activity_Six {
    public static boolean allPositive(int[] x) {
        boolean pos= false;
        int c = 0;
        for (int i = 0; i < x.length; i ++) {
            if (x[i] >= 0) {
                c ++;
            }
        }
        if (c == x.length) {
            pos = true;
        }
        return pos;
    }
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        allPositive(list);
    }
}
