import java.awt.*;
import java.awt.event.*;

public class Benutzeroberflaeche extends Frame
{

    Diagramm diagramm = new Diagramm();
    String[] ueberschriften = {"Ameisenbären", "Brontosaurier", "Chamäleons", "Dackel"};
    int[] zahlen = {212,121,122, 31};

    public Benutzeroberflaeche(){
        // Layout
        setTitle("Demo Diagramm");
        setLayout(new BorderLayout());        
        add(diagramm,BorderLayout.CENTER);

        setSize(400,180);
        setVisible(true);

        // EventListener zum Fensterschließen
        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            }
        );

        Button b = new Button("Los!");
        // ActionListener für den Button
        b.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    diagramm.setBeschriftung(ueberschriften);
                    diagramm.setDaten(zahlen);
                }
            }
        );
        
        add(b,BorderLayout.SOUTH);
        repaint();
    }

    public static void main(String[] args){
        new Benutzeroberflaeche();

    }

}