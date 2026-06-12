package Laboratorios_2.Lab6.Practica_Veintiuna.src.veintiuna;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;


public class Jugador {

    private static final String TEXTO_PREGUNTA = "Robas o te plantas? (carta/me planto)";
    private static final String TEXT_ACCION_INVALIDA = "Escribe 'carta' o 'me planto' sin comillas.";

    protected List<Carta> hand;
     public Jugador(){
        hand = new ArrayList<>();
     }

     public void roboCarta (Baraja baraja){
        hand.add(baraja.robar());
     }
     public int puntuacion(){
        


     }

}