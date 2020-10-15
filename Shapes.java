import java.util.*;

public class Shapes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Choose the shape you want to calculate the area/volume of\n1.Square\n2.Triangle\n3.Rectangle\n4.Circle\n5.Cube\n6.Triangular Prism\n7.Rectangular Prism\n8.Sphere");
    int chose = input.nextInt();

    if (chose == 1) {
      System.out.print("Enter the side length: ");
      double side = input.nextDouble();
      System.out.println("Area of square is: " + square(side));
    } //close for square if

    if (chose == 2) {
      System.out.println("Choose the way to calculate triangle. (1. base and height 2. 3 lengths)");
      int tAns = input.nextInt();
      if (tAns == 1) {
        System.out.print("Enter the base of right triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of right triangle: ");
        double height = input.nextDouble();
        System.out.println("Area of the triangle is: " + triangle1(base,height));
      } //close for if tAns 1

      if (tAns == 2) {
        System.out.print("Enter the first length of triangle: ");
        double len1 = input.nextDouble();
        System.out.print("Enter the second length of triangle: ");
        double len2 = input.nextDouble();
        System.out.print("Enter the third length of triangle: ");
        double len3 = input.nextDouble();
        System.out.println("Area of the triangle is: " + triangle2(len1, len2, len3));
      } //close for if tAns 2
    } //close for triangles if

    if (chose == 3) {
      System.out.print("Enter the length of rectangle: ");
      double len = input.nextDouble();
      System.out.print("Enter the width of rectangle: ");
      double wid = input.nextDouble();
      System.out.println("Area of the rectangle is: " + rectangle(len,wid));
    } //end rectangle if

    if (chose == 4) {
      System.out.print("Enter the radius of circle: ");
      double r = input.nextDouble();
      System.out.println("Area of the circle is: " + circle(r));
    } //end circle if

    if (chose == 5) {
      System.out.print("Enter the len of cube: ");
      double len = input.nextDouble();
      double cubeV = square(len) * len;
      System.out.println("Volume of cube is: " + cubeV);
    } //end cube if

  } //close for main


  public static double square(double s){
    //side times side
    double sa = Math.pow(s,2);
    return sa;
  }//close square method

  public static double triangle1(double base, double height) {
    double t1a = (base * height)/2;
    return t1a;
  } //close for triangle1

  public static double triangle2(double len1, double len2, double len3) {
    double s = (len1 + len2 + len3)/2;
    double area = s * (s - len1) * (s - len2) * (s - len3);
    double t2a = Math.pow(area, 0.5);
    return t2a;
  } //close for triangle2

  public static double rectangle(double len, double wid) {
    double ra = len * wid;
    return ra;
  } //end rectangle

  public static double circle(double r) {
    double ca = Math.pow(r,2) * Math.PI;
    return ca;
  }


} //close for class
