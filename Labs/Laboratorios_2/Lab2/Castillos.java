package Laboratorios_2.Lab2;

public class Castillos {
public static void main(String[] args) {
 /*Frac f;
  f = new Frac(1,4);
  System.out.println(f);
  Frac a = new Frac(1,2);
  Frac r = a.sum(new Frac(2,3));
  System.out.println(r); */


  Frac castillo =
  new Frac(3,5)
  .res(new Frac(1,4))
  .sum(new Frac(1,10))
  .mul(new Frac(3,2))
  .res(new Frac(1,5))
  .div(new Frac(2,6)
    .sum(new Frac(1,3))
    .res(new Frac(6,4))
    .div(new Frac(2,3))
    .sum(new Frac(1,6)));

  
  System.out.println(castillo.operar());


  Frac f = new Frac(1,4);
Assert.assertEquals("1 / 4", f.toString());
System.out.println("Han pasado todas las pruebas");

Frac a = new Frac(1,21);
Frac b = new Frac(2,7);
Frac r = a.sum(b);
Assert.assertEquals(r, new Frac(1,3));
  }

}

