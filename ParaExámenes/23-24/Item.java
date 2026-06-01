
public class Item {
    /** Un producto que vende la empresa */
    private String nombre; 
    private double precio;

  /** Constructor: Un Item con nombre y precio dados.*/
   public Item (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
}
   public String nombre () {
        return nombre;
}
   public double precio () {
        return precio;
}
  /** = Este Item representado como texto */ 
   public String toString () {
        return ("[ " + this.nombre + ", " + this.precio + "€ ]");

}
  /** = "Este Item es menor que ese Item" */ 
   public boolean esMenor (Item ese) {
        return this.precio < ese.precio;
}
  /** = "Este Item es igual que (el Item) obj" */ 
   public boolean equals (Object obj) {
        return this == obj;
}
}

