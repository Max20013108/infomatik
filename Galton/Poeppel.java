public class Poeppel extends GaltonElement
{
    
   private GaltonElement links;
   private GaltonElement rechts;
    
   public Poeppel(GaltonElement l, GaltonElement r){
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