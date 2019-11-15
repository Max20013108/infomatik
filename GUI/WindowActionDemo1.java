import java.awt.*;
import java.awt.event.*;

public class WindowActionDemo1 extends Frame
{
    
    // Einen spezialisierten EventListener von der Klasse WindowAdapter ableiten
    public class MeinWindowAdapter extends WindowAdapter {
        public void windowClosing (WindowEvent e){
            System.exit(0);
        }
    }
    
    public WindowActionDemo1(){
        
        // EventListener erzeugen und anmelden
        MeinWindowAdapter mwa = new MeinWindowAdapter();
        addWindowListener(mwa);
          
        setSize(300,100);
        setTitle("WindowActionDemo1");
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new WindowActionDemo1();
    }
}