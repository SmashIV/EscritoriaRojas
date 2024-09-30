
package componentes.celdas;

import Modelos.Nombre;
import com.raven.table.cell.Cell;

public class celdaRender extends Cell {

    public celdaRender(Nombre datos) {
        initComponents();
        nombreLb.setText(datos.toString());
        tableIcon.setImage(datos.getImg());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableIcon = new externals.ImageAvatar();
        nombreLb = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(350, 47));

        tableIcon.setBorderSize(2);
        tableIcon.setBorderSpace(1);
        tableIcon.setImage(new javax.swing.ImageIcon("/home/smashiv/NetBeansProjects/rojasMarket/src/main/resources/assets/productos.jpeg")); // NOI18N

        nombreLb.setForeground(new java.awt.Color(200, 200, 200));
        nombreLb.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreLb, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nombreLb;
    private externals.ImageAvatar tableIcon;
    // End of variables declaration//GEN-END:variables
}
