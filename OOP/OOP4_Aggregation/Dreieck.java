public class Dreieck extends Flächen
{
    protected double gseite;
    protected double höhe;

    public Dreieck(double a,double b)
    {
        gseite = a;
        höhe = b;
    }

    public double flächeninhalt(){

        return (1.0/2.0)*gseite*höhe;
    }

}
