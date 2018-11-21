import java.util.Scanner;

class Lesson_14_Activity_Three {
    public static void main(String[] args) {
        System.out.println("Please enter the first octet:");
        Scanner scan=new Scanner(System.in);
        int first = scan.nextInt();
        System.out.println("Please enter the second octet:");
        int second = scan.nextInt();
        System.out.println("Please enter the third octet:");
        int third = scan.nextInt();
        System.out.println("Please enter the fourth octet:");
        int fourth = scan.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        if (!(first >= 0 && first <= 255)){
            System.out.println("Octet 1 is incorrect");
            a++;
        }
        if (!(second >= 0 && second <= 255)){
            System.out.println("Octet 2 is incorrect");
            b++;
        }
        if (!(third >= 0 && third <= 255)){
            System.out.println("Octet 3 is incorrect");
            c++;
        }
        if (!(fourth >= 0 && fourth <= 255)){
            System.out.println("Octet 4 is incorrect");
            d++;
        }
        if ((a + b + c + d) == 0){
            System.out.println("IP Address: "+first+"."+second+"."+third+"."+fourth);
        }
    }
}
