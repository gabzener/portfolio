package Laboratorios;

//Este Lab se trata de algoritmos de ordenación, no es necesario hacerlo para Programación I.


class Lab12{

    /*
     * PROCEDIMIENTO mostrarElementos(array de enteros arr)
     * PRE: no es null
     * POST: este procedimiento muestra por pantalla los elementos
     * contenidos en arr entre llaves y separados por comas.
     * Si arr no tiene elementos, muestra {}
     */

    static void mostrarElementos(int[] arr){
        if(arr.length == 0)
            System.out.println("{}");
        else{
            System.out.print("{");
            for (int i = 0; i < arr.length-1 ; ++i)
                System.out.print(arr[i] + ",");
            System.out.println(arr[arr.length-1] + "}");
        }
    }

    /* PROCEDIMIENTO: ordenarInsercion(array de enteros arr)
     * PRE: arr no es null
     * POST: este procedimiento ordena los elementos de arr en orden
     * ascendente utilizando el metodo de insercion
     * si arr es [4,3,2] lo convierte a [2,3,4]
     */

    public static int[] ordenarInsercion(int [] arr){
        int [] resultado = new int[arr.length];
        for(int i = 1; i< arr.length; i++){
            if(arr[i]< arr[i - 1]){
                resultado[i] = arr[i - 1];
                resultado[i - 1] = arr[i];
            }
        }
        return resultado;
    }






    /* FUNCION: busquedaBinariaR(array de enteros arr, int n) -> boolean
     * PRE: arr no es null
     * POST: el resultado es true si n esta en arr y false e.o.c.
     * Se pide una implementacion recursiva
     *   busquedaBinariaR([1,2,3,4],6) -> false
     *   busquedaBinariaR([1,2,3,4],3) -> true
     */

 

    /*
     * PROCEDIMIENTO: ordenar(array de enteros arr)
     * PRE: arr no es null
     * POST: este procedimiento ordena los elementos de arr en orden
     * ascendente utilizando algun metodo de ordenacion.
     * Se debe comentar que metodo se usa
     *   si arr es [4,3,2] lo convierte a [2,3,4]
     */

  
    public static void main(String[] args){
        int [] col1 = {7,6,5};
        mostrarElementos(ordenarInsercion(col1));
        
    }

}
