public class Popultationsmodell {
    public static void main(String[] args) {
        
        int jung = 6;
        int erw = 9;
        int alt = 12;
        int jung2 = jung;
        int schritt = 0;
        int gesamt = 0;
        
        
        for(int i = 0; i < 10; i = i+1){
            jung = erw*4+alt*2;
            alt = erw/3;
            erw = jung2/2;
            gesamt = jung + erw + alt;
        
        
            System.out.println("Nach dem "+ (i+1)  +". Schritt gibt es:");
            System.out.println("jung: "+jung);
            System.out.println("Erwachsen "+erw);
            System.out.println("alt: "+alt);
            System.out.println("Es sind insgesamt " +gesamt +" Mäuse");
            jung2=jung;
        }
    }
}