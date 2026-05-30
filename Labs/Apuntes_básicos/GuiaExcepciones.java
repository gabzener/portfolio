// =============================================================================
//  GUÍA COMPLETA DE EXCEPCIONES EN JAVA
//  Basada en la presentación "Excepciones - Programación II" (UPM, 2020)
//
//  ÍNDICE:
//    1.  Jerarquía de clases: Throwable, Error, Exception, RuntimeException
//    2.  Checked vs Unchecked exceptions (cuándo usar cada una)
//    3.  Cómo definir excepciones propias (subclases de Exception)
//    4.  Cómo lanzar una excepción: throw / throws
//    5.  Cómo capturar: try-catch, multi-catch, finally
//    6.  Propagación de excepciones entre métodos
//    7.  Encadenamiento de excepciones (cause)
//    8.  Buenas prácticas y antipatrones
//    9.  Excepciones predefinidas más importantes
//   10.  Ejemplos completos: Vaso y Cuenta (del PDF)
// =============================================================================

import java.io.*;



// =============================================================================
// SECCIÓN 1 — JERARQUÍA DE CLASES
// =============================================================================
//
//  Object
//   └── Throwable                ← raíz de todo lo que se puede "lanzar"
//        ├── Error               ← errores graves de la JVM (NO capturar)
//        │    ├── OutOfMemoryError
//        │    ├── StackOverflowError
//        │    └── ...
//        └── Exception           ← situaciones que el programa PUEDE gestionar
//             ├── IOException    ← checked: hay que declarar/capturar
//             ├── SQLException   ← checked
//             ├── ...
//             └── RuntimeException  ← unchecked: NO hace falta declarar
//                  ├── NullPointerException
//                  ├── ArrayIndexOutOfBoundsException
//                  ├── ArithmeticException (división por cero)
//                  ├── ClassCastException
//                  ├── IllegalArgumentException
//                  ├── NumberFormatException
//                  └── ...
//
// REGLA CLAVE:
//   • Checked   → extienden Exception (pero NO RuntimeException)
//                 El compilador OBLIGA a declararlas con throws o capturarlas.
//   • Unchecked → extienden RuntimeException (o Error)
//                 El compilador NO obliga a nada; son opcionales.


// =============================================================================
// SECCIÓN 2 — CHECKED vs UNCHECKED: cuándo usar cada una
// =============================================================================
//
//  ┌──────────────────────────────────────────────────────────────────────────┐
//  │  CHECKED  (extiende Exception)                                           │
//  │  • Usa cuando el error es EXTERNO y el llamador PUEDE recuperarse.       │
//  │  • Ejemplos: fichero no encontrado, conexión de red caída,               │
//  │    saldo insuficiente en un banco, vaso lleno, etc.                      │
//  │  • El compilador te fuerza a pensar en el error → más robusto.           │
//  ├──────────────────────────────────────────────────────────────────────────┤
//  │  UNCHECKED  (extiende RuntimeException)                                  │
//  │  • Usa cuando el error indica un BUG en el código del programador.       │
//  │  • Ejemplos: argumento null inesperado, índice fuera de rango,           │
//  │    estado ilegal de un objeto.                                           │
//  │  • No contamina las firmas de los métodos con throws.                    │
//  └──────────────────────────────────────────────────────────────────────────┘
//
//  GUÍA RÁPIDA:
//    ¿Puede el llamador hacer algo útil si falla?  → Checked
//    ¿Es un error de programación que nunca debería ocurrir? → Unchecked


// =============================================================================
// SECCIÓN 3 — CÓMO DEFINIR EXCEPCIONES PROPIAS
// =============================================================================

// --- 3a. Excepción CHECKED básica -------------------------------------------
// Extiende Exception directamente.
// El compilador obliga a quien llame a métodos que la lanzan a gestionarla.
class ExcepcionVasoNoCabe extends Exception {

    // Constructor sin mensaje (mínimo requerido)
    public ExcepcionVasoNoCabe() {
        super();
    }

    // Constructor con mensaje descriptivo (RECOMENDADO siempre)
    // Se puede recuperar después con e.getMessage()
    public ExcepcionVasoNoCabe(String msg) {
        super(msg);
    }
}

