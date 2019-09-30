/*
Geschrieben Max Detlof
Das Programm hat die Funktion nach dem Vigenere verfahren zu ver und entschlüssen bei gegebenen Schlüssel.
Das Programm kann mit Text aus einer Datei umgehen aber auch mit der Eingabe inder Kommandozeile.
Das Ergebnis kann wenn gewünscht in einer Datei gespeichert werden.
*/
import java.io.*;
import java.util.*;
public class vigenerefinal{
    

    // Die methode kann einen Buchstaben ersetzten Input = Text( in dem der Buchstabe ersetzt werden soll), Buchstabe(der ersetzt werden soll), String der eingesetzt werden soll Output = Text ohne Buchstabe
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
    // Die methode nutzt die methode ersetzterText um einen String von Ä Ö Ü ß zubereinigen. Input = Text(der bereinigt werden soll) Output = Text(ohne Ä Ü Ö ß)
    public static String ohneumlaute(String text){
        text = erstetzterText(text, 'Ä', "ae");
        text = erstetzterText(text, 'Ö', "ue");
        text = erstetzterText(text, 'Ü', "oe");
        text = erstetzterText(text, 'ß', "ss");
        return text;
    }

    //Methode zum lesen von Text aus einer Datei Input= Dateiname(Name der einzulesenden Datei) Output = String(mit Inhalt der Datei)
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
    //Methode zum schreiben eines textes in eine datei Input= Dateiname(Name in der der text gespeichert werden soll), Text(der gespeichert werden soll), anfuegen(ob der text in der Datei angfügt werden soll oder den Inhalt überschreiben soll) Output= /
    public static void textInDateiSpeichern(String dateiname, String text, boolean anfuegen) throws IOException {
        PrintWriter datei = new PrintWriter(new FileWriter(dateiname,anfuegen));
        datei.println(text);
        datei.close();
    }
    //Methode die den Geheimtext wieder entschlüsselt Input = geheimtext(der bereits Verschlüsselte Text), Schlüssel(der passende Schlüssel zum entschlüsseln) Output = textneu(entschlüsselter text)
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
    //Methode zum verschlüsseln eines Textes nach dem Viegenere verfahren Input = klartext(der text der verschlüsseltwerden soll), Schlüssel(derSchlüssel mit dem verschlüsselt werden soll) Output = textneu(verschlüsselter text)
    public static String verschluesselterTextVigenere(String klartext, String Schlüssel){
        int ZahlZeichen = 0;
        int i = 0;
        String Schlüsselsave = Schlüssel;
        String textneu = " ";
        Schlüssel = Schlüsselbiggerklartext(Schlüsselsave, klartext);
        while(i<klartext.length()) {
            ZahlZeichen = buchstabenvorschieben(klartext.charAt(i), Schlüssel.charAt(i));
            textneu = textneu + NumbertoChar(ZahlZeichen);
            i++;
            
        }
        return textneu;
    }
    // Methode die einen Buchstaben mit der Position eines anderen im Alphabet vorverschiebt Input 2 buchstaben a wird um position von b im alphabet verschoben Outpu verschobener Buchstabe
    public static int buchstabenvorschieben(char a, char b){
            int ZahlZeichen = a+posalp(b);
            return ZahlZeichen;

    }
    // Methode die einen Buchstaben mit der Position eines anderen im Alphabet zurückverschiebt Input 2 buchstaben a wird um position von b im alphabet verschoben Outpu verschobener Buchstabe
    public static int buchstabenzurückschieben(String klartext, String Schlüssel,int i){
        int ZahlZeichen = (int)klartext.charAt(i) - posalp(Schlüssel.charAt(i));
        return ZahlZeichen;

    }

