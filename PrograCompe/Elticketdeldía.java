import java.util.Scanner;
class Elticketdeldía {

    final static java.util.Scanner scan = new Scanner(System.in);

    public static String funcion(){
        int temp = leerInt();
        if(!esInteresante(temp)){
            return "" + hastaInteresante(temp);
        } else {
            return "INTERESANTE";
        }
    }
    public static boolean esInteresante(int n){
        if ((n%1234 == 0) || (n%4321 == 0)){
            return true;
        } else if (esPalindromo(n)){
            return true;
        } else {
            return false;
        }
    }
    public static int hastaInteresante(int m){
        int contador = 0;
        while(!esInteresante(m)){
            m++;
            contador++;
        }
        return contador;
    }
    public static int leerInt() {
        String linea = scan.nextLine().trim();
        while (linea.isEmpty()) {
            linea = scan.nextLine().trim();
        }
        return Integer.parseInt(linea);
    }
    public static boolean esPalindromo(int n){
        String lol = "" + n;
        char [] arr = lol.toCharArray();
        for (int i = 0; i< arr.length; ++i){
            if(arr[i] != arr[arr.length - i - 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        int pruebas = leerInt();
        for(int i = 0; i< pruebas; ++i){
            System.out.println(funcion());
            System.out.flush();
        }
    }
}