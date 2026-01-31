package Laboratorios;
// autores: Profesorado Programación I - GII-ADE-PARS - ETSIINF - UPM


public class Lab10 {


  static void mostrarElementos(char[] arr) {
    System.out.print("{");
    if (arr.length > 0) {
      for (int i = 0; i < arr.length-1 ; ++i)
        System.out.print(arr[i] + ",");
      System.out.print(arr[arr.length-1]);
    }
    System.out.println("}");
  }


  /* concatenar(Array de caracteres a1, Array de caracteres a2) -> Array de caracteres
   *
   * PRE: a1 y a2 no son null.
   *
   * POST: Función que devuelve un nuevo array con los caracteres de a1
   *       seguidos a continuación de los caracteres de a2.
   *
   * CASOS DE USO:
   *  concatenar( {}, {} )                      -> {}
   *  concatenar( {}, {'a', 'b', 'c'} )         -> {'a', 'b', 'c'}
   *  concatenar( {'a', 'b', 'c'}, {} )         -> {'a', 'b', 'c'}
   *  concatenar( {'a', 'b', 'c'}, {'c', 'd'} ) -> {'a', 'b', 'c', 'c', 'd'}
   */

    public static char[] concatenar(char[] a, char[] b){
      char [] resultado = new char[a.length + b.length];

      for(int i = 0; i< a.length; i++){
        resultado[i] = a[i];
      }
      for(int m = 0; m<b.length; m++){
        resultado[a.length + m] = b[m];
      }
      return resultado;
    }


  /* insertar(Array de caracteres a, entero i, char c) -> Array de caracteres
   *
   * PRE: a no es null, 0 <= i y i <= a.length.
   *
   * POST: Función que devuelve un nuevo array de longitud a.length + 1 que
   * contiene los caracteres de a hasta la posición i-1, el carácter c en la
   * posición i y los caracteres de a desde la posición i hasta el final. El
   * resultado es un nuevo array en el que el carácter c aparece insertado en
   * la posición i.
   *
   * CASOS DE USO:
   *  insertar( {}, 0, 'a' )              -> {'a'}
   *  insertar( {'a', 'b', 'c'}, 0, 'd' ) -> {'d', 'a', 'b', 'c'}
   *  insertar( {'a', 'b', 'c'}, 1, 'd' ) -> {'a', 'd', 'b', 'c'}
   *  insertar( {'a', 'b', 'c'}, 2, 'd' ) -> {'a', 'b', 'd', 'c'}
   *  insertar( {'a', 'b', 'c'}, 3, 'd' ) -> {'a', 'b', 'c', 'd'}
   */

public static char[] insertar(char[] a, int i, char c) {
    char[] resultado = new char[a.length + 1];
    
    for (int j = 0; j < i; j++) {
        resultado[j] = a[j];
    }
    resultado[i] = c;
    for (int k = i; k < a.length; k++) {
        resultado[k + 1] = a[k];
    }
    
    return resultado;
}


  /* borrar(Array de caracteres a, Entero i) -> Array de caracteres
   *
   * PRE: a no es null, 0 <= i y i < a.length.

   * POST: Función que devuelve un nuevo array de longitud a.length - 1 que
   * contiene los caracteres de a hasta la posición i-1 seguido de los
   * caracteres de a desde la posición i+1. El resultado es un nuevo array
   * que no contiene el carácter de a en la posición i.

   * CASOS DE USO:
   *  borrar( {'a'}, 0 )           -> {}
   *  borrar( {'a', 'b', 'c'}, 0 ) -> {'b', 'c'}
   *  borrar( {'a', 'b', 'c'}, 1 ) -> {'a', 'c'}
   *  borrar( {'a', 'b', 'c'}, 2 ) -> {'a', 'b'}
   */

public static char[] borrar(char[] a, int i) {
    char[] resultado = new char[a.length - 1];
    
    for (int j = 0; j < i; j++) {
        resultado[j] = a[j];
    }
    
    for (int k = i + 1; k < a.length; k++) {
        resultado[k - 1] = a[k];
    }
    return resultado;
}

