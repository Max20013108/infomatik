public class zweistufigesGaltonBrett
{
    public static int[] durchlauf (int a){
        
        // Aufbau des Galton-Bretts
        Fach fach1 = new Fach();
        Fach fach2 = new Fach();
        Fach fach3 = new Fach();
        Poeppel poeppel1 = new Poeppel(fach1, fach2);
        Poeppel poeppel2 = new Poeppel(fach2, fach3);
        Poeppel poeppel3 = new Poeppel(poeppel1, poeppel2);
        Trichter trichter1 = new Trichter(poeppel3);
        
        // Ein Experiment starten
        trichter1.fuelleKugeln(a);
        
        // Auswertung
        int[] kugeln = new int[3];

        kugeln[0]=fach1.anzahlKugeln;
        kugeln[1]=fach2.anzahlKugeln;
        kugeln[2]=fach3.anzahlKugeln;
        return kugeln;
    }
}