// --- 3b. Excepción CHECKED con mensaje y causa encadenada -------------------
// Útil para "traducir" una excepción de bajo nivel a una de más alto nivel
// conservando la causa original (encadenamiento).
class ExcepcionVasoDesayuno extends Exception {

    public ExcepcionVasoDesayuno(String msg) {
        super(msg);
    }

    // Constructor con causa: permite encadenar la excepción original
    public ExcepcionVasoDesayuno(String msg, Throwable causa) {
        super(msg, causa);   // la causa queda guardada y se puede obtener con getCause()
    }
}

// --- 3c. Excepción UNCHECKED (RuntimeException) -----------------------------
// No obliga al compilador; útil para errores de programación (precondiciones rotas).
class ArgumentoNegativoException extends RuntimeException {

    public ArgumentoNegativoException(String msg) {
        super(msg);
    }
}

// --- 3d. Excepción CHECKED con campo adicional de contexto ------------------
// A veces conviene añadir información extra (p.ej. cuánto faltó de espacio).
class SaldoInsuficiente extends Exception {

    private final double saldoActual;
    private final double cantidadPedida;

    public SaldoInsuficiente(double saldoActual, double cantidadPedida) {
        super(String.format(
            "Saldo insuficiente: tienes %.2f€ pero intentas retirar %.2f€",
            saldoActual, cantidadPedida)); // El %.2f€ actua como un f'"{}" en python, pero para excepciones
        this.saldoActual   = saldoActual; // Se ve definido por los valres posteriores al texto
        this.cantidadPedida = cantidadPedida; // el % es como el {}, el .2 es 2 decimales y el f es el tipo de dato o variables, todo lo después (€) es texto plano.
    }

    // Getters para que el código que captura la excepción pueda acceder al contexto
    public double getSaldoActual()    { return saldoActual; }
    public double getCantidadPedida() { return cantidadPedida; }
}
    
class SaldoInicialInsuficiente extends Exception {

    public SaldoInicialInsuficiente(String msg) {
        super(msg);
    }
}


// =============================================================================
// SECCIÓN 4 — CÓMO LANZAR UNA EXCEPCIÓN: throw y throws
// =============================================================================
//
//  • throws  →  va en la FIRMA del método; declara qué excepciones PUEDE lanzar
//               (solo obligatorio para checked; buena práctica ponerlo siempre)
//  • throw   →  instrucción que LANZA el objeto excepción en tiempo de ejecución
//
//  Sintaxis:
//    public void metodo(int x) throws MiExcepcion {
//        if (condicionMala) {
//            throw new MiExcepcion("descripción del error");
//        }
//        // código normal ...
//    }


// =============================================================================
// SECCIÓN 5 — CLASE Vaso: ejemplo completo de lanzar y capturar
// =============================================================================

class Vaso {

    private double contenido;
    private final double capacidadMax;

    public Vaso(double capacidadMax) {
        this.capacidadMax = capacidadMax;
        this.contenido    = 0;
    }

    public double getCantidad() {
        return contenido;
    }

    // -------------------------------------------------------------------------
    // throws ExcepcionVasoNoCabe  → checked: el llamador debe gestionarla
    // -------------------------------------------------------------------------
    /**
     * Aumenta el contenido del vaso.
     * PRE:  contenido + cantidad <= capacidadMax
     * POST: contenido = contenido + cantidad
     *
     * @param cantidad mililitros a añadir (debe ser > 0)
     * @throws ExcepcionVasoNoCabe  si no hay espacio suficiente
     * @throws ArgumentoNegativoException  si cantidad <= 0  (unchecked, RuntimeException)
     */
    public void llenar(double cantidad) throws ExcepcionVasoNoCabe {

        // Validación de precondición de negocio → unchecked (bug del llamador)
        if (cantidad <= 0) {
            throw new ArgumentoNegativoException(
                "La cantidad a llenar debe ser positiva, recibido: " + cantidad);
        }

        // Validación de regla de dominio → checked (el llamador puede recuperarse)
        if (contenido + cantidad > capacidadMax) {
            throw new ExcepcionVasoNoCabe(
                "No cabe: intentas añadir " + cantidad +
                " ml pero solo quedan " + (capacidadMax - contenido) + " ml libres");
        }

        contenido += cantidad;
    }

