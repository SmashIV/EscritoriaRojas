package forms;

import Modelos.Controladora;
import Modelos.Pago;
import componentes.agregar.agregarPago;
import componentes.celdas.pago.AccionesPagoRenderer;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import raven.modal.ModalDialog;
import raven.modal.component.SimpleModalBorder;

public class pagosForm extends javax.swing.JPanel {

    Controladora controladora = new Controladora();
    
    public pagosForm() {
        initComponents();
        setOpaque(false);
        pagosTabla.agregarEstiloTabla(jScrollPane1);
        insertPago.addActionListener(actionEvent -> {
            ModalDialog.showModal(this, new SimpleModalBorder(new agregarPago( controladora, 0), "Agregar Pago", SimpleModalBorder.DEFAULT_OPTION, (controller, action) -> {
                if (action == SimpleModalBorder.OK_OPTION) {
                    loadPagos();
                }
            }));
        });
         loadPagos();
        add(insertPago);
    }

   public void loadPagos(){
        pagosTabla.getColumnModel().getColumn(4).setCellRenderer(new AccionesPagoRenderer(pagosTabla, this));
        pagosTabla.getColumnModel().getColumn(4).setCellEditor(new AccionesPagoRenderer(pagosTabla, this));
        DefaultTableModel model = (DefaultTableModel) pagosTabla.getTableModel();
        model.setRowCount(0); 

        List<Pago> pagos = controladora.getPagos();
        for (Pago pago : pagos) {
            model.addRow(pago.toTableRow());
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde1 = new componentes.panelBorde();
        panelBorde2 = new componentes.panelBorde();
        jScrollPane1 = new javax.swing.JScrollPane();
        pagosTabla = new componentes.tablas.compTabla();
        insertPago = new externals.Button();

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

        pagosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Metodo", "Descripcion", "Estado", "Acciones"
            }
        ));
        jScrollPane1.setViewportView(pagosTabla);
        if (pagosTabla.getColumnModel().getColumnCount() > 0) {
            pagosTabla.getColumnModel().getColumn(0).setPreferredWidth(5);
            pagosTabla.getColumnModel().getColumn(1).setPreferredWidth(40);
            pagosTabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            pagosTabla.getColumnModel().getColumn(4).setPreferredWidth(15);
        }

        insertPago.setForeground(new java.awt.Color(200, 200, 200));
        insertPago.setText("+ Agregar Metodo de Pago");
        insertPago.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        insertPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPagoActionPerformed(evt);
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
                        .addComponent(insertPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorde2Layout.setVerticalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
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

    private void insertPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private externals.Button insertPago;
    private javax.swing.JScrollPane jScrollPane1;
    private componentes.tablas.compTabla pagosTabla;
    private componentes.panelBorde panelBorde1;
    private componentes.panelBorde panelBorde2;
    // End of variables declaration//GEN-END:variables
}
