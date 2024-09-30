
package componentes.celdas;

import Modelos.Nombre;
import Modelos.Producto1;
import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import java.awt.Component;

public class categoriaCelda extends TableCustomCell {
    
    public categoriaCelda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();

        jLabel1.setForeground(new java.awt.Color(255, 253, 253));
        jLabel1.setText("Categoria");

        categoriaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Mascotas", "Verduras", "Frutas" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(categoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void setData(Object o) {
        
        if (o != null && o instanceof String) {
        String categoria = o.toString();
        
        categoriaBox.setSelectedItem(categoria);
        }
    }

    @Override
    public Object getData() {
        
        Object selectedItem = categoriaBox.getSelectedItem();
        return selectedItem != null ? selectedItem.toString() : "";
        
    }


    @Override
    public TableCustomCell createComponentCellEditor(TableCustom tc, TableRowData trd, Object o, int i, int i1) {
        categoriaCelda celda=new categoriaCelda();
        celda.setData(o);
        return celda;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoriaBox;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
