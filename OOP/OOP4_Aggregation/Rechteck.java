public class Rechteck extends Flächen{

    protected double länge;
    protected double breite;

    public Rechteck(double a, double b){
        länge = a;
        breite = b;
    }

    public Rechteck(){}

    public double flächeninhalt(){
        return länge*breite;
    }

}