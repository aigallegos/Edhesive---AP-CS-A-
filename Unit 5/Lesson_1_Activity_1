import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int i = 0;
        System.out.println("Please enter words, enter STOP to stop the loop.");
        while (i < 20) {
            String y = scan.nextLine();
            if (y.equals("STOP")) {
                break;
            }
            list.add(y);
            i ++;
        }
        System.out.println(i);
        System.out.println(list);
        if (i > 2) {
            list.remove(i - 1);
            list.remove(0);
        }
        System.out.println(list);
    }
}
