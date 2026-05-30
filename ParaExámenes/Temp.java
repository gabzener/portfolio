public class Temp {

    private String nombre;
    private String email; // "" si se desconoce

    static int numClientes = 0;

    Temp (String nom, String em){
        if (nom == null){
            throw new IllegalArgumentException();
        } else{
            this.nombre = nom;
            this.email = em;
            numClientes++;
        }
    } 
    Temp(String nom){
        this.nombre = nom;
        numClientes++;

    }
    String nombre (){
        return nombre;
    }
    public String toString(){
        return nombre; // Preguntar sobre si el nombre me retorna el nombre del Cliente o el atributo.
    }
    void cambiarNombre(String nom){
        this.nombre = nom;

    }

    public static void main(String [] args){

        Temp a = new Temp("Nombre1", "gola@gmail");
        Temp b = new Temp("Nombre2");
        a.cambiarNombre("Nombre3");

        System.out.println(b.nombre);
        System.out.println(a.nombre);

        Temp ah = new Temp("A");
Temp bh = ah;
bh.cambiarNombre("C");
System.out.println(ah + " - " + bh);

        System.out.println(Temp.numClientes);

    }



    
}
