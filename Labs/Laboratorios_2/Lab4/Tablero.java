package Laboratorios_2.Lab4;


public class Tablero {
  /* Matriz que representa internamente el tablero según el enunciado */
  private char[][] m;
  /* Dimensión del tablero */
  private int n;
  /* INV: m es una matriz cuadrada de dimensiones nxn, n>=0 */
  /**
   * Constructor de Tablero: Crea un tablero vacío de dimensiones nxn y
   * marca los escaques blancos y negros
   */
  public Tablero (int n){
    this.m = new char[n][n];
    
  }
  /**
   * POST: resultado: coord in {1..n}
   * DONDE: n es la dimensión del Tablero
   */
  public boolean esValida (int coord)
  {
    return 1<=coord && coord<=n;
  }
  /**
   * PRE: esValida(y)
   * POST: resultado: fila de la matriz para la coordenada y del Tablero
   *
   * Convierte la numeracion del tablero a la numeracion del array según
   * el enunciado
   */
  private int fila (int y)
  {
    return n-y;
  }
  /**
   * PRE: esValida(x)
   * POST: resultado: columna de la matriz para coordenada x del Tablero
   *
   * Convierte la numeracion del tablero a la numeracion del array según
   * el enunciado
   */
  private int columna (int x)
  {
    return x-1;
  }
  /**
   * PRE: esValida(x) and esValida(y)
   * POST: resultado: carácter en el escaque (x,y)
   */
  public char escaque (int x, int y)
  {
    return m[fila(y)][columna(x)];
  }
  /**
   * PRE: esValida(x) and esValida(y)
   * Pone c en el escaque (x,y) del tablero
   */
  public void poner (int x, int y, char c){
    m[fila(y)][columna(x)] = c;

  }

  /**
   * POST: resultado: dimensión del Tablero
   */
  public int dimension (){


  }
  /**
   * PRE: esValida(x) and esValida(y)
   * POST: "el escaque (x,y) es blanco"
   */
  public boolean esBlanco (int x, int y){
    return m[fila(y)][columna(x)] == 'B';

  }
    /**
     * POST: resultado: el Tablero como texto
     */
    public String toString ()
    {
    String tab = "";
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        tab += m[i][j] + " ";
        }
        tab += "\n";
    }
    return tab + "\n";
    }
  /**
   * PRE: esValida(k)
   * POST: resultado: convierte k a la letra correspondiente según
                      la equivalencia:
   *                    k = 1 --> 'a'
   *                    k = 2 --> 'b'
   *                    ...
   */
  public char car (int k){

  }

  
}
