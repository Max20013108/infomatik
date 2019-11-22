import java.awt.*;

public class IntField extends TextField
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public IntField(String s) {
        super(s);
    }
    
    public IntField(int d,int cul) {
        super(cul);
        setInt(d);
    }
    
    public int getInt() {
        return Integer.parseInt(getText());
    }
    

    public void setInt(int d) {
        setText(""+d);
    }
}
