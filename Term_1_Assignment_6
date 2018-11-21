import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[10000];
        System.out.println("\n\nEnter the values for the first array, up to 10000 values, enter 'End' to quit");
        int c = 0;
        boolean end = true;
        for (int i = 0; i < names.length; i ++) {
            names[i] = scan.nextLine().toLowerCase();
            names[i] = ((names[i].substring(0,1)).toUpperCase()) + ((names[i].substring(1,names[i].length())).toLowerCase());
            if ((names[i]).equals("End")) {
                break;
            }
            c ++;
        }
        int c1 = c;
        System.out.println("\n\nEnter the values for the second array, up to 10000 values, enter 'End' to quit");
        for (int i = c; i < names.length; i ++) {
            names[i] = scan.nextLine().toLowerCase();
            names[i] = ((names[i].substring(0,1)).toUpperCase()) + ((names[i].substring(1,names[i].length())).toLowerCase());
            if ((names[i]).equals("End")) {
                break;
            }
            c ++;
        }
        System.out.println("\nFirst Array");
        for (int i = 0; i < c1; i ++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n\nSecond Array");
        for (int i = c1; i < c; i ++) {
            System.out.print(names[i] + " ");
        }
        String bin;
        for (int i = 1; i < c1; i ++) {
            if ((names[i].compareTo(names[i - 1])) < 0) {
                end = false;
            }
        }
        for (int i = c1 + 1; i < c; i ++) {
            if ((names[i].compareTo(names[i - 1])) < 0) {
                end = false;
            }
        }
        if (end == false) {
            System.out.println("\n\nError: Arrays not in correct order");
        }
        else {
            System.out.println("\n\nMerged Array");
            for (int i = 0; i < c; i ++) {
                for (int a = i; a < c; a ++) {
                    if (names[a].compareTo(names[i]) < 0) {
                        bin = names[i];
                        names[i] = names[a];
                        names[a] = bin;
                    }
                }
                System.out.print(names[i] + " ");
            }
        }
    }
}
