public class Poeppel_B
{
    protected Poeppel links;
    protected Poeppel rechts;
    public Poeppel_B(Poeppel l, Poeppel r)
    {
        links = l;
        rechts = r;
    }

    public void naechsteKugel(){
    if (Math.random() <0.5){
        links.naechsteKugel();
    }
    else {
        rechts.naechsteKugel();
    }
}

}
