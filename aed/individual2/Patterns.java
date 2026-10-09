package aed.individual2;

import es.upm.aedlib.set.*;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;

public class Patterns {

  public static boolean exists(String s, PositionList<Set<String>> l) {

    /*
    l.first() devuelve el objeto, null si está vacía
    l.next(Position<E> nodo) nodo de la derecha
    l.prev(Position<E> nodo) nodo de la izquierda
    Set<String> contains(nodo) para saber si lo contiene
     */

    Position<Set<String>> puntero = l.first(); // Elemento E

    while (puntero != null) {
      if (puntero.element().contains(s)) { // E (elemento).element() retorna el elemento contenido en el (conjunto)
        return true;
      }
      puntero = l.next(puntero);
    }
    return false; // devuelve true si dentro de l, está el string s
  }

  public static boolean universal(String s, PositionList<Set<String>> l) {

    Position<Set<String>> puntero = l.first();

    while (puntero != null) {

      if(!puntero.element().contains(s)){
        return false;
      }
      puntero = l.next(puntero);

    }

    return true; // devuelve true si todos los nodos dentro de l, contienen s
  }

  public static boolean precededBy(String s1, String s2, PositionList<Set<String>> l) {
    boolean temp = false;
    Position<Set<String>> puntero = l.first();

    while (puntero != null) {
      Set<String> conjunto = puntero.element();

      if (conjunto.contains(s1) && !temp) {
        return false;
      }
      if (conjunto.contains(s2)) {
        temp = true;
      }

      puntero = l.next(puntero);
    }

    return true; // devuelve true si para cualquier nodo dentro de l que contienen s1, hay un
    // nodo anterior que contienen s2
  }

  public static boolean followedBy(String s1, String s2, PositionList<Set<String>> l) {
    boolean temp = false;
    Position<Set<String>> puntero = l.last();

    while (puntero != null) {
      Set<String> conjunto = puntero.element();

      if (conjunto.contains(s1) && !temp) {
        return false;
      }
      if (conjunto.contains(s2)) {
        temp = true;
      }

      puntero = l.prev(puntero);
    }
    return true; // lo mismo pero el posterior
  }

  public static void deleteStates(String s, PositionList<Set<String>> l) {

      Position<Set<String>> puntero = l.first();

      while (puntero != null) {
      Position<Set<String>> siguiente = l.next(puntero);

      if (puntero.element().contains(s)) {
        l.remove(puntero);
      }

      puntero = siguiente;
    }
  } // eliminar todas las acciones en el timepo, cuyas acciones contienen el string s.
}
