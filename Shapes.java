import java.util.*;

public class Shapes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the side length: ");
    double side = input.nextDouble();
    square(side);
  }

  /*
   * N: square
   * P: to calculate the area of any square
   * I: a side measure (double)
   * R:
   */
  public static void square(double s){
    //side times side
    double a = s * s;

    //generate some output
    System.out.println("A square with side " + s + " has an area of " + a);
  }//close square method

}
