public class arbeitenmitarrays
{    
    public static void print(String print){
        System.out.println(print);
    }
    public static int[] hinzufügen(int[] liste, int pos, int s){
        int[] neueListe = new int[liste.length+1];
        for (int i=0;i <pos;i=i+1) {
            neueListe[i]=liste[i];
        }
        neueListe[pos]=s;
        for (int i=pos;i < neueListe.length-1;i=i+1){
            neueListe[i+1]=liste[i];
        }
        return neueListe;        
    }
    
    public static int[] entfernen(int[] liste, int pos){
        int[] neueListe = new int[liste.length-1];
        for (int i=0;i <pos;i=i+1) {
            neueListe[i]=liste[i];
        }
        for (int i=pos+1;i < liste.length;i=i+1){
            neueListe[i-1]=liste[i];
        }
        return neueListe;        
    }
    public static int[] anhaengen(int[] a, int[] b){
        int[] neueListe = new int[a.length+b.length];
        int i = 0;
        while(i<a.length){
            neueListe[i] = a[i];
            i++;
        }
        i=0;
        while(i<b.length){
            neueListe[a.length+i] = b[i];
            i++;
        }
        return neueListe;

    }
    

    public static void main(String[] args){

        String[] M = {
            "amueller@gmx.de",
            "carla2@hotmail.org",
            "herbert.fluhr@web.de",
            "petra@dahm.de",
            "ewen@t-online.de",
            "t_schmidt@web.de",
            "nicole.weber@gmx.de"
        };

        String[] X = {"a","b","c","d"};
        /*
        M = hinzufügen(M,5,"hallo@hallo.com");
        for(String s : M){
            System.out.println(s);
        }
        print("Break");
        M = entfernen(M,5);
        for(String s : M){
            System.out.println(s);
        }
        */

    // M = anhaengen(M,X);
    // for(String s : M){
    //     System.out.println(s);
    // }
    
    }

}