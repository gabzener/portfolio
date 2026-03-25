package Laboratorios_2.Lab2;

class Frac2 { //Clase en donde definimos las fracciones

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
  public Frac2(){ //Constructor por defecto
  }
  public Frac2(int p, int q){ // Constructor con 2 variables para la Frac2ción
    this.setP(p);
    this.setQ(q);
  }
  public Frac2(int p){ // Constructor para numeros enteros (num) / 1
    this.setP(p);
    this.setQ(1);
  }
  public String toString() { // Método para imprimir las Frac2ciones
    return this.getP() + " / "+ this.getQ();
  }
  public Frac2 sum(Frac2 p){ // Método de suma de Frac2ciones
    Frac2 f0 = new Frac2();
    f0.setP((this.getP() * p.getQ()) + (p.getP() * this.getQ()));
    f0.setQ(this.getQ() * p.getQ());
    f0.sim();
    return f0;
  }
  public Frac2 res(Frac2 p){ // Método de resta de Frac2ciones
    Frac2 f0 = new Frac2();
    f0.setP((this.getP() * p.getQ()) - (p.getP() * this.getQ()));
    f0.setQ(this.getQ() * p.getQ());
    f0.sim();
    return f0;
  }
  public Frac2 mul(Frac2 p){ // Método de multiplicaciones de Frac2ciones
    Frac2 f0 = new Frac2();
    f0.setP(this.getP() * p.getP());
    f0.setQ(this.getQ() * p.getQ());
    f0.sim();
    return f0;
  }
  public Frac2 div(Frac2 p){ // Metodo de division de Frac2ciones
    Frac2 f0 = new Frac2();
    f0.setP(this.getP() * p.getQ());
    f0.setQ(this.getQ() * p.getP());
    f0.sim();
    return f0;
  }
  public boolean equals(Frac2 p){ // Método de comprobar si las Frac2ciones son idénticas
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
  private void sim(){ // Simplicación de Frac2ciones mediante el MCD
    int maximocd = mcd(this.getP(), this.getQ());
    this.setP(this.getP() / maximocd);
    this.setQ(this.getQ() / maximocd);
  }
  public float operar(){ // Operacion de las Frac2ciones
    return (float) this.getP() / this.getQ();
  }

}


