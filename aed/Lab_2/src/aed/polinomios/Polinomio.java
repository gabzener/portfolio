package aed.polinomios;

import java.security.cert.PolicyQualifierInfo;
import java.util.Arrays;
import java.util.function.BiFunction;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;


/**
 * Operaciones sobre polinomios de una variable con coeficientes enteros.
 */
public class Polinomio {

  // Una lista de monomios -- NO CAMBIA a private; el tester necesita acceso
  PositionList<Monomio> terms;

  /**
   * Crea un polinomio representando el valor 0.
   */
  public Polinomio() {
    terms = new NodePositionList<>();
  }

  /**
   * Crea un polinomio definado por una lista con monomios.
   * @param terms una lista de monomios
   */
  public Polinomio(PositionList<Monomio> terms) {
    this.terms = terms;
  }

  /**
   * Crea un polinomio definado por un String.
   * La representación del polinomio es una secuencia de monomios separados
   * por '+' (y posiblemente con caracteres blancos).
   * Un monomio esta compuesto por tres partes,
   * el coefficiente (un entero), el caracter 'x' (el variable), y el exponente
   * compuesto por un un caracter '^' seguido por un entero.
   * Se puede omitir multiples partes de un monomio, 
   * ejemplos:
   * <pre>
   * {@code
   * new Polinomio("2x^3 + 9");
   * new Polinomio("2x^3 + -9");
   * new Polinomio("x");   // == 1x^1
   * new Polinomio("5");   // == 5x^0
   * new Polinomio("8x");  // == 8x^1
   * new Polinomio("0");   // == 0x^0
   * }
   * </pre>
   * @throws IllegalArgumentException si el argumento es malformado
   * @param polinomio - una secuencia de monomios separados por '+'
   */
  public Polinomio(String polinomio) {
    if (polinomio == null){
      throw new IllegalArgumentException();
    }
    /*
    Necesitamos varias cosas:
    - una forma de llevar la posicion del string
    - la longitud del string
    - un polinomio donde pongamos todos los datos que vayamos sacando del string
    */

    int n = polinomio.length();
    Polinomio acc = new Polinomio();

  String[] monomios = polinomio.split("\\+", -1);

  try {
    for (int i = 0; i < monomios.length; ++i) {

      String s = monomios[i].trim();
      if (s.isEmpty()) {
        throw new IllegalArgumentException();
      }

      int coeficiente;
      int exponent;

      int posX = s.indexOf('x');

      if (posX == -1) {
        coeficiente = Integer.parseInt(s);
        exponent = 0;
      } else {
        String coefStr = s.substring(0, posX).trim();
        if (coefStr.isEmpty()) {
          coeficiente = 1;
        } else if (coefStr.equals("-")) {
          coeficiente = -1;
        } else {
          coeficiente = Integer.parseInt(coefStr);
        }

        String expStr = s.substring(posX + 1).trim();
        if (expStr.isEmpty()) {
          exponent = 1;
        } else if (expStr.startsWith("^")) {
          exponent = Integer.parseInt(expStr.substring(1).trim());
          if (exponent < 0) {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
      }

      PositionList<Monomio> lista = new NodePositionList<>();
      if (coeficiente != 0) {
        lista.addLast(new Monomio(coeficiente, exponent));
      }
      acc = suma(acc, new Polinomio(lista));
    }
  } catch (Exception e) {
    throw new IllegalArgumentException();
  }

  this.terms = acc.terms;
}

  /**
   * Suma dos polinomios.
   * @param p1 primer polinomio.
   * @param p2 segundo polinomio.
   * @return la suma de los polinomios.
   */
  public static Polinomio suma(Polinomio p1, Polinomio p2) {
    PositionList<Monomio> resultado = new NodePositionList<>();
    Position<Monomio> pon1 = p1.terms.first();
    Position<Monomio> pon2 = p2.terms.first();

    while(pon1 != null && pon2 != null){

      if(pon1.element().exponente() > pon2.element().exponente()){
        resultado.addLast(pon1.element());
        pon1 = p1.terms.next(pon1);

      } else if (pon1.element().exponente() < pon2.element().exponente()){
        resultado.addLast(pon2.element());
        pon2 = p2.terms.next(pon2);

      } else {

        int coef = pon1.element().coeficiente() + pon2.element().coeficiente();

        if(coef != 0){
          resultado.addLast(new Monomio(coef, pon1.element().exponente()));
        }
        pon1 = p1.terms.next(pon1);
        pon2 = p2.terms.next(pon2);
      }

    }
    while (pon1 != null){
      resultado.addLast(pon1.element());
      pon1 = p1.terms.next(pon1);
    }
    while(pon2 != null){
      resultado.addLast(pon2.element());
      pon2 = p2.terms.next(pon2);
  }
    return new Polinomio(resultado);
  }
    
  /**
   * Substraccion de dos polinomios.
   * @param p1 primer polinomio.
   * @param p2 segundo polinomio.
   * @return la resta de los polinomios.
   */
  public static Polinomio resta(Polinomio p1, Polinomio p2) {
    /*PositionList<Monomio> resultado = new NodePositionList<>();
    Position<Monomio> pon1 = p1.terms.first();
    Position<Monomio> pon2 = p2.terms.first();
    if (pon1 == null || pon2 == null){
      return new Polinomio();
    }

    while(pon1 != null && pon2 != null){

      if(pon1.element().exponente() > pon2.element().exponente()){
        resultado.addLast(pon1.element());
        pon1 = p1.terms.next(pon1);

      } else if (pon1.element().exponente() < pon2.element().exponente()){
        resultado.addLast(pon2.element());
        pon2 = p2.terms.next(pon2);

      } else {

        int coef = pon1.element().coeficiente() - pon2.element().coeficiente();

        if(coef != 0){
          resultado.addLast(new Monomio(coef, pon1.element().coeficiente()));
        }
        pon1 = p1.terms.next(pon1);
        pon2 = p2.terms.next(pon2);
      }
    }
    return new Polinomio(resultado); */

    return suma(p1,multiplica(new Monomio(-1,0), p2)); // Esto es más fácil que hacer la funcion entera desde el principio.
  }

    
  /**
   * Calcula el producto de dos polinomios.
   * @param p1 primer polinomio.
   * @param p2 segundo polinomio.
   * @return el producto de los polinomios.
   */
  public static Polinomio multiplica(Polinomio p1, Polinomio p2) {
    if (p1.terms.isEmpty() || p2.terms.isEmpty()){
      return new Polinomio();
    }
    Polinomio resultado = new Polinomio();

    Position<Monomio> puntero = p1.terms.first();

    while(puntero != null){

      Polinomio temp = multiplica(puntero.element(), p2);
      resultado = suma(resultado, temp);
      puntero = p1.terms.next(puntero);

    }
    return resultado;
  }

  /**
   * Calcula el producto de un monomio y un polinomio.
   * @param m el monomio
   * @param p el polinomio
   * @return el producto del monomio y el polinomio
   */
  public static Polinomio multiplica(Monomio m, Polinomio p) {

    if(m.coeficiente() == 0 || p.terms.isEmpty()){
      return new Polinomio();
    }
    PositionList<Monomio> resultado = new NodePositionList<>(); 
    Polinomio result = new Polinomio(resultado);
    Position<Monomio> puntero = p.terms.first();
    while(puntero != null){
      resultado.addLast(new Monomio(m.coeficiente() * puntero.element().coeficiente(), m.exponente() + puntero.element().exponente()));
      puntero = p.terms.next(puntero);
    }
    return result;
  }
    
  /**
   * Devuelve el exponente (grado) del monomio con el mayor grado
   * dentro del polinomio
   * Si el polinomio es vacio (la representacion del polinomio "0") entonces
   * el valor devuelto debe ser -1.
   * @return el grado del polinomio
   */
  public int grado() {
    if (terms.isEmpty()){
      return -1;
    } else {
      return terms.first().element().exponente();
    }
  }

  /**
   * Cambia las occurrencias del variable "x" dentro el polinomio p por el polinomio arg.
   * @return El polinomio p donde el variable "x" esta sustuido por el polinomio arg.
   * Ejemplo:
   * <pre>
   * {@code
   * Polinomio p1 = new Polinomio("2x^3 + 9");
   * Polinomio p2 = new Polinomio("x + 1");
   * Polinomio.componer(p1,p2) =>
   *   2 * (x+1)^3 + 9 = 2x^3 + 6x^2 + 6x^1 + 11
   * }
   * </pre>
   *
   */
  public static Polinomio componer(Polinomio p, Polinomio arg) {
    PositionList<Monomio> resultado = new NodePositionList<>();
    Polinomio res = new Polinomio(resultado);
    Position<Monomio> puntero = p.terms.first();

    while( puntero != null){

      Polinomio posiblePotencia = hacerPotencia(arg, puntero.element().exponente());
      Polinomio coef = multiplica(new Monomio(puntero.element().coeficiente(), 0), posiblePotencia);
      res = suma(res, coef);

      puntero = p.terms.next(puntero);
    }
    return res;

  }

  public static Polinomio hacerPotencia(Polinomio p, int exponente){

    PositionList<Monomio> wow = new NodePositionList<>();
    wow.addLast(new Monomio(1,0));
    Polinomio res = new Polinomio(wow);

    for (int i = 0; i< exponente; ++i){
      res = multiplica(res, p);
    }
    return res;
  }

  /**
   * Calcula el derivado de un polinomio.
   * @return el polinomio representando el derivado.
   */
  public Polinomio derivada() {
    if (terms.isEmpty()){
      return new Polinomio();
    }
    PositionList<Monomio> resultado = new NodePositionList<>();
    Polinomio result = new Polinomio(resultado);
    Position<Monomio> puntero = terms.first();
     
     while (puntero != null) {

      if(puntero.element().exponente() > 0){
        int multiplicacion = puntero.element().exponente() * puntero.element().coeficiente();
        int expo = puntero.element().exponente() - 1;

        Monomio temp = new Monomio(multiplicacion, expo);
        resultado.addLast(temp);
      }

      puntero = terms.next(puntero);

  }
  return result;
}

  @Override
  public int hashCode() {
    return terms.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Polinomio)) return false;

    Polinomio otro = (Polinomio) obj;

    if (terms.size() != otro.terms.size()) return false;

    Position<Monomio> c1 = terms.isEmpty() ? null : terms.first();
    Position<Monomio> c2 = otro.terms.isEmpty() ? null : otro.terms.first();

    while (c1 != null && c2 != null) {
      Monomio m1 = c1.element();
      Monomio m2 = c2.element();
      if (m1.coeficiente() != m2.coeficiente() || m1.exponente() != m2.exponente())
        return false;
      c1 = terms.next(c1);
      c2 = otro.terms.next(c2);
    }
    return true;
  }

  @Override
  public String toString() {
    if (terms.isEmpty()) return "0";
    else {
      StringBuffer buf = new StringBuffer();
      Position<Monomio> cursor = terms.first();
      while (cursor != null) {
        Monomio p = cursor.element();
        int coef = p.coeficiente();
        int exp = p.exponente();
        buf.append(new Integer(coef).toString());
        if (exp > 0) {
          buf.append("x");
          buf.append("^");
          buf.append(new Integer(exp)).toString();
        }
        cursor = terms.next(cursor);
        if (cursor != null) buf.append(" + ");
      }
      return buf.toString();
    }
  }


  public static void main(String [] args){
    System.out.println("hola");
  }
}
