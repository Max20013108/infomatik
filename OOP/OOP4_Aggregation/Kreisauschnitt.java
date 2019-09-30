public class Kreisauschnitt extends Flächen
{
    protected double winkel;
    protected double radius;
    public Kreisauschnitt(double winkel, double radius)
    {
        this.winkel = winkel;
        this.radius= radius;

    }

    public double flächeninhalt()
    {
        // put your code here
        return (winkel/360.0)*pi*radius*radius;
    }
}
