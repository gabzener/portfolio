

package Laboratorios_2.Lab4;

class TableroJugar
{
public static void main (String[] args)
{
    try {
        Tablero t = new Tablero(8);
        System.out.println("Tablero creado correctamente");
        System.out.println(t);
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        e.printStackTrace();
    }
}
}