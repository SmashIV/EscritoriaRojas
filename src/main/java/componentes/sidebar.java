package componentes;

import eventos.sidebarEvent;
import externals.ScrollBarCustom;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author smashiv
 */
public class sidebar extends javax.swing.JPanel {

    private Animator animator;
    private BotonesSidebar sidebarSeleccionado;
    private BotonesSidebar sidebarDeseleccionado;
    private sidebarEvent event;
    
    public sidebar() {
        initComponents();
        setOpaque(false);
        scroll.setViewportBorder(null);
        scroll.setBorder(null);
        scroll.getViewport().setOpaque(false);
        
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        
        panelMenu.setLayout(new MigLayout("wrap, fillx, inset 0", "[fill]"));
        
        TimingTarget target=new TimingTargetAdapter(){
        
            public void timingEvent(float f){
            
                sidebarSeleccionado.setAnimado(f);
                
                if (sidebarDeseleccionado!=null) {
                    sidebarDeseleccionado.setAnimado(1f-f);
                }
            }
        
        };
        animator=new Animator(300, target);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        animator.setResolution(0);
        
    }

    public void initSidebar(sidebarEvent e){
        event = e;
        
        agregarSidebar("1", "Principal", 0);
        division("Acciones");
        agregarSidebar("7", "Categorias", 1);
        agregarSidebar("3", "Productos", 2);
        agregarSidebar("2", "Usuarios", 3);
        agregarSidebar("4", "Pedidos", 4);
        agregarSidebar("6", "Promociones", 5);
        agregarSidebar("5", "Descuentos", 6);
        agregarSidebar("5", "Roles", 8);
        agregarSidebar("5", "Pagos", 9);
        espacio();
        agregarSidebar("key", "Cerrar Sesión", 7);
        
    }
    
    private void agregarSidebar(String icono, String texto, int index){
        BotonesSidebar sidebar = new BotonesSidebar(index);
        setFont(sidebar.getFont().deriveFont(Font.PLAIN, 14));
        sidebar.setIcon(new ImageIcon(getClass().getResource("/assets/" + icono + ".png"))); 
        sidebar.setText(" "+texto);
        
        sidebar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!animator.isRunning()) {
                    if (sidebar!=sidebarSeleccionado) {
                        
                        sidebarDeseleccionado=sidebarSeleccionado;
                        sidebarSeleccionado=sidebar;
                        
                        animator.start();
                        
                        event.sidebarSeleccionado(index);
                    }
                }
            }
        });
        
        panelMenu.add(sidebar);
    }

    private void division(String nombre){
        panelMenu.add(new barDivision(nombre), "h 20");
    }
    
    private void espacio(){
        panelMenu.add(new JLabel(), "push");
    }
    
    public void setSeleccionado(int index) {
        for (Component component : panelMenu.getComponents()) {
            
            if (component instanceof BotonesSidebar) {
                BotonesSidebar boton=(BotonesSidebar) component;
                
                if (boton.getIndex()==index) {
                    
                    if (boton!=sidebarSeleccionado) {
                        
                        sidebarDeseleccionado=sidebarSeleccionado;
                        sidebarSeleccionado=boton;
                        animator.start();
                        event.sidebarSeleccionado(index);
                    }
                    break;
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        img = new externals.ImageAvatar();
        scroll = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();

        tituloLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(237, 234, 234));
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Rojas Market");
        tituloLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        img.setBorderSize(3);
        img.setBorderSpace(2);
        img.setGradientColor1(new java.awt.Color(237, 55, 230));
        img.setGradientColor2(new java.awt.Color(231, 127, 17));
        img.setImage(new javax.swing.ImageIcon("C:\\Users\\Rodrigo\\Documents\\NetBeansProjects\\rojasMarket\\src\\main\\resources\\assets\\rojas_market.png")); // NOI18N

        panelMenu.setOpaque(false);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        scroll.setViewportView(panelMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(scroll))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private externals.ImageAvatar img;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
