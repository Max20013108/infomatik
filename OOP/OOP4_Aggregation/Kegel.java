
public class Kegel extends Körper
{
    protected double radius;
    protected double höhe;
    double pi = 3.141;
    protected double s;
    //protected Flächen[] f = new Flächen[2];
    protected double winkel;
    public Kegel(double r, double h)
    {
        f=new Flächen[2];
        radius = r;
        höhe = h;
        s = Math.sqrt(radius*radius+höhe*höhe);
        winkel = (radius/s)*360.0;
        f[0]=new Kreis(radius);
        f[1]=new Kreisauschnitt(winkel,s);
    }

    public double volumen()
    {
        return (1.0/3.0)*pi*radius*radius*höhe;
    }
}