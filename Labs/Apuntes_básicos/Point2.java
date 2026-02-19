/* This file is a version of Point2.java where the (nested) public static
   class Point is moved up as a package-private class (a class that is only
   visible to classes in the same package).
*/

class Point {  // Notice: no "public" and no "static" qualifiers.

  public double x, y;

  public Point() {
    this.x = 1.0;
    this.y = 0.0;
  }

  public Point(Point p) {
    // Assumes p != null.
    this.x = p.x;
    this.y = p.y;
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {  // Removed "point" from the method name.
    return "(x = " + this.x + ", y = " + this.y + ")";
  }

  public Point midPoint(Point p2) { // Can use "p" instead of "p2".
    return new Point((this.x + p2.x) / 2, (this.y + p2.y) / 2);
  }

  public double distance(Point p2) {  // Can use "p" instead of "p2".
    return Math.sqrt(Math.pow(p2.x - this.x,2) + Math.pow(p2.y - this.y,2));
  }
}

// The main function is declared in the Point2b class which has the same name
// as the file
public class Point2 {
  public static void main(String [] args) {
    Point p1 = new Point(1.0, 3.4);
    Point p2 = new Point(2.5, -4.8);
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println("The mid point is: " + p2.midPoint(p2).toString());
    System.out.println(p1.midPoint(p2));

  }
}
