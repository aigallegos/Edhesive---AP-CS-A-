import java.util.Scanner;
import java.lang.Math;

public class Lesson_13_Activity_Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x;
        x = scan.nextInt();
        if(x>=60){
            System.out.println("passing");
        }
        else{
            System.out.println("failing");
        }
    }
}
