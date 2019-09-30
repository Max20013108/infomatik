public class Abgabe2 {
    public static String schlüssel2(String schlüssel, String klartext) {
        while (klartext.length() > schlüssel.length()) {
            schlüssel = schlüssel + schlüssel;
        }
        return schlüssel;
    }

    public static String ersetzterText(String wort, char zeichen, String ersatz) {
        String reintext = "";
        int zeichenNeu;
        for (int i = 0; i < wort.length() ; i = i+1){
            char stelle = wort.charAt(i);
            if ( (int) zeichen == stelle) {
                reintext = reintext + ersatz;
            }
            else {
                reintext = reintext + stelle;
            }
        }
        return reintext;
    }

    public static String bereinigterText(String wortalt) {
        char zeichen = 'P';
        int zeichenNeu;
        String wort = "";
        for (int i = 0; i < wortalt.length() ; i = i+1){
            zeichen = wortalt.charAt(i);
            if ( (int) zeichen >= (int) 'a' && (int) zeichen <= (int) 'z' ) {
                zeichenNeu = (int) zeichen - 32;
                wort = wort + (char) zeichenNeu;
            }
            else {
                    wort = wort + zeichen;             
            }
        }
        wort = ersetzterText(wort, 'Ü', "UE");
        wort = ersetzterText(wort, 'ü', "UE");
        wort = ersetzterText(wort, 'Ö', "OE");
        wort = ersetzterText(wort, 'ö', "OE");
        wort = ersetzterText(wort, 'Ä', "AE");
        wort = ersetzterText(wort, 'ä', "AE");
        wort = ersetzterText(wort, 'ß', "SS");
        return wort;
    }

    public static String Verschlüsseln(String text, String schlüssel) {
        String verschlüsselterText = "";
        int stelle = 0;
        int verschiebezahl = 0;
        int test = 0;
        int stelle2 = 0;
        String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        schlüssel = schlüssel2(schlüssel, text);
        text = bereinigterText(text);
        schlüssel = bereinigterText(schlüssel);
        for (int i = 0;i < text.length(); i=i+1) {
            stelle = ABC.indexOf(text.charAt(i)+1);
            verschiebezahl = ABC.indexOf(schlüssel.charAt(i));
            int neueZahl = stelle + verschiebezahl;
            if (neueZahl > 25) {
                neueZahl = neueZahl - 25;
            }
            char neuesZeichen = ABC.charAt(neueZahl);
            verschlüsselterText = verschlüsselterText + neuesZeichen;
            
            
            System.out.println(stelle);
            System.out.println(verschiebezahl);

        }
        return verschlüsselterText;
    }
}