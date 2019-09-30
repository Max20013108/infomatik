
public class oop_flächen
{
    public static void main(String[] args){
    
        Flächen[] array_flächen = new Flächen[4];
        
        array_flächen[0] =new Rechteck(4,5);
        array_flächen[1] =new Kreis(6);
        array_flächen[2] =new Rechteck(7,8);
        array_flächen[3] =new Kreis(9);
        
        for (int i=0;i<4;i++) {
            System.out.println(array_flächen[i].flächeninhalt());
        }
    }
}