    /**
     * Extrae líquido del vaso.
     * PRE:  cantidad <= contenido
     * POST: contenido = contenido - cantidad
     *
     * @throws ExcepcionVasoNoCabe  si hay menos líquido del que se quiere extraer
     */
    public void vaciar(double cantidad) throws ExcepcionVasoNoCabe {

        if (cantidad <= 0) {
            throw new ArgumentoNegativoException(
                "La cantidad a vaciar debe ser positiva");
        }

        if (cantidad > contenido) {
            throw new ExcepcionVasoNoCabe(
                "No puedes extraer " + cantidad +
                " ml; solo hay " + contenido + " ml en el vaso");
        }

        contenido -= cantidad;
    }

    // -------------------------------------------------------------------------
    // PROPAGACIÓN: prepararVasoDesayuno llama a llenar(), que puede lanzar
    // ExcepcionVasoNoCabe. Aquí mostramos las DOS opciones posibles.
    // -------------------------------------------------------------------------

    // OPCIÓN A — Propagar sin tratar: añade throws en la firma y no hace nada.
    // La excepción sube al nivel superior (quien llame a este método).
    public void prepararDesayunoSinTratar(double leche, double cacao, double azucar)
            throws ExcepcionVasoNoCabe {

        llenar(leche);   // si falla, la excepción se propaga hacia arriba
        llenar(cacao);
        llenar(azucar);
    }

    // OPCIÓN B — Capturar y relanzar como excepción de más alto nivel.
    // Encadena la causa original para no perder información de depuración.
    public void prepararDesayunoConRelanzamiento(double leche, double cacao, double azucar)
            throws ExcepcionVasoDesayuno {

        try {
            llenar(leche);
            llenar(cacao);
            llenar(azucar);
        } catch (ExcepcionVasoNoCabe e) {
            // Encadenamos la causa para que el stack trace sea completo
            throw new ExcepcionVasoDesayuno(
                "No se puede preparar el vaso de desayuno (vaso de " +
                capacidadMax + " ml)", e);
        }
    }
}


// =============================================================================
// SECCIÓN 6 — ESTRUCTURA try-catch-finally EN DETALLE
// =============================================================================
//
//  try {
//      // Código que PUEDE lanzar excepciones
//  }
//  catch (TipoExcepcion1 e) {
//      // Se ejecuta SOLO si ocurrió TipoExcepcion1
//      // e.getMessage()        → mensaje de la excepción
//      // e.getClass().getName()→ nombre de la clase
//      // e.printStackTrace()   → traza completa (útil en desarrollo)
//      // e.getCause()          → excepción encadenada (si la hay)
//  }
//  catch (TipoExcepcion2 | TipoExcepcion3 e) {  // ← multi-catch (Java 7+)
//      // Se ejecuta si ocurrió TipoExcepcion2 O TipoExcepcion3
//  }
//  catch (Exception e) {
//      // Captura cualquier Exception no capturada antes (comodín)
//      // ¡Usar con cuidado! Puede ocultar errores.
//  }
//  finally {
//      // Se ejecuta SIEMPRE: haya o no haya excepción
//      // Ideal para cerrar recursos: ficheros, conexiones, etc.
//  }
//
//  REGLA DEL ORDEN: las ramas catch van de más específica a más general.
//  Si pones 'catch (Exception e)' primero, las siguientes nunca se alcanzan.


// =============================================================================
// SECCIÓN 7 — CLASE Cuenta: otro ejemplo completo
// =============================================================================

class Cuenta {

    private final String cliente;
    private double saldo;
    private static final double GASTOS_APERTURA = 10.0;

    /**
     * Crea una cuenta bancaria descontando los gastos de apertura.
     *
     * @param cliente       nombre del titular
     * @param saldoInicial  cantidad depositada al abrir la cuenta
     * @throws SaldoInicialInsuficiente  si el saldo inicial no cubre los gastos
     */
    public Cuenta(String cliente, double saldoInicial) throws SaldoInicialInsuficiente {

        if (saldoInicial < GASTOS_APERTURA) {
            throw new SaldoInicialInsuficiente(
                "Saldo inicial " + saldoInicial + "€ insuficiente. " +
                "Se necesitan al menos " + GASTOS_APERTURA + "€ de gastos de apertura.");
        }

        this.cliente = cliente;
        this.saldo   = saldoInicial - GASTOS_APERTURA;
    }

