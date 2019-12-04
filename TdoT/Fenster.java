import java.awt.*;

public class Fenster extends Frame
{
    public Fenster(){
        
        // Layoutmanager festlegen
        setLayout(new BorderLayout());
        
        // Komponenten erzeugen

        TextField tf = new IntField(0,10);

        
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
