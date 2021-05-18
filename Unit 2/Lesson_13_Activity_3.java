import java.util.Scanner;
import java.lang.Math;

public class Lesson_13_Activity_Three {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x;
        int y;
        x = scan.nextInt();
        y = scan.nextInt();
        if(x>y){
            System.out.println(x);
        }
        else if(y>x){
            System.out.println(y);
        }
        else{
            System.out.println("EQUAL");
        }
    }
}
