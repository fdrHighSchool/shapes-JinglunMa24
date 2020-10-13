# Shapes
![](https://www.tate.org.uk/art/images/work/D/D16/D16992_9.jpg)

Lab to work on static methods, parameters and return statements.

## To Do:

* Think about formulas used to determine the area of various shapes.
  * How many measurements are needed to determine the area?
  * What data type would be best to represent these measurements?
* For example, the area of a square can be determined using the formula: **A = s^2**.
  * The formula requires **one measurement**, the side length, to calculate the area.
  * The measurement can be either a whole number, or decimal, so using a **double** seems appropriate.
* Therefore, a method signature to calculate the area of any square could be:
```java
public static void square(double s){
  //insert code here
}
```

---
### Part 1:
* Other shapes you may consider:
  * Triangle 
    * A = 1/2(bh)
    * Heron's formula
  * Rectangle
  * Circle
---
### Part 2:
* Use existing methods to go a step further and determine the volume of 3D-shapes.
  * Cube
  * Triangular Prism
  * Rectangular Prism
  * Sphere
* Think about how these volume formulas relate to the area forumulas you already developed into Java methods.
  * Reuse code when you can!
---
### Extension:
* Include drawing methods that use nested for loops to produce ASCII art shapes.
