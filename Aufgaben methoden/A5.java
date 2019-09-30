import java.util.*;
public class A5{
public static String erstetzterText(String text, char buchstabe, String ersetzt){
    
        String textneu ="";
        for (int i = 0; i < text.length(); i=i+1){

            if(text.charAt(i)==buchstabe){
                textneu = textneu + ersetzt;

            }
            else{
                textneu = textneu+text.charAt(i);
            }

        }
    return textneu;
    }

    public static String ohneumlaute(String text){
        text = erstetzterText(text, 'Ä', "ae");
        text = erstetzterText(text, 'Ö', "ue");
        text = erstetzterText(text, 'ü', "oe");
        text = erstetzterText(text, 'ß', "ss");
        return text;
    }

    

    public static void main(String[] args) {
       Scanner textin = new Scanner(System.in);
         System.out.println("Gebe den Text in dem du was ersetzten möchtewst ein");
        String text = textin.nextLine();
        System.out.println("Gebe den Buchstaben den du ersetzten willst an");
        char buchstabe = textin.next().charAt(0);
        System.out.println("Gebe ein mit was der Angegebene Buchstabe ersetzt werden soll");
        String ersetzt = textin.next();
        text = ohneumlaute(text);
        System.out.println(erstetzterText(text,buchstabe,ersetzt));
        
    }
    
}