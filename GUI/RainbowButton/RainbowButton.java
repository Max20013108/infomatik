import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class RainbowButton extends Button{

    public class myMouseAdapter extends MouseAdapter{
        
        Component owner;
        
        public myMouseAdapter(Component o) {
            super();
            owner =o;
        }
        
        public void mouseEntered(KeyEvent e) {
            
                // int r = (int)Math.random()*255;
                // int g = (int)Math.random()*255;
                // int b = (int)Math.random()*255;
                // Color randomColor = new Color(r, g, b);

                owner.setBackground(Color.RED);
              
        }

    }
    public RainbowButton(String s) {
        super(s);
        addMouseListener(new myMouseAdapter(this));
    }

    public RainbowButton() {
        addMouseListener(new myMouseAdapter(this));
    
    }
    
}




    

    



