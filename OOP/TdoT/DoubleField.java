import java.awt.*;
import java.awt.event.*;

public class DoubleField extends TextField 
{
    public class myKeyAdapter extends KeyAdapter {
        
        Component owner;
        
        public myKeyAdapter(Component o) {
            super();
            owner =o;
        }
        
        public void keyReleased(KeyEvent e) {
            try {
                if((int)(Double.parseDouble(getText()))<=5 && ((int)(Double.parseDouble(getText()))>=-5 && true)){
                    owner.setBackground(Color.GREEN);
                } 
            }
            catch (NumberFormatException fe) {
                owner.setBackground(Color.RED);
            }
        }
    }

    public DoubleField(String s) {
        super(s);
        addKeyListener(new myKeyAdapter(this));
    }

    public DoubleField(double d,int cul) {
        super(cul);
        setDouble(d);
        addKeyListener(new myKeyAdapter(this));
    }

    public double getDouble() {
        return Double.parseDouble(getText());
    }

    public void setDouble(double d) {
        setText(""+d);
    }
}