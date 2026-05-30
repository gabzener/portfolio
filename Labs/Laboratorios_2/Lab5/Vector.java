package Laboratorios_2.Lab5;

// Partially implemented Vector class from Programación II's Lab5.
// To be COMPLETED by students.

public class Vector {

  // private final int n;
  /* We don't need the dimension attribute. The dimension is provided directly
     by the length of the array of coordinates. The dimension attribute is
     redundant and forces the following invariant:

       this.n == this.coords.length

     This invariant must be guaranteed by all methods.
  */

  // Array of coordinates.
  private double[] coords;

  /* Let's write the getters first, because other methods will use the getters
     to get the dimension and to get a coordinate from the array.
  */

  /** Getter that returns the dimension of the vector.
   */
  public int dim() { return this.coords.length; }

  /** Getter that returns the coordinate at position i in the vector. If the
   *  index i is out of bounds then the method throws an exception.
   *
   * PRE: 0 <= i && i < this.dim().
  */
  public double coord(int i) {
    return this.coords[i];
  }
  /* PROBLEM: If (i < 0 || i >= this.dim()) then the expression this.coords[i]
     throws the exception ArrayIndexOutOfBoundsException which has the word
     "Array" on its name and thus reveals that the implementation of the
     vector uses an "Array".

     SOLUTION: Try-catch the ArrayIndexOutOfBoundsException inside the method
     and throw another more appropriate exception. Also, add a "throws" clause
     to the method header.
  */

  /* There are no public setters and modifiers, therefore Vector objects are
     immutable.

     PROBLEM: No private setters are provided to hide the attribute to other
     methods of class VectorP. Therefore, a future change to another container
     or collection type for coordinates will involve changing all the methods
     that access the attribute directly.

     SOLUTION: Define and use two private setters, one to create the array and
     store the reference in the attribute, and another to set the value of the
     coordinate at index i in the attribute.
  */

  // PROBLEM: The default constructor was not disabled.
  // SOLUTION: We disable it by making it private.
  /** @hidden */
  private Vector() {}


  /** Constructor: creates a vector of dimension n with coordinates
   *  initialised to 0.0.
   *
   *  PRE: n >= 0.
   */
  public Vector(int n) {
    this.coords = new double[n];
    /* PROBLEM: If n < 0 the expression "double[n]" throws a
       NegativeArraySizeException which reveals to users of the class that the
       class internally uses an array. If we change the implementation of the
       attribute the exception thrown would be different.

       SOLUTION: Wrap the exception and provide a throws clause.
    */
  }

  /** Constructor: creates a vector from an array of double, deep-copying the
   *  array.
   *
   *  PRE: coords != null.
   */
  public Vector(double[] coords) {
    //                   ^^^^^^ same name as attribute, careful.
    this.coords = new double[coords.length];
    //                       ^^^^^^^^^^^^^
    //                       throws NullPointerException
    //                       if parameter coods == null.
    for (int i = 0; i < this.dim(); ++i)
      this.coords[i] = coords[i];
  }

  // PROBLEM: There is no copy constructor.
  // SOLUTION: Define the copy constructor.
  /* public Vector(Vector v) {}
   */

  /** Constructor: creates a vector from an array of strings, where the first
   *  component is a string representation of an integer literal (the
   *  dimension) and the remaining components are string representations of
   *  double literals. For example, from the array {"3", "1.0", -34.343",
   *  "40.031"} the constructor creates a vector of dimension 3 with
   *  coordinates 1.0, -34.343, and 40.031 in that order.  From the array
   *  {"0"} the constructor creates a vector of dimension 0 with no
   *  coordinates.
   *
   *  @throws IllegalArgumentException if the parameter is null, or has 0
   *  length, or the number of string coordinates is less than the dimension,
   *  or the first component of the string array does not represent an integer
   *  literal, or when any of the remaining strings do not represent a valid
   *  double literal. When the number of string components is larger than the
   *  dimension, the remaining components are ignored. For example, { "2",
   *  "1.0" } is an invalid string array parameter whereas {"2", "1.0",
   *  -34.343", "40.031"} is a valid string array parameter where the
   *  constructed vector is (1.0,-34.343).
   *
   */
  public Vector(String[] args) throws IllegalArgumentException {
    final String thisStr = "Vector::Vector(String[])";

    if (args == null || args.length == 0)
      throw new IllegalArgumentException
        (thisStr + ": null or empty array of strings.");

    try {
      this.coords = new double[Integer.parseInt(args[0])]; // Para pasar String de numeros a el array de duubles.
      // Integer.parseInt(String) throws a NumberFormatException if the string
      // does not represent an integer literal.
      //
      // double[...] throws a NegativeArraySizeException if the successfully
      // parsed string represents a negative integer literal.
    } catch (NumberFormatException | NegativeArraySizeException _) {
      // We catch all the exceptions and throw instead a single
      // IllegalArgumentException that reports the error.
      throw new IllegalArgumentException
        (String.format(thisStr + ": %s not a valid dimension.", args[0]));
    }

    if (args.length-1 < this.dim())
      throw new IllegalArgumentException(thisStr + ": dimension mismatch.");

    for (int i = 0; i < this.dim(); ++i)
      try {
        this.coords[i] = Double.parseDouble(args[i+1]);
        // Double.parseDouble(String) throws a NumberFormatException if the string
        // does not represent a double literal.
      } catch (NumberFormatException _) {
        // We catch the exception and throw instead a single
        // IllegalArgumentException that reports the error.
        throw new IllegalArgumentException
          (String.format(thisStr + ": %s not a valid double.", args[i+1]));
      }
    // The for loop uses as sentinel the dimension obtained from the first
    // string component. If the length of the args array is greater than that
    // dimension (there are more string components) they are ignored.
  }

