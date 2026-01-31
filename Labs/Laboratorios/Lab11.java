package Laboratorios;
/*
 * autor: Clara Benac Earle
 *
 * Matrices
 *
 */

class Lab11{

    /* FUNCION: sumElements(matrix of integer m) -> integer
     * PRE: m no es null
     * POST: el resultado es la suma de los elementos en m
     * EJEMPLO:
     *   sumElements([[1,2],[3,4]]) -> 10
     *   sumElements([[2,2],[1,1]]) -> 6
     */

    static int sumElements(int[][]m){
        int sum = 0;
        // recorre filas
        for (int i = 0; i < m.length; i++){
            // recorre columnas
            for (int j = 0; j < m[0].length; j++){
                sum = sum + m[i][j];
            }
        }
        return sum;
    }

    /* PROCEDIMIENTO: mostrarMatriz(matriz de enteros m)
     * PRE: m no es null
     * POST: muestra los elementos de una matriz
     * CASOS DE USO:
     *   showMatrix([[1,2],[3,4]]) -> 1 2
     *                                3 4
     */

    static void mostrarMatriz(int [][] m){
        String result = "";
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                result = result + m[i][j] + " ";
            }
            result = result + "\n";
        }
        System.out.println(result);
    }

    /* FUNCION: identity(entero n) -> matriz de enteros
     * PRE: n > 0
     * POST: el resultado es la matriz identidad de tamaño n, es decir, una
     * matriz n * n con unos en la diagonal y ceros en el resto.
     * CASOS DE USO:
     *   identity(1) -> 1
     *   identity(3) -> 1 0 0
     *                  0 1 0
     *                  0 0 1
     *
     */

    public static int[][] identity(int n){
        int [][] matrizidentidad = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j< n; j++){
                if (i == j){
                    matrizidentidad[i][j] = 1;
                } else{
                    matrizidentidad[i][j] = 0;
                }
            }
        }
        return matrizidentidad;
    }



    /* FUNCION: equals(matrices de enteros m1, m2) -> boolean
     * PRE: m1 y m2 no son null, m1.length > 0, m2.length > 0
     * POST: el resultado es true si m1 y m2 tienen los mismos
     * elementos y en el mismo orden y false e.o.c.
     *
     * CASOS DE USO:
     *   equals([[1,2],[3,4]],[[1,1],[2,2]]) -> false
     *   equals([[1,2],[3,4]],[[1,2],[3,4]]) -> true
     */

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1 == m2) return true;
        if (m1 == null || m2 == null) return false;
        if (m1.length != m2.length) return false;
        
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) return false;
            
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }

    /* FUNCION: sumMatrices(matrices de enteros m1, m2) -> matriz de enteros
     * PRE: m1 y m2 no son null. m1 y m2 son del mismo tamaño
     * POST: el resultado es una nueva matriz donde cada elemento en la fila
     * i y columna j es la suma de los elementos de la fila i y columna j
     * de m1 y m2
     *
     * CASOS DE USO:
     *   sumMatrices([[1,2],[3,4]],[[1,1],[2,2]]) -> [[2,3],[5,6]]
     */

    public static int[][] sumMatrices(int[][]m1,int[][]m2){
        int[][] resultado = new int[m1.length][m1.length];
        for(int i= 0; i<m1.length; i++){
            for(int j = 0; j<m1[i].length; j++){
                resultado[i][j] = m1[i][j] + m2[i][j];
            }
            
        }
        return resultado;
    }


    /* FUNCION: findN(matriz de enteros m, int n) -> boolean
     * PRE: m no es null
     * POST: el resultado es true si n está en m y false e.o.c
     *
     * CASOS DE USO:
     *   findN([[1,2],[3,4]],3) -> true
     *   findN([[1,2],[3,4]],5) -> false
     */

    public static boolean findN(int[][] m, int n){
        boolean resultado = false;
        for(int i = 0; i<m.length; i++){
            for(int j = 0; j <m[i].length; j++){
                if(m[i][j] == n){
                    return true;
                }
            }
        }
        return resultado;

    }


    public static void main(String[] args){

        int [][] mat1 = {{1,2},{3,4}};
        int [][] mat2 = {{1,1},{2,2}};
        mostrarMatriz(identity(4));
        System.out.println(equals(mat1, mat2));
        mostrarMatriz(sumMatrices(mat1, mat2));
        System.out.println(findN(mat1, 4));
        
    }

}
