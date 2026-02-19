

class Punto{
    public double x, y;
    
    public String pointToString(){
        return "(x = " + this.x + ", y = " + this.y +" )";
    }
    
    public Punto midPunto(Punto p){
        Punto m = new Punto();
        m.x = (this.x + p.x)/2;
        m.y = (this.y + p.y)/2;
        return m;

    }

    public void addTo(Punto p){
        this.x += p.x;
        this.y += p.y;
    }

    public Punto add(Punto p){
        Punto k = new Punto();
        k.x = this.x + p.x;
        k.y = this.y + p.y;
        return k;
    }

    public Punto(){ // COnstructor por defecto
        this.x = 1.0;
        this.y= 2.0;
    }
    public Punto(Punto p){ // Constructor de copia
        this.x = p.x;
        this.y = p.y;
    }
    public Punto(double x, double y){ //Constructor multiparámetros
        this.x = x;
        this.y = y;
    }
    public Punto(double d){
        this.x = d;
        this.y = d;
    }   

}



public class ClassFuera {

    public static void main(String[] args){
        Punto p1 = new Punto(4.0);
        Punto p2 = new Punto(2.5, -4.8);
        System.out.println(p1.pointToString());

        System.out.println(p1.add(p2).pointToString());
        Punto s1 = p1.add(p2);
        System.out.println(s1.pointToString());
        System.out.println(s1);
    }

    
}
