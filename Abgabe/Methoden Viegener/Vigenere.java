/*
Geschrieben Max Detlof
Das Programm hat die Funktion nach dem Vigenere verfahren zu ver und entschlüssen bei gegebenen Schlüssel.
Das Programm kann mit Text aus einer Datei umgehen aber auch mit der Eingabe inder Kommandozeile.
Das Ergebnis kann wenn gewünscht in einer Datei gespeichert werden.
*/
import java.io.*;
import java.util.*;
public class Vigenere{
    

    
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

    //Methode zum lesen von Text aus einer Datei
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
    //Methode zum schreiben eines textes in eine datei
    public static void textInDateiSpeichern(String dateiname, String text, boolean anfuegen) throws IOException {
        PrintWriter datei = new PrintWriter(new FileWriter(dateiname,anfuegen));
        datei.println(text);
        datei.close();
    }
    //Methode die den Geheimtext wieder entschlüsselt
    public static String entschluesselterTextVigenere(String geheimtext, String Schlüssel) {
        int ZahlZeichen = 0;
        int i = 0;
        String Schlüsselsave = Schlüssel;
        String textneu = " ";
        Schlüssel = Schlüsselbiggerklartext(Schlüsselsave, geheimtext);
        while(i<geheimtext.length()) {
            ZahlZeichen = buchstabenzurückschieben(geheimtext, Schlüssel, i);
            textneu = textneu + NumbertoChar(ZahlZeichen);
            i++;
            
        }
        return textneu;
    }
    //Methode zum verschlüsseln eines Textes nach dem Viegenere verfahren
    public static String verschluesselterTextVigenere(String klartext, String Schlüssel){
        int ZahlZeichen = 0;
        int i = 0;
        String Schlüsselsave = Schlüssel;
        String textneu = " ";
        Schlüssel = Schlüsselbiggerklartext(Schlüsselsave, klartext);
        while(i<klartext.length()) {
            ZahlZeichen = buchstabenvorschieben(klartext, Schlüssel, i);
            textneu = textneu + NumbertoChar(ZahlZeichen);
            i++;
            
        }
        return textneu;
    }
    // Methode die einen Buchstaben mit der Position eines anderen im Alphabet vorverschiebt
    public static int buchstabenvorschieben(String klartext, String Schlüssel,int i){
            int ZahlZeichen = (int)klartext.charAt(i)+posalp(Schlüssel.charAt(i));
            return ZahlZeichen;

    }
    // Methode die einen Buchstaben mit der Position eines anderen im Alphabet zurückverschiebt
    public static int buchstabenzurückschieben(String klartext, String Schlüssel,int i){
        int ZahlZeichen = (int)klartext.charAt(i) - posalp(Schlüssel.charAt(i));
        return ZahlZeichen;

    }

    //Methode die dafür sorgt das der Schlüssel größer als der Klartext ist
    public static String Schlüsselbiggerklartext(String Schlüsselsave, String klartext){
        String Schlüssel = Schlüsselsave;
        while(Schlüssel.length() < klartext.length()){
            Schlüssel = Schlüssel+Schlüsselsave;
        }
        return Schlüssel;
    }
    //Methode die aus dem Ascii Code einen Zeichen macht dabei aber schaut das es nicht den Bereich des Alphabetes verlässt
    public static char NumbertoChar(int ZahlZeichen){
        
        if (ZahlZeichen > (int) 'Z') {
            ZahlZeichen = ZahlZeichen - 26;
        }
        if (ZahlZeichen > (int) 'A') {
            ZahlZeichen = ZahlZeichen + 26;
        }
        char Zeichen = (char)ZahlZeichen;
        return Zeichen;
    }
    //Methode die die Position eines Buchstaben im Alphabet angibt wobei das A an Position 0 steht(posalp = Position Alphabet)
    public static int posalp(char Buchstabe){
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int poschar = abc.indexOf(Buchstabe);
        return poschar;
     }

 /*   public static String Inputauswahl(Scanner textin,char x) throws IOException{
        String Input = " ";
        // laden des textes aus datei
        if(x=='F'){
        System.out.println("Wie heißt die Datein (mit Endung)?");
        String DateiName = textin.nextLine();
        Input = textAusDatei(DateiName);
        Input = ohneumlaute(Input.toUpperCase());
    }
    //Eingabe des textes per Kommandozeile
    else{
        System.out.println("Gebe den zu ver/entschlüselnden Texte ein");
        Input = ohneumlaute(textin.nextLine().toUpperCase());
    }
    return Input;
    }

      public static String Output(String Input,String Schlüssel,Scanner textin) throws IOException{
        char entorver = textin.next().charAt(0);
        String Output=" ";
        //Verschlüsselung
        if(entorver=='v'){
            Output = verschluesselterTextVigenere(Input, Schlüssel);
        }
        //Entschlüsselung
        else{
            Output = entschluesselterTextVigenere(Input, Schlüssel);
        }
        return Output;
    }

    public static void Indateispeichernjanein(String Output,Scanner textin) throws IOException{
        char speichern = textin.next().charAt(0);
        if(speichern == 'J'){
        textInDateiSpeichern("Output.txt", Output, false);

    }
    }
*/
    public static void main(String[] args) throws IOException{
        
        char auswahl = ' ';
        String Input =  " ";
        String Output = " ";
        // erstellen des Scanner
        Scanner textin = new Scanner(System.in);
        // abfrage woher der Text kommen soll
        System.out.println("Willst du den Text selber eingeben (I) oder soll er aus einer Datei(F) geladen werden ?");
        //Input = Inputauswahl(textin, textin.next().charAt(0));
                // laden des textes aus datei
                if(textin.next().charAt(0)=='F'){
                    System.out.println("Wie heißt die Datein (mit Endung)?");
                    String DateiName = textin.nextLine();
                    Input = textAusDatei(DateiName);
                    Input = ohneumlaute(Input.toUpperCase());
                }
                //Eingabe des textes per Kommandozeile
                else{
                    System.out.println("Gebe den zu ver/entschlüselnden Texte ein");
                    Input = textin.next().toUpperCase();
                    Input = ohneumlaute(Input);
                }
        // Abfrage ob Text ver oder entschlüsselt werden soll
        System.out.println("Soll der Text verschlüsselt(v) oder entschlüsselt(e) werden?");
        char entorver = textin.next().charAt(0);
        //Abfrag nach dem schlüssel
        System.out.println("Gebe den Schlüssel ein");
        String Schlüssel = textin.nextLine().toUpperCase();

        //Verschlüsselung
        if(entorver=='v'){
            Output = verschluesselterTextVigenere(Input, Schlüssel);
        }
        //Entschlüsselung
        else{
            Output = entschluesselterTextVigenere(Input, Schlüssel);
        }

        //Text Ausgabe
        //Output = Output(Input, Schlüssel, textin);

        System.out.println(Output);
        //Abfrage und evtl. Speicherung des Outputs in einer datei
        System.out.println("Soll der Ver bzw. Entschlüsselte Text Gespeichert werden ?Ja(J) Nein(N)");
        //Indateispeichernjanein(Output, textin);
        char speichern = textin.next().charAt(0);
        if(speichern == 'J'){
        textInDateiSpeichern("Output.txt", Output, false);

       }
    }
}