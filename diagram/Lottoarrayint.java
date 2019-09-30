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



    public static double[] richtigearray(int trys){
        double[] richtigeprozentual = new double[7];
        int[] tipp = {6,3,4,2,49,37};
        int richtige = 0;
        int[] ziehung = new int[6];
        int i = 0;
        int[] anzahlrichtige={0,0,0,0,0,0,0};
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
    int x = 0;
    while(x<=6){
        richtigeprozentual[x] = (double)anzahlrichtige[x]/trys*100.0;
        x++;
    }
    return richtigeprozentual;
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
}


