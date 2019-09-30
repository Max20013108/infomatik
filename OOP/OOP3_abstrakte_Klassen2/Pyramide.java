public class Pyramide extends Körper
{
    protected Flächen[] f = new Flächen[5];
    protected double gseite;
    protected double höhe;
    protected double shöhe;
    public Pyramide(double a,double b)
    {
     gseite = a;
     höhe = b;
     shöhe=Math.sqrt((1/2)*gseite*(1/2)*gseite+höhe*höhe);
     f[0] = new Quadrat(gseite);
     for(int i=1;i<=4;i++){
         f[i] = new Dreieck(gseite,shöhe);
     }
    }
    
    public double volumen(){
        return (1.0/3.0)*gseite*gseite*höhe;
    }
    
    public double of(){
        double summe=0;
        for(int i=0;i<f.length;i++){
        summe=summe+f[i].flächeninhalt(); 
    }
        return summe;
    }
    
}
