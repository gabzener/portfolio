import java.util.Scanner;

public class SuitandTie {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[2 * n];

        for(int i = 0; i< 2*n; ++i) arr[i] = sc.nextInt();

        int contador = 0;

        for(int i = 0; i < 2 * n; i+=2){
            int j = i+1;
            int arr_temp = arr[i];
            while(arr[j] != arr_temp){
                j++;
            }
            while(j > i+1){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
                contador++;

            }

        }
        
        System.out.println(contador);


    }

    
}
