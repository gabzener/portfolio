package First_Exercices;
public class Ejemplosarrays {
    

    public static int sumarElementos(int[] elementos){
        int sol = 0;
        for(int i = 0; i < elementos.length; i++){
            sol = sol + elementos[i]; // esto se puede escribir con sol += elementos[i]

        }
        return sol;
    }
    
    static public void main(String[] args){
		
		
	}
}
