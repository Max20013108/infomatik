import java.util.*;

public class A1 {
    
    public static String uText(String text) {
        String textNeu = "";
        char zeichen;
        for (int i = 0 ; i < text.length(); i = i+1 ){
            zeichen = text.charAt(i);
            textNeu = zeichen + textNeu;
        }
        return textNeu;
    }

    public static void main(String[] args){
        Scanner textin = new Scanner(System.in);

        String text = textin.nextLine();

        System.out.println(uText(text));

    }
}