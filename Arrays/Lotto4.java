public class Lotto4
{

    public static void main(String[] args){           
        // Initialisierung
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
        
        // Ausgabe
        for (int i =0;i < 49;i=i+1){
            if (ziehung[i]) {System.out.println(i+1);}
        }
    }
}