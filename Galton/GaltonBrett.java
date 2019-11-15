import java.util.Scanner;
public class GaltonBrett
{
    public static int anzahlpoeppel(int a){
    int z=0;
        for(int i=1;i<=a;i++){
        z= z+i;
    }
        return z;
    }
    
    
    public static void main(String[] args){
        System.out.println("Wie viele Reihen an poeppeln soll das Brett haben? ");
        Scanner Anzahl = new Scanner(System.in);
        int z = Anzahl.nextInt();
        int anzahlpoeppel = anzahlpoeppel(z);
        GaltonElement[] allpoeppel = new GaltonElement[anzahlpoeppel];

    }
}
