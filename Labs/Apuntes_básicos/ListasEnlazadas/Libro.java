package ListasEnlazadas;

public class Libro {
    private String autor;
    private String titulo;

    public Libro(String titulo, String libro){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    
}
