package forms;

import Modelos.Cliente;
import Modelos.Controladora;
import componentes.agregar.agregarTest;
import componentes.celdas.cliente.AccionesRendererEditor;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import raven.modal.ModalDialog;
import raven.modal.component.SimpleModalBorder;

public class clienteForm extends javax.swing.JPanel {
    
    private Controladora controladora;

    public clienteForm() {
        initComponents();
        setOpaque(false);
        clienteTabla.agregarEstiloTabla(jScrollPane1);
        controladora = new Controladora();
        loadClientes();
        button1.addActionListener(actionEvent -> {
            ModalDialog.showModal(this, new SimpleModalBorder(new agregarTest( controladora, 0), "Agregar Cliente", SimpleModalBorder.DEFAULT_OPTION, (controller, action) -> {
                if (action == SimpleModalBorder.OK_OPTION) {
                    
                    loadClientes();
                }
            }));
        });
        
        add(button1);
    }

    // Method to load clients into the table
    public void loadClientes() {
       
         clienteTabla.getColumnModel().getColumn(8).setCellRenderer(new AccionesRendererEditor(clienteTabla, this));
         clienteTabla.getColumnModel().getColumn(8).setCellEditor(new AccionesRendererEditor(clienteTabla, this));
        
        DefaultTableModel model = (DefaultTableModel) clienteTabla.getModel();
        model.setRowCount(0); 

        List<Cliente> clientes = controladora.getClientes();
        for (Cliente cliente : clientes) {
            model.addRow(cliente.toTableRow());
        }
    }


 /*  public void cargarClientes() {
        DefaultTableModel model = (DefaultTableModel) clienteTabla.getModel();
        model.setRowCount(0); 

        List<Cliente> getclientes = controladora.getClientes();
        for (Cliente cliente : getclientes) {
           model.addRow(cliente.toTableRow());
        }
    }*/
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde1 = new componentes.panelBorde();
        jTextField1 = new javax.swing.JTextField();
        panelBorde2 = new componentes.panelBorde();
        jScrollPane1 = new javax.swing.JScrollPane();
        clienteTabla = new componentes.tablas.compTabla();
        button1 = new externals.Button();

        panelBorde1.setBackground(new java.awt.Color(60, 60, 60));

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout panelBorde1Layout = new javax.swing.GroupLayout(panelBorde1);
        panelBorde1.setLayout(panelBorde1Layout);
        panelBorde1Layout.setHorizontalGroup(
            panelBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde1Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorde1Layout.setVerticalGroup(
            panelBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorde1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        panelBorde2.setBackground(new java.awt.Color(60, 60, 60));

        clienteTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Usuario", "Mail", "Contraseña", "Nombres", "Apellidos", "Direccion", "Num_Celular", "Acciones"
            }
        ));
        jScrollPane1.setViewportView(clienteTabla);
        if (clienteTabla.getColumnModel().getColumnCount() > 0) {
            clienteTabla.getColumnModel().getColumn(0).setPreferredWidth(2);
            clienteTabla.getColumnModel().getColumn(1).setPreferredWidth(15);
            clienteTabla.getColumnModel().getColumn(2).setPreferredWidth(20);
            clienteTabla.getColumnModel().getColumn(3).setPreferredWidth(15);
            clienteTabla.getColumnModel().getColumn(4).setPreferredWidth(20);
            clienteTabla.getColumnModel().getColumn(8).setPreferredWidth(30);
        }

        button1.setText("Agregar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorde2Layout = new javax.swing.GroupLayout(panelBorde2);
        panelBorde2.setLayout(panelBorde2Layout);
        panelBorde2Layout.setHorizontalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBorde2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorde2Layout.setVerticalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
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

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private externals.Button button1;
    private componentes.tablas.compTabla clienteTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private componentes.panelBorde panelBorde1;
    private componentes.panelBorde panelBorde2;
    // End of variables declaration//GEN-END:variables
}
