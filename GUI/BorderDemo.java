import java.awt.*;

public class BorderDemo extends Frame
{
    public BorderDemo(){
        
        // Layoutmanager festlegen
        setLayout(new BorderLayout());
        
        // Komponenten erzeugen
        Button b = new Button("Drück mich!");
        TextField tf = new TextField("Bitte etwas eingeben");
        Label l =new Label("Hier steht was");
        Button b2 = new Button("Drück mich 2!");
        
        // Komponenten im Fenster einfügen
        add(b,BorderLayout.SOUTH);
        add(tf,BorderLayout.EAST);
        add(l,BorderLayout.WEST);
        add(b2,BorderLayout.CENTER);
        
        // Fenster anzeigen
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new BorderDemo();
    }
}
