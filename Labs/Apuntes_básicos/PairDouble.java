

public class PairDouble {
    private double left;
    private double right;

    private PairDouble(){}

    public PairDouble(double left, double right){
        this.left = left;
        this.right = right;
    }

    public PairDouble(String pair) throws IllegalArgumentException{
        String[] es = pair.split(",");
        if(es.length != 2){
            throw new IllegalArgumentException("PairString::PairString(String pair): ");
        }
        this.left = Double.parseDouble(es[0].substring(1));
        this.right = Double.parseDouble(es[1].substring(0, es[1].length()-1));
    }

    public double getLeft(){ return this.left; }

    public double getRight(){ return this.right; }

    public String toString(){
        return "(" + this.left + "," + this.right + ")";
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o instanceof PairDouble p)
            return this.left == p.left && this.right == p.right;
        return false;
    }

    public static void main(String[] args){
        
    }
}
