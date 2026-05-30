// ==================== PILA (STACK) ====================
// Estructura LIFO: Last In, First Out
// El último elemento en entrar es el primero en salir

public class Pila<T> {
    private Object[] elementos;
    private int tope;
    private static final int CAPACIDAD_DEFECTO = 10;

    // Constructor: inicializa la pila con una capacidad dada
    public Pila(int capacidad) {
        elementos = new Object[capacidad];
        tope = -1;
    }

    public Pila() {
        this(CAPACIDAD_DEFECTO);
    }

    // PUSH — Apila un elemento en el tope
    public void push(T elemento) {
        if (estaLlena()) throw new RuntimeException("Pila llena");
        elementos[++tope] = elemento;
    }

    // POP — Desapila y devuelve el elemento del tope
    @SuppressWarnings("unchecked")
    public T pop() {
        if (estaVacia()) throw new RuntimeException("Pila vacía");
        T elemento = (T) elementos[tope];
        elementos[tope--] = null;
        return elemento;
    }

    // PEEK — Consulta el tope sin extraerlo
    @SuppressWarnings("unchecked")
    public T peek() {
        if (estaVacia()) throw new RuntimeException("Pila vacía");
        return (T) elementos[tope];
    }

    // Métodos auxiliares
    public boolean estaVacia()  { return tope == -1; }
    public boolean estaLlena()  { return tope == elementos.length - 1; }
    public int tamaño()        { return tope + 1; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pila (tope→base): [");
        for (int i = tope; i >= 0; i--) {
            sb.append(elementos[i]);
            if (i > 0) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}


// ==================== COLA (QUEUE) ====================
// Estructura FIFO: First In, First Out
// El primer elemento en entrar es el primero en salir

public class Cola<T> {
    private Node<T> frente;   // apunta al primer elemento (el próximo en salir)
    private Node<T> fondo;    // apunta al último elemento  (el último en entrar)
    private int tamanio;

    // Nodo interno de la lista enlazada
    private static class Node<T> {
        T dato;
        Node<T> siguiente;
        Node(T dato) { this.dato = dato; }
    }

    // Constructor: cola vacía
    public Cola() {
        frente = fondo = null;
        tamanio = 0;
    }

    // ENQUEUE — Encola un elemento al fondo
    public void enqueue(T elemento) {
        Node<T> nuevo = new Node<>(elemento);
        if (estaVacia()) {
            frente = fondo = nuevo;
        } else {
            fondo.siguiente = nuevo;
            fondo = nuevo;
        }
        tamanio++;
    }

    // DEQUEUE — Desencola y devuelve el elemento del frente
    public T dequeue() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fondo = null; // la cola quedó vacía
        tamanio--;
        return dato;
    }

    // PEEK — Consulta el frente sin extraerlo
    public T peek() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");
        return frente.dato;
    }

    // Métodos auxiliares
    public boolean estaVacia() { return tamanio == 0; }
    public int tamanio()       { return tamanio; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cola (frente→fondo): [");
        Node<T> actual = frente;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) sb.append(", ");
            actual = actual.siguiente;
        }
        return sb.append("]").toString();
    }
}


// ==================== DEMO ====================

public class Main {
    public static void main(String[] args) {

        // --- Pila ---
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println(pila);          // [3, 2, 1]
        System.out.println(pila.pop());    // 3  ← sale el último en entrar
        System.out.println(pila.peek());   // 2  ← consulta sin sacar
        System.out.println(pila);          // [2, 1]

        // --- Cola ---
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        System.out.println(cola);           // [1, 2, 3]
        System.out.println(cola.dequeue()); // 1  ← sale el primero en entrar
        System.out.println(cola.peek());    // 2  ← consulta sin sacar
        System.out.println(cola);           // [2, 3]
    }
}