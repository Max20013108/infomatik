import java.io.*;
public class Sortieren2
{
    static int[] l = {632,87426,8736,8735,6514};


    public static boolean istSortiert(int[] liste) {
		for(int i = 1;i< liste.length ;i++ ){
			if(liste[i]<liste[i-1]){
				return false;
			}
		}
		return true;
	}


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
 
public static int[] zufallsListedumm(int n){
        int[] liste = new int[n];
        int t = 0;
        for(int i=0;i<n;){
        // System.out.println(i);
            t = (int) Math.floor(n*Math.random())+1;
            if(check(liste,t)){
                liste[i] = t;
                i++;
            }
            }
            return liste;
        }



public static int[] zufallsListe(int n){
    int[] liste = new int[n];
    for(int i = 0;i<n;i++){
        liste[i]=i+1;
    }

    for(int x=0;x<2*n;x++){
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

public static int indexofsmallestnumber(int[] array,int from){
    int index = from;
    for(int i =from;i<array.length;i++){
        if(array[index]>array[i]){
            index = i;
        }
    }
    return index;
}

public static int[] searchsmallestsort(int[] array){
    for(int i = 0;i<array.length;i++){
        array = tauschen(array, indexofsmallestnumber(array, i), i);
    }
    return array;
}

public static int[] newlistsort(int[] array){
    int[] sortedlist = new int[array.length];
    int index;
    for(int i = 0;i<sortedlist.length;i++){
        index = indexofsmallestnumber(array, 0);
        sortedlist[i]=array[index];
        array = arbeitenmitarrays.entfernen(array, index);
    }
    return sortedlist;
}

public static int[] randomsort(int[] array){
    int n = array.length;
    boolean getauscht = false;
    while(istSortiert(array)==false){
        while(getauscht == false){
        int i1 =  (int) Math.floor(n*Math.random());
        int i2 =  (int) Math.floor(n*Math.random());
        if(i1>i2){
            int a = i1;
            i1 = i2;
            i2 = a;
        }
        if(array[i1]<array[i2]){
        array=tauschen(array,i1,i2);
        getauscht = true;
     }
    }
    }
   return array; 
}

public static int[] bubblesort(int[] array){
    for(int x = array.length;x>0;x--)
        for(int i=0;i<(x-1);i++){
            if(array[i]>array[i+1]){
               tauschen(array, i, i+1);
           }
        }
    return array;
}

public static void quicksort(int[] array,int start, int ende){

if(start<ende){
    int index = partition(array, start, ende);
    quicksort(array, start, index-1);
    quicksort(array, index+1, ende);
    }
}



// public static int partitionfalsch(int[] array, int start, int ende){
//     int pivotvalue;
//     int pivind = start;
//     pivotvalue = array[start];
//     if(start<ende){
//         for(int i = start;i<=ende;i++){
//             if(array[i]<pivotvalue){
//                 tauschen(array, i, pivind);
//                 pivind=i;
//             }
//         }
//     }
//     return pivind;
// }

public static int partition(int[] array, int start, int ende){
    int pivotvalue;
    int pivind = start;
    pivotvalue = array[start];
        for(int i = start;i<ende;i++){
            if(array[i]<pivotvalue){
                array[pivind]=array[i];
                array[i]=array[pivind+1];
                array[pivind+1]=pivotvalue;
                pivind++;
            }
        }
    return pivind;
}

public static void arrayInDateiSpeichern(String dateiname, int[] liste, boolean anfuegen) throws IOException {
    PrintWriter datei = new PrintWriter(new FileWriter(dateiname,anfuegen));
    datei.print("{");
    for (int i =0; i<liste.length-1;i++) {
        datei.print(liste[i]+", ");
    }
    datei.print("}");
    datei.println("");
    datei.close();
}

public static void textInDateiSpeichern(String dateiname, String text, boolean anfuegen) throws IOException {
    PrintWriter datei = new PrintWriter(new FileWriter(dateiname,anfuegen));
    datei.println(text);
    datei.close();
}

public static void test(int[] a) {
    a[0]=1;

}

public static long speed(int n){
    int[] x = zufallsListe(n);
    long start = System.currentTimeMillis();
    quicksort(x,0,x.length);
    long ende = System.currentTimeMillis();
    return ende-start;
}
public static void main(String[] args)throws IOException {
    int[][] lists = new int[100][];
    long start;
    long ende;
    long t;
    String s;
    int a = 0;
    System.out.println("Program start");
    start = System.currentTimeMillis();
    int anzahl = 1000000;
    for(int i = anzahl;i<=anzahl*100;i=i+anzahl){
        int[] x = zufallsListe(i);
        lists[a] = x;
        a++;
    }
    ende = System.currentTimeMillis();

    System.out.println("Arrays erstellt. Dauer: "+(ende-start));

    int[] x;

    System.out.println("start searchsmallestsort");
    textInDateiSpeichern("times.txt", "Start searchsmallestsort", false);

    for(int i = 0;i<=lists.length-1;i++){
        x = lists[i];
        start = System.currentTimeMillis();
        searchsmallestsort(x);
        ende = System.currentTimeMillis();
        t = ende - start;
        s = x.length+":"+t;
        textInDateiSpeichern("times.txt", s, true);
    }

    textInDateiSpeichern("times.txt", "Ende searchsmallestsort", true);
    System.out.println("ende searchsmallestsort");

    System.out.println("start newlistsort");
    textInDateiSpeichern("times.txt", "Start newlistsort", true);

    for(int i = 0;i<=lists.length-1;i++){
        x = lists[i];
        start = System.currentTimeMillis();
        newlistsort(x);
        ende = System.currentTimeMillis();
        t = ende - start;
        s = x.length+":"+t;
        textInDateiSpeichern("times.txt", s, true);
    }

    textInDateiSpeichern("times.txt", "Ende newlistsort", true);
    System.out.println("ende newlistsort");

    System.out.println("start bubblesort");
    textInDateiSpeichern("times.txt", "Start bubblesort", true);

    for(int i = 0;i<=lists.length-1;i++){
        x = lists[i];
        start = System.currentTimeMillis();
        bubblesort(x);
        ende = System.currentTimeMillis();
        t = ende - start;
        s = x.length+":"+t;
        textInDateiSpeichern("times.txt", s, true);
    }

    textInDateiSpeichern("times.txt", "Ende bubblesort", true);
    System.out.println("ende newlistsort");

    System.out.println("start quicksort");
    textInDateiSpeichern("times.txt", "Start quicksort", true);

    for(int i = 0;i<=lists.length-1;i++){
        x = lists[i];
        start = System.currentTimeMillis();
        quicksort(x,0,x.length);
        ende = System.currentTimeMillis();
        t = ende - start;
        s = x.length+":"+t;
        textInDateiSpeichern("times.txt", s, true);
    }

    textInDateiSpeichern("times.txt", "Ende quicksort", true);
    System.out.println("ende quicksort");

    }
}