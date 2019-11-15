import java.awt.*;
import java.awt.event.*;

public class Fenster extends Frame
{
    TextField eingabe = new TextField("Bitte etwas eingeben");
    Label ausgabe =new Label("                                                              ");
    
    
    public class MeinButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int anzahlkugeln =(int) eingabe.getText();
            int[] kugeln = zweistufigesGaltonBrett.durchlauf(anzahlkugeln);
            ausgabe.setText(geheimtext);
            
        }
    }
    
    public Fenster(){
        
        // Layoutmanager festlegen
        setLayout(new BorderLayout());
        
        // Komponenten erzeugen
        Button b = new Button("GOOOO");
        
        // EventListener anmelden
        b.addActionListener(new MeinButtonListener());
        
        addWindowListener(
            new WindowAdapter(){
                public void windowClosing (WindowEvent e){
                    System.exit(0);
                }
            }
        );
        
        
        // Komponenten im Fenster einfügen

        // Fenster anzeigen
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new EVADemo();
    }
}