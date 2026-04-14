package Laboratorios_2.Lab5;

public class MainVector {

    public static void main(String [] args){
        double [] arr = new double[] {2.0,3.4};
        Vector v1 = new Vector(arr, true);
        Vector v2 = new Vector(new double [] {1.0,2.0}, true);
        arr[0] = 1.0;
        System.out.println(v1.getcoords(0));
        Vector v3 = new Vector(v2);
        
    }
    
}
