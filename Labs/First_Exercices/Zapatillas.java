package First_Exercices;
// Clase 22/09/25 de Programación 1
// Autor: Gabriel Duque Ojeda


class Zapatillas {
	public static void main(String [] args){
		final double precio_zapatillas = 160;
		if (precio_zapatillas > 150){
			System.out.println("El precio de las zapatillas es mayor a 150 euros, por tanto se le aplica un descuento del 15%");
			System.out.println("Su precio final es de " + (precio_zapatillas * (0.85)) + " euros");
		} else{
			System.out.println("El precio final de las zapatillas es de " + precio_zapatillas);
		}
	}
}		
