/* k = 0-14 Jahre
 * e = 15-49 Jahre
 * a = 50-64 Jahre
 * r = 65+ Jahre
 * der zusatz n sagt aus das es der Wert der nächsten Generation ist
 * schritt = hochzählen für die anzahl der wiederholungen
 * 
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //initialisierung der Variablen
        double k = 12.3;
        double e = 39.1;
        double a = 15.5;
        double r = 16.3;
        int schritt = 0;
        double kn;
        double en;
        double an;
        double rn;
        int z;

        // Schleife um mehrere Generationen hintereinander zurechnen
        System.out.println("Wie viel Jahre sollen Berechnet werden? ");
        // Benutzerabfrage
        Scanner Jahre = new Scanner(System.in);
        // Wert der Benutzerabfrage in Variable geschrieben
        z = Jahre.nextInt();
        while(schritt < z){
            // Berechnung der nächsten Generation
            kn = k*0.93+e*0.02;
            en = k*0.066+e*0.97;
            an = e*0.029+a*0.925;
            rn = a*0.066+r*0.972;
            // Überschreibung der Variablen
            k = kn;
            e = en;
            a = an;
            r = rn;
            // hoch zählen für das abbrechen der Schleife
            schritt = schritt+1;
            // ausgabe der Werte
            System.out.println("Nach " + schritt + " Jahren gibt es:");
            System.out.println(Math.round(100*k)/100.0 + " Millionen Kinder,");
            System.out.println(Math.round(100*e)/100.0 + " Millionen Erwachsene,");
            System.out.println(Math.round(100*a)/100.0 + " Millionen alte");
            System.out.println("und " + Math.round(100*r)/100.0 +" Millionen Rentner");
        }
    }
}

