public class Lotto3
{
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
           
        boolean[] ziehung = {
            true , false, false, false, false, false, false, 
            false, false, false, false, false, false, false, 
            false, false, false, false, false, false, true , 
            false, false, false, true , false, false, false, 
            false, false, false, false, false, false, false, 
            false, false, false, false, true , false, false, 
            false, true , true , false, false, false, false, 
        };
        // Anzahl der Richtigen
        int richtige = 0;
        for (int i =0;i < 49;i=i+1){
            if(tipp[i]==ziehung[i] && tipp[i]==true) richtige++;
        }
        System.out.println(richtige);
    }
}