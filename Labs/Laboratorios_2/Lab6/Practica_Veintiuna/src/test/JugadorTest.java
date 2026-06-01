package Laboratorios_2.Lab6.Practica_Veintiuna.src.test;

import java.util.Random;
import java.util.Scanner;

import Laboratorios_2.Lab6.Practica_Veintiuna.src.veintiuna.*;

public class JugadorTest {

  static void test1 () {
    Jugador j = new Jugador();
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja b = new Baraja(r);
    Assert.assertEquals(j.muestraMano(), "Tu mano:\nPuntuacion: 0\n");
    j.robaCarta(b);
    Assert.assertEquals(j.muestraMano(), "Tu mano:\nRey de Copas\nPuntuacion: 10\n");
    j.robaCarta(b);
    Assert.assertEquals(j.muestraMano(), "Tu mano:\nRey de Copas\nCaballo de Copas\nPuntuacion: 20\n");
    j.robaCarta(b);
    Assert.assertEquals(j.muestraMano(), "Tu mano:\nRey de Copas\nCaballo de Copas\nSota de Copas\nPuntuacion: 30\n");
  }

  static void test2 () {
    // Comprobar puntuacion con As (con un solo As). 
    Jugador j = new Jugador();
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja b = new Baraja(r);
    // Quito 9 cartas.
    for (int i = 0; i < 9; ++i) {
      b.robar();
    }
    j.robaCarta(b); // Robo As de Copas
    Assert.assertEquals(j.muestraMano(), "Tu mano:\nAs de Copas\nPuntuacion: 11\n");
    j.robaCarta(b); // Robo Rey de Espadas 
    Assert.assertEquals(j.puntuacion(), 21);
    j.robaCarta(b); // Robo Caballo de Espadas 
    Assert.assertEquals(j.puntuacion(), 21);
  }

  static void test3 () {
    // Comprobar puntuacion con As (con dos ases). 
    Jugador j = new Jugador();
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja b = new Baraja(r);
    // Quito 9 cartas.
    for (int i = 0; i < 9; ++i) {
      b.robar();
    }
    j.robaCarta(b); // Robo As de Copas
    Assert.assertEquals(j.puntuacion(), 11);
    // Quito 9 cartas.
    for (int i = 0; i < 9; ++i) {
      b.robar();
    }
    j.robaCarta(b); // Robo As de Espadas
    Assert.assertEquals(j.puntuacion(), 2);
    // Quito 3 cartas (figuras).
    for (int i = 0; i < 3; ++i) {
      b.robar();
    }
    j.robaCarta(b); // Robo el 7
    Assert.assertEquals(j.puntuacion(), 9);
    j.robaCarta(b); // Robo el 6
    Assert.assertEquals(j.puntuacion(), 15);
    j.robaCarta(b); // Robo el 5
    Assert.assertEquals(j.puntuacion(), 20);
    // Quito 4, 3, 2.
    for (int i = 0; i < 3; ++i) {
      b.robar();
    }
    j.robaCarta(b); // Robo el as
    Assert.assertEquals(j.puntuacion(), 21);
    j.robaCarta(b); // Robo el Rey
    Assert.assertEquals(j.puntuacion(), 31);
  }

  static void test4 () {
    System.out.println("--- test 4 ---");
    System.out.println("-> Se van a mostrar los textos que se muestran al usuario, pero no se comprueban");
    String input = "carta\ncarta\ncarta\ncarta\ncarta\ncarta\n";
    Scanner s = new Scanner(input);
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja b = new Baraja(r);
    b.barajar(10);
    // Quito 3 cartas.
    for (int i = 0; i < 3; ++i) {
      b.robar();
    }
    Jugador j = new Jugador();
    j.juegaTurnos(s, b);
    s.close();
    Assert.assertEquals(j.puntuacion(), 21);
  }

  static void test5 () {
    System.out.println("--- test 5 ---");
    System.out.println("-> Se van a mostrar los textos que se muestran al usuario, pero no se comprueban");
    String input = "carta\ncarta\ncarta\ncarta\ncarta\ncarta\n";
    Scanner s = new Scanner(input);
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja b = new Baraja(r);
    b.barajar(10);
    Jugador j = new Jugador();
    j.juegaTurnos(s, b);
    Assert.assertEquals(j.puntuacion(), 30);
  }

  // Se planta en 20
  static void test6 () {
    System.out.println("--- test 6 ---");
    System.out.println("-> Se van a mostrar los textos que se muestran al usuario, pero no se comprueban");
    String input = "carta\ncarta\nusuario se equivoca\nme planto\n"; // Una de las veces el usuario se equivoca
    Scanner s = new Scanner(input);
    Random r = new Random(1122); // Se generan los mismos numeros
    Baraja b = new Baraja(r);
    b.barajar(10);
    Jugador j = new Jugador();
    j.juegaTurnos(s, b);
    Assert.assertEquals(j.puntuacion(), 20);
  }

  public static void main (String[] args) {
    test1();
    test2();
    test3();
    test4();
    test5();
    test6();
    System.out.println("--- --- ---");
    System.out.println("Han pasado todas las pruebas de Jugador");
  }
}