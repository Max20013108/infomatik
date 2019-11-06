import java.awt.*;

public class A31 extends Frame
{
    public A31(){
        
        // Layoutmanager festlegen
        setLayout(new BorderLayout());
        

         Choice ch = new Choice();
            ch.addItem("Freundliches Feedback");
            ch.addItem("Wutbrief");
            ch.addItem("Beschwerde");

        TextField tf = new TextField();

        Button b = new Button("Bestätige");
        
        add(ch,BorderLayout.NORTH);
        add(tf,BorderLayout.CENTER);
        add(b,BorderLayout.SOUTH);
        
        // Fenster anzeigen
        pack();
        
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new A31();
        
    }
}
