public class Terna<Tipo1, Tipo2, Tipo3> {

    private Tipo1 uno;
    private Tipo2 dos;
    private Tipo3 tres;

    Terna (Tipo1 uno, Tipo2 dos, Tipo3 tres){
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
    }
    Tipo1 uno(){
        return uno;
    }
    Tipo2 dos(){
        return dos;
    }
    Tipo3 tres(){
        return tres;
    }
    
    /**Implementar la clase Persona:
     * Nombre (String)
     * DNI (String)
     * Año de Nacimiento (int)
     */
    public static void main(String[] args){
        Terna<String, String, Integer> Persona = new Terna("Jose Manuel", "23456789A",1974);
        System.out.println(Persona.uno());
        System.out.println(Persona.dos());
        System.out.println(Persona.tres());
    
    }
    
}

