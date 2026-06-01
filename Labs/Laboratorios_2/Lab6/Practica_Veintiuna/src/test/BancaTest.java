package Laboratorios_2.Lab6.Practica_Veintiuna.src.test;

import java.util.Random;

import Laboratorios_2.Lab6.Practica_Veintiuna.src.veintiuna.*;

public class BancaTest {

  static void test1 () {
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja baraja = new Baraja(r);
    Banca banca = new Banca(baraja);
    Assert.assertEquals(banca.puntuacion(), 10);
    banca.juegaTurnos(baraja);
    Assert.assertEquals(banca.puntuacion(), 20);
  }

  static void test2 () {
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja baraja = new Baraja(r);
    for (int i = 0; i < 9; ++i) {
      baraja.robar();
    }
    Banca banca = new Banca(baraja);
    Assert.assertEquals(banca.puntuacion(), 11);
    banca.juegaTurnos(baraja);
    Assert.assertEquals(banca.puntuacion(), 21);
  }

  static void test3 () {
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja baraja = new Baraja(r);
    baraja.barajar(10);
    for (int i = 0; i < 9; ++i) {
      baraja.robar();
    }
    Banca banca = new Banca(baraja);
    Assert.assertEquals(banca.puntuacion(), 11);
    banca.juegaTurnos(baraja);
    Assert.assertEquals(banca.puntuacion(), 21);    
  }

  static void test4 () {
    // 20 Test aleatorios "fijos"
    Random r = new Random(2313);
    for ( int i = 0; i < 20; ++i ) {
      Baraja baraja = new Baraja(r);
      baraja.barajar(100);
      Banca banca = new Banca(baraja);
      banca.juegaTurnos(baraja);
      Assert.assertTrue(banca.puntuacion() >= 17);    
    }
  }

  public static void main (String[] args) {
    test1();
    test2();
    test3();
    test4();
    System.out.println("Han pasado todas las pruebas de Banca");
  }
}