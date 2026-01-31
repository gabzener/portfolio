package Laboratorios;
/*
 * autora: Clara Benac Earle
 * autor:
 *
 * Ejercios de arrays
 *
 * El desarrollo de la práctica se realizará de la forma habitual. Para cada especificación
 * se implementa la función o procedimiento indicado y se escriben las pruebas en main 
 * para comprobar su funcionamiento. Una vez implementadas todas las especificaciones y 
 * hechas las pruebas necesarias, se entregará a través de la plataforma DeliverIt disponible en
 * https://deliverit.fi.upm.es/
 */


class Lab7{
    
    /*
     * sumaElementos(array de enteros nums) -> entero
     * PRE: nums no es null, la longitud del array es mayor que 0
     * POST: el resultado es la suma de todos los elementos de nums
     * CASOS DE USO:
     *   sumaElementos([1,2,4]) = 7
     *   sumaElementos([8]) = 8
     *   sumaElementos([1,6,3,0,0]) = 10
     */

    static int sumaElementos(int[] nums){
	int resultado = 0;
	for (int i = 0; i < nums.length; i++)
	    resultado = resultado + nums[i];
	return resultado;

    }

    /*
     * sumaElementosPares(array de enteros nums) -> entero
     * PRE: nums no es null, la longitud del array es mayor que 0
     * POST: el resultado es la suma de todos los elementos pares de nums
     * CASOS DE USO:
     *   sumaElementosPares([1,2,4]) = 6
     *   sumaElementosPares([8]) = 8
     *   sumaElementosPares([7]) = 0
     *   sumaElementosPares([1,6,3,0,0]) = 6
     */

    public static int sumaElementosPares(int[] elementos){
        int resultado = 0;
        for (int i = 0; i < elementos.length; i++)
            resultado = resultado + (elementos[i]%2 == 0? elementos[i]:0);
//            if (elementos[i]%2 == 0)
//                resultado = resultado + elementos[i];
        return resultado;


    }

    /* sumaElementosPosicionesPares(array de enteros nums) -> entero
     * PRE: nums no es null, la longitud del array es mayor que 0
     * POST: el resultado es la suma de todos los elementos en las posiciones pares
     * de nums.
     * CASOS DE USO:
     *   sumaElementosPosicionesPares([1,2,4]) = 5
     *   sumaElementosPosicionesPares([8]) = 8
     *   sumaElementosPosicionesPares([7]) = 7
     *   sumaElementosPosicionesPares([1,6,3,0,4]) = 8
     */

    public static int sumaElementosPosicionesPares(int[] elementos){
        int resultado = 0;
        for (int i = 0; i < elementos.length; i+=2)
            resultado = resultado + elementos[i];
        return resultado;
    }
    
    /* estaN(array de enteros nums, int n) -> boolean
     * PRE: nums no es null
     * POST: el resultado es true si n esta en nums y false e.o.c.
     * CASOS DE USO:
     * estaN([3,2,5,2,8,1],2) -> true
     * estaN([3,2,5,2,8,1],7) -> false
     * estaN([],2) -> false
     * estaN([2],2) -> true
     */

    public static boolean estaN(int []elementos, int n){
        boolean encontrado = false;
        for (int i = 0; i < elementos.length && !encontrado; i++) // if (elemento[i] == n)
            encontrado = (elementos[i] == n);                   //       resultado = true;

        return encontrado;
    }

    /* cuantosN(array de enteros nums, int n) -> int
     * PRE: nums no es null
     * POST: el resultado es el numero de veces que n aparece en nums
     * CASOS DE USO:
     * cuantosN([3,2,5,2,8,1],2) -> 2
     * cuantosN([3,2,5,2,8,1],7) -> 0
     * cuantosN([],2) -> 0
     * cuantosN([2],2) -> 1
     */

    public static int cuantosN(int[] elementos, int n) {
        int resultado = 0;
        for (int i = 0; i < elementos.length; i++) {
            resultado += (elementos[i] == n) ? 1 : 0; // Importante
        }
        return resultado;
    }

    /* todosN(array de enteros nums, int n) -> boolean
     * PRE: nums no es null
     * POST: el resultado es true si todos los elementos de nums son n
     * y false e.o.c,
     * CASOS DE USO:
     * todosN([3,2,5,2,8,1],2) -> false
     * todosN([],2) -> true
     * todosN([2],2) -> true
     * todosN([2,2,2],2) -> true
     */

    public static boolean todosN(int[] nums, int n) {
        boolean resultado = true;
        for (int i = 0; i < nums.length && (nums [i] != n); i++) {
            resultado = false;
        }
        
        return resultado;
    }


    /* maxElemento(array de enteros nums) -> entero
     * PRE: nums no es null, la longitud del array es mayor que 0
     * POST: el resultado es el numero mayor en nums
     * CASOS DE USO:
     * maxElemento([2,5,3,6,8,1]) -> 8
     * maxElemento([2]) -> 2
     * maxElemento([1,4,10,3,6,1]) -> 10
     * maxElemento([-10,-4,-6]) -> -4
     */

    public static int maxElemento(int [] nums){
        int maximo = nums[0];
        for (int i = 0; i < nums.length; i++){
            maximo = (nums[i] > maximo) ? nums[i]: maximo;
        }
        return maximo;
    }

    /* iguales(array de enteros nums1, array de enteros nums2) -> boolean
     * PRE: nums1 y nums2 no son null
     * POST: el resultado es true si todos los elementos de nums1 están en nums2
     * y viceversa, y en el mismo orden y false e.o.c.
     * CASOS DE USO:
     *   iguales([1,2,3],[1,2,3]) -> true
     *   iguales([1,2,3],[1,2]) -> false
     *   iguales([1,2,3],[1,2,3,3]) -> false
     */

    public static boolean iguales(int []nums1, int [] nums2){
        boolean resultado = false;
        for (int i = 0; i < nums1.length && i < nums2.length; i++){
            resultado = (nums1[i] == nums2[i]);

        
        }
        return resultado;
    }

    public static void main(String[] args){

        int [] col1 = {2, 4, 8, 3};
        int [] colnula = {};
        int [] col2 = {8,8,8,8,8};
        int [] col3 = {-1, -6, -8};
        int [] colnula2 = {2};
        int [] coll2 = {1,2,3};
        int [] coll3 = {1,2};

        //Pruebas
        boolean prueba1 = (sumaElementosPares(col1) == 14);
        boolean prueba2 = (sumaElementosPosicionesPares(col1) == 10);
        boolean prueba3 = (estaN(col1, 8) == true);
        boolean prueba4 = (todosN(col2, 8) == true);
        boolean prubea5 = (maxElemento(col1) == 8);
        boolean prueba6 = (iguales(coll2, coll3) == true);
        boolean probando = prueba1 && prueba2 && prueba3;
        System.out.println("Las funciones" + (probando? " funcionan.": " fallan."));
        System.out.println("Las funcion 4" + (prueba4? " funciona.": " falla."));
        System.out.println("Las funcion 5" + (prubea5? " funciona.": " falla."));
        System.out.println("Las funcion 6" + (prueba6? " funciona.": " falla."));
        //System.out.println(cuantosN(col1, 8));
        //System.out.println(todosN(col1, 4));

    }
}
