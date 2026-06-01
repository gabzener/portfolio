package Laboratorios_2.Lab6.Practica_Veintiuna.src.veintiuna;

import java.util.Random;

public class Baraja {

    /** 40 cartas de la baraja española --> Números del 0 al 39
     * Se puede barajar (Aleatorizar los números de nuevo)
     * Se pueden robar cartas de la baraja, los que se roben ya no saldrán de nuevo
     */

    private Carta [] cards;
    private int size = 40;

    private Random rand;

    public Baraja (Random rand){
        this.rand = rand;
        this.cards = new Carta[40];
        for (int i = 0; i<cards.length; ++i){
            cards[i] = new Carta(i);
        }
    }
    public int size(){
        return size;
    }

    /**
     * Se emplea el siguiente algoritmo:
     * a) Genera dos enteros aleatorios entre 0 y size()-1
     * b) Intercambia las cartas en las posiciones dadas pr los enteros aleatorios
     * c) Repite a) y b) 'n' veces.
     * @param n las veces que se intercambian las cartas.
     */
    public void barajar(int n){
        for (int i = 0; i<n; ++i){
            int a = rand.nextInt(size());
            int b = rand.nextInt(size());

            Carta aux = cards[a];
            cards[a] = cards[b];
            cards[b] = aux;
        }
    }
    public Carta robar(){
        size--;
        return cards[size()];

    }
    
}