    /**
     * Retira dinero de la cuenta.
     *
     * @param cantidad importe a retirar
     * @throws SaldoInsuficiente  si el saldo no cubre la cantidad
     */
    public void sacarDinero(double cantidad) throws SaldoInsuficiente {

        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                "La cantidad a retirar debe ser positiva");
        }

        if (cantidad > saldo) {
            throw new SaldoInsuficiente(saldo, cantidad);
        }

        saldo -= cantidad;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                "La cantidad a ingresar debe ser positiva");
        }
        saldo += cantidad;
    }

    public double getSaldo()   { return saldo; }
    public String getCliente() { return cliente; }
}


// =============================================================================
// SECCIÓN 8 — BUENAS PRÁCTICAS Y ANTIPATRONES
// =============================================================================
//
//  ✅  BUENAS PRÁCTICAS
//  ─────────────────────
//  1. Usa mensajes descriptivos en el constructor de la excepción.
//  2. Crea clases de excepción específicas (no uses siempre Exception genérica).
//  3. Encadena excepciones (causa) al "traducir" de bajo a alto nivel.
//  4. Documenta con @throws en el Javadoc de cada método.
//  5. Libera recursos en finally (o usa try-with-resources).
//  6. Lanza la excepción lo antes posible (fail-fast).
//
//  ❌  ANTIPATRONES (qué NO hacer)
//  ─────────────────────────────────
//  a) Catch vacío: silencia el error sin que nadie lo sepa.
//       catch (Exception e) { }    ← NUNCA hagas esto
//
//  b) Capturar Exception o Throwable de forma genérica cuando no es necesario.
//       catch (Exception e) { /* tratas todo igual */ }
//
//  c) Usar excepciones para controlar flujo normal del programa.
//       try { return array[i]; } catch (ArrayIndexOutOfBoundsException e) { return -1; }
//       → Mejor: if (i >= 0 && i < array.length) ...
//
//  d) Perder la causa al relanzar.
//       catch (IOException e) { throw new MiExcepcion("fallo"); }  // ← pierde e
//       → Mejor: throw new MiExcepcion("fallo", e);               // ← conserva e
//
//  e) Declarar throws Exception en todos los métodos (too broad).


// =============================================================================
// SECCIÓN 9 — try-with-resources (Java 7+)
// =============================================================================
//
//  Para objetos que implementan AutoCloseable (ficheros, streams, conexiones…)
//  el bloque try-with-resources cierra el recurso automáticamente, incluso
//  si se lanza una excepción. Equivale a un finally con close().
//
//  SINTAXIS:
//    try (BufferedReader br = new BufferedReader(new FileReader("fichero.txt"))) {
//        String linea = br.readLine();
//        // ...
//    }
//    // br.close() se llama automáticamente aquí, haya o no excepción
//
//  Varios recursos (se cierran en orden inverso):
//    try (InputStream in  = new FileInputStream("entrada.txt");
//         OutputStream out = new FileOutputStream("salida.txt")) {
//        // ...
//    }


// =============================================================================
// SECCIÓN 10 — CLASE PRINCIPAL: demostraciones
// =============================================================================

public class GuiaExcepciones {

    // ─── 10.1 Demostración básica: try-catch simple ──────────────────────────
    static void demo_tryCatchSimple() {
        System.out.println("\n=== DEMO 1: try-catch simple ===");

        Vaso vaso = new Vaso(200);

        try {
            vaso.llenar(150);
            System.out.println("Llenado 150 ml. Contenido: " + vaso.getCantidad());

            // Esta llamada supera la capacidad → lanza ExcepcionVasoNoCabe
            vaso.llenar(100);
            System.out.println("Esta línea NO se ejecuta si hay excepción");

        } catch (ExcepcionVasoNoCabe e) {
            // e.getMessage() devuelve el mensaje que pasamos al constructor
            System.err.println("ERROR capturado: " + e.getMessage());
        }

        System.out.println("El programa continúa después del try-catch.");
    }