  /** Returns a string representation of the vector. A vector is represented
   *  as a string by an opening parenthesis followed by the coordinate values
   *  separated by commas with no whitespace, except the last coordinate which
   *  is followed by a closing parenthesis. A vector of dimension 0 is
   *  represented by "()".
   */
  @Override
  public String toString() {
    String res = "(";
    if (this.dim() > 0) {
      for (int i = 0; i < this.dim()-1; ++i)
        res += this.coord(i) + ",";
      res += this.coord(this.dim()-1);
    }
    res += ")";
    return res;
    // PROBLEM: This is an inefficient implementation due to the use of string
    // concatenation which creates many intermediate string objects that end
    // garbage collected.
    //
    // SOLUTION: Use mutable strings: StringBuilder class.
  }

  /** Overloaded equals method.
   */
  public boolean equals(Vector v) {
    if (v == this) return true;
    if (v == null) return false;
    return this.equalCoords(v);

  }

  /** Overridden equals method.
   */
  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (o instanceof Vector v) {
      return this.equalCoords(v);
    } else
      return false;  // Includes case o == null.
  }

  /* Auxiliary method used by both equals methods. Returns true when equal
     dimension and equal coordinates.
  */
  private boolean equalCoords(Vector v) {
    // v != null already checked by equals methods.
    if (this.dim() != v.dim()) return false;
    int i;
    for (i = 0; i < this.dim() && this.coord(i) == v.coord(i); ++i)
      ;
    return i == this.dim();
  }

  /** Returns new vector with sum of coordinates.
   *
   *  PRE: v != null && this.dim() == v.dim().
   */
  public Vector sum(Vector v) {
    if (this.dim() != v.dim())
      throw new IllegalArgumentException("Vector::sum(Vector): dimension mismatch.");
    // PROBLEM: If v == null we should also throw an IllegalArgumentException instead of
    // letting the code throw a NullPointerException.

    Vector res = new Vector(this.dim());
    for (int i = 0; i < this.dim(); ++i)
      res.coords[i] = this.coord(i) + v.coord(i);
    return res;
    // We should have a setter to avoid using the this.coords attribute
    // directly.

    /* If we had the copy constructor we could implement the loop as follows:

        Vector res = new Vector(this);  // Makes a copy of this.
        for (int i = 0; i < res.dim(); ++i)
          res.coords[i] += v.coord(i);  // Add to copied coordinate.
    */
  }

  /** Returns new vector with subtraction of coordinates.
   *
   *  PRE: v != null && this.dim() == v.dim()
   */
  public Vector dif(Vector v) {
    return null; /* COMPLETE */
  }

  /** Returns vectorial product.
   *
   *  PRE: v != null && this.dim() == v.dim()
   */
  public double prod(Vector v) {
    return 0.0;  /* COMPLETE */
  }

  /** Returns new vector with scalar product.
   *
   */
  public Vector prod(double k) {
    return null; /* COMPLETE */
  }

  /** Returns the vector module (square root of vector product).
   */
  public double mod() {
    return 0.0; /* COMPLETE */
  }

  /** Returns unitary vector (direction of this vector, dividing every
   * coordinate by modulo.
   */
  public Vector dir() {
    return null; /* COMPLETE */
  }

  /** Returns distance between vectors.
   *  PRE: v != null && this.dim() = v.dim().
   */
  public double dist(Vector v) {
    return 0.0; /* COMPLETE */
  }
}
