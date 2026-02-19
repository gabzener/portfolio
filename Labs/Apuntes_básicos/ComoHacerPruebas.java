
public class ComoHacerPruebas {
    
/* Para hacer pruebas en Java de forma "correcta" se usan los booleanos:
- Debe haber un booleano por cada prueba que se realice
- Se puede hacer de dos maneras:
    - Un booleano para todas las pruebas
    - Cada prueba un booleano
   Se que esto puede sonar lioso pero lo vamos a ver ahora*/

// Imaginemos que tenemos 4 funciones que hacen cosas distintas:

public static int pruebaInt(int n){
    return n;
}
public static String pruebaString(String probando){
    return probando;
}
public static boolean pruebaBoolean(Boolean test){
    return test;
}
public static char pruebaChar(char a){
    return a;
}

//Para hacer pruebas a estas funciones usamos el siguiente método:

public static void main(String[] args){ //Las pruebas siempre se hacen en el main.


    // Esto es a lo que me referia con un boolean por cada prueba.
    // Para hacer pruebas, debemos igualar la funcion con los parametros
    // al resultado esperado, así completamos la prueba.
    boolean testInt = (pruebaInt(5) == 5);
    boolean testString = (pruebaString("hola") == "hola");
    boolean testBoolean = (pruebaBoolean(true) == true);
    boolean testChar = (pruebaChar('C') == 'C');

    //Método para un boolean para cada prueba

    /* Ahora esto es solo para definir el valor, ahora debemos escribir
    lo que nos dará la terminal al completar o no completar las pruebas */
    System.out.println("-------------Inicio de las pruebas para las funciones-----------");
    System.out.println("Las funcion pruebaInt" + (testInt? " funciona.": " falla."));
    System.out.println("Las funcion testString" + (testString? " funciona.": " falla."));
    System.out.println("Las funcion testBoolean" + (testBoolean? " funciona.": " falla."));
    System.out.println("Las funcion testChar" + (testChar? " funciona.": " falla."));
    System.out.println("--------------Fin de las pruebas para las funciones------------");

    //Método para un booleano para todas las pruebas
    /* Ahora esto es solo para definir el valor, ahora debemos escribir
    lo que nos dará la terminal al completar o no completar las pruebas */

    boolean PruebasFinales = testInt && testString && testBoolean && testChar;
    System.out.println("Las funciones" + (PruebasFinales? " han pasado todas las pruebas.": " ha fallado alguna prueba."));

    /*Con esto es a lo que me referia con booleano para cada prueba o 1 booleano
    para todas las pruebas. De todas formas el metodo más intuitivo y más detallado 
    es el primero, pero siempre está bien recordar el otro para una forma más general. */

}


}
