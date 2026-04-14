package Laboratorios_2.Lab5;

public class Vector {
    //private final double n;
    private double [] coords;

/**
* Añade una cantidad al vaso
* @pre  n>=0
* @param n Dimensión
*/
    public Vector(int n){
        //n = Math.abs(n);
        assert n<0 : "No se puede crear un vector de tamaño negativo"; // javac -ea (Enable Assertions)
        this.coords = new double[n];
    }

    private Vector (){}

    public Vector(double [] coords, boolean copy){
        if (copy == true){
            this.coords = new double[coords.length];
            for (int i = 0; i <coords.length; ++i){
                this.coords[i] = coords[i];
            }
        } else {
            this.coords = coords;
        }
    }
/**
 * 
 * @return Devuelve this.n, osea la dimesión del Vector.
 */
    public double dim(){
        return coords.length;
    }
/**
 * @pre i >= 0
 * @param i Posición de la coordenada del Vector
 * @return Coordenada del Vector
 */
    public double getcoords(int i){
        return this.coords[i];
    }

    public String toString(){
        String result = "(";
        for (int i = 0; i <this.coords.length-1; ++i){
            result += this.coords[i] + ", ";
            result += this.coords[i];
        }
        return result += ")";

    }
    
}
