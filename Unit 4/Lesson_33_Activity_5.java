import java.util.Scanner;

public class Lesson_33_Activity_Five {
    public static void insertValue(int[] array, int num, int index) {
        for (int i = array.length - 1; i > index; i --) {
            array[i] = array[i - 1];
        }
        array[index] = num;
    }
}
