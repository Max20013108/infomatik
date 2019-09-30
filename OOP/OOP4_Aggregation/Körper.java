
public abstract class Körper
{
    protected final double pi =  3.14159265359;
    protected Flächen[] f;
    public abstract double volumen();
    public double of(){
        double summe=0;
        for(int i=0;i<f.length && f[i]!= null;i++){
            summe=summe+f[i].flächeninhalt();   
        }
        return summe;
    }
}
