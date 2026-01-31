package Laboratorios;
/*
  Deben entregarse soluciones iterativas y recursivas de los ejercicios
  propuestos.

  Este fichero contiene solamente las cabeceras de los métodos iterativos.

  Deben definirse los métodos recursivos con el mismo nombre que los
  iterativos pero terminado en "Rec" (ver el ejemplo del método
  "mostrarElementos").
 */

class Lab9 {

  /*
   * PROCEDIMIENTO mostrarElementos(array de enteros arr)
   * PRE: arr no es null.
   * POST: muestra por pantalla los elementos del array arr entre llaves y
   *       separados por comas. Si arr no tiene elementos entonces muestra {}.
   */

  // VERSIÓN ITERATIVA.
  static void mostrarElementos(int[] arr) {
    System.out.print("{");
    if (arr.length > 0) {
      for (int i = 0; i < arr.length-1 ; ++i)
        System.out.print(arr[i] + ",");
      System.out.print(arr[arr.length-1]);
    }
    System.out.println("}");
  }

  // VERSIÓN RECURSIVA: el nombre termina en "Rec".
  static void mostrarElementosRec(int [] arr) {
    System.out.print("{");
    if (arr.length > 0)
      mostrarElementosRecAux(0, arr);
    System.out.println("}");

  }
  // Puede elegirse el nombre de la función auxiliar, que debe tener relación
  // con lo que hace el método.
  static void mostrarElementosRecAux(int i, int [] arr) {
    if (i == arr.length-1)
      System.out.print(arr[i]);
    else {
      System.out.print(arr[i] + ",");
      mostrarElementosRecAux(i+1, arr);
      //System.out.println((i == arr.length-1?arr[i]: arr[i] + ","));
    }
  }

  /* FUNCIÓN copiar(array de enteros arr) -> array de enteros
   * PRE: arr no es null.
   * POST: retorna un nuevo array de enteros con los mismos elementos que arr
   *       en el mismo orden posicional.
   * CASOS DE USO:
   *   copiar({1,2,3}) -> {1,2,3}
   *   copiar({}) -> {}
   */

  public static int[] copiar(int[] arr) {
    int [] nuevo = new int[arr.length];
    for (int i = 0; i < arr.length; i++){
      nuevo[i] = arr[i];

    }//return arr[i]+copia(arr,i++)
    return nuevo;
  }

  private static int[] copiarRecAux(int[] original, int[] copia, int indice) {
      if (indice == original.length) {
          return copia;
      }
      copia[indice] = original[indice];
      return copiarRecAux(original, copia, indice + 1);
  }

  public static int[] copiarRec(int[] arr) {
    int[] resultado = new int[arr.length];
    if (arr.length == 0) {
      return resultado;
    }
    return copiarRecAux(arr, resultado, 0);
  }
  /* Para el resto de ejercicios debéis definir vosotros las funciones recursivas */

  /*
   * FUNCIÓN multiplicarEscalarCopia(array de enteros arr, entero n) -> array de enteros
   * PRE: longitud de arr > 0
   * POST: retorna un nuevo arrray con los valores de arr
   *       multiplicados por el número n.
   * CASOS DE USO:
   *     multiplicarEscalarCopia([4, 6, 5, 2], 2) -> [8, 12, 10, 4]
   *     multiplicarEscalarCopia([0, 2, 4], -1) -> [0, -2, -4]
   *     multiplicarEscalarCopia([4, 6, 5, 2], 0) -> [0, 0, 0, 0]
   */

  public static int[] multiplicarEscalarCopia(int[] arr, int n) {
    int [] resultado = new int[arr.length];
    int operador;
    for ( int i = 0; i < arr.length; i++){
      operador = arr[i];
      resultado[i] = operador * n;

    }
    return resultado;
  }

  public static int[] multiplicarEscalarCopiaRecAux(int []arr,int [] resultado, int n, int i){
    int operador;
    if (i == arr.length){
      return resultado;
    }
    operador = arr[i];
    resultado[i] = operador * n;
    return multiplicarEscalarCopiaRecAux(arr,resultado, n, i+1);
  }

  public static int[] multiplicarEscalarCopiaRec(int [] arr, int n){
    int [] resultado = new int[arr.length];
    return multiplicarEscalarCopiaRecAux(arr,resultado, n, 0);
  }

  /*
   * FUNCIÓN sustituirNumero(array de enteros arr, entero buscado, entero reemplazo)
   *         -> array de entero
   * PRE: longitud de arr > 0.
   * POST: retorna arr pero con las posiciones que contengan
   *       el valor 'buscado' reemplazadas por el valor 'reemplazo'.
   * CASOS DE USO:
   *     sustituirNumero([4, 6, 5, 2], -7, 9) -> [4, 6, 5, 2]
   *     sustituirNumero([0, 2, 0], 0, 10) -> [10, 2, 10]
   */

