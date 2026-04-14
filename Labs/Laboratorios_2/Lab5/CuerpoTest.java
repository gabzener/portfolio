public class CuerpoTest {

  static void test1 ()
  {  
    String linea = "0.0 4.5 1.0 0.0 1.5";
    Cuerpo c = Universo.cuerpo(linea);
    Assert.assertEquals(c.toString(), "(r=(0.0,4.5) v=(1.0,0.0) m=1.5)");
    
    linea = "0.0e00 4.5e10 1.0e04 0.0e00 1.5e30";
    c = Universo.cuerpo(linea);
    Assert.assertEquals(c.toString(), 
                        "(r=(0.0,4.5E10) v=(10000.0,0.0) m=1.5E30)");
  }
  
  static void test2 ()
  {  
    Cuerpo c = Universo.cuerpo("0.0 4.0 1.0 0.0 1.0");
    
    double[] fCoords = {2.0, 2.0};
    Vector f = new Vector(fCoords);
    double dt = 10;
    
    c.mover(f, dt);

    Assert.assertEquals(c.toString(), 
                        "(r=(210.0,204.0) v=(21.0,20.0) m=1.0)");
  }
  
  static void test3 ()
  {  
    Cuerpo c1 = Universo.cuerpo("0.0 4.0 1.0 0.0 1.0");
    Cuerpo c2 = Universo.cuerpo("0.0 6.0 2.0 0.0 2.0");
    Vector f = c1.fuerza(c2);
    
    Assert.assertEquals(String.format("%.3f",f.mod()/1e-11), "3,335");
    
    double[] coordsRes = {0.0, 1.0};
    Vector res = new Vector(coordsRes);
    Assert.assertEquals(f.dir(),res);
  }
  
  public static void main(String[] args) {
    test1();    
    test2();    
    test3();    
    System.out.println("Han pasado todas las pruebas");
  }
}
