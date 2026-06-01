package Laboratorios_2.Lab6.Practica_Veintiuna.src.veintiuna;

public class Carta {

    private static final String [] PALO = {"Oros", "Espadas","Bastos","Copas"};
    private static final String [] NUMERO = {"As","2","3","4","5","6","7","Sota","Caballo","Rey"};
    private static final int [] VALOR = {11,2,3,4,5,6,7,10,10,10};

    private int carta;

    /** Cartas:
     * Oros:    0,1,2,3,4,5,6,7,8,9
     * 
     * Espadas: 10,11,12,13,14,15,16,17,18,19
     * 
     * Bastos:  20,21,22,23,24,25,26,27,28,29
     * 
     * Copas:   30,31,32,33,34,35,36,37,38,39
     */

    public Carta(int indice){
        this.carta = indice;
    }

    public String palo(){
        if (carta >= 0 && carta <= 9){
            return PALO[0];
        }
        else if (carta >= 10 && carta <= 19){
            return PALO[1];
        }
        else if (carta >= 20 && carta <= 29){
            return PALO[2];
        }
        else if (carta >= 30 && carta <= 39){
            return PALO[3];
        } else{
            throw new IllegalArgumentException("Introduce un número válido de Carta");
        }
    }
    public String numero(){
        return NUMERO[(carta%10)];
    } 
    public int valor(){
        return VALOR[(carta%10)];
    }
    @Override
    public String toString(){
        return numero() + " de " + palo();
    }
    

    public static void main(String[] args){
        Carta test = new Carta(34);
        System.out.println(test.numero());
        System.out.println(test.valor());
        System.out.println(test.palo());
        System.out.println(test.toString());

    }
}
