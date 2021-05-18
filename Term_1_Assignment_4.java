import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter message board post:\n");
        String x = (scan.nextLine() + " ");
        System.out.println(x + "\n");
        int money = 0;
        int up = 0;
        int qey = 0;
        String name = "blah";
        for (int i = 0; i >= x.length(); i ++) {
            if ((x.charAt(i) == ' ')&&(x.charAt(i + 1) == '$')&&(x.charAt(i + 2) == ' ')) {
                money ++;
            }
            if ((x.charAt(i) == ' ')&&(x.charAt(i + 1) == '^')&&(x.charAt(i + 2) == '^')&&(x.charAt(i + 3) == ' ')) {
                up ++;
            }
            if ((x.charAt(i) == ' ')&&((x.charAt(i + 1) == 'Q')||(x.charAt(i + 1) == 'q'))&&((x.charAt(i + 2) == 'E')||(x.charAt(i + 2) == 'e'))&&((x.charAt(i + 3) == 'Y')||(x.charAt(i + 3) == 'y'))&&(x.charAt(i + 4) == ' ')) {
                qey ++;
            }
            if (x.charAt(i) == '-') {
                name = x.substring(0, i);
            }
        }
        System.out.println("Results:\n");
        if ((money > 0)||(up > 0)||(qey > 0)) {
            System.out.println("BAD\n" + name);
            System.out.println("^^: " + up);
            System.out.println("qey: " + qey);
            System.out.println("$: " + money);
        }
        else {
            System.out.println("CLEAN");
        }
    }
}
