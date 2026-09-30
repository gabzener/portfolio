package aed.Lab_1;

import es.upm.aedlib.indexedlist.ArrayIndexedList;
import es.upm.aedlib.indexedlist.IndexedList;

import java.util.Comparator;
import java.util.function.Function;

import es.upm.aedlib.Pair;

public class ActaNotasImpl implements ActaNotas{
    
    private String asignatura;
    private double notaMinimaAprobado;
    private int anyo;
    private boolean esConvocatoriaExtraordinaria;
    private IndexedList<Calificacion> calificaciones;

    public ActaNotasImpl(String asignatura, double nota, int anyo, boolean esConvocatoriaExtraordinaria){
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
        if(obj instanceof ActaNotasImpl){
            return this.asignatura.equals(((ActaNotasImpl)obj).asignatura) && this.anyo == ((ActaNotasImpl)obj).anyo && this.esConvocatoriaExtraordinaria == ((ActaNotasImpl)obj).esConvocatoriaExtraordinaria;
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

    //busca una matricula y si no la encuentra devuelve -1
    private int buscarMatricula(String matricula){
        int posicion = -1;
        for(int i = 0; i<calificaciones.size(); i++){
            if(calificaciones.get(i).matricula().equals(matricula)){
                posicion = i;
            }
        }
        return posicion;
    }

    //metodo auxiliar para tener las calificaciones simpre ordenadas segun las matriculas
    private int posicionInsercion(String matricula){
        int posicion = calificaciones.size();
        for(int i = 0; i<calificaciones.size(); i++){
            if(calificaciones.get(i).matricula().compareTo(matricula) > 0){
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    @Override
    public ActaNotas addCalificacion(String nombre, String matricula, String grupo, double nota) {
        if(nombre == null || matricula == null || grupo == null || nota < 0.0 || nota > 10.0){
            throw new IllegalArgumentException();
        }
        if(buscarMatricula(matricula) != -1){
            throw new IllegalStateException();
        }
        Calificacion c = new Calificacion(nombre, matricula, grupo, nota);
        int pos = posicionInsercion(matricula);
        calificaciones.add(pos, c);
        
        return this;
    }

    @Override
    public Calificacion getCalificacion(String matricula) {
        if(matricula == null){
            throw new IllegalArgumentException();
        }
        int pos = buscarMatricula(matricula);
        if(pos == -1){
            return null;
        }else{
            return calificaciones.get(pos);
        }
    }

    @Override
    public ActaNotas updateCalificacion(Calificacion calificacion) {
        if(calificacion == null){
            throw new IllegalArgumentException();
        }
        int pos = buscarMatricula(calificacion.matricula());
        if(pos == -1){
            throw new IllegalStateException();
        }
        calificaciones.set(pos, calificacion);
        return this;
    }

    @Override
    public ActaNotas deleteCalificacion(String matricula) {
        if(matricula == null){
            throw new IllegalArgumentException();
        }
        int pos = buscarMatricula(matricula);
        if(pos == -1){
            throw new IllegalStateException();
        }
        calificaciones.removeElementAt(pos);
        return this;
    }

    @Override
    public double notaMedia() {
        if(calificaciones.size() == 0){
            throw new IllegalStateException();
        }
        double nota = 0;
        for(int i = 0; i<calificaciones.size(); i++){
            nota += calificaciones.get(i).nota();
        }
        return nota/calificaciones.size();
    }

    //metodo auxiliar parecido a buscar matricula
    private int buscarGrupo(IndexedList<Pair<String,Integer>> lista, String grupo){
        int posicion = -1;
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).left().equals(grupo)){
                posicion = i;
            }
        }
        return posicion;
    }

    @Override
    public IndexedList<Pair<String, Integer>> alumnosPorGrupo() {
        IndexedList<Pair<String,Integer>> resultado = new ArrayIndexedList<>();

        for(int i = 0; i<calificaciones.size(); i++){
            String grupo = calificaciones.get(i).grupo();
            int pos = buscarGrupo(resultado, grupo);

            if(pos == -1){
                resultado.add(resultado.size(), new Pair<>(grupo, 1));
            }else{
                Pair<String, Integer> anterior = resultado.get(pos);
                Pair<String, Integer> nuevo = new Pair<>(grupo, anterior.right() + 1);
                resultado.set(pos, nuevo);
            }
        }
        return resultado;
    }


    private int posicionInsercionCalificacion(IndexedList<Calificacion> lista, Calificacion c, Comparator<Calificacion> comparador){
        int posicion = lista.size();
        for(int i = 0; i<lista.size(); i++){
            if(comparador.compare(lista.get(i), c) > 0){
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    @Override
    public IndexedList<Calificacion> getCalificaciones(Function<Calificacion, Boolean> filter,
            Comparator<Calificacion> cmp) {
        IndexedList<Calificacion> resultado = new ArrayIndexedList<>();

        Comparator<Calificacion> comparador = cmp;
        if(comparador == null){
            comparador = (c1,c2) -> c1.matricula().compareTo(c2.matricula());  
        }

        for(int i = 0; i<calificaciones.size(); i++){
            Calificacion c = calificaciones.get(i);
            boolean incluir = (filter == null) || filter.apply(c);
            if(incluir){
                int pos = posicionInsercionCalificacion(resultado, c, comparador);
                resultado.add(pos, c);
            }
        }
        return resultado;
    }
}