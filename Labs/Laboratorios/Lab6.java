package Laboratorios;
/* Este laboratorio se entrega por DeliverIt. 

   La plataforma DeliverIt se encuentra alojada en:

   https://deliverit.fi.upm.es/

   Para acceder es necesario conocer vuestro número de matrícula. 
   Podéis consultar vuestro número de matrícula accediendo a Politécnica Virtual en:

   https://www.upm.es/politecnica_virtual/

   Una vez dentro, tenéis que pulsar en 
   "Mis Datos" -> "Matrícula" -> "Estudios del alumno" -> "Mostrar" 
   y ahí aparece en el campo "Número de expediente", que corresponde con el número de 
   matrícula que solicita DeliverIt para iniciar sesión.

   En caso de que no tengáis las credenciales de acceso, podéis obtener unas nuevas pulsando 
   el botón "¿Has olvidado tu contraseña?". La nueva contraseña os llegará a través de 
   vuestro correo electrónico institucional.
*/


class Lab6{
	

    // Se pide hacer los mismos ejercicios del Lab5 pero usando while
/*
   int res = 1;
   int i = 1
   
	static 
  while ( i<=n){
	res = res *i:
	i = i+1;
}
*/

    // PRIMER EJERCICIO

    /* lineaAst (integer n) -> texto
     * PRE: n >= 0
     * POST: el resultado es una línea con n asteriscos
     * CASOS DE USO:
     *    lineaAst(0) -> ""
     *    lineaAst(1) -> "*"
     *    lineaAst(3) -> "***"
     */
	 
	public static String lineaAst(int n){
		String resultado = "";
		int i = 0;
		
		while (i < n){
			resultado = resultado + "*";
			i = i +1;
		}
		
		return resultado;
	}
	
    //SEGUNDO EJERCICIO

    /* cancionElefante(integer num) -> texto
     * PRE: num > 0
     * POST: el resultado es un texto que contiene la letra de la canción del
     * elefante hasta que el número de elefantes sea num.
     * EJEMPLOS:
     *    cancionElefante(3) = "Un elefante se balanceaba sobre la tela de una
     *    araña y como veía que no se caía fue a llamar a otro elefante. 2
     *    elefantes se balanceaban sobre la tela de una araña y como veían
     *    que no se caían fueron a llamar a otro elefante. 3 elefantes se
     *    balanceaban sobre la tela de una araña y como veían que no se caían
     *    fueron a llamar a otro elefante."
     */

	public static String cancionElefante(int n){
		String resultado = "Un elefante se balanceaba sobre la tela de una araña y como veía que no se caía fue a llamar a otro elefante.";
		int num = 1;
		int i = 2;
		while ( i <= n){
			i = i +1;
			num = num +1;
			resultado = resultado + " " + num + " elefantes se balanceaban sobre la tela de una araña y como veían que no se caían fueron a llamar a otro elefante.";
		}
		return resultado;
	}


    //TERCER EJERCICIO

    /* sumaDigitos(integer n) -> integer
     * PRE: n >= 0
     * POST: el resultado es la suma de los digitos de n
     * CASOS DE USO:
     *    sumaDigitos(0)   -> 0
     *    sumaDigitos(10)  -> 1
     *    sumaDigitos(123) -> 6
     *    sumaDigitos(45)  -> 9
     */

	public static int sumaDigitos(int n){
		int resultado = 0;
		int i = 0;
		while(n > 0){
			resultado = resultado + n%10;
			i = i +1;
			n = n/10;
		}
		return resultado;
	}
			
			

    //CUARTO EJERCICIO

    /* cuantosTres(int n) -> int
     * PRE: true
     * POST: el resultado es el número de veces que aparece el dígito 3 en n
     * CASOS DE USO:
     *   cuantosTres(123) -> 1
     *   cuantosTres(3) -> 1
     *   cuantosTres(8) -> 0
     *   cuantosTres(453893) -> 2
     *
     */
	
	public static int cuantosTres(int n){
		int resultado = 0;
		// int i = 0;
		if (n <0)
			n = n * -1;
		else
			// n = n;
		while (n > 0){
			if (n%10 == 3 || n%10 == -3)
				resultado = resultado +1;
			n = n/10;
		}
		return resultado;
	}
	

    //QUINTO EJERCICIO


    /* hayTres(int n) -> boolean
     * PRE: true
     * POST: el resultado es true si el dígito 3 aparece en n y false en caso
     * contrario
     * CASOS DE USO:
     *   hayTres(123) -> true
     *   hayTres(3) -> true
     *   hayTres(330033) -> true
     *   hayTres(124) -> false
     *
     */
	
	public static boolean hayTres(int n){
		boolean resultado = false;
		if (n <0)
			n = n * -1;
		else
			// n = n;
		while ( n> 0){
			if ( n % 10 == 3 || n % 10 == -3)
				resultado = true;
			n = n/10;
		}
		return resultado;
	}
			

    //SEXTO EJERCICIO

    /* trianguloInvertidoAst(integer n) -> texto
     * PRE: n >= 0
     * POST: el resultado es un triangulo rectangulo invertido de asteriscos
     * CASOS DE USO:
     *   trianguloAst(0) -> ""
     *   trianguloAst(1) -> "*"
     *   trianguloAst(3) -> "***"
     *                      "**"
     *                      "*"
	*/
	
	public static String lineaAst1(int n) {
        String linea = "";
        int contador = 0;
        
        while (contador < n) {
            linea = linea + "*";
            contador = contador + 1;
        }
        
        return linea;
    }
    
    public static String trianguloInvertidoAst(int n) {
        if (n <= 1) {
            return "*" + "\n";
        }
        
        String triangulo = "";
        int filaActual = n;
        
        while (filaActual > 0) {
            triangulo = triangulo + lineaAst1(filaActual);
            
            if (filaActual > 1) {
                triangulo = triangulo + "\n";
            }
            
            filaActual = filaActual - 1;
        }
        
        return triangulo + "\n";
    }
	
	
     // SEPTIMO EJERCICIO

     /* trianguloAst(integer n) -> texto
     * PRE: n > 0
     * POST: el resultado es un triangulo rectangulo de asteriscos
     * CASOS DE USO:
     *   trianguloAst(0) -> ""
     *   trianguloAst(1) -> "*"
     *   trianguloAst(3) -> "*"
     *                      "**"
     *                      "***"
     */


	public static String lineaAst2(int n) {
        String linea = "";
        int contador = 0;
        
        while (contador < n) {
            linea = linea + "*";
            contador = contador + 1;
        }
        
        return linea;
    }
    
    public static String trianguloAst(int n) {
        if (n <= 1) {
            return "*" + "\n";
        }
        
        String triangulo = "";
        int filaActual = 1;
        
        while (filaActual <= n) {
            triangulo = triangulo + lineaAst2(filaActual);
            
            if (filaActual < n) {
                triangulo = triangulo + "\n";
            }
            
            filaActual = filaActual + 1;
        
        }
        return triangulo + "\n";
    }

    static public void main(String[] args){
		System.out.println(lineaAst(5));
		System.out.println(cancionElefante(5));
		System.out.println(sumaDigitos(11));
		System.out.println(cuantosTres(-13));
		System.out.println(hayTres(-13));
		System.out.println(trianguloInvertidoAst(6));
		System.out.println(trianguloAst(7));
	// Escribir aquí las pruebas
    }

}