    // ─── 10.2 Multi-catch y finally ──────────────────────────────────────────
    static void demo_multiCatchYFinally() {
        System.out.println("\n=== DEMO 2: multi-catch y finally ===");

        Vaso vaso = new Vaso(100);

        try {
            vaso.llenar(50);

            // Argumento negativo → lanza ArgumentoNegativoException (unchecked)
            vaso.llenar(-10);

        } catch (ExcepcionVasoNoCabe e) {
            System.err.println("Vaso lleno: " + e.getMessage());

        } catch (ArgumentoNegativoException e) {
            // Esta se captura aquí porque es más específica
            System.err.println("Argumento inválido: " + e.getMessage());

        } catch (Exception e) {
            // Comodín: captura cualquier otra excepción no prevista
            System.err.println("Error inesperado: " + e.getMessage());

        } finally {
            // Se ejecuta SIEMPRE (aquí simula cerrar un recurso)
            System.out.println("finally ejecutado. Contenido actual: " + vaso.getCantidad());
        }
    }

    // ─── 10.3 Multi-catch con | (Java 7+) ────────────────────────────────────
    static void demo_multiCatchUnificado() {
        System.out.println("\n=== DEMO 3: multi-catch con | ===");

        Vaso vaso = new Vaso(100);

        try {
            vaso.llenar(200); // supera capacidad

        } catch (ExcepcionVasoNoCabe | ArithmeticException e) {
            // Útil cuando el tratamiento de dos excepciones es idéntico
            System.err.println("Capturado (" + e.getClass().getSimpleName() + "): " + e.getMessage());
        }
    }

    // ─── 10.4 Propagación: la excepción sube al método que llama ─────────────
    static void demo_propagacion() {
        System.out.println("\n=== DEMO 4: propagación de excepciones ===");

        Vaso vaso = new Vaso(200);

        // prepararDesayunoSinTratar no captura la excepción, la propaga.
        // Quien llama (este método) debe capturarla.
        try {
            vaso.prepararDesayunoSinTratar(250, 30, 10); // 250 ya supera 200

        } catch (ExcepcionVasoNoCabe e) {
            System.err.println("Capturada en demo_propagacion: " + e.getMessage());
        }
    }

    // ─── 10.5 Encadenamiento de excepciones ──────────────────────────────────
    static void demo_encadenamiento() {
        System.out.println("\n=== DEMO 5: encadenamiento (cause) ===");

        Vaso vaso = new Vaso(200);

        try {
            vaso.prepararDesayunoConRelanzamiento(250, 30, 10);

        } catch (ExcepcionVasoDesayuno e) {
            System.err.println("Error de alto nivel: " + e.getMessage());
            // getCause() devuelve la ExcepcionVasoNoCabe original
            if (e.getCause() != null) {
                System.err.println("Causa original: " + e.getCause().getMessage());
            }
            // Para ver la traza completa en producción/debug:
            // e.printStackTrace();
        }
    }

    // ─── 10.6 Excepción con datos extra (SaldoInsuficiente) ──────────────────
    static void demo_excepcionConDatos() {
        System.out.println("\n=== DEMO 6: excepción con campos adicionales ===");

        try {
            Cuenta cuenta = new Cuenta("Ana García", 50.0);
            System.out.println("Cuenta creada. Saldo: " + cuenta.getSaldo() + "€");

            cuenta.sacarDinero(200.0); // más de lo que hay

        } catch (SaldoInicialInsuficiente e) {
            System.err.println("No se pudo crear la cuenta: " + e.getMessage());

        } catch (SaldoInsuficiente e) {
            // Accedemos a los campos extra de la excepción
            System.err.println("Retirada fallida: " + e.getMessage());
            System.err.printf("  Tenías: %.2f€  |  Pediste: %.2f€%n",
                e.getSaldoActual(), e.getCantidadPedida());
        }
    }

    // ─── 10.7 Excepción en el constructor ────────────────────────────────────
    static void demo_excepcionEnConstructor() {
        System.out.println("\n=== DEMO 7: excepción lanzada desde un constructor ===");

        try {
            // Saldo inicial de 5€ < GASTOS_APERTURA(10€) → excepción
            Cuenta cuentaPobre = new Cuenta("Bob", 5.0);
            System.out.println("Cuenta creada para " + cuentaPobre.getCliente());

        } catch (SaldoInicialInsuficiente e) {
            System.err.println("No se pudo abrir la cuenta: " + e.getMessage());
        }
    }

