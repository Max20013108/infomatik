import java.awt.*;
import java.awt.event.*;

public class Fenster extends Frame{

    Button b = new Button("GOOOO");
    IntField eingabe = new IntField(0,10);
    Label ausgabe0 =new Label("                                         ");
    Label ausgabe1 =new Label("                                         ");
    Label ausgabe2 =new Label("                                         ");
    Label F0 = new Label("Fach 1");
    Label F1 = new Label("Fach 2");
    Label F2 = new Label("Fach 3");


    public class MeinButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int anzahlkugeln = eingabe.getInt();
            int[] kugeln = zweistufigesGaltonBrett.durchlauf(anzahlkugeln);
            ausgabe0.setText(" "+kugeln[0]);
            ausgabe1.setText(" "+kugeln[1]);
            ausgabe2.setText(" "+kugeln[2]);
            
        }
    }

    public class Input extends Panel{


        public Input() {
            setLayout(new GridLayout(1,2));
            add(eingabe);
            add(b);
        }
    }

    public class Output extends Panel{


        public Output() {
            setLayout(new GridLayout(2,3));
            add(F0);
            add(F1);
            add(F2);
            add(ausgabe0);
            add(ausgabe1);
            add(ausgabe2);
        }
    }


    public Fenster(){
        
        // Layoutmanager festlegen
        setLayout(new BorderLayout());
        add(new Input(),BorderLayout.NORTH); 
        add(new Output(),BorderLayout.CENTER);       

    
        // EventListener anmelden
        b.addActionListener(new MeinButtonListener());
        
        addWindowListener(
            new WindowAdapter(){
                public void windowClosing (WindowEvent e){
                    System.exit(0);
                }
            }
        );

        
        
        

        // Fenster anzeigen
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Fenster();
    }
}