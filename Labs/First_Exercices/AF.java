package First_Exercices;
/* esVocalMinuscula (Caracter C) --> Boolean

PRE: true

POST: el resultado es true si el caracter es una vocal en minuscula, false en claso contrario

casos de USO:

esVocalMinuscula('e') -> true
esVocalMinuscula(`h') -> false
esVocalMinuscula('?') -> false
esVocalMinuscula('E') -> false


*/

class AF{
	
	static int esRectangulo( int base, int altura){
		return base * altura;
	}
	
	public static void main(String[] args){
		System.out.println(esRectangulo(2,3) == 6 );
		System.out.println(esRectangulo(2,7) == 9 );
		System.out.println(esRectangulo(4,3) == 12 );
	}
}