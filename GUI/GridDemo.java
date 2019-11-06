import java.awt.*;

public class GridDemo extends Frame
{
    public GridDemo() {         

        // Layout festlegen
        setLayout(new GridLayout(4,2));
        
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
    
        // Zum Applet hinzufuegen
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
        new GridDemo();
    }
}