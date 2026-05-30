/*
   BArrayStackStr: A [B]ounded [Stack] of [Str]ing elements implemented with
   an [Array].

   The stack has a fixed capacity which is the length of the array, and has a
   bounded size which is the number of string elements pushed on the stack.

   The stack is *full* when its size equals its capacity. An exception is
   thrown by methods that push elements on a full stack (e.g. push, stack,
   etc.).

   The stack is *empty* when its size is zero. An exception is thrown by
   methods that operate with elements on an empty stack (top, pop, topPop,
   etc.).

   The stack stores String object references and allows storage of null
   elements. The elements are shallow-copied (i.e. the stack stores the
   references to the string objects, not references to copies of the string
   objects that would be created inside the stack) because elements are owned
   by the user of the stack.

   Supported methods:

   * Constructors: default constructor, copy constructor, conversion
     constructors (from string representation and from array of strings),
     parametrised constructor (capacity parameter).

   * Interrogators: isEmpty, isFull, equals (overloaded) and equals
    (overridden), hasSubStack.

   * Stack getters: size, capacity.

   * Element getters: top, topPop, at, find, getSubStack.

   * Modifiers: push, pop, clear, deepClear, stack (overloaded: from another
     stack, from array, from string representation).

   * Converters: toString, toArray.
 */

public class BArrayStackStr {

  private static final int MINIMUM_CAPACITY = 2;
  private static final int DEFAULT_CAPACITY = 16;
  // Maximum capacity is Integer.MAX_VALUE.

  private static final String THIS_CLASS_NAME = "BArrayStackStr";
  // To abbreviate exception messages.

  private String [] elems;
  private int tos; // [t]op [o]f [s]tack: index of last element on stack.
                   // this.tos == -1 when stack empty.

  public int capacity() {
    return this.elems.length;
  }

  public int size() {
    return this.tos + 1;
  }

  public boolean isEmpty() {
    // return this.tos == -1;
    return this.size() == 0;
  }

  public boolean isFull() {
    // return this.tos + 1 == this.elems.length;
    return this.size() == this.capacity();
  }

  //
  // No setters, we'll use attributes directly for now, using getters whenever
  // possible for abstraction.
  //

  public BArrayStackStr() {
    // this.elems = new String[DEFAULT_CAPACITY];
    // this.tos   = -1;
    this(DEFAULT_CAPACITY);  // Calls BArrayStackStr::BArrayStackStr(int) below.
  }

  public BArrayStackStr(int capacity) throws IllegalArgumentException {
    if (capacity < MINIMUM_CAPACITY)
      throw new IllegalArgumentException
        ("%1$s::1$%s(int): minimum stack capacity is %2$d"
         .formatted(THIS_CLASS_NAME, MINIMUM_CAPACITY));
    this.elems = new String[capacity];  // null elements.
    this.tos = -1;
  }

  public BArrayStackStr(BArrayStackStr stk) throws IllegalArgumentException {
    if (stk == null)
      throw new IllegalArgumentException
        ("%1$s::%1$s(%1$s): null argument".formatted(THIS_CLASS_NAME));

    // // Relying on the parametrised constructor does not save work.
    // this(stk.size());
    // // Still has to copy elements.
    // for (int i = 0; i < stk.size(); ++i)
    //   this.elems[i] = stk.elems[i];
    // this.tos = stk.tos;

    this.elems = new String[stk.size()];
    for (int i = 0; i < stk.size(); ++i)
      this.elems[i] = stk.elems[i];
    this.tos = stk.tos;
  }

  /* The following constructor creates a stack from an array. The stack's
     capacity is the length of the array plus the default capacity as slack
     space. If the array has length zero then the stack is empty with the
     default capacity. The method stacks the elements on the array from first
     to last or from last to first depending on the value of the second
     boolean parameter.
  */
  public BArrayStackStr(String [] es, boolean dir) {
    /* COMPLETE */
    this(0); // Remove this line when completed, it's just to compile.
  }

