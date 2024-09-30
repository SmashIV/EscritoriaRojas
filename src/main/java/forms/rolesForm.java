package forms;

import Modelos.Controladora;
import Modelos.Rol;
import componentes.agregar.agregarRol;
import componentes.celdas.rol.AccionesRolRenderer;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import raven.modal.ModalDialog;
import raven.modal.component.SimpleModalBorder;

public class rolesForm extends javax.swing.JPanel {

    private Controladora controladora;
    
    public rolesForm() {
            
        controladora = new Controladora();
        initComponents();
        setOpaque(false);
        rolTabla.agregarEstiloTabla(jScrollPane1);
        insertRol.addActionListener(actionEvent -> {
            ModalDialog.showModal(this, new SimpleModalBorder(new agregarRol( controladora, 0), "Agregar Rol", SimpleModalBorder.DEFAULT_OPTION, (controller, action) -> {
                if (action == SimpleModalBorder.OK_OPTION) {
                    loadRoles();
                }
            }));
        });
         loadRoles();
        add(insertRol);
    }

    public void loadRoles(){
        rolTabla.getColumnModel().getColumn(3).setCellRenderer(new AccionesRolRenderer(rolTabla, this));
        rolTabla.getColumnModel().getColumn(3).setCellEditor(new AccionesRolRenderer(rolTabla, this));
        DefaultTableModel model = (DefaultTableModel) rolTabla.getTableModel();
        model.setRowCount(0); 

        List<Rol> roles = controladora.getRoles();
        for (Rol rol : roles) {
            model.addRow(rol.toTableRow());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde1 = new componentes.panelBorde();
        panelBorde2 = new componentes.panelBorde();
        jScrollPane1 = new javax.swing.JScrollPane();
        rolTabla = new componentes.tablas.compTabla();
        insertRol = new externals.Button();

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

        rolTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Descripcion", "Acciones"
            }
        ));
        jScrollPane1.setViewportView(rolTabla);
        if (rolTabla.getColumnModel().getColumnCount() > 0) {
            rolTabla.getColumnModel().getColumn(0).setPreferredWidth(5);
            rolTabla.getColumnModel().getColumn(1).setPreferredWidth(190);
            rolTabla.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        insertRol.setForeground(new java.awt.Color(200, 200, 200));
        insertRol.setText("+ Agregar Rol");
        insertRol.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        insertRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRolActionPerformed(evt);
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
                        .addComponent(insertRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorde2Layout.setVerticalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(panelBorde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBorde1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void insertRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertRolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private externals.Button insertRol;
    private javax.swing.JScrollPane jScrollPane1;
    private componentes.panelBorde panelBorde1;
    private componentes.panelBorde panelBorde2;
    private componentes.tablas.compTabla rolTabla;
    // End of variables declaration//GEN-END:variables
}
