public class Lotto5{
    
    public static void Ausgabe(int i, int[] richtige, int trys){
        System.out.println("Die wahrscheinlichkeit "+i+" richtiger ist "+ (((double)richtige[i])/trys)*100.0 +"%");

    }

    public static boolean[] Lottozahlen(){
        boolean[] ziehung = new boolean[49];
        for (int i=0;i<49;i=i+1) { ziehung[i] = false;}
        
        // Ziehung
        int x = 0;
        while(x<=6){
        int Position = (int)(49*Math.random());
        if(ziehung[Position] != true){  
            ziehung[Position] = true;
            x++;
        }
        }
    return ziehung;
    }

    
    public static int richtige(boolean[] ziehung, boolean[] tipp){
        int count = 0; 
        int i = 0;
        while(i<49){
        if(ziehung[i]==tipp[i] && ziehung[i]){
                count++;
            }
        i++;
        }

    return count;
    }



    public static void main(String[] args){
        boolean[] tipp = {
            true , false, false, false, false, false, false, 
            false, false, false, false, true , false, false, 
            false, false, false, false, false, false, true , 
            false, false, false, false, false, false, false, 
            false, false, true , false, false, false, false, 
            false, true , false, false, false, false, false, 
            false, false, false, true , false, false, false, 
        };
        boolean[] ziehung = new boolean[49];
        int i = 0;
        int trys = 10000;
        int[] richtige={0,0,0,0,0,0,0};
        while(i<trys){
            ziehung = Lottozahlen();
                richtige[(richtige(ziehung, tipp))]=richtige[(richtige(ziehung, tipp))]+1;
                
        i++;
                }
        
        


                Ausgabe(0,richtige,trys);
                Ausgabe(1,richtige,trys);
                Ausgabe(2,richtige,trys);
                Ausgabe(3,richtige,trys);
                Ausgabe(4,richtige,trys);
                Ausgabe(5,richtige,trys);
                Ausgabe(6,richtige,trys);
    }
}