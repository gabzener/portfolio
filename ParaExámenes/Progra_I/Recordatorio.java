package Progra_I;

public class Recordatorio {

    static int ultimoNumero(int num){ // Es la división con resto
	    return num % 10;
	}
    static int restodeNumeros(int num1){ // Es la división sin resto y es con decimales
	    return num1 / 10;
	}
    static int obtenerRestodeUnNumero_modulo(int divisor, int dividendo){
        int resto = dividendo % divisor;
        return resto;
    }

    public static void main(String [] args){
        int dni = 8928867;
        double modulo = 23;
        System.out.println( dni / modulo); //Punto importante:
        //Si haces la división decimal con enteros, solo te devolverá numero entero ignorando todo decimal, la
        // división debe de ser con [doubles] en almenos 1 de los 2.

    }



    
}
