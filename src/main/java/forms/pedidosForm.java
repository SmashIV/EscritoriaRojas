package forms;



public class pedidosForm extends javax.swing.JPanel {

    public pedidosForm() {
        initComponents();
        setOpaque(false);
        pedidosTabla.agregarEstiloTabla(jScrollPane1);

    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde1 = new componentes.panelBorde();
        panelBorde2 = new componentes.panelBorde();
        jScrollPane1 = new javax.swing.JScrollPane();
        pedidosTabla = new componentes.tablas.compTabla();

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

        pedidosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Pago", "Fecha_Pedido", "Subtotal", "Total", "Estado Pedido"
            }
        ));
        jScrollPane1.setViewportView(pedidosTabla);
        if (pedidosTabla.getColumnModel().getColumnCount() > 0) {
            pedidosTabla.getColumnModel().getColumn(0).setPreferredWidth(190);
            pedidosTabla.getColumnModel().getColumn(1).setPreferredWidth(200);
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
    private componentes.tablas.compTabla pedidosTabla;
    // End of variables declaration//GEN-END:variables
}
