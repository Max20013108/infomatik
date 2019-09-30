import java.util.*;
public class Vigenere{

    public static String verschluesselterTextVigenere(String klartext, String Schlüssel){
        int ZahlZeichen = 0;
        int i = 0;
        char Zeichen = ' ';
        String Schlüsselsave = Schlüssel;
        String textneu = " ";
        while(Schlüssel.length() < klartext.length()){
            Schlüssel = Schlüssel+Schlüsselsave;
        }
        while(i<=klartext.length()) {
            ZahlZeichen = (int)klartext.charAt(i) + (int)Schlüssel.charAt(i);
            if (ZahlZeichen > (int) 'Z') {
                ZahlZeichen = ZahlZeichen - 26;
            }
            textneu = textneu + (char)Zeichen;

            i++;

        }
        return textneu;
    }

    public static void main(String[] args) {
        Scanner textin = new Scanner(System.in);
        System.out.println("Gebe den zu verschlüsselden Texte ein");
        String klartext = textin.nextLine();
        System.out.println("Gebe den Schlüssel ein");
        String Schlüssel = textin.nextLine();

        System.out.println(verschluesselterTextVigenere(klartext,Schlüssel));   
    }
}