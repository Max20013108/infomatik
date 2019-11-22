import java.awt.*;

public class DoubleField extends TextField
{
    public DoubleField(String s) {
        super(s);
    }
    
    public DoubleField(double d,int cul) {
        super(cul);
        setDouble(d);
    }
    
    public double getDouble() {
        return Double.parseDouble(getText());
    }
    
    public void setDouble(double d) {
        setText(""+d);
    }
}
