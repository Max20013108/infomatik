import java.awt.*;
import java.awt.event.*;

public class EVADemo extends Frame
{
    TextField eingabe = new TextField("Bitte etwas eingeben");
    Label ausgabe =new Label("                                                              ");
    
    
    public class MeinButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String klartext = eingabe.getText();
            String geheimtext = Verarbeitung.verschluessele(klartext);
            ausgabe.setText(geheimtext);
            
        }
    }
    
    public EVADemo(){
        
        // Layoutmanager festlegen
        setLayout(new BorderLayout());
        
        // Komponenten erzeugen
        Button b = new Button("Verschlüssele");
        
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
        add(b,BorderLayout.SOUTH);
        add(eingabe,BorderLayout.WEST);
        add(ausgabe,BorderLayout.EAST);
        
        // Fenster anzeigen
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new EVADemo();
    }
}