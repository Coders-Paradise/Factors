
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static Main get = new Main();

  public static void main(String args[]) {
    int cube, square, one, none, count = 0;
    double equation = -1, i;

    System.out.println("Enter the polynomial you want to factorise, part-by-part.");
    System.out.println("If you want to factorise a quadratic equation, enter 0 for the coefficient of 𝑥³.");
    System.out.println("Coefficients should be integers only.");
    System.out.println();
    System.out.print("Coefficient of 𝑥³:");
    cube = sc.nextInt();
    System.out.print("Coefficient of 𝑥²:");
    square = sc.nextInt();
    System.out.print("Coefficient of 𝑥:");
    one = sc.nextInt();
    System.out.print("Coefficient of the literal:");
    none = sc.nextInt();
    System.out.println();

    for (i = -1000; i <= 1000; i += 0.25) {
      equation = (i * i * i * cube) + (i * i * square) + (i * one) + none;

      if (equation == 0 && count == 0) {
        System.out.println("Factors found.");
        System.out.println();
        get.Factor1(i);
        count++;
      }

      else if (equation == 0) {
        if (count == 1) {
          get.Factor2(i);
          count++;
        } else
          get.Factor3(i);
      }
    }
    if (count == 0)
      System.out.println("Factor not found for values of x between -1000 and 1000.");
  }

  private void Factor1(double i) {
    if (((int) i) == i) {
      if ((-1 * i) >= 0)
        System.out.print("( 𝑥 + " + ((int) i * -1) + " )");
      else if ((-1 * i) < 0)
        System.out.print("( 𝑥 - " + (int) i + " )");
      else
        System.out.print("( 𝑥 + 0 )");
    } else {
      if ((-1 * i) >= 0)
        System.out.print("( 𝑥 + " + (i * -1) + " )");
      else if ((-1 * i) < 0)
        System.out.print("( 𝑥 - " + i + " )");
      else
        System.out.print("( 𝑥 + 0 )");
    }
  }

  private void Factor2(double i) {
    if (((int) i) == i) {
      if ((-1 * i) >= 0)
        System.out.print("( 𝑥 + " + ((int) i * -1) + " )");
      else if ((-1 * i) < 0)
        System.out.print("( 𝑥 - " + (int) i + " )");
      else
        System.out.print("( 𝑥 + 0 )");
    } else {
      if ((-1 * i) >= 0)
        System.out.print("( 𝑥 + " + (i * -1) + " )");
      else if ((-1 * i) < 0)
        System.out.print("( 𝑥 - " + i + " )");
      else
        System.out.print("( 𝑥 + 0 )");
    }
  }

  private void Factor3(double i) {
    if (((int) i) == i) {
      if ((-1 * i) >= 0)
        System.out.println("( 𝑥 + " + ((int) i * -1) + " )");
      else if ((-1 * i) < 0)
        System.out.println("( 𝑥 - " + (int) i + " )");
      else
        System.out.println("( 𝑥 + 0 )");
    } else {
      if ((-1 * i) >= 0)
        System.out.println("( 𝑥 + " + (i * -1) + " )");
      else if ((-1 * i) < 0)
        System.out.println("( 𝑥 - " + i + " )");
      else
        System.out.println("( 𝑥 + 0 )");
    }
    System.out.println();
    System.out.println("Enter any key, then press enter to exit.");
    sc.next();
    System.exit(0);
  }
}