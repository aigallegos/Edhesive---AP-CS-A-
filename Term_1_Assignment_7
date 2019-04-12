import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static String duplicate (String x) {
        int length = x.length();
        String bw = "";
        if (length % 2 == 0) {
            int length2 = length * 2;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    bw += x.charAt(i);
                }
            }
        } 
        else {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    bw += x.charAt(i);
                }
            }
        }
        return bw;
    }
    public static boolean palindrome (String x) {
        boolean palindrome = false;
        if ((x.length() > 3) && (x.length() <15)) {
            x = x.toLowerCase();
            x = x.replace ("4","a");
            x = x.replace ("3", "e");
            x = x.replace ("0", "o");
            String copy = "";
            for (int i = x.length()-1; i >=0; i--) {
                copy = copy + x.charAt(i);  
            }
            if (copy.compareTo(x) == 0) {
                return true;
            } 
            else {
                return false;
            }   
        } 
        else {
            return false;
        }
    }
    public static double numberScramble (double num) {
        if (num < 0) {
        double neg = 0.0;
        return neg;
        } 
        else {
            num += 5;
            num /= 2;
            num = Math.sqrt(num);
            return num;
        }
    }
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
        String input1 = scan.nextLine();
        System.out.println ("The duplicated String is: " + duplicate(input1));
        System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
        String input2 = scan.nextLine();
        if (palindrome(input2) == true) {
            System.out.println("Nice, you found an Edhesive Palindrome!");
        } 
        else {
            System.out.println("Too bad, that isn't an Edhesive Palindrome.");
        }
        System.out.println("Almost done! Please enter a number to scramble.");
        double input3 = scan.nextDouble();
        System.out.println("The scrambled number is: " + numberScramble(input3));
    }
}
