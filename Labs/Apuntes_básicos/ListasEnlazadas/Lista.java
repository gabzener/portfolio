package ListasEnlazadas;

public class Lista {

    private Nodo cabeza = null;

    private int logitud = 0;

    public class Nodo{
        public Object objeto;
        public Nodo siguiente = null;

        public Nodo(Object objeto){
            this.objeto = objeto;
        }
    }
    public void insertarPrincipio(Object libro){
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        logitud++;
    }
    public void insertarFinal(Object libro){
        Nodo nodo = new Nodo(libro);
        if (cabeza == null){
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            while(puntero.siguiente != null){
                puntero = puntero.siguiente;    
            }
            puntero.siguiente = nodo;
            
        }
        logitud++;
    }
    public void insertarEnMedio(int n, Object libro){
        Nodo nodo = new Nodo(libro);
        if(cabeza == null){
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while(contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        logitud++;
    }
    public Object obtener(int n){
        if (cabeza == null){
            return null;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while(contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n){
                return null;
            } else {
                return puntero.objeto;
            }
        }
    }
    public int contar(){
        return logitud;
    }
    public void eliminarPrincipio(){
        if (cabeza != null){
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            logitud--;
        }
    }
    public boolean estaVacia(){
        return cabeza == null;
    }
    public void eliminarUltimo(){
        if (cabeza != null){
            if (cabeza.siguiente == null){
                cabeza = null;
                logitud--;
                return;
                
            }
            Nodo puntero = cabeza;
            while(puntero.siguiente.siguiente != null){
                puntero = puntero.siguiente;
            }
            puntero.siguiente = null;
            logitud--;
        }
    }
    public void eliminarEnMedio(int n){
        if (cabeza != null){
            if (n == 0){
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                logitud--;
            } else {
                Nodo puntero = cabeza;
                int contador = 0;
                while(contador < (n-1)){
                    puntero = puntero.siguiente;
                    contador++;      
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                logitud--;
            }

        }
    }
}
