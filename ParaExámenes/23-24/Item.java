
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

public class ItemAlquiler extends Item{
    private String nombre;
    private double precio;
    private double alquilerpordia;
    
    public ItemAlquiler(String nombre, double precio, double alquilerpordia){
        super(nombre, precio);
        this.alquilerpordia = alquilerpordia;
    }
@Override
    public String toString(){
        return super.toString() + "[ " + alquilerpordia + "€ ]";
    }
    public double alquiler(){
        return alquilerpordia;
    }

}
public class Transaccion<I>{

    public Transaccion(){}

    private Items cabeza = null;
    private int numero = 0;
    private double preciototal;

    /** Venta de 0 o más productos más productos de Item */
    public class Items{
        public I item;
        public I siguiente = null;

        public Items(I item){
            this.item = item;
        }
    }
    public int numItems(){
        return numero;
    }
    public double precioTotal(){
        return preciototal;
    }
    public double totalVentas(){
        if(cabeza == null){
            return 0.00;
        } else {
            Items puntero = cabeza;
            while(puntero.siguiente != null){
                preciototal += puntero.precio;
                puntero = puntero.siguiente;
            }
            return preciototal;
        }
    }
    public void añadirFinal(I item){
        Items nodo = new Items(item);
        if (cabeza == null){
            cabeza = nodo;
        } else {
            Items puntero = cabeza;
            while(puntero.siguiente != null){
                puntero = puntero.siguiente;    
            }
            puntero.siguiente = nodo;
        }
        numero++;
    }
    public String toString(){
        String temp;
        if (cabeza == null){
            return "";
        } else {
            Items puntero = cabeza;
            while(puntero.siguiente != null){
                temp += puntero.nombre + " ";
                puntero = puntero.siguiente;
            }
        }
        return temp;
    }
    public I getItem(int i){
        if (cabeza == null){
            return;
        } else {
            Items puntero = cabeza;
            int contador = 0;
            while(contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
            }
            return puntero.nombre + " " + puntero.precio;
        }
    }
}
