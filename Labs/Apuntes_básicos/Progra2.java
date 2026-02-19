public class Progra2 {

// ¿Qué es la programacion orientada a objetos?

/* Instanciar una clase --> Crear un objeto */
 static private int edad = 5;




    // (Usado para las funciones auxiliares (private)) [public] controlador de visibilidad [static] orientado a objetos.

int [] a = null;
// Esto es una declaracion
int [] arr = new int[4];
//Esto es una inicializacion

// Los literales son cosas que dan valores y tienen varios tipos
// String / int / 

// Comandos --> Ejecutan una acción, terminados en punto y coma
// Sentencias son acciones del codigo 


// for ( i = 0; i < a.length && a[i] != e; ++i)
//   i == a.length || i < a.length && a [i] == e

  // public static void buscar(int [] a, int s){ 

  //}







// Para constructores y creacion de clases

 public static class Punto{
    public double x,y;

    public Punto(){ // COnstructor por defecto
        this.x = 1.0;
        this.y= 2.0;
    }
    public Punto(Punto p){ // Constructor de copia
        this.x = p.x;
        this.y = p.y;
    }
    public Punto(double x, double y){ //Constructor multiparámetros
        this.x = x;
        this.y = y;
    }
    public Punto(double d){
        this.x = d;
        this.y = d;
    }
    public String toString(){
        return this.x + " " + this.y;
    }
    public Punto midPunto(Punto p){
        Punto m = new Punto();
        m.x = (this.x + p.x)/2;
        m.y = (this.y + p.y)/2;
        return m;

    }
 }

 public static void main(String[] args) { 

    Punto p1 = new Punto();
    Punto p2 = new Punto();
    p1 = new Punto(3.0);
    p2 = new Punto(p2);
    System.out.println(p1.toString());
    System.out.println(p2.midPunto(p1));

}
}
