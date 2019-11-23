import java.awt.*;

public class Fenster extends Frame
{
    public Fenster(){
        
        // Layoutmanager festlegen
        setLayout(new BorderLayout());
        
        // Komponenten erzeugen

        TextField tf = new DoubleField("                          ");

        
        // Komponenten im Fenster einfügen

        add(tf,BorderLayout.EAST);

        
        // Fenster anzeigen
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Fenster();
    }
}

