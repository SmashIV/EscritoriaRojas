package forms;

import Modelos.Admin;
import Modelos.Controladora;
import componentes.agregar.agregarAdmin;
import componentes.celdas.admin.AccionesAdminRenderer;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import raven.modal.ModalDialog;
import raven.modal.component.SimpleModalBorder;

public class adminForm extends javax.swing.JPanel {

    private Controladora controladora;
    
    public adminForm() {
        controladora = new Controladora();
        initComponents();
        setOpaque(false);
        adminTabla.agregarEstiloTabla(jScrollPane1);
        insertAdmin.addActionListener(actionEvent -> {
            ModalDialog.showModal(this, new SimpleModalBorder(new agregarAdmin( controladora, 0), "Agregar Administrador", SimpleModalBorder.DEFAULT_OPTION, (controller, action) -> {
                if (action == SimpleModalBorder.OK_OPTION) {
                    loadAdmins();
                }
            }));
        });
        loadAdmins();
        add(insertAdmin);

    }

   public void loadAdmins(){
       adminTabla.getColumnModel().getColumn(7).setCellRenderer(new AccionesAdminRenderer(adminTabla, this));
       adminTabla.getColumnModel().getColumn(7).setCellEditor(new AccionesAdminRenderer(adminTabla, this));
       
       DefaultTableModel model = (DefaultTableModel) adminTabla.getTableModel();
        model.setRowCount(0); 

        List<Admin> admins = controladora.getAdmins();
        for (Admin admin : admins) {
            model.addRow(admin.toTableRow());
        }
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde1 = new componentes.panelBorde();
        panelBorde2 = new componentes.panelBorde();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTabla = new componentes.tablas.compTabla();
        insertAdmin = new externals.Button();

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

        adminTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Usuario", "Contraseña", "Email", "Nombres", "Apellidos", "Area", "Accion"
            }
        ));
        jScrollPane1.setViewportView(adminTabla);
        if (adminTabla.getColumnModel().getColumnCount() > 0) {
            adminTabla.getColumnModel().getColumn(0).setPreferredWidth(5);
            adminTabla.getColumnModel().getColumn(1).setPreferredWidth(50);
            adminTabla.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        insertAdmin.setForeground(new java.awt.Color(200, 200, 200));
        insertAdmin.setText("+ Agregar Admin");
        insertAdmin.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        insertAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertAdminActionPerformed(evt);
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
                        .addComponent(insertAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorde2Layout.setVerticalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
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

    private void insertAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertAdminActionPerformed
        
    }//GEN-LAST:event_insertAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.tablas.compTabla adminTabla;
    private externals.Button insertAdmin;
    private javax.swing.JScrollPane jScrollPane1;
    private componentes.panelBorde panelBorde1;
    private componentes.panelBorde panelBorde2;
    // End of variables declaration//GEN-END:variables
}
