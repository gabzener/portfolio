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