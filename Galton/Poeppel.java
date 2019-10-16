public class Poeppel{
    
   private Fach links;
   private Fach rechts;
    
   public Poeppel(Fach l, Fach r){
        links =l;
        rechts = r;
   }
    
   public void naechsteKugel(){
        if (Math.random() <0.5){
            links.naechsteKugel();
        }
        else {
            rechts.naechsteKugel();
        }
   }
}