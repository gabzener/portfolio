

import java.util.Scanner;

public class SuitandTie {
    final static java.util.Scanner scan = new Scanner(System.in);


    public static int ordenar(int [] array, int num_parejas){
        int resultado = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == num_parejas){

            }
        }

        return resultado;

    }

    /*public static int ordenar(int [] array){
        int resultado = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    resultado++;
                }
            }
        }

        return resultado;

    } */

    public static void main(String [] args){
        int num_parejas = scan.nextInt();
        int num_personas = 2 * num_parejas;
    
        int [] personas = new int [num_personas];

        for( int i = 0; i<num_personas; ++i){
            personas[i] = scan.nextInt();
        }

        System.out.println(ordenar(personas, num_parejas));
        
    }



    
}
