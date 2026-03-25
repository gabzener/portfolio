package Laboratorios_2.Lab3;

public class VasoTest {

public static void main(String[] args) throws Exception {
Vaso v = new Vaso(333);
Assert.assertEquals(v.capacidad(), 333);
Assert.assertEquals(v.contenido(), 0);
v.llenarVaso(250);
Assert.assertEquals(v.capacidad(), 333);
Assert.assertEquals(v.contenido(), 250);
v.vaciarVaso(150);
Assert.assertEquals(v.capacidad(), 333);
Assert.assertEquals(v.contenido(), 100);
Assert.assertError(() -> {
v.llenarVaso(250);
});
Assert.assertEquals(v.contenido(), 100);
Assert.assertError(() -> {
v.vaciarVaso(250);
});
Assert.assertEquals(v.contenido(), 100);
final int cantidad = 7;
while (v.contenido() + cantidad < v.capacidad()) {
v.llenarVaso(cantidad);
}
Assert.assertError(() -> {
v.llenarVaso(cantidad);
});
while (cantidad < v.contenido()) {
v.vaciarVaso(cantidad);
}
Assert.assertError(() -> {
v.vaciarVaso(cantidad);
});
System.out.println("Han pasado todas las pruebas");
}
}
