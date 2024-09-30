
package componentes.tablas;

import com.raven.table.TableCustom;
import externals.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableCellRenderer;


public class compTabla extends TableCustom{

    public compTabla() {
        
    }
    
    public void agregarEstiloTabla(JScrollPane scroll){
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        setBorder(null);
        scroll.setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        
        JPanel tPanel=new JPanel();
        tPanel.setBackground(new Color(60,60,60));
        setForeground(new Color(214,214,214));
        setSelectionForeground(new Color(214,214,214));
        setSelectionBackground(new Color(50,50,50));
        getTableHeader().setDefaultRenderer(new productoHeader());
        setRowHeight(47);
        setShowHorizontalLines(true);
        setGridColor(new Color(50,50,50));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, tPanel);
    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        
        
        Component component=super.prepareRenderer(renderer, row, column);
        
        if (!isCellSelected(row, column)) {
            component.setBackground(new Color(60,60,60));
        }
        
        return component;
        
    }
   
    
}   
