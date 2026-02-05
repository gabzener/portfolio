package Laboratorios;

// Ejercicios del 2P Progra 1 9/1/2026

public class LabCustom {

// (Usado para las funciones auxiliares (private)) [public] controlador de visibilidad [static] orientado a objetos.

int [] a = null;
// Esto es una declaracion
int [] arr = new int[4];
//Esto es una inicializacion

// for ( i = 0; i < a.length && a[i] != e; ++i)
//   i == a.length || i < a.length && a [i] == e

  public static void buscar(int [] a, int s){ 

  }




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

  public static char[] insertarArray(char[] original, int n, char[] sustitucion){
    if(original == null || sustitucion == null){
      return null;
    } else if(n >= 0 || original.length <= 0){
      return null;
    }
    


    }

  }
