public class Fach
{
    public int anzahlKugeln;
 
    public Fach()
    {
        anzahlKugeln = 0;
    }


    public void naechsteKugel()
    {
        anzahlKugeln = anzahlKugeln+1;
    }
    
    public void leeren(){
        anzahlKugeln = 0;
    }
}