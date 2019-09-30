import java.awt.*;
import java.awt.event.*;

public class Benutzeroberflaeche extends Frame
{

    Diagramm diagramm = new Diagramm();
    String[] ueberschriften = {"0 richtige","1 richtiger","2 richtige","3 richtige", "4 richtige", "5 richtige", "6 richtige"};
    double[] zahlen = Lottoarrayint.richtigearray(100000000);

    public Benutzeroberflaeche(){
        // Layout
        setTitle("Lotto Wahrscheinlichkeiten");
        setLayout(new BorderLayout());        
        add(diagramm,BorderLayout.CENTER);

        setSize(1020,360);
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