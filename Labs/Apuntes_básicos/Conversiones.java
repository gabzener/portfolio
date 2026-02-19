
// En este documento voy a apuntar todas las conversiones posibles de todos los tipos de 
// literales de java.

public class Conversiones {

    /* Voy a empezar con el literal de tipo [int] */

    public static void intString(String [] args){
        int numero_temp = 5;
        String hola;

        hola = numero_temp + "";
        System.out.println(hola);
    }

    public static void intDouble(String [] args){
        int numero_temp = 5;
        double decimal = (double) numero_temp;
        System.out.println(decimal);
    }

    public static void intLong(String [] args){
        int numero_temp = 5;
        long grande = (long) numero_temp;
        System.out.println(grande);
    }
    
    /* Ahora seguirmos con el literal tipo [String] */

    public static void stringChar(String [] args){
        String str = "Hola";
        char[] caracteres = new char[str.length()]; //importante saber que podemos sacar la length 
                                                    // de un string.
        for (int i = 0; i < str.length(); i++) {
            caracteres[i] = str.charAt(i);
        }
    }

    public static void stringInvertido(String [] args){
        String original = "Java";
        String invertido = "";
        
        for (int i = original.length() - 1; i >= 0; i--) { //Importante saber esto.
            invertido += original.charAt(i); // Esa funcion charAt
        }
        System.out.println(original);
        System.out.println(invertido);
    }


}
