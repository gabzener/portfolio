package First_Exercices;

// Ejemplo muy basico del uso de Scanner.

import java.util.Scanner;


public class Ex {


    static Scanner sc = new Scanner(System.in);
    static int ejemplo = sc.nextInt();

    public static int funcion(int n){
        return n;
    }


    public static void main(String [] args){
        System.out.println(funcion(ejemplo));

    }


}
