import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main (String [] args){
    Scanner scan = new Scanner (System.in);
      System.out.println("Welcome. What is your name?");
      String name = scan.nextLine();
      System.out.println("Hello "+name+". Try your best to crack the code!");
      System.out.println("\nPHASE 1");
      System.out.println("Enter a number:");
      int x = scan.nextInt();
      if (x != 3) {
        System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
      }
      else {
        System.out.println("Correct!\n\nPHASE 2\nEnter a number:");
        int y = scan.nextInt();
        if (!((y == 1) || (y >= 33 && y<= 100))) {
          System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
        }
        else {
          System.out.println("Correct!\n\nPHASE 3\nEnter a number:");
          int z = scan.nextInt();
          if (!(((z % 3) == 0) || ((z % 7) == 0))) {
            System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
          }
          else {
            System.out.println("Correct!\nYou have cracked the code!");
          }
        }
      }
  }
}
