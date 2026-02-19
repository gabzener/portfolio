

public class Point0 {

  /* In the previous course we wrote programs using primitive types (int,
     double, boolean, char) and two pre-defined "object" types (arrays and
     String), not really knowing what an object really is. We wrote programs
     in a single ".java" file with a main() procedure and our own local static
     procedures and functions. We used main() basically for testing the local
     procedures and functions.

     This file explains the motivation for the Java language mechanism that
     enables programmers to define their own types (called classes), create
     and use values (called objects) of those types, and define and use
     operations (called methods) on those types, with the compiler checking
     for type errors and more.

     In Java, new types can be defined by programmers using the concept of a
     class. The values of a class are called objects. A variable declared of
     class type does not store an object directly, it stores a **reference**
     to the object, like with arrays, which are predefined objects---see file
     O7_Arrays.java. This is because the object is composed of more data than
     a single primitive type and may not fit onto a stack memory cell. Hence
     the distinction in Java between "primitive types" (int, boolean, etc.,
     whose values are directly stored on the stack) and "reference types"
     (array types and class types, whose objects are stored on the heap and a
     reference to them is what's stored on the stack).

     Some class types come predefined in the standard Java library
     (e.g. String).

     Class names are written in uppercase (e.g. String) and primitive type
     names are written in lowercase (e.g. int).

     This file shows how horrible it is to define and use a new type using
     only the primitive types of Java. This motivates the need for a mechanism
     that enables programmers to define their own types.

     Note: the word "data-type" and "type" are related but have a different
     meaning. "Data-type" is used more generally and "type" is used more
     specifically. Integer and floating-point numbers are numeric data-types
     whereas "int" and "double" are their "type" in Java. An array is a
     data-type whereas "int []" is the type of arrays of integers in Java.
  */

  public static void main(String [] args) {

    /* We are going to define and use Cartesian points, that is, pairs of
       coordinates in a plane.
    */

    // A Cartesian point can be represented using two doubles.
    double x1 = 1.0;  // First coordinate.
    double y1 = 3.4;  // Second coordinate.

    // We need many more variables to define more points.
    double x2 = 2.5;
    double y2 = -4.8;

    /* Problems:

       - These variables are local to main, we cannot use them in other
         programs.

       - The coordinates are numbered to distinguish one point from another
         (x1 and x2 are coordinates of different points). But we can't use
         identifiers for a point such as "centre", "outlier", etc.

       - We have to work with coordinates separately, and be careful not to
         confuse coordinates from different points in operations.

           int mid1 = (x1 + x2) / 2;
           int mid2 = (y1 + x2) / 2;
                            ^^   Mistake.

       - We cannot pass a point as a parameter, we have to pass coordinates
         and avoid confusing them. For example if we want to write a function
         that calculates the distance between two points, we have to pass
         all coordinates:

          static double distance(double x1, double y1, double x2, double y2) {
                                        ^^         ^^         ^^         ^^
                                        One parameter for each coordinate!

         Technically, function "distance" does not take points, it takes four
         doubles.

       - We cannot return a point from a function:

          static  ??  midPoint(double x1, double y1, double x2, double y2) {}
                  ^^
                  How do we return two ints?

       - Worse: we have to rewrite the program entirely if instead of two
         integers we decide to change the representation for points.

         For example, we may use arrays of doubles of length 2 to represent
         points, so that we can return a point from a function, returning an
         array.

         Let's change the representation.
    */

    double [] p1 = new double [] { 1.0,  3,4 };
    double [] p2 = new double [] { 2.5, -4.8 };

    System.out.println(pointToString(p1));  // pointToString is defined below.
    System.out.println(pointToString(p2));

    System.out.print("The mid point is: " + pointToString(midPoint(p1,p2)));

    /* Problems:

       - We lose the nice coordinate names "x" and "y". (See function
         "midPoint" below.)

       - Any array of length 2 could be used as a point!

         We may have to use arrays of double of length 2 to represent other
         pairs of things, e.g. complex numbers in Cartesian format, complex
         numbers in module-angle format, initial price and final price of a
         stock, etc. We are representing them all as arrays of double of
         length 2 and there is no compiler check if we confuse them in
         operations (e.g. by mistake we pass to function "midPoint" an array
         of length 2 that represents a complex number or an initial-final
         stock price). We want the compiler's type checking!

       It'd be nice if we could create our own point type with its own
       operations which can be checked by the compiler. A point type which
       cannot be confused with two doubles, or arrays of double of length two,
       or whatever we chose to represent points, because the compiler
       type-checks the operations and we can abstract over the representation.

       It'd be nice if changing the representation of a point does not affect
       all the code using that representation. The less code affected the
       better.

       Primitive types are also abstract data types. For example, we don't
       know how doubles are represented internally nor how functions such as
       "Math.sqrt(x)" work internally. We want to create new types where the
       users of these types need only be concerned with what they can do with
       the types, not how the types work internally.

       Note: operators are predefined functions that take their parameters in
       infix notation, as "x + y" instead of "add(x,y)". Java does not let us
       define our operators for our new class types. This is called "operator
       definition and overloading", which is (partially) allowed in other
       languages, e.g. C++.

       To continue see file Point1.java.

       The rest of this file shows the implementation of the local functions.
    */
  }

  // Represents a point in a string.
  public static String pointToString(double [] p) {
    return "(x = " + p[0] + ", y = " + p[1] + ")";
  }

  // Calculates the point between two points.
  public static double [] midPoint(double [] p1, double [] p2) {
    double [] m = new double[2];
    m[0] = (p1[0] + p2[0])/2;
    m[1] = (p1[1] + p2[1])/2;
    return m;
  }
  /* That was hard to read. It would be easier to write:
       m1 = (x1 + x2) / 2;
       m2 = (y1 + y2) / 2;

     An unsatisfactory fix is to define local variables for the array indices:

       int x = 0, y = 1;
       m[x] = (p1[x] + p2[x]) / 2;
       m[y] = (p1[y] + p2[y]) / 2;

     But then we can't use "x" and "y" for other variables and we have to
     declare and initialise these convenience variables inside every
     procedure/function that uses points.
  */

  // Calculates the distance between two points.
  public static double distance(double [] p1, double [] p2) {
    return Math.sqrt(Math.pow(p2[0] - p1[0],2) + Math.pow(p2[1] - p1[1],2));
    //                          x2  - x1                     y2 - y1
  }
}
