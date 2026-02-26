package Laboratorios_2.Lab1;

class Frac { //Clase en donde definimos las fracciones

  private int p,q; //Valores de p = Numerador y q = Denominador de las fracciones

  public int getP() { // Obtener P
    return this.p;
  }
  public int getQ() { // Obtener Q
    return this.q;
  }
  public void setP(int x) { // Establecer P
    this.p = x;
  }
  public void setQ(int y) { // Establecer Q
    this.q = y;
  }
  public Frac(){ //Constructor por defecto
  }
  public Frac(int p, int q){ // Constructor con 2 variables para la fracción
    this.setP(p);
    this.setQ(q);
  }
  public Frac(int p){ // Constructor para numeros enteros (num) / 1
    this.setP(p);
    this.setQ(1);
  }
  public String toString() { // Método para imprimir las fracciones
    return this.getP() + " / "+ this.getQ();
  }
  public void sum(Frac p){ // Método de suma de fracciones
    this.setP((this.getP() * p.getQ()) + (p.getP() * this.getQ()));
    this.setQ(this.getQ() * p.getQ());
    this.sim();
  }
  public void res(Frac p){ // Método de resta de fracciones
    this.setP((this.getP() * p.getQ()) - (p.getP() * this.getQ()));
    this.setQ(this.getQ() * p.getQ());
    this.sim();
  }
  public void mul(Frac p){ // Método de multiplicaciones de fracciones
    this.setP(this.getP() * p.getP());
    this.setQ(this.getQ() * p.getQ());
    this.sim();
  }
  public void div(Frac p){ // Metodo de division de fracciones
    this.setP(this.getP() * p.getQ());
    this.setQ(this.getQ() * p.getP());
    this.sim();
  }
  public boolean equals(Frac p){ // Método de comprobar si las fracciones son idénticas
    return this.getP() == p.getP() && this.getQ() == p.getQ();
  }
  private int mcd(int a, int b) { // Máximo Común Divisor por Algoritmo de Euclides
    while (b != 0) {
      int residuo = b;
      b = a % b;
      a = residuo;
    }
    return Math.abs(a);
  }
  private void sim(){ // Simplicación de fracciones mediante el MCD
    int maximocd = mcd(this.getP(), this.getQ());
    this.setP(this.getP() / maximocd);
    this.setQ(this.getQ() / maximocd);
  }
  public float operar(){ // Operacion de las fracciones
    return (float) this.getP() / this.getQ();
  }

}


