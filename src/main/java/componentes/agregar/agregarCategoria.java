package componentes.agregar;

import Modelos.Admin;
import Modelos.Categoria;
import Modelos.Controladora;
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

public class agregarCategoria extends JPanel{
    
    private Controladora controladora;
    private int idCategoria;
    
    private JTextField txtNombre;
    private JTextArea txtDescripcion;

    public agregarCategoria(Controladora controladora, int idCategoria) {
        this.controladora = controladora;
        this.idCategoria = idCategoria;
        init();
    }
    @SuppressWarnings("unchecked")
    private void init() {
        Categoria categoria = controladora.traerCategoria(idCategoria);
        setLayout(new MigLayout("wrap 2,fillx,insets n 35 n 35", "[fill,200]"));
        JLabel lbAgregar = new JLabel("Panel de Agregar");
        lbAgregar.putClientProperty(FlatClientProperties.STYLE, "font:bold +2;");
        add(lbAgregar, "gapy 10 10,span 2");

        JLabel lbRequestDetail = new JLabel("Informacion de Categorias");
        lbRequestDetail.putClientProperty(FlatClientProperties.STYLE, "font:bold +2;");
       
        add(new JLabel("Ingresa el nombre"), "gapy 5, span 2");
        txtNombre = new JTextField();
        txtNombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Bebidas/Frutas/Aseo");
        
        txtNombre.setText((categoria == null) ? "" : categoria.getNombre());
        add(txtNombre, "Span 2");
        add(new JLabel("Ingresa la descripcion:"), "gapy 5,span 2");
        
        txtDescripcion = new JTextArea();
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setRows(3);
        
        txtDescripcion.setText((categoria == null) ? "" : categoria.getDescripcion());
        add(txtDescripcion, "Span 2, growx");

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
        
            String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            
        if (idCategoria == 0) {
            
            controladora.crearCategoria(nombre, descripcion);
            
        }else{
           Categoria editCategoria = controladora.traerCategoria(idCategoria);
           
           editCategoria.setNombre(nombre);
           editCategoria.setDescripcion(descripcion);
           
           controladora.editarCategoria(editCategoria);
        }
            
            ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.OK_OPTION);
        });

        add(cmdCancel, "grow 0");
        add(cmdPayment, "grow 0, al trailing");
    }
    
}
