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
 
public static int[] zufallsListe(int n){
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

public static int[] sortieren(int[] array){
    long start = System.currentTimeMillis();
    for(int i = 0;i<array.length;i++){
        array = tauschen(array, indexofsmallestnumber(array, i), i);
    }
    long end = System.currentTimeMillis();
    System.out.println(end-start);
    return array;
}

public static int[] sortieren2(int[] array){
    int[] sortedlist = new int[array.length];
    int index;
    long start = System.currentTimeMillis();
    for(int i = 0;i<sortedlist.length;i++){
        index = indexofsmallestnumber(array, 0);
        sortedlist[i]=array[index];
        array = arbeitenmitarrays.entfernen(array, index);
    }
    long end = System.currentTimeMillis();
    System.out.println(end-start);
    return sortedlist;
}

public static int[] sortieren3(int[] array){
    int n = array.length;
    long start = System.currentTimeMillis();
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
    long end = System.currentTimeMillis();
    System.out.println(end-start);
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
    datei.println("{");
    for (int i =0; i<liste.length-1;i++) {
        datei.print(liste[i]+", ");
    }
    datei.close();
}

public static void test(int[] a) {
    a[0]=1;

}

public static long speed(int n){
    int[] x = zufallsListe2(n);
    long start = System.currentTimeMillis();
    quicksort(x,0,x.length);
    long ende = System.currentTimeMillis();
    return ende-start;
}
    public static void main(String[] args) {
        for(int i = 1000000; i<=100000000;i=i+1000000){
            long t = speed(i);
            System.out.println(i+":"+t);
        }

    }
}