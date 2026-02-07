package Laboratorios;

// Ejercicios del 2P Progra 1 9/1/2026

public class LabCustom {


    /*Se pide implementar usando iteración o recursión la siguiente especificación. 

      FUNCIÓN: esIdentidad(array de array de enteros m) -> boolean      
      PRE: m no es null, m es una matriz cuadrada      
      POST: devuelve true si todos los elementos de m en la 
      diagonal principal son 1 y el resto de elementos son 0.
      Devuelve false en otro caso.
      CASOS DE USO:
        esIdentidad({{}}) -> true
        esIdentidad({{1}}) -> true
        esIdentidad({{5}}) -> false
        esIdentidad({{1,0},{0,1}}) -> true
        esIdentidad({{0,0},{0,1}}) -> false
    */
  
  /* Para entender este ejercicio debemos verlo por partes:
  - Para que una matriz sea identidad debemos:
    - Comprobar que es cuadrada
    - Comprobar que la diagonal son todo 1
    - Comprobar que el resto de numeros son 0
    - Además cumplir las PRE que son que m no sea null. */

  public static boolean esIdentidad(int [][] m){
    if (m.length == 0){ // primero comprobamos que la matriz m no es null
      return true;
    }
    for (int i = 0; i < m.length; ++i){ //posteriormente empezamos con el analísis de la matriz.
      if (m[i].length != m.length){ //comprobamos si es cuadrada, y además si la diagonal está compuesta por 1.
        return false;
      } else if (m[i][i] != 1){
        return false;
      }
      for(int j = 0; j < m[i].length; ++j){ // Luego comprobamos si cualquiera de los otros numeros es 0.
        if (m[i][j] != 0 && i != j){
          return false;
        }
      }

    }
    return true; // Y si ninguna de las otras condiciones se cumple entonces es identidad y devolvemos true.
    
  }

/* Las matrices se entienden de forma que son un array de arrays:

          int [][] m {
                                                                                        -|
                  {1,0,0}, --> m[1].length = 3 Cantidad de elementos en el primer array. | 
                  {0,1,0}, --> m[2].length = 3 cantidad de elementos en el segundo array.| Todo esto es m.length:
                  {0,0,1}  --> m[3].length = 3 cantidad de elementos en el tercer array. | La longitud del array de arrays, es decir cuantas filas hay.
                                                                                        -|
Aquí vemos que en el primer [] es el número de arrays,  y el segundo [] es la cantidad de elementos que tienen
los arrays internos.
Pero esto no acaba aquí, ya que las length son distintas.
*/



    /*Se pide implementar usando RECURSIÓN la siguiente especificación. 

   PROCEDIMIENTO: acumulaSumas(array de enteros arr) 
      PRE: arr no es null
      EFECTO: se modifica el array arr de la siguiente manera: 
      En cada posición i se almacena la suma de los elementos desde 0 hasta i.
      CASOS DE USO:

        acumulaSumas({}) no hace nada
        acumulaSumas({2}) no hace nada.
        acumulaSumas({2,3}) modifica el array con el resultado {2,5}.
        acumulaSumas({2,3,4}) modifica el array con el resultado {2,5,9}
        acumulaSumas({2,3,4,1}) modifica el array con el resultado {2,5,9,10}

   */

  public static void acumulaSumas(int [] arr){ //Dado que es un proceso se añade void 
    if (arr == null || arr.length <= 1){ //AQuí complimos el PRE y el 2 caso de uso
      return;
    } else{
      acumulaSumasAux(arr, 1, arr[0]); //Dado que es con recursion, debemos crear una funcion auxiliar
    }
  }

  public static void acumulaSumasAux(int [] arr, int i, int acumulado){

    if (i >= arr.length){ //Condicion de parada, cuando ya ha recorrido todos los elementos.
      return;
    }
// Fijarnos que la condicion de parada va antes de todo.
    acumulado += arr[i]; // el arr[0] se le suma al siguiente elemento que es el arr[1]
    arr[i] = acumulado; // luego sustituimos el arr[1] con ese valor

    acumulaSumasAux(arr, i +1, acumulado); //y vuelta a empezar.

  }

