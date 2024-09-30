package componentes.agregar;

import Modelos.Admin;
import Modelos.Controladora;
import Modelos.Pago;
import Modelos.Rol;
import Modelos.Usuario;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import raven.modal.component.ModalBorderAction;
import raven.modal.component.SimpleModalBorder;

public class agregarPago extends JPanel{
    
    private Controladora controladora;
    private int idPago;
    
    private JTextField txtMetodo;
    private JTextArea txtDescripcion;
    
    public agregarPago(Controladora controladora, int idPago) {
        this.controladora = controladora;
        this.idPago = idPago;
        init();
    }
    @SuppressWarnings("unchecked")
    private void init() {
        Pago pago = controladora.traerPago(idPago);
        setLayout(new MigLayout("wrap 2,fillx,insets n 35 n 35", "[fill,200]"));
        JLabel lbAgregar = new JLabel("Panel de Agregar");
        lbAgregar.putClientProperty(FlatClientProperties.STYLE, "font:bold +2;");
        add(lbAgregar, "gapy 10 10,span 2");

        JLabel lbRequestDetail = new JLabel("Informacion de Pago");
        lbRequestDetail.putClientProperty(FlatClientProperties.STYLE, "font:bold +2;");
       
        add(new JLabel("Ingresa el metodo de pago"), "gapy 5, span 2");
        txtMetodo = new JTextField();
        txtMetodo.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Tarjeta de Credito");
        
        txtMetodo.setText((pago == null) ? "" : pago.getMetodoPago());
        add(txtMetodo, "Span 2");
        add(new JLabel("Ingresa la descripcion:"), "gapy 5,span 2");
        
        txtDescripcion = new JTextArea();
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setRows(3);
        
        txtDescripcion.setText((pago == null) ? "" : pago.getDescripcion());
        add(txtDescripcion, "Span 2, growx");

        add(new JLabel("Ingresa el estado del metodo"));
        JComboBox estadoPago = new JComboBox();
        estadoPago.addItem("Integrado");
        estadoPago.addItem("Pendiente");
        estadoPago.addItem("Stand By");
        
        if(pago == null){
            estadoPago.setSelectedIndex(0);
        }else{
            estadoPago.setSelectedItem(pago.getEstado());
        }
        
        add(estadoPago, "Span 2");
        
        
        JButton cmdCancel = new JButton("Cancelar");
        JButton cmdPayment = new JButton("Agregar") {
            @Override
            public boolean isDefaultButton() {
                return true;
            }
        };
        cmdCancel.addActionListener(actionEvent -> {
            ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.CANCEL_OPTION);
        });

        cmdPayment.addActionListener(actionEvent -> {
        
            String metodo = txtMetodo.getText();
            String descripcion = txtDescripcion.getText();
            String estado = estadoPago.getSelectedItem().toString();
            
        if (idPago == 0) {
            
            controladora.crearPagos(metodo, descripcion, estado);
            
        }else{
            Pago editPago = controladora.traerPago(idPago);
            
            editPago.setMetodoPago(metodo);
            editPago.setDescripcion(descripcion);
            editPago.setEstado(estado);
            
            controladora.editarPago(editPago);
            
        }
            
            ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.OK_OPTION);
        });

        add(cmdCancel, "grow 0");
        add(cmdPayment, "grow 0, al trailing");
    }
    
}
