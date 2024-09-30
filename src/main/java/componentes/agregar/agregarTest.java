package componentes.agregar;

import Modelos.Cliente;
import Modelos.Controladora;
import Modelos.Rol;
import Modelos.Usuario;
import com.formdev.flatlaf.FlatClientProperties;
import forms.clienteForm;
import net.miginfocom.swing.MigLayout;
import raven.modal.component.ModalBorderAction;
import raven.modal.component.SimpleModalBorder;

import javax.swing.*;

public class agregarTest extends JPanel {

    private Controladora controladora;
    private int idCliente;
    
    private JTextField txtEmail;
    private JTextField txtPass;
    private JTextField txtUsuario;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtDireccion;
    private JTextField txtNumCelular;
    public agregarTest(Controladora controladora, int idCliente) {
        this.controladora = controladora;
        this.idCliente = idCliente;
        init();
    }
    private void init() {
        Cliente cliente = controladora.traerCliente(idCliente);
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
        
        txtEmail.setText((cliente == null) ? "" : cliente.getUsuario().getCorreoElectronico());
        txtPass.setText((cliente == null) ? "" : cliente.getUsuario().getPassword());
        txtUsuario.setText((cliente == null) ? "" : cliente.getUsuario().getNombreUsuario());
        
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
        txtNombres.setText((cliente == null) ? "" : cliente.getNombres());
        txtApellidos.setText((cliente == null) ? "" : cliente.getApellidos());
        add(txtNombres);
        add(txtApellidos);

        add(new JLabel("Ingresa la dirección:"), "gapy 5,span 2");
        txtDireccion = new JTextField();
        txtDireccion.setText((cliente == null) ? "" : cliente.getDireccion());
        add(txtDireccion, "Span 2");

        add(new JLabel("Ingresa el número de celular"), "gapy 5,span 2");
        txtNumCelular = new JTextField();
        txtNumCelular.setText((cliente == null) ? "" : cliente.getNumeroCelular());
        txtDireccion.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Calle Ejemplo 123");
        txtNumCelular.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "123456789");
        add(txtNumCelular, "Span 2");

        JButton cmdCancel = new JButton("Cancel");
        JButton cmdPayment = new JButton("Request Payment") {
            @Override
            public boolean isDefaultButton() {
                return true;
            }
        };
        cmdCancel.addActionListener(actionEvent -> {
            ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.CANCEL_OPTION);
        });

        cmdPayment.addActionListener(actionEvent -> {
            cmdPayment.setEnabled(false);
            String usuario = txtUsuario.getText();
            String email = txtEmail.getText();
            String password = txtPass.getText();
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            String direccion = txtDireccion.getText();
            String numCelular = txtNumCelular.getText();

            try {
                if (idCliente == 0) {
                  

                    Rol rol = controladora.traerRolPorNombre("Cliente");

                    Usuario nuevoUser = new Usuario();
                    nuevoUser.setNombreUsuario(usuario);
                    nuevoUser.setCorreoElectronico(email);
                    nuevoUser.setPassword(password);
                    nuevoUser.setRol(rol);

                    controladora.crearUsuario(nuevoUser);

                    Cliente nuevoCliente = new Cliente();
                    nuevoCliente.setUsuario(nuevoUser);
                    nuevoCliente.setNombres(nombres);
                    nuevoCliente.setApellidos(apellidos);
                    nuevoCliente.setDireccion(direccion);
                    nuevoCliente.setNumeroCelular(numCelular);

                    controladora.crearCliente(nuevoCliente);

                }else{

                    Usuario user = controladora.traerUsuario(cliente.getUsuario().getIdUsuario());
                    
                    user.setNombreUsuario(usuario);
                    user.setCorreoElectronico(email);
                    user.setPassword(password);
                    
                    controladora.editarUsuario(user);
                    
                    Cliente editCliente = controladora.traerCliente(idCliente);
                    
                    editCliente.setNombres(nombres);
                    editCliente.setApellidos(apellidos);
                    editCliente.setDireccion(direccion);
                    editCliente.setNumeroCelular(numCelular);
                    
                    controladora.editarCliente(editCliente);
                }
                    ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.OK_OPTION);
                } finally {
                    cmdPayment.setEnabled(true);
                }
      
        });

        add(cmdCancel, "grow 0");
        add(cmdPayment, "grow 0, al trailing");
    }
}