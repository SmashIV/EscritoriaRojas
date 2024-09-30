        
package componentes.celdas;

import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class accionesCelda extends TableCustomCell {

    
    public accionesCelda() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eliminarButton = new externals.Button();
        editarButton = new externals.Button();

        eliminarButton.setIcon(new javax.swing.ImageIcon("/home/smashiv/NetBeansProjects/rojasMarket/src/main/resources/assets/delete.png")); // NOI18N

        editarButton.setIcon(new javax.swing.ImageIcon("/home/smashiv/NetBeansProjects/rojasMarket/src/main/resources/assets/edit.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(editarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addEventos(TableCustom tabla, TableRowData datos, int fila){
        editarButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (datos.isEditing()) {
                    tabla.cancelEditRowAt(fila);
                    editarButton.setIcon(new ImageIcon(getClass().getResource("/assets/edit.png")));
                }else{
                    tabla.editRowAt(fila);
                    editarButton.setIcon(new ImageIcon(getClass().getResource("/assets/cancel.png")));
                }
            }
      
        });
        
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               tabla.deleteRowAt(getRow(), true);
            }
        });
    }
    
    private void checkIcono(TableRowData datos){
        
         if (datos.isEditing()) {
                  
            editarButton.setIcon(new ImageIcon(getClass().getResource("/assets/cancel.png")));
         }else{
                   
            editarButton.setIcon(new ImageIcon(getClass().getResource("/assets/edit.png")));
         }    
        
    }
    
    @Override
    public void setData(Object o) {
        
    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public Component createComponentCellRender(TableCustom table, TableRowData data, int row, int column) {
       accionesCelda celda=new accionesCelda();
       celda.checkIcono(data);
       celda.addEventos(table, data, row);
       return celda;
    }

    @Override
    public Component createComponentCellRenderOnEditor(TableCustom table, TableRowData data, int row, int column) {
        return null;
    }

    
    
    
    @Override
    public TableCustomCell createComponentCellEditor(TableCustom tc, TableRowData trd, Object o, int i, int i1) {
        accionesCelda celda=new accionesCelda();
        celda.checkIcono(trd);
        celda.addEventos(tc, trd, i);
        return celda;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private externals.Button editarButton;
    private externals.Button eliminarButton;
    // End of variables declaration//GEN-END:variables
}
