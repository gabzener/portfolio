package Laboratorios;
/*
 * autora: Clara Benac Earle
 * autor/a: Gabriel Duque Ojeda
 * 
 */

class Lab4{
	
	/* EJERCICIO 1: Escribe la especificación y la implementación de una 
     * función que devuelve el último dígito de un número dado y escribe
     * algunas pruebas en el main.
     */ 
	/* ultimoNumero(Numero) --> Entero
	* PRE: numero > 0
	* POST: el resultado es el ultimo numero del numero dado.
	* Casos de Uso:
	* ultimoNumero(54) -> 4
	* ultimoNumero(558) -> 8
	* ultimoNumero(032) -> 2
	*/
	static int ultimoNumero(int num){
		return num % 10;
	}
	
	/* EJERCICIO 2: Escribe la especificación y la implementación de una 
     * función que, dado un número, devuelve el número sin el último 
     * dígito y escribe algunas pruebas en el main.
     */
    /* restodeNumeros(Numero) --> Entero
	* PRE: numero > 0
	* POST: el resultado son todos los numeros menos el último del numero dado.
	* Casos de Uso:
	* restodeNumeros(54) -> 5
	* restodeNumeros(558) -> 55
	* restodeNumeros(032) -> 03
	*/	

	static int restodeNumeros(int num1){
		return num1 / 10;
	}

    /* EJERCICIO 3: Escribe la especificación y la implementación de un
     * procedimento que, dados la edad de un cliente solicitante de un préstamo, 
     * su clasificación crediticia  ('A', 'B', 'C', 'D', 'E') y el dato de si 
     * dispone de aval o no, muestre por la pantalla "Préstamo concedido" si
     * el cliente cumple con los requisitos mínimos o bien "Préstamo no concedido" 
     * si no los cumple.
     * Requisitos mínimos:
     *  - es indispensable tener más de 18 años
     *  - cumplir una de estas dos condiciones:
     *      - clasificación crediticia igual a 'A' o 'B'
     *      - disponer de aval
     * Escribe algunas pruebas en el main.
     */
	 
	 
	/*prestamoConcedido(Edad, Clasificacion, tieneAval) --> Boolean
	* PRE: false	
	* POST: el resultado es true si tiene más de 18 años y clasificacion = A o B o dispone de aval
	* Casos de Uso:
	* prestamoConcedido(18, B, No aval) -> true
	* prestamoConcedido(27, A, Aval) -> true
	* prestamoConcedido(58, C, Aval) -> true
	*/
	
	static String prestamoConcedido(int edadbanco, char clase, boolean aval){
		if (edadbanco >= 18 && (clase == 'A' || clase == 'B' || aval))
			return "Prestamo Concedido";
		else
			return "Prestamo no Concedido";
	}

    /* EJERCICIO 4: Dada la siguiente especificación, implementa la 
     * función y escribe algunas pruebas en el main.
     *
     * calculadora(caracter op, entero o1, entero o2) -> entero
     * PRE: op es uno de los siguientes caracteres +, -, * o /
     * POST: 
     * Si op es + el resultado es la suma de o1 y o2
     * Si op es - el resultado es la o1 menos o2
     * Si op es * el resultado es el producto de o1 y o2
     * Si op es / el resultado es la división de o1 entre o2
     * CASOS DE USO:
     *  calculadora('+',4,6) -> 10
     */
	 
	public static int Calculadora(char operador, int primeronum, int segundonum){
		if (operador == '+')
			return primeronum + segundonum;
		if (operador == '-')
			return primeronum - segundonum;
		if (operador == '*')
			return primeronum * segundonum;
		if (operador == '/')
			return primeronum / segundonum;
		else 
			return 0;
	}

    /* EJERCICIO 5: Escribe la especificación e implementación de la función
     * esLetra que, dado un carácter, devuelve true si es una letra y false 
     * en caso contrario.
     */
	
	/*esLetra(Letra) --> Boolean
	* PRE: false
	* POST: el resultado es true si el caracter es una letra.
	* Casos de Uso:
	* esLetra(a) -> True
	* esLetra(4) -> False
	*/
	
	// Letras de la A a la Z --> {caracter >= A,B,C...,Z <= caracter}
	
	static boolean esLetra(char caracter){
		if ((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z'))
			return true;
		else if ( caracter >= '0' && caracter <= '9')
			return false;
		else
			return false;
	}
	 
	 
    
    /* EJERCICIO 6: Delegación de alumnos está organizando un viaje de fin de 
     * estudios. El coste del viaje se calcula de la siguiente manera:
     * Si son 100 alumnos o más, el coste por cada alumno es de 65 euros.
     * De 50 a 99 alumnos, el coste es de 70 euros por alumno.
     * De 30 a 49 alumnos, el coste es de 95 euros por alumno.
     * Si se apuntan menos de 30 alumnos, el coste es de 4000 euros, 
     * sin importar el número de alumnos.
     * Escribe las especificaciones e implementaciones de las funciones 
     * necesarias para calcular cuánto hay que pagar a la agencia de
     * viajes por el servicio y cuánto tiene que pagar cada estudiante.
    */
	
	// +100 alumnos --> 65€/pers
	// n >= 50 && n <= 99 --> 70€/pers
	// n >= 30 && n <= 49 --> 95€/pers
	// n < 30 --> 4000€ --> 29 pers 133,3 €/pers
	
	public static String costeViaje(int numeroAlumnos){
		if (numeroAlumnos >= 100)
			return "Cada alumno deberá pagar 65€, siendo el dinero total que se abona a la agencia de " + (65 * numeroAlumnos) + "€";
		if (numeroAlumnos >= 50 && numeroAlumnos <= 99)
			return "Cada alumno deberá pagar 70€, siendo el dinero total que se abona a la agencia de " + (70 * numeroAlumnos) + "€";
		if (numeroAlumnos >= 30 && numeroAlumnos <= 49)
			return "Cada alumno deberá pagar 95€, siendo el dinero total que se abona a la agencia de " + (95 * numeroAlumnos) + "€";
		if (numeroAlumnos < 30)
			return "Cada alumno deberá pagar " + (4000 / numeroAlumnos) + "€, siendo el dinero total que se abona a la agencia de 4000€";
		else 
			return "";
	}
	
	
	public static void main(String[] args){
	
	System.out.println(ultimoNumero(74)); // Prueba Ejercicio 1
	System.out.println(restodeNumeros(8864)); // Prueba Ejercicio 2
	System.out.println(prestamoConcedido(18, 'C', true)); //Ejercicio 3
	System.out.println(Calculadora('-',5,7)); //Prueba ejercicio 4
	System.out.println(esLetra('5')); //Prueba ejercicio 5
	System.out.println(costeViaje(20));
    
  }
}