  /*
     Parametrised constructor. Creates a stack from its string representation,
     as given by toString(). Think of how to deal with occurrences of the
     separator "|" on the string elements.
  */
  public BArrayStackStr(String sstk) {
    /* COMPLETE */
    /* Try the following in jshell:

       "| Hello|world | how |are | you | today? | I'm  | feeling | |well ".split(" \\| ")

       see what happens and what you need to do on the resulting array of
       strings to push the array's elements on the stack.
    */
    this(0); // Remove this line when completed, it's just to compile.
  }

  public BArrayStackStr push(String elem) throws IllegalStateException {
    if (this.isFull())
      throw new IllegalStateException
        ("%1$s::push(String)%1$s: stack full".formatted(THIS_CLASS_NAME));
    this.elems[++this.tos] = elem; // Shallow copy of elements.
    return this;
  }

  public String top() {
    if (this.isEmpty())
      throw new IllegalStateException
        ("%s::top()String: stack empty".formatted(THIS_CLASS_NAME));
    return this.elems[this.tos];
  }

  public BArrayStackStr pop() {
    if (this.isEmpty())
      throw new IllegalStateException
        ("%1$s::pop()%1$s: stack empty".formatted(THIS_CLASS_NAME));
    --this.tos;
    return this;
  }

  public String topPop() {
    if (this.isEmpty())
      throw new IllegalStateException
        ("%1$s::topPop()%1$s: stack empty".formatted(THIS_CLASS_NAME));
    String s = this.top();
    this.pop();
    return s;
  }

  public BArrayStackStr clear() {
    this.tos = -1;
    return this;
  }

  public BArrayStackStr deepClear() {
    for (int i = 0; i < this.size(); ++i)
      this.elems[i] = null; // May help the GC.
    this.tos = -1;
    return this;
  }

  // String format for stacks:
  // Empty: "| "
  // Non-empty "| str1 | str2 | ... | strN "
  @Override
  public String toString() {
    if (this.isEmpty())
      return "| ";
    StringBuilder res = new StringBuilder(this.size() * 3);
    //                                    ^^^^^^^^^^^^^^^
    //                  Multiply to allocate some initial
    //                  space for elements.
    for (int i = 0; i < this.size(); ++i)
      res.append("| ").append(this.elems[i]).append(' ');
    return res.toString();

    // // Inefficient: copies created by concatenation.
    // String res = "";
    // for (int i = 0; i < this.size(); ++i)
    //   res += "| " + this.elems[i] + ' ';
    // return res;
  }

  public String [] toArray() {
    // return this.elems; // No!
    /* The array attribute is privately owned by the stack object. It's not
       used as an ordinary array but to model a stack. It's reference must not
       be returned outside the class because then its contents would be
       changeable from the outside. For example:

         public static void main(String [] args) {
             BArrayStackStr stk = new BArrayStackStr(4);
             stk.push("Hello").push("world").push("Bye");
             String [] arr = stk.toArray();
             arr[0] = "Bye";
             arr[1] = null;
             arr[2] = null;
         }

       If stk.toArray() returns the array reference stored in this.elems, the
       stack is modified and left on an inconsistent state by the "arr[...] =
       ..."  lines. Notice that the value of this.tos cannot be changed from
       the outside.
    */

    String [] res = new String[this.size()];  // Deep copy of the array.
    for (int i = 0; i < this.size(); i++)
      res[i] = this.elems[i]; // Shallow copy of elements.
    return res;

  }

  // Stack on top of this the contents of another stack.
  public BArrayStackStr stack(BArrayStackStr stk) {
    /* COMPLETE */
    return this;
  }

  // Stack on top of this contents of an array.
  public BArrayStackStr stack(String [] arr) {
    /* COMPLETE */
    return this;
  }

  // Stack on top of this the string representation of stack.
  public BArrayStackStr stack(String s) {
    /* COMPLETE */
    return this;
  }


  public boolean equals(BArrayStackStr stk) {
    /* COMPLETE */
    return false;
  }

  @Override
  public boolean equals(Object o) {
    /* COMPLETE */
    return false;
  }

  public String at(int i) {
    /* COMPLETE */
    return "";
  }

}
