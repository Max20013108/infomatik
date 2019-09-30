public class Lottoarrayint{

    
    public static boolean doppelt(int[] array, int Zahl){
    boolean doppeltfragezeichen = false;
        for(int s : array){
            if(Zahl==s){
            doppeltfragezeichen = true;
            }
        
        }
    return doppeltfragezeichen;
    }

    
    public static int[] ziehung(){
        int[] ziehung = new int[6];
        int i = 0;
        int neueZahl=0;
        while(i<ziehung.length){
            neueZahl=(int)(49*Math.random()+1);
            if(false == doppelt(ziehung,neueZahl)){
                ziehung[i]=neueZahl;
                i++;
            }
        }
        return ziehung;
    }




public static void main(String[] args){
    int[] tipp = {6,3,4,2,49,37};
    int richtige = 0;
    long trys = 1000000000;
    int[] ziehung = new int[6];
    long i = 0;
    long[] anzahlrichtige={0,0,0,0,0,0,0};
    while(i<trys){
    ziehung = ziehung();
    richtige = 0;
    for(int s : tipp){
        for(int x : ziehung){
            if(s==x) richtige++;
        }
    }
    anzahlrichtige[richtige]=anzahlrichtige[richtige]+1;
    i++;
    }
        System.out.println("Die wahrscheinlichkeit 6 richtiger ist "+ (((double)anzahlrichtige[6])/trys)*100.0 + " es kam "+ anzahlrichtige[6]+" vor");
        System.out.println("Die wahrscheinlichkeit 5 richtiger ist "+ (((double)anzahlrichtige[5])/trys)*100.0 + " es kam "+ anzahlrichtige[5]+" vor");
        System.out.println("Die wahrscheinlichkeit 4 richtiger ist "+ (((double)anzahlrichtige[4])/trys)*100.0 + " es kam "+ anzahlrichtige[4]+" vor");
        System.out.println("Die wahrscheinlichkeit 3 richtiger ist "+ (((double)anzahlrichtige[3])/trys)*100.0 + " es kam "+ anzahlrichtige[3]+" vor");
        System.out.println("Die wahrscheinlichkeit 2 richtiger ist "+ (((double)anzahlrichtige[2])/trys)*100.0 + " es kam "+ anzahlrichtige[2]+" vor");
        System.out.println("Die wahrscheinlichkeit 1 richtiger ist "+ (((double)anzahlrichtige[1])/trys)*100.0 + " es kam "+ anzahlrichtige[1]+" vor");
        System.out.println("Die wahrscheinlichkeit 0 richtiger ist "+ (((double)anzahlrichtige[0])/trys)*100.0 + " es kam "+ anzahlrichtige[0]+" vor");
}
}
