package Laboratorios_2.Lab4;

public class ReinaJugar
{
  public static void main (String[] args)
  {
    //int n = Integer.parseInt(args[0]);
    //Assert.assertEq(n>=0,true);
    Tablero t = new Tablero(8);
    Reina r = new Reina(3,8);
    r.ponerReina(t);
    System.out.println(t);
    r.marcarAmenazados(t);
    System.out.println(t);
  }
}
