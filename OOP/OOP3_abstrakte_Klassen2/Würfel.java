
public class Würfel extends Körper
{
    private double kantenlänge;
    protected Flächen[] f = new Flächen[6];
    
    public Würfel(double a) {
        kantenlänge = a;
          for(int i=0;i<6;i++){
          f[i]=new Quadrat(kantenlänge);   
        }
    }
    
    // Methode zur Berchnung des Volumens
    public double volumen() {
        return kantenlänge*kantenlänge*kantenlänge;
    }
    
    public double of(){      
      double summe=0;
      for(int i=0;i<f.length;i++){
        summe = summe +f[i].flächeninhalt();
        }
        return summe;
      //return f[0].flächeninhalt()+f[1].flächeninhalt()+f[2].flächeninhalt()+f[3].flächeninhalt()+f[4].flächeninhalt()+f[5].flächeninhalt();
    }
}


