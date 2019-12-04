import java.awt.*;

public class Fenster extends Frame
{
    public Fenster(){
        
        // Layoutmanager festlegen
        setLayout(new BorderLayout());
        
        // Komponenten erzeugen

        Button tf = new RainbowButton("Los");
        tf.addMouseListener(new RainbowButton(myMouseListener()));
        
        // Komponenten im Fenster einfügen

        add(tf,BorderLayout.CENTER);

        
        // Fenster anzeigen
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Fenster();
    }
}
