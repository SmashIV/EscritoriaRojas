package forms;

import Modelos.Categoria;
import Modelos.Controladora;
import componentes.agregar.agregarCategoria;
import componentes.celdas.categoria.AccionesCategoriaRenderer;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import raven.modal.ModalDialog;
import raven.modal.component.SimpleModalBorder;

public class categoriasForm extends javax.swing.JPanel {

    private Controladora controladora;
    
    public categoriasForm() {
        controladora = new Controladora();
        initComponents();
        setOpaque(false);
        categoriaTabla.agregarEstiloTabla(jScrollPane1);
        insertCategoria.addActionListener(actionEvent -> {
            ModalDialog.showModal(this, new SimpleModalBorder(new agregarCategoria( controladora, 0), "Agregar Categoria", SimpleModalBorder.DEFAULT_OPTION, (controller, action) -> {
                if (action == SimpleModalBorder.OK_OPTION) {
                    loadCategorias();
                }
            }));
        });
        loadCategorias();
        add(insertCategoria);
    }
    
    public void loadCategorias(){
        categoriaTabla.getColumnModel().getColumn(3).setCellRenderer(new AccionesCategoriaRenderer(categoriaTabla, this));
        categoriaTabla.getColumnModel().getColumn(3).setCellEditor(new AccionesCategoriaRenderer(categoriaTabla, this));
        DefaultTableModel model = (DefaultTableModel) categoriaTabla.getTableModel();
        model.setRowCount(0); 

        List<Categoria> categorias = controladora.getCategorias();
        for (Categoria categoria : categorias) {
            model.addRow(categoria.toTableRow());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde1 = new componentes.panelBorde();
        panelBorde2 = new componentes.panelBorde();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoriaTabla = new componentes.tablas.compTabla();
        insertCategoria = new externals.Button();

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

        categoriaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Descripcion", "Acciones"
            }
        ));
        jScrollPane1.setViewportView(categoriaTabla);
        if (categoriaTabla.getColumnModel().getColumnCount() > 0) {
            categoriaTabla.getColumnModel().getColumn(0).setPreferredWidth(10);
            categoriaTabla.getColumnModel().getColumn(1).setPreferredWidth(190);
            categoriaTabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            categoriaTabla.getColumnModel().getColumn(3).setPreferredWidth(35);
        }

        insertCategoria.setForeground(new java.awt.Color(200, 200, 200));
        insertCategoria.setText("+ Agregar Categoria");
        insertCategoria.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        insertCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCategoriaActionPerformed(evt);
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
                        .addComponent(insertCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorde2Layout.setVerticalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorde2Layout.createSequentialGroup()
                .addComponent(insertCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void insertCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCategoriaActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_insertCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.tablas.compTabla categoriaTabla;
    private externals.Button insertCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private componentes.panelBorde panelBorde1;
    private componentes.panelBorde panelBorde2;
    // End of variables declaration//GEN-END:variables
}
