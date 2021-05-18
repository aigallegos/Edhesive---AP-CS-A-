public class Lesson_34_Activity_Four {
    public static int findMin(int[] x) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i ++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        findMin(list);
    }
}
