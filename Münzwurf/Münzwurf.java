import java.util.*;
public class Münzwurf{
    public static void Main(String[] args){
        System.out.println("Bitte wähle zwischen Kopf und Zahl");
        Scanner sc = new Scanner(System.in);
        
        String tipp = sc.next();
        
        int zufallszahl = (int)(2*Math.random());
        
        String muenze;
        
        System.out.println(tipp);
        
        if (zufallszahl == 0){
            muenze = "Kopf";
            System.out.println("Es ist Kopf gefallen");
        }
        else{
            muenze = "Zahl";
            System.out.println("Es ist Zahl gefallen");
        }

        if(tipp.equals(muenze)){
            System.out.println("Du hast gewonnen");
        }
        else{
            System.out.println("Du hast verloren");
        }
    }
}