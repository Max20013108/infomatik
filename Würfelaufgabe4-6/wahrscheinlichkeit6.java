import java.util.Scanner;
public class wahrscheinlichkeit6{
    public static void Main(String[] args){
        int augenzahl = (int)(6*Math.random()+1);
        double zähler = 1;
        double rundenzähler = 0;
        double zählergesamt = 0;
        double wurfdurchschnitt = 0;
        System.out.println("Wie oft soll eine 6 gewürfelt werden");
        Scanner sc = new Scanner(System.in);
        int rundenanzahl =  sc.nextInt();
        while(rundenzähler < rundenanzahl){
            while(augenzahl !=6){
                augenzahl = (int)(6*Math.random()+1);
                zähler++;
            }
            augenzahl = 0;
            rundenzähler++;
        }
        wurfdurchschnitt = Math.round(zähler/rundenzähler*1000)/1000.0;
        System.out.println("Es hat im durchscnitt " + wurfdurchschnitt +" Versuche gebraucht");
        
        
        
    }
}
