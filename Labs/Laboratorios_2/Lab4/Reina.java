package Laboratorios_2.Lab4;

public class Reina
{
  /* (xr,yr) es la ubicacion de la reina en el tablero nxn
     (1, 1) es el escaque inferior izquierdo
     (n, n) es el escaque superior derecho */
  private int xr;
  private int yr;
  /**
   * Constructor de Reina
   */
  public Reina (int x0, int y0){
    this.xr = x0;
    this.yr = y0;

  }
  /**
   * POST: "el escaque (xr,yr) de t está ocupado por esta reina"
   */
  public boolean hayReina (Tablero t){
    return t.escaque(xr,yr) == 'R';


  }
  /**
   * Pone la marca de reina al escaque de t ocupado por esta reina
   */
  public void ponerReina (Tablero t){
    t.poner(xr, yr, 'R');
  }
  /**
   * PRE: esValida(x) and esValida(y)
   * Pone la marca de amenazado al escaque (x,y) en t
   */
  public void ponerAmenazado (int x, int y, Tablero t){
    if (estaAmenazado(x, y) == true){
      t.poner(x, y, '*');
    }

  }
  /**
   * PRE: esValida(x) and esValida(y)
   * POST: "el escaque (x,y) de t está amenazado por esta Reina"
   * POST: "el escaque (x,y) de t está en la misma fila, columna o diagonal
   *        que esta Reina"
   * DONDE: el escaque de esta Reina se considera amenazado
   */
  public boolean estaAmenazado (int x, int y){
    int a = Math.abs(x - xr);
    int b = Math.abs(y - yr);
    if (x == xr){
      return true;
    } else if ( y == yr){
      return true;
    } else if (a == b){
      return true;
    } else{
      return false;
    }

  }
  /**
   * Marca en t los escaques amenazados por esta Reina.
   * Marca esta Reina también.
   */
  public void marcarAmenazados (Tablero t){
    for(int i = 1; i <= t.dimension(); ++i){
      for(int j = 1; j <= t.dimension(); ++j){
        if (estaAmenazado(i, j)){
          ponerAmenazado(i, j, t);  
        }

      }

    }
    ponerReina(t);

  }
}
