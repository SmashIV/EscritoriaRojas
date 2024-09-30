package componentes.agregar;

import Modelos.Admin;
import Modelos.Cliente;
import Modelos.Controladora;
import Modelos.Rol;
import Modelos.Usuario;
import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import raven.modal.component.ModalBorderAction;
import raven.modal.component.SimpleModalBorder;

public class agregarAdmin extends JPanel{
    
    private Controladora controladora;
    private int idAdmin;
    
    private JTextField txtEmail;
    private JTextField txtPass;
    private JTextField txtUsuario;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    public agregarAdmin(Controladora controladora, int idAdmin) {
        this.controladora = controladora;
        this.idAdmin = idAdmin;
        init();
    }
    @SuppressWarnings("unchecked")
    private void init() {
        Admin admin = controladora.traerAdmin(idAdmin);
        setLayout(new MigLayout("wrap 2,fillx,insets n 35 n 35", "[fill,200]"));
        JLabel lbAgregar = new JLabel("Panel de Agregar");
        lbAgregar.putClientProperty(FlatClientProperties.STYLE, "font:bold +2;");
        add(lbAgregar, "gapy 10 10,span 2");

        add(new JLabel("Email"), "gapy 5,span 2");
        txtEmail = new JTextField();
        add(txtEmail, "Span 2");

        add(new JLabel("Contraseña"));
        add(new JLabel("Usuario"));
        txtPass = new JTextField();
        txtUsuario = new JTextField();
        txtPass.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password123");
        txtEmail.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "example@mail.com");
        txtUsuario.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rodrigo");
        
        txtEmail.setText((admin == null) ? "" : admin.getUsuario().getCorreoElectronico());
        txtPass.setText((admin == null) ? "" : admin.getUsuario().getPassword());
        txtUsuario.setText((admin == null) ? "" : admin.getUsuario().getNombreUsuario());
        
        add(txtPass);
        add(txtUsuario);

        JLabel lbRequestDetail = new JLabel("Información Personal");
        lbRequestDetail.putClientProperty(FlatClientProperties.STYLE, "font:bold +2;");
        add(lbRequestDetail, "gapy 10 10,span 2");

        add(new JLabel("Nombres"));
        add(new JLabel("Apellidos"));
        txtNombres = new JTextField();
        txtApellidos = new JTextField();
        txtNombres.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rodrigo Jesus");
        txtApellidos.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Huatangari Navarrete");
        txtNombres.setText((admin == null) ? "" : admin.getNombres());
        txtApellidos.setText((admin == null) ? "" : admin.getApellidos());
        add(txtNombres);
        add(txtApellidos);

        add(new JLabel("Ingresa el area:"), "gapy 5,span 2");
        
        JComboBox comboArea = new JComboBox();
        comboArea.addItem("Mantenimiento");
        comboArea.addItem("Desarrollo");
        comboArea.addItem("Atencion");
        
        if (admin == null) {
            comboArea.setSelectedIndex(0);
        }else{
            comboArea.setSelectedItem(admin.getArea());
        }
        
        add(comboArea, "Span 2");

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
        
            String usuario = txtUsuario.getText();
            String email = txtEmail.getText();
            String password = txtPass.getText();
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            String area = comboArea.getSelectedItem().toString();
            
            if (idAdmin == 0) {
            
            Rol rol = controladora.traerRolPorNombre("Admin");
            
            Usuario miUsuario = new Usuario();
            
            miUsuario.setNombreUsuario(usuario);
            miUsuario.setCorreoElectronico(email);
            miUsuario.setPassword(password);
            miUsuario.setRol(rol);
            
            controladora.crearUsuario(miUsuario);
            
            Admin miAdmin = new Admin();
            
            miAdmin.setNombres(nombres);
            miAdmin.setApellidos(apellidos);
            miAdmin.setArea(area);
            miAdmin.setUsuario(miUsuario);
            
            controladora.crearAdmin(miAdmin);
            
        }else{
            Usuario editUsuario = controladora.traerUsuario(admin.getUsuario().getIdUsuario());
            editUsuario.setNombreUsuario(usuario);
            editUsuario.setCorreoElectronico(email);
            editUsuario.setPassword(password);
            
            controladora.editarUsuario(editUsuario);
            
            Admin editAdmin = controladora.traerAdmin(idAdmin);
            editAdmin.setNombres(nombres);
            editAdmin.setApellidos(apellidos);
            editAdmin.setArea(area);
        }
            
            ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.OK_OPTION);
        });

        add(cmdCancel, "grow 0");
        add(cmdPayment, "grow 0, al trailing");
    }
    
}