  /* Aquí la clave de este ejercicio es que la cantidad de elementos en el array [arr.length] es igual al index
  
  Si tenemos un array:
  {1,2,3,4,5,6} --> arr.length = 6
   0 1 2 3 4 5
  Pero no será lo mismo en la enumeracion de los elementos. Este es el punto clave, el index que recorre todos los elementos
  debe para cuando sea igual a arr.length y empezar a sumar con arr[0] porque no hay forma de el index pase por el primer elemento.
  Es por esto por lo que debemos directamente pasarle a la funcion auxiliar el arr[0] del array a sumar.*/


    /*Se pide implementar usando ITERACIÓN la siguiente especificación. 

    FUNCIÓN: insertarArray(array de caracteres a, entero pos, array de caracteres b) 
     *                                            -> array de caracteres
     * PRE: a no es null, b no es null, pos >= 0, pos <= a.length
     * POST: el resultado es un nuevo array donde aparecen en primer lugar
     los elementos que el array a tiene en las posiciones desde 0 hasta pos-1, 
     después todos los elementos del array b, y por último los elementos
     del array a que ocupan las posiciones desde pos hasta a.length-1.
     * CASOS DE USO:
     * insertarArray( { }, 0, { } )  -> { }
     * insertarArray( {'a','b'}, 0, { } ) -> {'a', 'b'}
     * insertarArray( {'a','b'}, 1, { } ) -> {'a', 'b'}
     * insertarArray( { }, 0, {'x','y'} ) -> {'x', 'y'} 
     * insertarArray( {'a','b'}, 0, {'x','y'} ) -> {'x', 'y', 'a', 'b'}
     * insertarArray( {'a','b'}, 1, {'x','y'})  -> {'a','x','y','b'}
     * insertarArray( {'a','b'}, 2, {'x','y'} ) -> {'a','b','x','y'}
     * insertarArray( {'a','b','c'}, 0, {'x','y'} ) ->{'x','y','a','b','c'}
    */

  public static char[] insertarArray(char[] original, int pos, char[] sustitucion){
    if ( pos < 0){
      return null;
    }

    char [] resultado = new char[original.length + sustitucion.length];
    int indice = 0;

    for(int i = 0; i<pos; ++i){ // El buble iguala los elementos de original al resultado hasta pos
      resultado[i] = original[i];
      indice++; //Guardamos en que posicion del array resultado estamos
    }

    for(int i = 0; i<sustitucion.length; ++i){ // Luego recorriendo el segundo array igualamos los elementos de este
      resultado[indice] = sustitucion[i]; // Usamos indice en vez de i para seguir recorriendo el array resultado correctamente
      indice++;
    }

    for(int i = pos; i<original.length; ++i){ //Recorremos de nuevo el primer array, teniendo en cuenta que empezamos en pos
      resultado[indice] = original[i]; //       porque pos no puede ser mayor a original.length, hasta original.length
                                              // con indice para terminar de recorrer el array resultado.
    }

    return resultado;
    }

    /* La clave de est ejercicio es saber que los arrays se deben recorrer con un index es decir, cada vez que hacemos una
    sustitucion de un elemento debemos hacer i+1 para asegurarnos que la proxima sustitucion será en la siguiente posicion. 
    Este indice no solo traquea nuestra posicion en el array, sino que nos ayuda a llevar una cuenta cuando debemos usar varios
    arrays distintos. Imaginémoslo así:

     [  0 1 2 3          4 5 6 7  ] --> length = 8 (Para el buble indice < .length (8))
     | {a,b,c,d} |    | {e,f,g,h} |
     |  0 1 2 3  |    |  0 1 2 3  |
    Cada uno de estos arrays tiene 0,1,2,3 de posiciones. Para poder seguirlos, en los bucles debemos seguir
    ese orden, pero para seguir en un metodo mas global hace falta otro contador que nos indique en que posicion global nos encontramos.
    Lo podemos ver tambien como que para cada bucle que sigue un array, está el indice del for, pero para seguir un array global debemos
    hacer un indice global que aumente con cada bucle que sigue a cada array.
    
    */


  }
