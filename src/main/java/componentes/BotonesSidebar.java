package componentes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BotonesSidebar extends JButton{

    private float animado;
    private int index;
    
    
    public BotonesSidebar(int index) {
        
        this.index = index;
        
        setContentAreaFilled(false);
        setForeground(new Color(189, 189, 189));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setHorizontalAlignment(SwingConstants.LEFT);
        setBackground(new Color(65,65,65));
        setBorder(new EmptyBorder(8, 20, 8, 15));
    }
 
    
    
    public float getAnimado() {
        return animado;
    }

    public void setAnimado(float animado) {
        this.animado = animado;
        repaint();
    }

    public int getIndex() {
        return index;
    }

    public void paint(Graphics g){
       
        Graphics2D g2=(Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        double ancho=getWidth();
        double largo=getHeight();
        
        double x=animado * ancho - ancho;
        
        Area area=new Area(new RoundRectangle2D.Double(x,0,ancho,largo,largo,largo));
        area.add(new Area(new Rectangle2D.Double(x,0,largo,largo)));
        
        g2.setColor(getBackground());
        g2.fill(area);
        g2.dispose();
        
        super.paint(g);
    }
    
    
}
