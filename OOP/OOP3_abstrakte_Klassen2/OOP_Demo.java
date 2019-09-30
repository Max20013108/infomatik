
public class OOP_Demo {

    public static void main(String[] args){

        Körper[] k = new Körper[2];
        k[0] = new Würfel(4);
        k[1] = new Kugel(3);

        for (int i=0;i<2;i++) {
            System.out.println(k[i].volumen());
        }
    }

}
