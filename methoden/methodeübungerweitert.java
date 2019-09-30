import java.io.*;
public class methodeübungerweitert
{
    public static int haeufigkeit(char buchstabe, String text){
        char zeichen;
        int anzahl =0;
        for (int i = 0;i < text.length(); i=i+1){
            zeichen = text.charAt(i);
            if ( zeichen == buchstabe) {
                anzahl = anzahl +1;
            }
        }
        return anzahl;
    }

    public static String verschluesselterText(String klartext, int schluessel){
        String geheimtext = "";
        char zeichen = ' ';
        int zahl = 0;
        int neueZahl = 0;
        char neuesZeichen;
        for (int i =0; i < klartext.length(); i = i+1){
            zeichen = klartext.charAt(i);
            zahl = (int) zeichen;
            neueZahl = zahl + schluessel;
            if (neueZahl > (int) 'Z') {
                neueZahl = neueZahl - 26;
            }
            neuesZeichen = (char) neueZahl;
            geheimtext = geheimtext + neuesZeichen;
        }
        return geheimtext;
    }
    
    public static String bereinigterText(String klartext){
		String textNeu = "";
        char zeichen =' ';
        char neuesZeichen;
    for (int i = 0 ; i < klartext.length(); i = i+1){
            zeichen = klartext.charAt(i);
            if ( (int) zeichen >= (int) 'A' && (int) zeichen <= (int) 'Z' ) {
                // zeichen ist ein Großbuchstabe
                textNeu = textNeu + zeichen;
            }
            if ( (int) zeichen >= (int) 'a' && (int) zeichen <= (int) 'z' ) {
                // zeichen ist ein Kleinbuchstabe
                neuesZeichen = (char) (zeichen-32);
                textNeu = textNeu + neuesZeichen;
            }
            if ( zeichen == 'Ä' || zeichen == 'ä' ) {
                textNeu = textNeu + "AE";
            }
            if ( zeichen == 'Ö' || zeichen == 'ö' ) {
                textNeu = textNeu + "OE";
            }
            if ( zeichen == 'Ü' || zeichen == 'ü' ) {
                textNeu = textNeu + "UE";
            }
            if ( zeichen == 'ß' ) {
                textNeu = textNeu + "SS";
            }
        }
        return textNeu;
    }

    public static String entschluesselterText(String geheimtext, int schluessel){
        
        char zeichen;
        int zahl;
        int neueZahl;
        //char neuesZeichen;
		String klartext = "";
        for (int i = 0; i < geheimtext.length(); i=i+1) {
            zeichen = geheimtext.charAt(i);
            zahl = (int) zeichen;
            neueZahl = zahl - schluessel;
            if ( neueZahl < (int) 'A') {
                neueZahl = neueZahl + 26;
            }
            //neuesZeichen = (char) neueZahl;
            klartext = klartext + (char) neueZahl;
        }
        return klartext;
	}
    
    public static String textAusDatei(String dateiname) throws IOException {
        BufferedReader datei = new BufferedReader(new FileReader(dateiname));
        String text ="";
        String naechsteZeile =datei.readLine();
        while (naechsteZeile != null) {
            text = text +  naechsteZeile;
            naechsteZeile =datei.readLine();
        }
        datei.close();
        return text;
    }

    public static void textInDateiSpeichern(String dateiname, String text, boolean anfuegen) throws IOException {
        PrintWriter datei = new PrintWriter(new FileWriter(dateiname,anfuegen));
        datei.println(text);
        datei.close();
    }
    
    public static void main(String[] args) throws IOException {
        int k =0;
        char heufigsterbuchstabe = ' ';
        int maxhb = 0;
        char aktuellerbuchstabe = ' ';
        int aktuellerhb = 0;
        int VZ = 0;
        String text1 = textAusDatei("geheimtext.txt");
        String text2 = bereinigterText(text1);

        while(k<=25){
            aktuellerbuchstabe = (char)(65+k);
            aktuellerhb = haeufigkeit(aktuellerbuchstabe, text2);
            if (aktuellerhb > maxhb){
                heufigsterbuchstabe = aktuellerbuchstabe;
                maxhb = aktuellerhb;
            }
            k=k+1;
        }


        VZ = (int)heufigsterbuchstabe-69;

        if(VZ<=0){
            VZ=VZ+26;
        }


        
        String text3 = entschluesselterText(text2, VZ);
        textInDateiSpeichern("klartext.txt", text3, false);
    }
}