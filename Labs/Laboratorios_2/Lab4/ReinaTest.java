package Laboratorios_2.Lab4;

public class ReinaTest {
  static void test1 () {
    String t4x4 =
      "   4   B N B N \n" +
      "   3   N B N B \n" +
      "   2   B N B N \n" +
      "   1   N R N B \n" + "\n" +
      "       a b c d \n";
    Tablero t = new Tablero(4);
    Reina r = new Reina(2,1);
    r.ponerReina(t);
    Assert.assertEquals(t4x4, t.toString());
  }
  static void test2 () {
    String t4x4 =
      "   4   B N B N \n" +
      "   3   N B N B \n" +
      "   2   B N B N \n" +
      "   1   N B N B \n" + "\n" +
      "       a b c d \n";
    Tablero t = new Tablero(4);
    Reina r = new Reina(2,1);
    Assert.assertEq(t.escaque(2,1), 'B');
    r.ponerReina(t);
    Assert.assertEq(r.hayReina(t), true);
  }
  static void test3 () {
    Tablero t = new Tablero(4);
    Reina r = new Reina(2,1);
    r.ponerReina(t);
    Assert.assertEq(r.estaAmenazado(1,1) &&
                    r.estaAmenazado(3,1) &&
                    r.estaAmenazado(4,1), true);
    Assert.assertEq(r.estaAmenazado(1,2) &&
                    r.estaAmenazado(2,2) &&
                    r.estaAmenazado(3,2), true);
    Assert.assertEq(r.estaAmenazado(2,3) &&
                    r.estaAmenazado(4,3), true);
    Assert.assertEq(r.estaAmenazado(2,4), true);
  }
  static void test4 () {
    String t4x4 =
      "   4   B * B N \n" +
      "   3   N * N * \n" +
      "   2   * * * N \n" +
      "   1   * R * * \n" + "\n" +
      "       a b c d \n";
    Tablero t = new Tablero(4);
    Reina r = new Reina(2,1);
    r.ponerReina(t);
    r.marcarAmenazados(t);
    Assert.assertEquals(t4x4, t.toString());
  }
  public static void main(String[] args) {
    test1();
    test2();
    test3();
    test4();
    System.out.println("Han pasado todas las pruebas");
  }
}
