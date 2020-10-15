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
      System.out.println("Area of square is: " + sa);
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

    if ("rectangle".equals(chose)) {
      System.out.print("Enter the length of rectangle: ");
      double len = input.nextDouble();
      System.out.print("Enter the width of rectangle: ");
      double wid = input.nextDouble();
      rectangle(len,wid);
    } //end rectangle if

    if ("circle".equals(chose)) {
      System.out.print("Enter the radius of circle: ");
      double r = input.nextDouble();
      circle(r);
    } //end circle if

    if ("cube".equals(chose)) {
      System.out.print("Enter the len of cube: ");
      double len = input.nextDouble();
      square(len);
      double cubeV = sa * len;
      System.out.println("Volume of cube is: " + cubeV);
    } //end cube if

  } //close for main


  public static double square(double s){
    //side times side
    double sa = s * s;
    return sa;
  }//close square method

  public static double triangle1(double base, double height) {
    double t1a = (base * height)/2;
    System.out.println("Area of th right triangle is: " + t1a);
    return t1a;
  } //close for triangle1

  public static double triangle2(double len1, double len2, double len3) {
    double s = (len1 + len2 + len3)/2;
    double area = s * (s - len1) * (s - len2) * (s - len3);
    double t2a = Math.pow(area, 0.5);
    System.out.println("Area of the triangle is: " + t2a);
    return t2a;
  } //close for triangle2

  public static double rectangle(double len, double wid) {
    double ra = len * wid;
    System.out.println("Area of the rectangle is: " + ra);
    return ra;
  } //end rectangle

  public static double circle(double radius) {
    double ca = radius * radius * Math.PI;
    System.out.println("Area of the circle is: " + ca);
    return ca;
  } //end circle

} //close for class
