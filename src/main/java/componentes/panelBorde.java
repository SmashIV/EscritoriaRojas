
package componentes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class panelBorde extends JPanel{

    public panelBorde() {
        setOpaque(false);
    }
    
    public void paint (Graphics g){
        
        Graphics2D g2=(Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int ancho=getWidth();
        int largo=getHeight();

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, ancho, largo, 15, 15);
        g2.dispose();
        
        super.paint(g);
    }
    
}
