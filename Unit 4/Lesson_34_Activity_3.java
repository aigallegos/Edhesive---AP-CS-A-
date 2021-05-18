public class Lesson_34_Activity_Three {
    public static int findMax(int[] x) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i ++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        findMax(list);
    }
}
