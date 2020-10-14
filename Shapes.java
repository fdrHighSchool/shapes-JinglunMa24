import java.util.*;

public class Shapes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Choose the shape you want to calculate the area of. (square, triangle, rectangle, circle)");
    String chose = input.next();

    if ("square".equals(chose)) {
      System.out.print("Enter the side length: ");
      double side = input.nextDouble();
      square(side);
    } //close for square if

    if ("triangle".equals(chose)) {
      System.out.println("Choose the way to calculate triangle. (1. base and height 2. 3 lengths)");
      int tAns = input.nextInt();
      if (tAns == 1) {
        System.out.print("Enter the base of right triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of right triangle: ");
        double height = input.nextDouble();
        triangle1(base,height);
      } //close for if tAns 1

      if (tAns == 2) {
        System.out.print("Enter the first length of triangle: ");
        double len1 = input.nextDouble();
        System.out.print("Enter the second length of triangle: ");
        double len2 = input.nextDouble();
        System.out.print("Enter the third length of triangle: ");
        double len3 = input.nextDouble();
        triangle2(len1, len2, len3);
      } //close for if tAns 2
    } //close for triangles if

  } //close for main

  /*
   * N: square
   * P: to calculate the area of any square
   * I: a side measure (double)
   * R:
   */
  public static double square(double s){
    //side times side
    double a = s * s;

    //generate some output
    System.out.println("A square with side " + s + " has an area of " + a);
    return a;
  }//close square method

  public static void triangle1(double base, double height) {
    double area = (base * height)/2;
    System.out.println("Area of th right triangle is: " + area);
  } //close for triangle1

  public static void triangle2(double len1, double len2, double len3) {
    double s = (len1 + len2 + len3)/2;
    double area = s * (s - len1) * (s - len2) * (s - len3);
    double Area = Math.pow(area, 0.5);
    System.out.println("Area of the triangle is: " + Area);
  } //close for triangle2

} //close for class
