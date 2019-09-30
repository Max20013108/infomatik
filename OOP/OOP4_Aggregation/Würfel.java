
public class Würfel extends Körper
{
    private double kantenlänge;

    public Würfel(double a) {
        kantenlänge = a;
        f=new Flächen[6];
        for(int i=0;i<6;i++){
            f[i]=new Quadrat(kantenlänge);   
        }
    }

    // Methode zur Berchnung des Volumens
    public double volumen() {
        return kantenlänge*kantenlänge*kantenlänge;
    }
}

