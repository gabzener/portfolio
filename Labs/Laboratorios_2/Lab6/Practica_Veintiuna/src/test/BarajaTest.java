package Laboratorios_2.Lab6.Practica_Veintiuna.src.test;

import java.util.Random;

import Laboratorios_2.Lab6.Practica_Veintiuna.src.veintiuna.*;

public class BarajaTest {

  static void test1 () {
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja b = new Baraja(r);
    Assert.assertEq(b.size(), 40);
    for (int i = 39; i >= 0; --i) {
      Carta u = b.robar();
      Carta esperada = new Carta(i);
      Assert.assertEquals(u.toString(), esperada.toString());
      Assert.assertEq(b.size(), i);
    }
  }

  static void test2 () {
    Random r = new Random(1122);
    // Se muestran los primeros 20 enteros aleatorios generados
    // (Para mostrar lo que se va esperar)
    System.out.println("Mostrando numeros aleatorios");
    for (int i = 0; i < 10; ++i) {
      System.out.println(r.nextInt(40) + " " + r.nextInt(40));
    }
  }

  static void test3 () {
    // Se han hecho los intercambios mostrados antes
    int[] indice = { 0, 15, 11, 4, 21, 5, 6, 22, 8, 3, // Hasta 10 
        10, 2, 12, 13, 14, 1, 23, 17, 18, 36, // De 11 a 20  
        20, 9, 28, 16, 24, 25, 26, 19, 7, 29, // De 21 a 30  
        30, 31, 32, 33, 34, 35, 27, 37, 38, 39 // De 31 a 40 
    };
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja b = new Baraja(r);
    b.barajar(10);
    for (int i = 39; i >= 0; --i) {
      Carta u = b.robar();
      Carta esperada = new Carta(indice[i]);
      Assert.assertEquals(u.toString(), esperada.toString());
      Assert.assertEq(b.size(), i);
    }
  }

  public static void main (String[] args) {
    test1();
    test2();
    test3();
    System.out.println("Han pasado todas las pruebas de Baraja");
  }
}