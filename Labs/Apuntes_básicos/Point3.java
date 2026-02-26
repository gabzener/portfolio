/* This file introduces more features of the class mechanism for defining
   types: private attributes and "set" and "get" methods ("setters" and
   "getters"). By making the representation private and providing an interface
   for the data, we can change how we represent the data easily (we do so in
   file Point4.java).
*/

class Point {

  // Attributes now private
  private double x, y;

  // Accessed by "getter" and "setter" methods.
  public double getX() {
    return this.x;
  }
  public double getY() {
    return this.y;
  }
  public void setX(double x) {
    this.x = x;
  }
  public void setY(double y) {
    this.y = y;
  }

  public Point() {
    this(1.0, 0.0);
  }

  public Point(Point p) {
    //assert p == null : "Point(Point) called with null argument.";
    this(p.getX(), p.getY());
  }

  public Point(double x, double y) {
    this.setX(x);
    this.setY(y);
  }

  public Point(double d) {
    this.setX(d);
    this.setY(d);
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
    return Math.sqrt(Math.pow(p.getX() - this.getX(),2) + Math.pow(p.getY() - this.getY(),2));
                     
  }
}

public class Point3 {
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
