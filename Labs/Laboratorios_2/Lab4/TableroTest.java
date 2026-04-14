package Laboratorios_2.Lab4;
import Laboratorios_2.Lab3.Assert;

public class TableroTest {
  static void test1 () {
    String t4x4 =
      "   4   B N B N \n" +
      "   3   N B N B \n" +
      "   2   B N B N \n" +
      "   1   N B N B \n" + "\n" +
      "       a b c d \n";
    Tablero t = new Tablero(4);
    Assert.assertEquals(t4x4, t.toString());
  }
  static void test2 () {
    String t4x4 =
      "   4   B N B N \n" +
      "   3   N B N B \n" +
      "   2   B * B N \n" +
      "   1   N R N B \n" + "\n" +
      "       a b c d \n";
    Tablero t = new Tablero(4);
    t.poner(2,1,'R');
    Assert.assertEq(t.escaque(2,1), 'R');
    t.poner(2,2,'*');
    Assert.assertEq(t.escaque(2,2), '*');
    Assert.assertEquals(t4x4, t.toString());
  }
  public static void main(String[] args) {
    test1();
    test2();
    System.out.println("Han pasado todas las pruebas");
  }
}

