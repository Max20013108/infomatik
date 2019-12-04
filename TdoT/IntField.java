import java.awt.*;
import java.awt.event.*;


public class IntField extends TextField 
{
    public class myKeyAdapter extends KeyAdapter {
        
        Component owner;
        
        public myKeyAdapter(Component o) {
            super();
            owner =o;
        }
        
        public void keyReleased(KeyEvent e) {
            try {
                int a = Integer.parseInt(getText());
                System.out.println(a);
                if((a>=-5)&&(a<=5)){owner.setBackground(Color.GREEN);}
                else{

                    owner.setBackground(Color.RED);
                }
            }
            catch (NumberFormatException fe) {
                owner.setBackground(Color.RED);
            }
        }
    }

    public IntField(String s) {
        super(s);
        addKeyListener(new myKeyAdapter(this));
    }

    public IntField(int d,int cul) {
        super(cul);
        setInt(d);
        addKeyListener(new myKeyAdapter(this));
    }

    public int getInt() {
        return Integer.parseInt(getText());
    }

    public void setInt(int d) {
        setText(""+d);
    }
}