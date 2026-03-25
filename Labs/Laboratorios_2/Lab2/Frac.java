package Laboratorios_2.Lab2;



class Frac { // Clase en donde definimos las fracciones

  private final int p, q; 

  public int getP() { // Obtener P
    return this.p;
  }
  
  public int getQ() { // Obtener Q
    return this.q;
  }

  
  public Frac(){ // Constructor por defecto
    this.p = 0; // Valor por defecto
    this.q = 1; // Denominador no puede ser 0
  }
  
  public Frac(int p, int q){ // Constructor con 2 variables para la fracción
    this.p = p;
    this.q = q;
    this.sim(); // Simplificar al crear
  }
  
  public Frac(int p){ // Constructor para numeros enteros (num) / 1
    this.p = p;
    this.q = 1;
  }
  
  public String toString() { // Método para imprimir las fracciones
    return this.getP() + " / " + this.getQ();
  }
  
  public Frac sum(Frac p){ // Método de suma de fracciones
    int P = (this.getP() * p.getQ()) + (p.getP() * this.getQ());
    int Q = this.getQ() * p.getQ();
    return new Frac(P, Q); // Crear nueva fracción (ya se simplifica en constructor)
  }
  
  public Frac res(Frac p){ // Método de resta de fracciones
    int P = (this.getP() * p.getQ()) - (p.getP() * this.getQ());
    int Q = this.getQ() * p.getQ();
    return new Frac(P, Q);
  }
  
  public Frac mul(Frac p){ // Método de multiplicaciones de fracciones
    int P = this.getP() * p.getP();
    int Q = this.getQ() * p.getQ();
    return new Frac(P, Q);
  }
  
  public Frac div(Frac p){ // Metodo de division de fracciones
    int P = this.getP() * p.getQ();
    int Q = this.getQ() * p.getP();
    return new Frac(P, Q);
  }
  
  public boolean equals(Frac p){ // Método de comprobar si las fracciones son idénticas
    return this.getP() == p.getP() && this.getQ() == p.getQ();
  }
  
  private int mcd(int a, int b) { // Máximo Común Divisor por Algoritmo de Euclides
    a = Math.abs(a);
    b = Math.abs(b);
    while (b != 0) {
      int residuo = b;
      b = a % b;
      a = residuo;
    }
    return a;
  }
  
  private void sim(){ // Simplificación de fracciones mediante el MCD
  }
  
  public float operar(){ // Operacion de las fracciones
    return (float) this.getP() / this.getQ();
  }

}