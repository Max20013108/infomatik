public class Lotto5{

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
 //           if(ziehung[i]==tipp[i] && ziehung[i] == true){
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
        int sechsrichtig=0;
        int i = 0;
        while(sechsrichtig<100){
            ziehung = Lottozahlen();
                if(richtige(tipp, tipp)==6){
                    sechsrichtig++;
                }
        i++;
        }

        System.out.println("Du musst im Schnitt "+(double)i/100.0 +" mal spielen um sechs richtige zubekommen");
    }
}