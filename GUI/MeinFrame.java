import java.awt.*;

public class MeinFrame extends Frame
{
    public MeinFrame() {

        // Frenster Überschrift mit Hilfe des Konstruktors der Oberklasse Frame festlegen
        super("Dies ist ein Test");

        // Layout festlegen
        setLayout(new FlowLayout());
        
        // Komponenten erzeugen
        Button b = new Button("klick");

        Checkbox cb = new Checkbox("geschnallt?");
    
        Choice ch = new Choice();
        ch.addItem("ertse Wahl");
        ch.addItem("zweite Wahl");
          
        Label l = new Label("Hallo Welt");
    
        List li = new List(3,false);
        li.add("erste Zeile");
        li.add("zweite Zeile");
        li.add("dritte Zeile");
        li.add("vierte Zeile");
    
        Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,50);
    
        TextArea ta = new TextArea(5,10);
        ta.append("Jubel!");
    
        TextField tf = new TextField("Eingabe?",8);
    
        // Komponenten ins Fenster einfügen
        add(b);
        add(cb);
        add(ch);
        add(l);
        add(li);
        add(sb);
        add(ta);
        add(tf);
        
        // Fenster darstellen
        pack();
        setVisible(true);        
    }
    
    public static void main(String[] args){
        new MeinFrame();
    }
    
}