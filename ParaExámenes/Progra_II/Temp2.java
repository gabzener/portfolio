class Temp2 extends Temp {
 
  private int adnac; // año de nacimiento
 
  /** Constructor: cliente preferente con nombre, email y adnac (año de nacimiento)
  Si nom es "", lanza IllegalArgumentException */
  ClientePref (String nombre, String email, int adnac) {

    if (nombre == null){
        throw new IllegalArgumentException();
    } else {
        this.nombre = nombre;
        this.email = email;
        this.adnac = adnac;
    }
  }
 
  /** Constructor: cliente preferente con nombre, email desconocido y adnac (año de nacimiento)
  Si nom es "", lanza IllegalArgumentException */
  ClientePref (String nombre, int adnac) {
        if (nombre == null){
        throw new IllegalArgumentException();
    } else {
        this.nombre = nombre;
        this.adnac = adnac;
    }
  }
 
  /** = Este cliente preferente representado como texto, mostrado de la forma
  <representación del cliente>, <año de nacimiento> */
  public String toString () {
    return super.toString() + ", " + adnac;

 
  }
 
  /** = Año de nacimiento de este cliente */
  int adnac () {
  return adnac;
  }
}