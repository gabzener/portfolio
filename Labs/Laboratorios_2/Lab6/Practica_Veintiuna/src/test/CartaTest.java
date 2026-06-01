package test;

import Laboratorios_2.Lab6.Practica_Veintiuna.src.veintiuna.*;

public class CartaTest {

  // Usa estos atributos de clase para manejar los datos de las cartas.
  private static final String[] PALO = { "Oros", "Espadas", "Bastos", "Copas" };
  private static final String[] NUMERO = { "As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey" };
  private static final int[] VALOR = { 11, 2, 3, 4, 5, 6, 7, 10, 10, 10 };

  static void test1 () {
    Carta c = new Carta(0); // As de Oros
    Assert.assertEquals(c.numero(), NUMERO[0]);
    Assert.assertEquals(c.palo(), PALO[0]);
    Assert.assertEquals(c.valor(), VALOR[0]);
    Assert.assertEquals(c.toString(), "As de Oros");
  }

  static void test2 () {
    Carta c = new Carta(11); // Dos de Espadas
    Assert.assertEquals(c.numero(), NUMERO[1]);
    Assert.assertEquals(c.palo(), PALO[1]);
    Assert.assertEquals(c.valor(), VALOR[1]);
    Assert.assertEquals(c.toString(), "2 de Espadas");
  }

  static void test3 () {
    Carta c = new Carta(27); // Sota de Bastos
    Assert.assertEquals(c.numero(), NUMERO[7]);
    Assert.assertEquals(c.palo(), PALO[2]);
    Assert.assertEquals(c.valor(), VALOR[7]);
    Assert.assertEquals(c.toString(), "Sota de Bastos");
  }

  static void test4 () {
    Carta c = new Carta(38); // Caballo de Copas
    Assert.assertEquals(c.numero(), NUMERO[8]);
    Assert.assertEquals(c.palo(), PALO[3]);
    Assert.assertEquals(c.valor(), VALOR[8]);
    Assert.assertEquals(c.toString(), "Caballo de Copas");
  }

  static void test5 () {
    Carta c = new Carta(9); // Rey de Oros
    Assert.assertEquals(c.numero(), NUMERO[9]);
    Assert.assertEquals(c.palo(), PALO[0]);
    Assert.assertEquals(c.valor(), VALOR[9]);
    Assert.assertEquals(c.toString(), "Rey de Oros");
  }

  public static void main (String[] args) {
    test1();
    test2();
    test3();
    test4();
    test5();
    System.out.println("Han pasado todas las pruebas de Carta");
  }
}