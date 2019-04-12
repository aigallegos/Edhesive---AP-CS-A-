public class Lesson_17_Activity {
    public static boolean isSorted(int[] a) {
        boolean bool = true;
        for (int i = 1; i < a.length; i ++) {
            if (a[i] < a[i - 1]) {
                bool = false;
            }
        }
        return bool;
    }
    
    public static int binarySearch(int[] a, int b) {
        int upper = a.length - 1;
        int lower = 0;
        int middle = (upper + lower)/2;
        boolean found = false;
        while ((upper >= lower)&&(found == false)) {
            if (a[middle] == b) {
                found = true;
                return middle;
            }
            if (a[middle] < b) {
                lower = middle + 1;
            }
            else {
                upper = middle - 1;
            }
            middle = (upper + lower)/2;
        }
        return -1;
    }
}
