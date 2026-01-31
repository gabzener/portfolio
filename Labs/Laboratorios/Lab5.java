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

// Laboratorio 5
// Autor: Gabriel Duque Ojeda


class Lab5{

    /* factorial (entero n) -> entero
       PRE: n >= 0
       POST: el resultado es el factorial de n
       CASOS DE USO:
         factorial(1) -> 1
         factorial(3) -> 6
    */

    static int factorial (int n){
      if (n < 2)
        return 1;
      else
        return n * factorial(n-1);
    }


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
		if (n <= 0)
			return "";
		else
			return "*" + lineaAst(n-1);
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

	public static String cancionElefante(int num) {
		if (num <= 0)
			return "";
		else if(num == 1)
			return "Un elefante se balanceaba sobre la tela de una araña y como veía que no se caía fue a llamar a otro elefante.";
		else
			return cancionElefante(num - 1) + " " + num + " elefantes se balanceaban sobre la tela de una araña y como veían que no se caían fueron a llamar a otro elefante.";
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
	
	public static int sumaDigitos(int num){
		if (num < 10)
			return num;
		else
			return sumaDigitos(num/10) + num%10;
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
	public static int cuantosTres(int n) {
		if (n == 0) {
			return 0;
		}
		if (n % 10 == 3 || n % 10 == -3) {
			return 1 + cuantosTres(n / 10);
		} else {
			return cuantosTres(n / 10);
		}
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

	public static boolean hayTres(int n) {
		if (n == 0) {
			return false;
		}
		if (n % 10 == 3 || n % 10 == -3) {
			return true;
		} else {
			return hayTres(n / 10);
		}
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
	
	public static String lineaAst2(int n){
		if ( n <= 0) return "";
		return "*" + lineaAst2(n-1);
	
	}
	
	public static String trianguloInvertidoAst(int n){
		if (n == 0)
			return "";
		else
			return lineaAst2(n) + "\n" + trianguloInvertidoAst(n-1);
	
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
	
	public static String trianguloAst(int n) {
		if (n == 0)
			return "";
		return trianguloAst(n - 1) + "\n" + lineaAst5(n);
	}

	public static String lineaAst5(int n) {
		if (n == 1)
			return "*";
		return lineaAst5(n - 1) + "*";
	}
	
	
	static public void main(String[] args){
      int n = 8;
      System.out.println("En factorial de " + n + " es " + factorial(n));
	  System.out.println(cancionElefante(5));
	  System.out.println(sumaDigitos(147));
	  System.out.println(trianguloAst(8));
	  System.out.println(cuantosTres(7746352));
	  System.out.println(hayTres(3775));
	  System.out.println(cuantosTres(3));
	  System.out.println("----------------");
	  System.out.println(lineaAst2(5));
	  System.out.println(lineaAst5(5));
    }

}
