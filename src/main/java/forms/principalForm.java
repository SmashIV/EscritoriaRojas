package forms;

public class principalForm extends javax.swing.JPanel {

    public principalForm() {
        initComponents();
        setOpaque(false);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde1 = new componentes.panelBorde();
        panelBorde2 = new componentes.panelBorde();
        panelBorde3 = new componentes.panelBorde();

        panelBorde1.setBackground(new java.awt.Color(60, 60, 60));

        javax.swing.GroupLayout panelBorde1Layout = new javax.swing.GroupLayout(panelBorde1);
        panelBorde1.setLayout(panelBorde1Layout);
        panelBorde1Layout.setHorizontalGroup(
            panelBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBorde1Layout.setVerticalGroup(
            panelBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        panelBorde2.setBackground(new java.awt.Color(60, 60, 60));

        javax.swing.GroupLayout panelBorde2Layout = new javax.swing.GroupLayout(panelBorde2);
        panelBorde2.setLayout(panelBorde2Layout);
        panelBorde2Layout.setHorizontalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBorde2Layout.setVerticalGroup(
            panelBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        panelBorde3.setBackground(new java.awt.Color(60, 60, 60));

        javax.swing.GroupLayout panelBorde3Layout = new javax.swing.GroupLayout(panelBorde3);
        panelBorde3.setLayout(panelBorde3Layout);
        panelBorde3Layout.setHorizontalGroup(
            panelBorde3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        panelBorde3Layout.setVerticalGroup(
            panelBorde3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorde3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorde1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorde2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorde3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.panelBorde panelBorde1;
    private componentes.panelBorde panelBorde2;
    private componentes.panelBorde panelBorde3;
    // End of variables declaration//GEN-END:variables
}
