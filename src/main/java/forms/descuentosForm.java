package forms;

import Modelos.Controladora;
import Modelos.Descuento;
import componentes.agregar.agregarDescuento;
import componentes.celdas.descuento.AccionesDescuentosRenderer;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import raven.modal.ModalDialog;
import raven.modal.component.SimpleModalBorder;



public class descuentosForm extends javax.swing.JPanel {

    Controladora controladora;
    
    public descuentosForm() {
        controladora = new Controladora();
        
        initComponents();
        setOpaque(false);
        descuentosTabla.agregarEstiloTabla(jScrollPane1);
        insertDescuento.addActionListener(actionEvent -> {
            ModalDialog.showModal(this, new SimpleModalBorder(new agregarDescuento( controladora, 0), "Agregar Descuento", SimpleModalBorder.DEFAULT_OPTION, (controller, action) -> {
                if (action == SimpleModalBorder.OK_OPTION) {
                    loadDescuentos();
                }
            }));
        });
         loadDescuentos();
        add(insertDescuento);  
        
    }

    public void loadDescuentos(){
        descuentosTabla.getColumnModel().getColumn(5).setCellRenderer(new AccionesDescuentosRenderer(descuentosTabla, this));
        descuentosTabla.getColumnModel().getColumn(5).setCellEditor(new AccionesDescuentosRenderer(descuentosTabla, this));
        DefaultTableModel model = (DefaultTableModel) descuentosTabla.getTableModel();
        model.setRowCount(0); 

        List<Descuento> descuentos = controladora.getDescuentos();
        for (Descuento descuento : descuentos) {
            model.addRow(descuento.toTableRow());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde1 = new componentes.panelBorde();
        panelBorde2 = new componentes.panelBorde();
        jScrollPane1 = new javax.swing.JScrollPane();
        descuentosTabla = new componentes.tablas.compTabla();
        insertDescuento = new externals.Button();

        panelBorde1.setBackground(new java.awt.Color(60, 60, 60));

        javax.swing.GroupLayout panelBorde1Layout = new javax.swing.GroupLayout(panelBorde1);
        panelBorde1.setLayout(panelBorde1Layout);
        panelBorde1Layout.setHorizontalGroup(
            panelBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        panelBorde1Layout.setVerticalGroup(
            panelBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        panelBorde2.setBackground(new java.awt.Color(60, 60, 60));

        descuentosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre Descuento", "Porcentaje (%)", "FechaInicio", "FechaFin", "Acciones"
            }
        ));
        jScrollPane1.setViewportView(descuentosTabla);
        if (descuentosTabla.getColumnModel().getColumnCount() > 0) {
            descuentosTabla.getColumnModel().getColumn(0).setPreferredWidth(5);
            descuentosTabla.getColumnModel().getColumn(1).setPreferredWidth(60);
            descuentosTabla.getColumnModel().getColumn(2).setPreferredWidth(60);
            descuentosTabla.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        insertDescuento.setForeground(new java.awt.Color(200, 200, 200));
        insertDescuento.setText("+ Agregar Descuento");
        insertDescuento.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        insertDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertDescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorde2Layout = new javax.swing.GroupLayout(panelBorde2);
        panelBorde2.setLayout(panelBorde2Layout);
        panelBorde2Layout.setHorizontalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                    .addGroup(panelBorde2Layout.createSequentialGroup()
                        .addComponent(insertDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorde2Layout.setVerticalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorde1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorde2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorde2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBorde1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void insertDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertDescuentoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_insertDescuentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.tablas.compTabla descuentosTabla;
    private externals.Button insertDescuento;
    private javax.swing.JScrollPane jScrollPane1;
    private componentes.panelBorde panelBorde1;
    private componentes.panelBorde panelBorde2;
    // End of variables declaration//GEN-END:variables
}
