public class Lesson_15_Activity {
public static void sortAndPrint(String [] list) {
          int min;
          String temp;
          for (int i = 0; i < list.length; i ++) {
              min = i;
             for (int j = i; j < list.length; j ++) {
                 if (list[j].compareTo(list[min]) < 0) {
                     min = j;
                }
            }
            temp = list[i]; 
            list[i] = list[min];
            list[min] = temp;
        }
        for (int i = 0; i < list.length; i ++) {
            System.out.print(list[i] + " ");
        }
      }
}