    //Methode die dafür sorgt das der Schlüssel größer als der Klartext ist Input Schlüssel , klartext Output Schlüssel der länger als klartext ist
    public static String Schlüsselbiggerklartext(String Schlüsselsave, String klartext){
        String Schlüssel = Schlüsselsave;
        while(Schlüssel.length() < klartext.length()){
            Schlüssel = Schlüssel+Schlüsselsave;
        }
        return Schlüssel;
    }
    //Methode die aus dem Ascii Code einen Zeichen macht dabei aber schaut das es nicht den Bereich des Alphabetes verlässt input ascii code eines Zeichen Output char des angegebnen ascii codes
    public static char NumbertoChar(int ZahlZeichen){
        
        if (ZahlZeichen > (int) 'Z') {
            ZahlZeichen = ZahlZeichen - 26;
        }
        if (ZahlZeichen < (int) 'A') {
            ZahlZeichen = ZahlZeichen + 26;
        }
        char Zeichen = (char)ZahlZeichen;
        return Zeichen;
    }
    //Methode die die Position eines Buchstaben im Alphabet angibt wobei das A an Position 0 steht(posalp = Position Alphabet) Buchstabe von dem man die Position im Alphabet will output Position des angegebenes Buchstaben
    public static int posalp(char Buchstabe){
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int poschar = abc.indexOf(Buchstabe);
        return poschar;
    }
    // Methode die dem Nutzer die wahl zwischen Input durch Datei oder Terminal für den zuverarbeitenden text Input nichts Output Input
    public static String InputTerminaloderdatei()throws IOException{
        String Dateiname = "";
        String Input = " ";
        Scanner textin = new Scanner(System.in);
        System.out.println("Willst du den Text im Terminal(T) oder per Datei(F) eingeben? ");
        char Auswahl = textin.next().charAt(0);

        if(Auswahl == 'T'){
            System.out.println("Bitte gib den Text der Ver/Entschlüsselt werden soll ein");
            Input = textin.next();
            Input = ohneumlaute(Input);
            Input = Input.toUpperCase();
    
       }
       else{
            System.out.println("Bitte gib den Dateinamen mit Endung ein");
            Dateiname = textin.nextLine();
            Input = textAusDatei(Dateiname);
            Input = ohneumlaute(Input);
            Input = Input.toUpperCase();
            
       }
    return Input;
    }
    // Methode die dem Nutzer die wahl zwischen Input durch Datei oder Terminal für den zuverarbeitenden text Input nichts Output Schlüssel
    public static String SchlüsselTerminaloderdatei()throws IOException{
        String Dateiname = "";
        String Schlüssel = " ";
        Scanner textin = new Scanner(System.in);
        System.out.println("Willst du den Schlüssel im Terminal(T) oder per Datei(F) eingeben? ");
        char Auswahl = textin.next().charAt(0);

        if(Auswahl == 'T'){
            System.out.println("Bitte gib den Schlüssel ein");
            Schlüssel = textin.next();
            Schlüssel = ohneumlaute(Schlüssel);
            Schlüssel = Schlüssel.toUpperCase();
    
       }
       else{
            System.out.println("Bitte gib den Dateinamen mit Endung ein");
            Dateiname = textin.nextLine();
            Schlüssel = textAusDatei(Dateiname);
            Schlüssel = ohneumlaute(Schlüssel);
            Schlüssel = Schlüssel.toUpperCase();
            
       }
    return Schlüssel;
    }
    //methode die dem Nutzer die möglichkeit gibt zuentscheiden ob ver oder entschlüsselt wird. Input String schlüssel und String Input Output String Output (der verarbeitete Text)
    public static String Output(String Schlüssel, String Input){
        char Auswahl = ' ';
        String Output = "";
        Scanner textin = new Scanner(System.in);
        System.out.println("Soll der Text Verschlüsselt(V) oder Entschlüsselt(E) werden?");
        Auswahl = textin.next().charAt(0);
        if(Auswahl == 'E'){
            Output = entschluesselterTextVigenere(Input, Schlüssel);
        }
        else{
            Output = verschluesselterTextVigenere(Input, Schlüssel);
        }
    return Output;
    }
    // Gibt dem Nutzer die möglichkeit den Output in einer Datei mit dem Namen Output.txt zuspeichern. Input String Output Output nichts
    public static void speichern(String Output)throws IOException{
        char Auswahl = ' ';
        Scanner textin = new Scanner(System.in);
        System.out.println("Soll der Text in einer Datei gespeiochert werden ? Ja(J) Nein (N)");
        Auswahl = textin.next().charAt(0);
            if(Auswahl == 'J'){
                textInDateiSpeichern("Output.txt", Output, true);
                System.out.println("Der Text wurde in der Datei Output.txt gespeicher");
            }
        
    }
   
    public static void main(String[] args)throws IOException{
    String Input = InputTerminaloderdatei();
    String Schlüssel = SchlüsselTerminaloderdatei();
    String Output = Output(Schlüssel, Input);
    System.out.println(Output);
    speichern(Output);
    
    }
}