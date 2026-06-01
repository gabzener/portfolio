package Laboratorios_2.Lab5;

public class MainVector {

    public static void main(String [] args){
        double [] arr = new double[] {2.0,3.4};
        Extra v1 = new Extra(arr, true);
        Extra v2 = new Extra(new double [] {1.0,2.0}, true);
        arr[0] = 1.0;
        System.out.println(v1.getcoords(0));
        
    }
    
}