  /* borrarElementos(Array de caracteres a, carácter c) -> Array de caracteres
   *
   * PRE: a no es null.
   *
   * POST: Función que devuelve un nuevo array con los valores de a
   * distintos al carácter c en el mismo orden que tienen en a.
   *
   * CASOS DE USO:
   *   borrarElementos( {}, 'a' )                   -> {}
   *   borrarElementos( {'b','c'}, 'a' )            -> {'b', 'c'}
   *   borrarElementos( {'a', 'b', 'a', 'c'}, 'a' ) -> {'b', 'c'}
   *   borrarElementos( {'a', 'b', 'a', 'c'}, 'c' ) -> {'a', 'b', 'a'}
   */

  public static char[] borranElementos(char[] arr, char c) {
      if (arr == null || arr.length == 0) {
          return new char[0];
        }
        
      int contador = 0;
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] != c) {
              contador++;
          }
      }
        
      char[] resultado = new char[contador];
        
      int posiciondelarrayresultado = 0;
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] != c) {
              resultado[posiciondelarrayresultado] = arr[i];
              posiciondelarrayresultado++;
          }
      }
        
      return resultado;
  }
    
  /* coincidentes(array de caracteres a1, array de caracteres a2) -> array de caracteres
   *
   * PRE: a1 no es null, a2 no es null
   *  
   * POST: Función que devuelve un nuevo array de caracteres que contiene la
   * primera secuencia de valores de a1 que coincide con una secuencia de
   * valores del array a2 tal que el primer carácter coincidente está en la
   * misma posición en los dos arrays.
   *
   * CASOS DE USO:
   *   coincidentes( {} , a2 )                               -> {}
   *   coincidentes( a1, {}  )                               -> {}
   *   coincidentes( {'h'}, {'h'} )                          -> {'h'}
   *   coincidentes( {'h'}, {'a'} )                          -> {}
   *   coincidentes( {'h','o','l','a'}, {'h','o','l','i'} )  -> {'h','o','l'}
   *   coincidentes( {'h','o','l','a'}, {'o','l','a'} )      -> {}
   *   coincidentes( {'h','o','l','a'}, {'b','o','l','a'} )  -> {'o','l','a'}
   */

  public static char[] coincidentes(char[] a1, char[] a2){
    if (a1 == null || a2 == null){
      return new char[0];
    }

    int contador = 0;
    for (int i = 0; i < a1.length; i++) {
        if (a1[i] == a2[i]) {
            contador++;
        }
    }
    char[] resultado = new char[contador];

    int posicion = 0;
    for(int i = 0; i< a1.length; i++){
      if (a1[i] == a2[i]){
        resultado[posicion] = a1[i];
        posicion++;
      }
    }
    return resultado;

  }

  /* eliminarDuplicados(Array de caracteres a) -> Array de caracteres
   *
   * PRE: a no es null.
   *
   * POST: Función que devuelve un nuevo array de caracteres en la que se han
   * eliminado los caracteres duplicados en a. Los caracteres en el
   * resultado deben tener el mismo orden que en a.
   *
   * CASOS DE USO:
   *   eliminarDuplicados( {} )                        -> {}
   *   eliminarDuplicados( {'1'} )                     -> {'1'}
   *   eliminarDuplicados( {'1','4','2','4'} )         -> {'1','4','2'}
   *   eliminarDuplicados( {'1','1','2','2','3','3'} ) -> {'1','2','3'}
   */


  public static char[] eliminarDuplicados(char[] a) {
    if (a == null || a.length == 0) { 
        return new char[0];
    }
    
    // Primera pasada: contar caracteres únicos
    int contadorUnicos = 0;
    for (int i = 0; i < a.length; i++) {
        boolean esUnico = true;
        // Comprobar si este carácter ya apareció antes
        for (int j = 0; j < i; j++) {
            if (a[j] == a[i]) {
                esUnico = false;  // Encontramos un duplicado
                // Sin break - el bucle continúa comparando
                // pero ya sabemos que no es único
            }
        }
        if (esUnico) {
            contadorUnicos++;
        }
    }
    
    // Crear array resultado
    char[] resultado = new char[contadorUnicos];
    int indiceResultado = 0;
    
    // Segunda pasada: agregar caracteres únicos
    for (int i = 0; i < a.length; i++) {
        boolean esUnico = true;
        // Comprobar si este carácter ya está en el resultado
        for (int j = 0; j < indiceResultado; j++) {
            if (resultado[j] == a[i]) {
                esUnico = false;  // Encontramos un duplicado
                // Sin break - el bucle continúa
            }
        }
        if (esUnico) {
            resultado[indiceResultado] = a[i];
            indiceResultado++;
        }
    }
    
    return resultado;
}


  /* Una vez resueltos los ejercicios, se recomienda reescribirlos definiendo
   * las funciones o procedimientos auxiliares que se consideren adecuados
   * para descomponer el problema en sub-problemas más pequeños. Un criterio
   * que indica que una función auxiliar es adecuada es que se puede utilizar
   * en la solución de varios de los ejercicios.
   */

   /*
   * Por ejemplo, algunas de las funciones anteriores pueden implementarse
   * utilizando la siguiente función auxiliar, que también debe implementarse
   * como parte del laboratorio.
   *
   * PROCEDIMIENTO: copiar(array de caracteres origen,
   *                       entero origenPos,
   *                       entero origenFin,
   *                       array de caracteres destino,
   *                       entero destinoPos)
   *
   * PRE: origen no es null, destino no es null, origenPos < origenFin.
   *
   * POST: Copia al array "destino" los valores del array "origen" situados
   * entre el índice "origenPos" hasta el índice anterior a "origenFin". Los
   * valores son copiados en el array "destino" a partir de la posición
   * "destinoPos". Si "origen" o "destino" tienen tamaño cero, el
   * procedimiento no modifica "destino".
   *
   * Tal como se ha descrito, el procedimiento ejecutaría mediante bucles la
   * siguiente secuencia de asignaciones:
   *
   *    destino[destinoPos+0]   =   origen[origenPos+0];
   *    destino[destinoPos+1]   =   origen[origenPos+1];
   *    destino[destinoPos+2]   =   origen[origenPos+2];
   *             .                       .
   *             .                       .
   *             .                       .
   *    destino[destinoPos+(n-1)] =   origen[origenFin-1];
   *
   * Como ilustra la secuencia, el valor n es el número de elementos copiados,
   * esto es, origenFin - origenPos.
   *
   * Pueden asumirse las siguientes condiciones de rango: origenFin <=
   * origen.length y destinoPos+n <= destino.length.
   *
   * Por ejemplo, dados:
   *
   *    a1 = {'a','c','h','f','j'}
   *    origenPos = 1
   *    origenFin = 4
   *    a2 = {'1','3','7','8','4','5','9'}
   *    destinoPos = 2
   *
   * el procedimiento deja a2 con los valores {'1','3','c','h','f','5','9'}.
   *
   * CASOS DE USO:
   *
   *   copiar( {'a','b','c','d'}, 0, 4, destino es {'f','g','h','i'}, 0 )
   *   destino queda {'a','b','c','d'}
   *
   *   copiar( {'a','b','c','d'}, 1, 3, destino es {'f','g','h','i'}, 1 )
   *   destino queda {'f','b','c','i'}
   *
   *   copiar( {'a','b','c','d'}, 1, 3, destino es {'f','g','h','i'}, 2 )
   *   destino queda {'f','g','b','c'}
   *
   *   copiar( {'a','b','c','d'}, 1, 5, destino es {'f','g','h','i'}, 2 )
   *   destino queda {'f','g','b','c'}
   *
   *   copiar( {'a','b','c','d'}, 1, 5, destino es {'f','g','h','i'}, 4 )
   *   destino queda {'f','g','h','i'}
   *
   * Como ejercicio extra, se pide modificar el código para que asegure las
   * condiciones de rango.
   */
  // static void copiar(char[] origen, int origenPos, int origenFin, char[] destino, int destinoPos) {

  // }

  public static void main (String[] args) {

    char [] col1 =  {'a', 'b'};
    char [] col2 =  {'c', 'd'};
    char [] col6 =  {'c', 'b'};
    char [] col3 =  {};
    char [] col4 =  {};
    char [] jeje =  {'h','o','l','a'};
    char [] jaja =  {'h','o','l','i'};

    mostrarElementos(concatenar(col3, col4));
    mostrarElementos(insertar(col4, 0, 'C'));
    mostrarElementos(coincidentes(jeje, jaja));

  }

}
