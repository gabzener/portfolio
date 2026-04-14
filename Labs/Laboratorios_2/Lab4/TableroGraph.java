package Laboratorios_2.Lab4;

import java.awt.Font;
import stdlib.StdDraw;
public class TableroGraph {
  /**
   * Pinta el tablero t en modo gráfico
   */
public static void dibujar(Tablero t) {
    int n = t.dimension();
    
    // Configurar el tamaño del canvas
    StdDraw.setCanvasSize(600, 600);
    StdDraw.setXscale(-1,n);
    StdDraw.setYscale(-1,n);
    
    // Recorrer todas las casillas
    for (int x = 1; x <= n; ++x) {
        for (int y = 1; y <= n; ++y) {
            
            char casilla = t.escaque(x, y);
            
            // Elegir color según el carácter
            if (casilla == 'B') {
                StdDraw.setPenColor(StdDraw.WHITE);
            } else if (casilla == 'N') {
                StdDraw.setPenColor(StdDraw.BLACK);
            } else if (casilla == '*') {
                StdDraw.setPenColor(StdDraw.RED);
            } else if (casilla == 'R') {
                StdDraw.setPenColor(StdDraw.YELLOW);
            }
                
            // Dibujar el cuadrado en la posición (x, y)
            StdDraw.filledSquare(x,y,1);
            //StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.square(x, y, 1);
        }
    }
    StdDraw.setPenColor(StdDraw.BLACK);
    // Dibujar las letras en el eje x (a, b, c...)
    for (int x = 1; x <= n; x++) {
        StdDraw.text(x-0.5, -0.5, String.valueOf(t.car(x)));
    }
    
    // Dibujar los números en el eje y (1, 2, 3...)
    for (int y = 1; y <= n; y++) {
        StdDraw.text(-0.5, y-0.5, String.valueOf(y));
    }
}

public static void main (String[] args) {
  //int n = Integer.parseInt(args[0]);
  //Assert.assertEq(n>=0,true);
  Tablero t = new Tablero(8);
  Reina r = new Reina(5,5);
  r.ponerReina(t);
  r.marcarAmenazados(t);
  dibujar(t);
}
}