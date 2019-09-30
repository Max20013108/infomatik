
public class Kugel extends Körper
{
    double radius;


    public Kugel(double r)
    {
        radius = r;
    }


    public double volumen()
    {
        return pi*4/3*radius*radius*radius;
    }
    
    public double of(){return 0.0;}
}
