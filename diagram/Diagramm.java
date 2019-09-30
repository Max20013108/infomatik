import java.awt.*;

public class Diagramm extends Canvas
{
    private int fontsize = 20;
    private Font f = new Font("Arial",Font.BOLD,fontsize);

    private String[] beschriftung;
    private double[] daten;

    public Diagramm() {
        super();
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Hintergrund
        g.setColor(Color.WHITE);
        g.fillRect(0,0,getWidth(),getHeight());

        // Überschriften schreiben 
        g.setColor(Color.BLACK);
        g.setFont(f);
        int x =10;
        int y=2*fontsize;
        if (beschriftung != null){
            for (String s : beschriftung) {
                g.drawString(s,x,y);
                y=y+2*fontsize;
            }
        }

        g.setColor(Color.BLACK);
        g.setFont(f);
        int c =700;
        int m=2*fontsize;
        if (beschriftung != null){
            for (double s : daten) {
                g.drawString(""+s+"%",c,m);
                m=m+2*fontsize;
            }
        }

        // Balken zeichnen
        g.setColor(Color.BLUE);
        x = 150;
        y = fontsize;
        if (daten != null){
            for (double d : daten) {
                g.fillRect(x,y,(int)d*10,fontsize); //int !!!!!!!!!!
                y=y+2*fontsize;
            }
        }
    }

    public void setBeschriftung(String[] us){
        beschriftung = us;
        repaint();
    }

    public void setDaten(double[] d){
        daten =d;
        repaint();
    }

}