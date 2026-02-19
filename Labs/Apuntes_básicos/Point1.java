public class Point1 {

  /* This file introduces the class mechanism for defining types. It only
     shows a nested static class with attributes (called "fields" in Java) and
     the so-called "no-argument" constructor (automatic default constructor).
     In file Point2.java we add more features and show more realistic code.
  */

  /* We define the Cartesian point type as a pair of two double coordinates
     named "x" and "y", so we can use coordinate names.
  */
  public static class Point {
    public double x, y;
  }

  /* The class identifier is written in uppercase. This is a Java convention
     to distinguish reference types from primitive types. (Recall that "String"
     is in uppercase and "int", "boolean", etc. are in lowercase.)

     * We have declared the class with "public" visibility (accessible to all
       procedures and functions in this file and outside this file).

     * We have defined it as a "nested" class (nested inside "class
       Point1"). We explain nesting and what "class Point1" is in the
       classroom.

     * We have declared the class "static" to be able to use it the "main()"
       method of this file which must be static. We explain this in the
       classroom.

     We will show how to remove the "nested" and "static" qualifiers later on
     in file Point.java.

     The attributes are declared with "public" visibility, which means they
     can be accessed using the "dot" operator. If we make them "private" they
     cannot be accessed using the dot operator. (But still may be accessed
     indirectly by better means, as we will see.) Some attributes can be
     public and some attributes can be private, it depends on what we want to
     make visible to users of the class. Private attributes are useful for
     internal operations (we will see an example in file Point4.java.)
  */

  public static void main(String [] args) {

    Point p1;
    // Variable declaration, p1 stores the value "null".

    Point p2 = null;
    // Better to always initialise to null explicitly.

    // No points defined yet! Similar to what occurs with arrays:

    int [] a;
    // a == null

    /* Suppose we write on the next line the following:

         a[0] = 1;

       that line would raise a NullPointerException. Similarly, if we write:

         p1.x = 1.0;

       that line would raise a NullPointerException.

       NullPointerException means "cannot use null as a reference".

       In the array example, there is no array object on the heap whose
       reference (address) is stored in "a". Thus, "a[0]" means "null[0]" and
       "null" references nothing.

       In the point example, there is no point object on the heap whose
       reference (address) is stored in "p". Thus "p.x" means "null.x" and
       "null" references nothing.

       SUMMARY: Objects (arrays included) are created on the heap using the
       "new" operator which returns the reference to the created object. We
       can store that reference somewhere (e.g. in a local variable) to
       reference (access) the object.

    */

    a = new int[] {1,2,3};
    // The "new" operator creates the array on the heap and returns the
    // reference. We store the reference on the local variable "a".

    p1 = new Point();
    //       ^^^^^^^ This is called a "default constructor", which is
    //        automatically provided by the language if we don't define it.
    //        It has the same name as the class and takes no arguments. It
    //        creates the object on the heap and initialises the attributes to
    //        default values (in our case initialises the attributes "x" and
    //        "y" to the value 0.0). The "new" operator returns the reference
    //        to the created object, and we store the reference in variable
    //        "p1".

    /* A crude representation of the stack (left) and the heap (right):

         |---|            -------------
       a |  ------------->| 1 | 2 | 3 |
         |   |            -------------
         |---|            | 3 |
         |   |            -----
      p1 |  ---\          -----------
         |   |  \-------->| x | 0.0 |
         |---|            -----------
         |   |            | y | 0.0 |
                          -----------
    */

    p2 = new Point();

    /* A new point is created on the heap and its reference stored in "p2".

         |---|            -------------
       a |  ------------->| 1 | 2 | 3 |
         |   |            -------------
         |---|            | 3 |
         |   |            -----
      p1 |  ---\          -----------
         |   |  \-------->| x | 0.0 |
         |---|            -----------
         |   |            | y | 0.0 |
      p2 |  ---\          -----------
         |   |  \
         |---|   \        -----------
         |   |    \------>| x | 0.0 |
                          ----------|
                          | y | 0.0 |
                          -----------
     */

    // Once created, we can access the attributes with the "dot" operator and
    // change the values.
    p1.x = 1.0;
    p1.y = 3.4;

    p2.x = 2.5;
    p2.y = -4.8;

    System.out.println(pointToString(p1));
    System.out.println(pointToString(p2));

    System.out.print("The mid point is: " + pointToString(midPoint(p1,p2)));
  }

  // Compare the code of the local functions with those in file Point0.java.

  // Represents a point in a string.
  public static String pointToString(Point p) {
    return "(x = " + p.x + ", y = " + p.y + ")";
  }

  // Calculates the point between two points.
  public static Point midPoint(Point p1, Point p2) {
    Point m = new Point();
    m.x = (p1.x + p2.x)/2;
    m.y = (p1.y + p2.y)/2;
    return m;
  }

  // Calculates the distance between two points.
  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p2.x - p1.x,2) + Math.pow(p2.y - p1.y,2));
  }
}
  /* Problem:

     The local functions are local to this file. We'd like to associate the
     procedures/functions that belong to our point class to the objects of the
     class, as we did with attributes.

     Instead of calling a static procedure or function passing points:

        String s = pointToString(p);
        Point  m = midPoint(p1,p2);
        double d = distance(p1,p2);

     We will define the functions and procedures as "methods" of the object,
     as operations performed on the object, as operations to which the object
     "responds to", using the "dot" notation.

        String s = p.pointToString();
        Point  m = p1.midPoint(p2);
        double d = p1.distance(p2);

     Notice that the first parameter of the static method is the object to
     which we invoke the non-static method. "Static" ~ no object, "non-static"
     ~ object. More precisely, a static method is a method that is not invoked
     on an object, it is not a method of "an object" but a method of the class
     that can be applied without an object:

         p.pointToString();
         ^^
         object, so method "pointToString" must be a regular (non-static) method.

         pointToString(p);
         ^
         no object, so method "pointToString" must be a static method.

     In Point2.java we define the attributes and all operations (methods) that
     can be performed on a point object inside the Point class.

  */
