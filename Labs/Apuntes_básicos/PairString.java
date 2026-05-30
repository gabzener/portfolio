
class PairString {
    private String left;
    private String right;

    private PairString(){}

    public PairString(String left, String right){
        this.left = left;
        this.right = right;
    }

    public PairString(String pair) throws IllegalArgumentException{
        String[] es = pair.split(",");
        if(es.length != 2){
            throw new IllegalArgumentException("PairString::PairString(String pair): ");
        }
        this.left = es[0].substring(1);
        this.right = es[1].substring(0, es[1].length()-1);
    }

    public String getLeft(){ return this.left; }

    public String getRight(){ return this.right; }

    public String toString(){
        return "(" + this.left + "," + this.right + ")";
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o instanceof PairString p)
            return this.left.equals(p.left) && this.right.equals(p.right);
        return false;
    }

    public static void main(String[] args){
        PairString p1 = new PairString("Hola", "Mundo");
        PairString p2 = new PairString("(Hola,Mundo)");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
    }
}
