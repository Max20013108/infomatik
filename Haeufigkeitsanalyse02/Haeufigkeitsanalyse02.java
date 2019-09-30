import java.io.*;
public class Haeufigkeitsanalyse02 {

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
    public static String entschluesselterText(String geheimtext, int schluessel){
        
        char zeichen;
        int zahl;
        int neueZahl;
        char neuesZeichen;
		String klartext = "";
        for (int i = 0; i < geheimtext.length(); i=i+1) {
            zeichen = geheimtext.charAt(i);
            zahl = (int) zeichen;
            neueZahl = zahl - schluessel;
            if ( neueZahl < (int) 'A') {
                neueZahl = neueZahl + 26;
            }
            neuesZeichen = (char) neueZahl;
            klartext = klartext + neuesZeichen;
        }
        return klartext;
	}
    public static void main(String[] args) throws IOException{
        String aktuellerText = textAusDatei("text.txt");
        int k = 0;
        char buchstabe = ' ';

        while(k<26){
            buchstabe = (char)(65+k);
            k++;
            System.out.println(buchstabe + ":" + haeufigkeit(buchstabe, aktuellerText));
            

        }


       /* System.out.println('A' + ":" + haeufigkeit('A', aktuellerText));
        System.out.println('B' + ":" + haeufigkeit('B', aktuellerText));
        System.out.println('C' + ":" + haeufigkeit('C', aktuellerText));
        System.out.println('D' + ":" + haeufigkeit('D', aktuellerText));        
        System.out.println('E' + ":" + haeufigkeit('E', aktuellerText));
        System.out.println('F' + ":" + haeufigkeit('F', aktuellerText));
        System.out.println('G' + ":" + haeufigkeit('G', aktuellerText));
        System.out.println('H' + ":" + haeufigkeit('H', aktuellerText));
        System.out.println('I' + ":" + haeufigkeit('I', aktuellerText));
        System.out.println('J' + ":" + haeufigkeit('J', aktuellerText));
        System.out.println('K' + ":" + haeufigkeit('K', aktuellerText));
        System.out.println('L' + ":" + haeufigkeit('L', aktuellerText));
        System.out.println('M' + ":" + haeufigkeit('M', aktuellerText));
        System.out.println('N' + ":" + haeufigkeit('N', aktuellerText));
        System.out.println('O' + ":" + haeufigkeit('O', aktuellerText));
        System.out.println('P' + ":" + haeufigkeit('P', aktuellerText));
        System.out.println('Q' + ":" + haeufigkeit('Q', aktuellerText));
        System.out.println('R' + ":" + haeufigkeit('R', aktuellerText));
        System.out.println('S' + ":" + haeufigkeit('S', aktuellerText));
        System.out.println('T' + ":" + haeufigkeit('T', aktuellerText));
        System.out.println('U' + ":" + haeufigkeit('U', aktuellerText));
        System.out.println('V' + ":" + haeufigkeit('V', aktuellerText));
        System.out.println('W' + ":" + haeufigkeit('W', aktuellerText));
        System.out.println('X' + ":" + haeufigkeit('X', aktuellerText));
        System.out.println('Y' + ":" + haeufigkeit('Y', aktuellerText));
        System.out.println('Z' + ":" + haeufigkeit('Z', aktuellerText));
        */
        String text = entschluesselterText(aktuellerText, 17);
        System.out.println(text);
    }
}