package main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import eventos.sidebarEvent;
import forms.categoriasForm;
import forms.descuentosForm;
import forms.pagosForm;
import forms.pedidosForm;
import forms.principalForm;
import forms.productoForm;
import forms.promocionesForm;
import forms.rolesForm;
import forms.usuariosForm;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
        getContentPane().setBackground(new Color(63,109,217));
        
        sidebarEvent event=new sidebarEvent() {
            @Override
            public void sidebarSeleccionado(int index) {
                
                switch (index) {
                    case 0:
                        mostrarForm(new principalForm());
                        break;
                    case 1:
                        mostrarForm(new categoriasForm());
                        break;
                    case 2:
                        mostrarForm(new productoForm());
                        break;
                    case 3:
                        mostrarForm(new usuariosForm());
                        break;
                    case 4:
                        mostrarForm(new pedidosForm());
                        break;
                    case 5:
                        mostrarForm(new promocionesForm());
                        break;
                    case 6:
                        mostrarForm(new descuentosForm());
                        break;
                    case 8: 
                        mostrarForm(new rolesForm());
                        break;
                    case 9:
                        mostrarForm(new pagosForm());
                        break;
                    case 7:
                        Main.this.dispose();
                        login login = new login();
                        login.setVisible(true);
                        break;
                }
            }
        };
        
        sidebar.initSidebar(event);
        sidebar.setSeleccionado(0);
       
    }

    
    
    
    private void mostrarForm(Component comp){
        panelContenido.removeAll();
        panelContenido.add(comp);
        panelContenido.revalidate();
        panelContenido.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidebar = new componentes.sidebar();
        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        panelContenido.setOpaque(false);
        panelContenido.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelContenido;
    private componentes.sidebar sidebar;
    // End of variables declaration//GEN-END:variables
}