    // ─── 10.8 try-with-resources ─────────────────────────────────────────────
    static void demo_tryWithResources() {
        System.out.println("\n=== DEMO 8: try-with-resources (lectura de fichero) ===");

        // Nota: este fichero no existe en este entorno, pero ilustra el patrón.
        // El BufferedReader se cierra automáticamente al salir del try.
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
        // br.close() ya fue llamado automáticamente, sin necesidad de finally
    }

    // ─── 10.9 Excepción dentro de un bucle (reintentar) ──────────────────────
    static void demo_reintentarEnBucle() {
        System.out.println("\n=== DEMO 9: pedir cantidad válida en bucle (como el ejercicio del PDF) ===");

        Vaso vaso = new Vaso(100);
        // Simulamos entradas del usuario (en vez de Scanner para no bloquear el ejemplo)
        double[] intentos = {150, 200, 80}; // los dos primeros fallan, el tercero cabe

        for (double cantidad : intentos) {
            try {
                vaso.llenar(cantidad);
                System.out.printf("✓ Llenado %.0f ml. Total: %.0f ml%n", cantidad, vaso.getCantidad());
                break; // éxito → salimos del bucle

            } catch (ExcepcionVasoNoCabe e) {
                System.err.printf("✗ No cabe %.0f ml. Intenta con menos.%n", cantidad);
            }
        }
    }

    // ─── 10.10 Excepciones predefinidas más habituales ───────────────────────
    static void demo_excepcionesPredefinidas() {
        System.out.println("\n=== DEMO 10: excepciones predefinidas de Java ===");

        // NullPointerException
        try {
            String s = null;
            s.length(); // lanza NullPointerException
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int x = arr[10];  // lanza ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // ArithmeticException (división por cero)
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        }

        // NumberFormatException
        try {
            int n = Integer.parseInt("no_es_un_numero");
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
        }

        // ClassCastException
        try {
            Object obj = "Hola";
            Integer i = (Integer) obj;  // lanza ClassCastException
        } catch (ClassCastException e) {
            System.err.println("ClassCastException: " + e.getClass().getSimpleName());
        }

        // IllegalArgumentException (unchecked, para validar argumentos)
        try {
            Vaso v = new Vaso(100);
            v.llenar(-5);  // ArgNegativo (unchecked): no necesita try-catch
        } catch (ExcepcionVasoNoCabe e) {
            System.err.println("VasoNoCabe: " + e.getMessage());
        } catch (ArgumentoNegativoException e) {
            System.err.println("ArgumentoNegativo (RuntimeException): " + e.getMessage());
        }
    }

    // ─── main: ejecutar todas las demos ──────────────────────────────────────
    public static void main(String[] args) {
        demo_tryCatchSimple();
        demo_multiCatchYFinally();
        demo_multiCatchUnificado();
        demo_propagacion();
        demo_encadenamiento();
        demo_excepcionConDatos();
        demo_excepcionEnConstructor();
        demo_tryWithResources();
        demo_reintentarEnBucle();
        demo_excepcionesPredefinidas();

        System.out.println("\n=== FIN DE LA GUÍA ===");
    }
}

// =============================================================================
// RESUMEN RÁPIDO
// =============================================================================
//
//  CUÁNDO USAR QUÉ
//  ───────────────────────────────────────────────────────────────────────────
//  extends Exception         → Checked. Error externo recuperable.
//  extends RuntimeException  → Unchecked. Bug del programador / precondición.
//  throw new X("msg")        → Lanzar la excepción.
//  throws X en la firma      → Declarar que el método puede lanzarla (checked).
//  try { } catch (X e) { }   → Capturar y gestionar.
//  finally { }               → Código que SIEMPRE se ejecuta (cerrar recursos).
//  try (Recurso r = ...) { } → try-with-resources: cierre automático.
//  throw new X("msg", e)     → Encadenar (conservar causa original).
//  e.getMessage()            → Mensaje de la excepción.
//  e.getCause()              → Excepción encadenada (puede ser null).
//  e.printStackTrace()       → Traza completa (solo para debug).
// =============================================================================
