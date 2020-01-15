public class Sortieren2
{
    static int[] l = {632,87426,8736,8735,6514};




    public static void ausgabe(int[] liste) {
        System.out.print("{");
        for (int i =0; i<liste.length-1;i++) {
            System.out.print(liste[i]+", ");
        }
        System.out.println(liste[liste.length-1]+"}");
    }





    public static boolean check(int[] liste,int l){
        boolean tf = true; 
        for(int x=0;x<liste.length;x++){
            if(liste[x]==l){
                tf = false;
            }
    }
    return tf;
}
 
public static int[] zufallsListe(int n){
        int[] liste2 = new int[n];
        int t = 0;
        for(int i=0;i<n;){
        System.out.println(i);
            t = (int) Math.floor(n*Math.random())+1;
            if(check(liste2,t)){
                liste2[i] = t;
                i++;
            }
            }
            return liste2;
        }



public static int[] zufallsListe2(int n){
    int[] liste = new int[n];
    for(int i = 0;i<n;i++){
        liste[i]=i+1;
    }

    for(int x=n;x<2*x;x++){
        liste=tauschen(liste, (int) Math.floor(n*Math.random()), (int) Math.floor(n*Math.random()));
    }

   return liste; 
}

public static int[] tauschen(int[] array, int from, int to){;
    int n = array[from];
    array[from] = array[to];
    array[to] = n;
    return array;
}

    public static void main(String[] args) {
        int[] x = zufallsListe2(1000000);
        // System.out.println(x);
        ausgabe(x);
    }
}