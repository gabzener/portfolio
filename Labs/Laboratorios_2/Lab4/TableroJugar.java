

package Laboratorios_2.Lab4;
import Laboratorios_2.Lab3.Assert;

class TableroJugar
{
  public static void main (String[] args)
  {
    int n = Integer.parseInt(args[0]);
    Assert.assertEq(n>=0,true);
    Tablero t = new Tablero(n);
    System.out.println(t);
  }
}