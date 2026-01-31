package Laboratorios;
// Programa para el Laboratorio 2 de la clase de Programación 1.
// Autor: Gabriel Duque Ojeda.

class Lab2 {
	public static void main(String[] args) {
		char a = 5;	// Ejercicio 4
		char b = 10;// Ejercicio 4
		char g = 54;// Ejercicio 6
		double pi = 3.14; //Ejercicio 7
		int r = 3; // Ejercicio 8
		double rcuadrado = Math.pow(3, 2); // Ejercicio 8
		int cualquiera = 425; // Ejercicio 9/10
		
		
		System.out.println("2 != 4 " + (2!=4)); // Ejercicio 5
		System.out.println("4+5=" + (4+5)); // Ejercicio 2
		System.out.println("a + b =" + (a +b)); // Ejercicio 4
		System.out.println(g); // Ejercicio 6
		System.out.println("Área de un Círculo: A = pi * r^2");
		System.out.println("Radio: " + r);
		System.out.println("A = " + pi + " * " + "r^2 = " + (pi*rcuadrado)); // Ejercicio 8
		System.out.println(pi);
		System.out.println("Ultimo numero es " + (cualquiera % 10)); // Ejercicio 9
		System.out.println("Ultimo numero es " + (cualquiera / 10)); // Ejercicio 10
		System.out.println("68 + 1 = " + (68 +1)); //Ejercicio 11
		
	}
}