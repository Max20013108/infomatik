public class Trichter
{
    protected GaltonElement startpoebble;
    public Trichter(GaltonElement p)
    {
        startpoebble = p;
    }
    
    public void fuelleKugeln(int n){
        for(int i = 0;i<n;i++){
            startpoebble.naechsteKugel();
        }
    }
    
    
    }

