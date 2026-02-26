/* A rewrite of Point3.java using an alternative attribute representation.
   Notice that we only change the setters and getters, and one constructor.

   The rest of the code remains unchanged!

   Not having to change code allows us to make changes easily. The point is
   not that we must use arrays to represent points (we don't), but to show
   that a change of representation may not involve changing too much code,
   thanks to the abstraction provided by hiding the representation. This is
   called "encapsulation".

   The changes to the code are marked in comments, the rest of the code
   remains intact.
*/

class Point {

  private double [] coords;

  public double getX() {
    return this.coords[0];   // Change.
  }

  public double getY() {
    return this.coords[1];   // Change.
  }

  public void setX(double x) {
    this.coords[0] = x;      // Changed
  }

  public void setY(double y) {
    this.coords[1] = y;      // Changed
  }

  public Point() {
    this(1.0, 0.0);
  }

  public Point(Point p) {
    //assert p == null : "Point(Point) called with null argument.";
    this(p.getX(), p.getY());
  }

  public Point(double x, double y) {
    this.coords = new double[2];  // Change.
    this.setX(x);
    this.setY(y);
  }

  public Point(double d) {
    this(d, d);
  }

  @Override
  public String toString() {
    return "(x = " + this.getX() + ", y = " + this.getY() + ")";
  }

  public Point midPoint(Point p) {
    assert p == null : "Point.midPoint(Point) called with null argument.";
    return new Point((this.getX() + p.getX()) / 2, (this.getY() + p.getY()) / 2);
  }

  public double distance(Point p) {
    assert p == null : "Point.distance(Point) called with null argument.";
    return Math.sqrt( Math.pow(p.getX() - this.getX(),2)
                      + Math.pow(p.getY() - this.getY(),2));
  }
}

public class Point4 {
  public static void main(String [] args) {
    Point p1 = new Point(1.0, 3.4);
    Point p2 = new Point(2.5, -4.8);
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println("The mid point is: " + p1.midPoint(p2).toString());
    Point p3 = new Point(3);
    Point p4 = new Point(4.0);
    System.out.println(p3.toString());
    System.out.println(p4.toString());
  }
}

/* EXERCISE: Generalise the Point class to represent points of dimension n > 2
   where n is fixed when the point object is constructed.
*/
