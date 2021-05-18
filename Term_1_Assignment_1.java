import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter ratings from the movie review website.");
        int web1 = scan.nextInt();
        int web2 = scan.nextInt();
        int web3 = scan.nextInt();
        System.out.println("Please enter ratings from the focus group.");
        double focus1 = scan.nextDouble();
        double focus2 = scan.nextDouble();
        System.out.println("Please enter the average movie critic rating.");
        double avgCritic = scan.nextDouble();
        double avgWeb = (double)((web1 + web2 + web3) / 3);
        double avgFocus = (double)((focus1 + focus2) / 2);
        double avgOverall = (double)((avgWeb * .20) + (avgFocus * .30) + (avgCritic * .50));
        System.out.println("Average website rating: " + avgWeb);
        System.out.println("Average focus group rating: " + avgFocus);
        System.out.println("Average movie critic rating: " + avgCritic);
        System.out.println("Overall movie rating: " + avgOverall);
    }
}
