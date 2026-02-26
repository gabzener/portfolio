class Point { 

  private double [] x_y;

  public double getX(){
    return x_y[0];
  }

  public double getY(){
    return x_y[1];
  }

  public void setX(double x){
    this.x_y[0] = x;
  }

  public void setY(double y){
    this.x_y[1] = y;
  }

  public Point() {
    this(0.0, 0.0);
  }

  public Point(Point p) {
    this(p.getX(), p.getY());
  }

  public Point(double x, double y) {
    x_y = new double[2];
    this.setX(x);
    this.setY(y);
  }

  public String toString() { 
    return "(x = " + this.getX() + ", y = " + this.getY() + ")";
  }

  public Point midPoint(Point p) { 
    return new Point((this.getX() + p.getX()) / 2, (this.getY() + p.getY()) / 2);
  }

  public double distance(Point p) { 
    return Math.sqrt(Math.pow(p.getX() - this.getX(),2) + Math.pow(p.getY() - this.getY(),2));
  }

  public void addTo(Point p){
    this.setX(this.getX() + p.getX());
    this.setY(this.getY() + p.getY());
  }

  public Point add(Point p){
    Point p0 = new Point();
    p0.setX(this.getX() + p.getX());
    p0.setY(this.getY() + p.getY());
    return p0;
  }

  public boolean equals(Point p1){
    return this.getX() == p1.getX() && this.getY() == p1.getY();
  }

  public Point escalar(Point p){
    Point p0 = new Point();
    p0.setX(this.getX() * p.getX());
    p0.setY(this.getY() * p.getY());
    return p0;
  }

  public Point dividir(Point p){
    Point p0 = new Point();
    p0.setX(this.getX() / p.getX());
    p0.setY(this.getY() / p.getY());
    return p0;
  }
}

public class Point2 {
  public static void main(String [] args) {
    Point p1 = new Point(1.0, 2.0);
    Point p2 = new Point(1.0, 4.0);
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println("The mid point is: " + p2.midPoint(p2).toString());
    System.out.println(p1.midPoint(p2));
    p2 = p1;
    System.out.println(p2 == p1); // Compara direcciones de memoria
    System.out.println(p1.equals(p2)); // Compara los valores de los objetos

  }
}
