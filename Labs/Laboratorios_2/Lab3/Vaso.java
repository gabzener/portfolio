package Laboratorios_2.Lab3;

public class Vaso {
  

  private int capacidad; 
  private int contenido;

  public Vaso(){
  }
  public Vaso(int capacidad){
    this.capacidad = capacidad;
    this.contenido = 0;
  }
  public Vaso(int cantidad, int contenido){
    this.capacidad = cantidad;
      if (capacidad <= 0){
        throw new IllegalArgumentException("La capacidad no puede ser menor/igual a 0");
      }
    this.contenido = contenido;
      if (contenido < 0){
        throw new IllegalArgumentException("La capacidad no puede ser menor que 0");
      }
  }

  /**
   * Añade una cantidad al vaso
   * @pre {@code contenido() + cantidad <= capacidad()}
   * 
   * @post el contenido del vaso se habrá incrementado en {@code cantidad}
   * 
   * @param cantidad Mililitros para añadir al vaso
   */
  public void llenarVaso(int cantidad){
    if (contenido + cantidad > capacidad)
      throw new RuntimeException("La cantidad supera la capacidad del vaso");
    else
      this.contenido += cantidad;
  }

  /**
   * Añade una cantidad al vaso
   * @pre {@code contenido() - cantidad >= capacidad()}
   * 
   * @post el contenido del vaso habrá disminuído en {@code cantidad}
   * 
   * @param cantidad Mililitros para añadir al vaso
   * 
   */
  public void vaciarVaso(int cantidad){
    if (contenido - cantidad < 0)
      throw new RuntimeException("La cantidad es mayor a lo que hay en el vaso");
    else
      this.contenido -= cantidad;
  }
  public int capacidad(){
    return this.capacidad;

  }
  public int contenido(){
    return this.contenido;

  }

/**
* Devuelve un string que representa un vaso.
*/
public String toString() {
int nivel = 5 * contenido / capacidad;
String resultado = String.format("| | %dml\n", capacidad);
for (int i = 4; nivel < i; i--)
resultado += "| |\n";
if (contenido > 0)
resultado += String.format("|------| %dml\n", contenido);
else
resultado += "| |\n";
for (int i = nivel - 1; i >0; i--)
resultado += "| |\n";
resultado += "|______| 0ml\n";
return resultado;


}
}