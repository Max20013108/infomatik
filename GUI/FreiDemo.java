import java.awt.*;
public class FreiDemo extends Frame {

    
    public FreiDemo(){
        
        // Layoutmanager festlegen
        setLayout(null);
        
        // Komponenten erzeugen
        Button b = new Button("Drück mich!");
        TextField tf = new TextField("Bitte etwas eingeben");
        Label l =new Label("Hier steht was");
        
        //Position und Größe festlegen
        b.setBounds(40,30,80,20);
        tf.setBounds(50,50,80,20);
        l.setBounds(20,70,100,20);
        
        // Komponenten im Fenster einfügen
        add(b);
        add(tf);
        add(l);
        
        // Fenster anzeigen
        setSize(150,100);
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new FreiDemo();
    }
}
