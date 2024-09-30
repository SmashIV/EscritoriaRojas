package forms;

import Modelos.Nombre;
import Modelos.Producto1;
import componentes.celdas.accionesCelda;
import componentes.celdas.nombreCelda;
import javax.swing.ImageIcon;

public class promocionesForm extends javax.swing.JPanel {

    public promocionesForm() {
        initComponents();
        setOpaque(false);
        promocionesTabla.agregarEstiloTabla(jScrollPane1);
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde1 = new componentes.panelBorde();
        panelBorde2 = new componentes.panelBorde();
        jScrollPane1 = new javax.swing.JScrollPane();
        promocionesTabla = new componentes.tablas.compTabla();

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

        promocionesTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descuento", "Producto", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(promocionesTabla);
        if (promocionesTabla.getColumnModel().getColumnCount() > 0) {
            promocionesTabla.getColumnModel().getColumn(0).setPreferredWidth(190);
            promocionesTabla.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout panelBorde2Layout = new javax.swing.GroupLayout(panelBorde2);
        panelBorde2.setLayout(panelBorde2Layout);
        panelBorde2Layout.setHorizontalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelBorde2Layout.setVerticalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private componentes.panelBorde panelBorde1;
    private componentes.panelBorde panelBorde2;
    private componentes.tablas.compTabla promocionesTabla;
    // End of variables declaration//GEN-END:variables
}
