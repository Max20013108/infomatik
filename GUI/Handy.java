import java.awt.*;

public class Handy extends Frame
{
    


    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");    
    Button b5 = new Button("5");    
    Button b6 = new Button("6");    
    Button b7 = new Button("7");    
    Button b8 = new Button("8");    
    Button b9 = new Button("9");    
    Button bs = new Button("*");    
    Button b0 = new Button("0");
    Button br = new Button("#");    
    
    TextField tf  =  new TextField("       ");
    Tastatur t = new Tastatur();
    
    public class Tastatur extends Panel{
        public Tastatur() {
            setLayout(new GridLayout(4,3));
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bs);
            add(b0);
            add(br);
        }
    }
    
    public Handy()
    {
        setLayout(new BorderLayout());
        add(tf,BorderLayout.NORTH);
        add(t,BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Handy();
    }

}
