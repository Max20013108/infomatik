import java.io.*;
public class Sortieren2
{



//gibt das array ordentlich aus
    public static void ausgabe(int[] liste) {
        System.out.print("{");
        for (int i =0; i<liste.length-1;i++) {
            System.out.print(liste[i]+", ");
        }
        System.out.println(liste[liste.length-1]+"}");
    }


// erzeugt eine Zuffällige liste der länge n
public static int[] zufallsListe2(int n){
    int[] liste = new int[n];
    for(int i = 0;i<n;i++){
        liste[i]=i+1;
    }

    for(int x=0;x<2*n;x++){
        liste=tauschen(liste, (int) Math.floor(n*Math.random()), (int) Math.floor(n*Math.random()));
    }

   return liste; 
}

//tauscht die position von zwei index positionen
public static int[] tauschen(int[] array, int from, int to){;
    int n = array[from];
    array[from] = array[to];
    array[to] = n;
    return array;
}

    public static void main(String[] args) {
        int[] x = zufallsListe2(100000000);
        // x = sortieren(x);
        ausgabe(x);
    }
}
