import java.util.Scanner;
import java.lang.Math; 

class Lesson_1011_Activity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in base 8:");
        int octal = scan.nextInt();
        int decimal = 0;
        int place = 1;
        int bin = 0;
        while (octal != 0) {
            bin = octal % 10;
            if (bin < 8) {
                decimal += bin * place;
            }
            else {
                System.out.println("ERROR: Incorrect Octal Format");
                break;
            }
            place *= 8;
            octal /= 10;
        }
        if (decimal <= 77777777) {
            System.out.println(decimal);
        }
        else {
            System.out.println("ERROR: Incorrect Octal Format");
        }
    }
}
