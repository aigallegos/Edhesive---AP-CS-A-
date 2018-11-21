import java.util.Scanner;

class Lesson_20_Activity{
  public static void main (String [] args){
    Scanner scan = new Scanner (System.in);
    int c = 1;
    double max = Double.MIN_VALUE;
    double min = Double.MAX_VALUE;
    double max1 = Double.MIN_VALUE;
    double min1 = Double.MAX_VALUE;
    while (c != 0) {
      System.out.println("Please enter the latitude:");
      double a = scan.nextDouble();
      System.out.println(a);
      if ((a > max) && (a >= -90) && (a <= 90)){
        max = a;
      }
      if ((a < min)  && (a >= -90) && (a<= 90)){
        min = a;
      }
      System.out.println("Please enter the longitude:");
      double b = scan.nextDouble();
      System.out.println(b);
      if ((b > max1) && (b >=-180) && (b <= 180)){
        max1 = b;
      }
      if ((b < min1) && (b >=-180) && (b <= 180)){
        min1 = b;
      }
      if (!((a>=-90) && (a<=90))) {
      System.out.println("Incorrect Latitude or Longitude");
      }
      else if (!((b>=-180) && (b<=180))) {
      System.out.println("Incorrect Latitude or Longitude"); 
      }
      else {
      System.out.println("Would you like to enter another location?");
      c = scan.nextInt();
      }
    }
    System.out.println("Farthest North: " + max);
    System.out.println("Farthest South: " + min);
    System.out.println("Farthest East: " + max1);
    System.out.println("Farthest West: " + min1);
  }
}
