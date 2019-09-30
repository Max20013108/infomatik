public class Würfelhoch4{
    public static void main(String[] args){

        
     int[] Anzahl = new int[24];
     
     
      for(int i=0; i<=6; i++){
        for(int b=0; b<=6; b++){
            for(int c=0; c<=6; c++){
                for(int d=0; d<=6; d++){

                    int summe = i+b+c+d;

                    Anzahl[summe] = Anzahl[summe]+1;

                }
            }
        }
                
    }
    for(int t: Anzahl)
    {
        System.out.println(t);
    }
}
}