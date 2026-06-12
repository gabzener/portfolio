public class Transaccion<I>{

    public Transaccion(){}

    private Items cabeza = null;
    private int numero = 0;
    private double preciototal;

    /** Venta de 0 o más productos más productos de Item */
    public class Items{
        public I item;
        public I siguiente = null;
        public int precio = 0;
        public String nombre = "";

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
                puntero = (Items) puntero.siguiente;
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
                puntero = (Items) puntero.siguiente;    
            }
            puntero.siguiente = (I) nodo;
        }
        numero++;
    }
    public String toString(){
        String temp = "";
        if (cabeza == null){
            return "";
        } else {
            Items puntero = cabeza;
            while(puntero.siguiente != null){
                temp += puntero.nombre + " ";
                puntero = (Items)puntero.siguiente;
            }
        }
        return temp;
    }
    public I getItem(int i){
        if (cabeza == null){
            return null;
        } else {
            Items puntero = cabeza;
            int contador = 0;
            while(contador < i && puntero.siguiente != null){
                puntero = (Items) puntero.siguiente;
            }
            return (I) (puntero.nombre + " " + puntero.precio);
        }
    }
}
