package aed.Lab_1;

import es.upm.aedlib.indexedlist.ArrayIndexedList;
import es.upm.aedlib.indexedlist.IndexedList;

import java.util.Comparator;
import java.util.function.Function;

import es.upm.aedlib.Pair;

public class ActaNotasImpsadasl implements ActaNotas{
    
    private String asignatura;
    private double notaMinimaAprobado;
    private int anyo;
    private boolean esConvocatoriaExtraordinaria;
    private IndexedList<Calificacion> calificaciones;

    public ActaNotasImpsadasl(String asignatura, double nota, int anyo, boolean esConvocatoriaExtraordinaria){
        this.asignatura = asignatura;
        this.notaMinimaAprobado = nota;
        this.anyo = anyo;
        this.esConvocatoriaExtraordinaria = esConvocatoriaExtraordinaria;
        this.calificaciones = new ArrayIndexedList<>();
    }

    public String asignatura(){
        return this.asignatura;
    }

    public int anyo(){
        return this.anyo;
    }

    public boolean esConvocatoriaExtraordinaria(){
        return this.esConvocatoriaExtraordinaria;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof ActaNotasImpsadasl){
            return this.asignatura.equals(((ActaNotasImpsadasl)obj).asignatura) && this.anyo == ((ActaNotasImpsadasl)obj).anyo && this.esConvocatoriaExtraordinaria == ((ActaNotasImpsadasl)obj).esConvocatoriaExtraordinaria;
        }
        return false;
    }

    public String toString(){
        return "Asignatura: " + this.asignatura + "\nNota mínima: " + this.notaMinimaAprobado + "\nAño: " + this.anyo + "\nConvocatoria ordinaria: " + this.esConvocatoriaExtraordinaria;
    }

    @Override
    public double minNotaAprobado() {
        return this.notaMinimaAprobado;
    }

    private int buscarMatricla(String matricula){
        int posicion = calificaciones.size();
        boolean parar = false;
        for(int i = 0; i<calificaciones.size() && !parar; i++){
            int cmp = calificaciones.get(i).matricula().compareTo(matricula);
            if(cmp > 0){
                posicion = i;
                parar = true;
            }else if(cmp == 0){
                posicion = -1;
                parar = true;
            }
        }
        return posicion;
    }

    @Override
    public ActaNotas addCalificacion(String nombre, String matricula, String grupo, double nota) {
        if(nombre == null || matricula == null || grupo == null || nota < 0.0 || nota > 10.0){
            throw new IllegalArgumentException();
        }
        if(buscarMatricla(matricula) == -1){
            throw new IllegalStateException();
        }
        
        
        return this;
    }


    public static void main(String[] args){
        ActaNotasImpsadasl a0 = new ActaNotasImpsadasl("AED", 5, 2026, false);
        ActaNotasImpsadasl a1 = new ActaNotasImpsadasl("pps", 5, 2026, false);
        System.out.println(a0.equals(a1));
        System.out.println(a0.toString());
    }

}