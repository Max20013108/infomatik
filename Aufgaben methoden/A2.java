import java.util.*;
public class A2{

    public static String VokalplusB(String klartext){
        String textneu="";
        for (int i = 0; i < klartext.length(); i=i+1) {
            if ("aeiou".indexOf(klartext.charAt(i))>=0){

                textneu = textneu + klartext.charAt(i) + 'B' + klartext.charAt(i);
            }
            else{

                textneu = textneu + klartext.charAt(i);

            }
        }
        return textneu;
    }
    public static void main(String[] args){
        Scanner textin = new Scanner(System.in);

        String text = textin.nextLine();


        System.out.println(VokalplusB(text));
    }

}