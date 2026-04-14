import java.util.Arrays; 

public class VectorTest {
  
  static void test1 ()
  {  
    double[] uCoords = { 1.0, 2.0, 3.0, 4.0 };
    Vector u = new Vector(uCoords);
    Assert.assertEquals(u.toString(), "(1.0,2.0,3.0,4.0)");
  }
  
  static void test2 ()
  {  
    Vector u = new Vector(3);
    Assert.assertEquals(u.toString(), "(0.0,0.0,0.0)");
    u = new Vector(0);
    Assert.assertEquals(u.toString(), "()");
  }

  static void test3 ()
  {  
    double[] uCoords = { 1.0, 2.0, 3.0, 4.0 };
    double[] vCoords = { 5.0, 2.0, 4.0, 1.0 };
    Vector u = new Vector(uCoords);
    Vector v = new Vector(vCoords);
    Assert.assertEquals(u.sum(v).toString(), "(6.0,4.0,7.0,5.0)");
  }

  static void test4 ()
  {  
    double[] uCoords = { 1.0, 2.0, 3.0, 4.0 };
    double[] vCoords = { 5.0, 2.0, 4.0, 1.0 };
    Vector u = new Vector(uCoords);
    Vector v = new Vector(vCoords);
    Assert.assertEquals(u.dif(v).toString(), "(-4.0,0.0,-1.0,3.0)");
  }

  static void test5 ()
  {  
    double[] uCoords = { 1.0, 2.0, 3.0, 4.0 };
    double[] vCoords = { 5.0, 2.0, 4.0, 1.0 };
    Vector u = new Vector(uCoords);
    Vector v = new Vector(vCoords);
    Assert.assertEquals(u.prod(10.0).toString(), "(10.0,20.0,30.0,40.0)");
  }

  static void test6 ()
  {  
    double[] uCoords = { 1.0, 2.0, 3.0, 4.0 };
    double[] vCoords = { 5.0, 2.0, 4.0, 1.0 };
    Vector u = new Vector(uCoords);
    Vector v = new Vector(vCoords);
    Assert.assertEquals(u.prod(v), 25.0);
  }

  static void test7 ()
  {  
    double[] uCoords = { 1.0, 2.0, 3.0, 4.0 };
    Vector u = new Vector(uCoords);
    Assert.assertEquals(String.format("%.2f", u.mod()), "5,48");
  }

  static void test8 ()
  {  
    double[] uCoords = { 2.0, 2.0, 2.0 };
    Vector u = new Vector(uCoords);
    Vector v = u.dir();
    String[] vRound = {String.format("%.2f",v.coord(0)),
                       String.format("%.2f",v.coord(1)),
                       String.format("%.2f",v.coord(2))};
    Assert.assertEquals(Arrays.toString(vRound), "[0,58, 0,58, 0,58]");
  }

  static void test9 ()
  {  
    double[] uCoords = { 1.0, 2.0, 3.0, 4.0 };
    double[] vCoords = { 5.0, 2.0, 4.0, 1.0 };
    Vector u = new Vector(uCoords);
    Vector v = new Vector(vCoords);
    Assert.assertEquals(String.format("%.2f",u.dist(v)), "5,10");
    
    Assert.assertEquals(String.format("%.2f",u.dist(u)), "0,00");
  }
  
  public static void main(String[] args) {
    test1();    
    test2();    
    test3();    
    test4();    
    test5();    
    test6();    
    test7();    
    test8();    
    test9();    
    System.out.println("Han pasado todas las pruebas");
  }
}
