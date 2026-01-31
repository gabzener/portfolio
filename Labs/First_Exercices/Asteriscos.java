package First_Exercices;
// Una funcion "lineaAst" recibe 1 unico argumento que e sun entero, lo que hace es devolver un string on n asteriscos.
//UNa funcion suma los digitos de un numero
//UNa funcion suma digitos pares
// UNa funcion que te dice cuantas veces te aparece un digito en un numero.

// Implemetar en Java una función que se llame "piramideInvertida" que recibe como argumentno 1 numero entero y te recibe un string formado por una piramide invertida que empieza por n asteriscos y termina con n.
/*

class Main {

    static int factorial( int n ) {
        // base condition or termination condition
        if (n != 0)
        // here we are calling the recursive method
            return n * factorial(n-1);
        else
            return 1;
    }
	
	
class lineaAst(int n){
	if  (n != 0)
		return ""
	else
		return "*" * n
}






// Clase 25/09/25 de Programación 1
// Autor: Gabriel Duque Ojeda

import 
*/


class Asteriscos {
	
	static String lineaAst(int n){
		if ( n <= 0) return "";
		return "*" + lineaAst(n-1);
	
	}
	
	
	
	static String piramideInvertida(int n){
		if (n == 0)
			return "";
		else
			return lineaAst(n) + "\n" + piramideInvertida(n-1);
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(piramideInvertida(5));
	}
}