  public static int[] sustituirNumero(int[] arr, int buscado, int reemplazo) {
    int [] resultado = new int[arr.length];
    for (int i = 0; i < arr.length; i++){
      resultado[i] = arr[i] == buscado ? reemplazo: arr[i];
      // if (arr[i] == buscado){
      //   resultado[i] = reemplazo;
      // } else{
      //   resultado[i] = arr[i];
      // }

    }
    return resultado;

  }
  public static int[] sustituirNumeroRecAux(int[]arr,int [] resultado, int buscado, int reemplazo, int i){
    if (i< arr.length){
      resultado[i] = arr[i] == buscado ? reemplazo : arr[i];

    } else{
      return resultado;
    }
    return sustituirNumeroRecAux(arr, resultado, buscado,reemplazo, i+1);

  }

  public static int[] sustituirNumeroRec(int[]arr, int buscado, int reemplazo){
    int [] resultado = new int[arr.length];
    return sustituirNumeroRecAux(arr,resultado, buscado, reemplazo, 0);
  }

  /* FUNCIÓN invertirNuevo(array de enteros arr) -> array de enteros
   * PRE: arr no es null.
   * POST: devuelve un nuevo array de enteros con los
   *       valores de arr en orden posicional inverso.
   * CASOS DE USO:
   *   invertirNuevo({1,2,3}) -> {3,2,1}
   *   invertirNuevo({}) -> {}
   */

  public static int[] invertirNuevo(int[] arr) {
    int [] resultado = new int[arr.length];
    for ( int i = 0; i < arr.length; i++){
      resultado[i] = arr[arr.length - 1 - i];
    }
    return resultado;

  }

  public static int[] invertirNuevoRecAux(int[] arr, int[] resultado, int i){
    if (i< arr.length){
      resultado[i] = arr[arr.length - 1 - i];
    } else{
      return resultado;
    }

    return invertirNuevoRecAux(arr, resultado, i+1);
  }

  public static int[] invertirNuevoRec(int[] arr){
    int [] resultado = new int[arr.length];
    return invertirNuevoRecAux(arr,resultado, 0);
  }


  /* FUNCIÓN invertir(array de enteros arr) -> array de enteros
   * PRE: arr no es null.
   * POST: devuelve arr pero con sus elementos en orden posicional inverso.
   * CASOS DE USO:
   *   invertir({1,2,3}) -> {3,2,1}
   *   invertir({}) -> {}
   */

  public static int[] invertir(int[] arr) {
    for ( int i = 0; i < arr.length; i++){
      arr[i] = arr[arr.length - 1 - i];
    }
    return arr;

  }

  public static int[] invertirRecAux(int[] arr, int i){
    if (i< arr.length){
      arr[i] = arr[arr.length - 1 - i];
    } else{
      return arr;
    }

    return invertirRecAux(arr, i+1);
  }

  public static int[] invertirRec(int[] arr){
    return invertirRecAux(arr, 0);
  }

  /*
   * FUNCIÓN hayValoresIgualesConsecutivos(array de enteros arr) -> booleano
   * PRE: longitud de arr > 0.
   * POST: Devuelve verdadero si existen dos valores iguales consecutivos
   *       en el array arr.
   * CASOS DE USO:
   *     hayValoresIgualesConsecutivos([2,-55,0,-4,42]) -> falso
   *     hayValoresIgualesConsecutivos([80,0,-80,41]) -> falso
   *     hayValoresIgualesConsecutivos([80,0,0,-80,41]) -> verdadero
   *     hayValoresIgualesConsecutivos([80,0,-80,4,4]) -> verdadero
   */
  public static boolean hayValoresIgualesConsecutivos(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
          if (arr[i] == arr[i + 1]) {
              return true;
          }
      }
      return false;
  }

public static boolean hayValoresIgualesConsecutivosRecAux(int[] arr, int i) {
    if (i >= arr.length - 1) {
        return false;
    }
    if (arr[i] == arr[i + 1]) {
        return true;
    }
    return hayValoresIgualesConsecutivosRecAux(arr, i + 1);
}

  public static boolean hayValoresIgualesConsecutivosRec(int[]arr){
    return hayValoresIgualesConsecutivosRecAux(arr, 0);
  }

  /* ********************************************************************************** */
  public static void main(String[] args) {

    int [] col1 = {1,2,3};
    mostrarElementos(copiar(col1));
    mostrarElementos(copiarRec(col1));
    mostrarElementos(multiplicarEscalarCopia(col1, 5));
    mostrarElementosRec(multiplicarEscalarCopiaRec(col1,5));
    mostrarElementos(sustituirNumeroRec(col1, 2, 0));
    mostrarElementos(invertirNuevo(col1));
    mostrarElementos(invertirNuevoRec(col1));
    mostrarElementos(invertir(col1));
    mostrarElementos(invertirRec(col1));
    System.out.println(hayValoresIgualesConsecutivosRec(col1));
  }
}
