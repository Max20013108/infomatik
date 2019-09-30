public class PyramideRechteck extends Körper
{
    protected Flächen[] f = new Flächen[5];
    protected double gseite;
    protected double höhe;
    protected double shöhe;
    public PyramideRechteck(double a,double b)
    {
     gseite = a;
     höhe = b;
     shöhe=Math.sqrt((1/2)*gseite*(1/2)*gseite+höhe*höhe);
     f[0] = new Quadrat(gseite);
     for(int i=1;i<=2;i++){
         f[i] = new Dreieck(gseite,shöhe);
     }
    }
    
    public double volumen(){
        return (1.0/3.0)*gseite*gseite*höhe;
    }
    
    public double of(){
    double summe=0;
    for(int x=0;x<=4;x++){
        summe=summe+f[x].flächeninhalt(); 
    }
    return summe;
    }
    
}
