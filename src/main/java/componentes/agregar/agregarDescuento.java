package componentes.agregar;

import Modelos.Admin;
import Modelos.Controladora;
import Modelos.Descuento;
import Modelos.Pago;
import Modelos.Rol;
import Modelos.Usuario;
import com.formdev.flatlaf.FlatClientProperties;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import raven.datetime.component.date.DatePicker;
import raven.modal.component.ModalBorderAction;
import raven.modal.component.SimpleModalBorder;

public class agregarDescuento extends JPanel{
    
    private Controladora controladora;
    private int idDescuento;
    
    private JTextField txtNombre;
    private JTextField txtPorcentaje;
    
    public agregarDescuento(Controladora controladora, int idDescuento) {
        this.controladora = controladora;
        this.idDescuento = idDescuento;
        init();
    }
    @SuppressWarnings("unchecked")
    private void init() {
        Descuento descuento = controladora.traerDescuento(idDescuento);
        
        setLayout(new MigLayout("wrap 2,fillx,insets n 35 n 35", "[fill,200]"));
        JLabel lbAgregar = new JLabel("Panel de Agregar");
        lbAgregar.putClientProperty(FlatClientProperties.STYLE, "font:bold +2;");
        add(lbAgregar, "gapy 10 10,span 2");

        JLabel lbRequestDetail = new JLabel("Informacion de Descuento");
        lbRequestDetail.putClientProperty(FlatClientProperties.STYLE, "font:bold +2;");
       
        add(new JLabel("Ingresa el nombre del descuento"), "gapy 5, span 2");
        txtNombre = new JTextField();
        txtNombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Descuento en productos nuevos!");
        
        txtNombre.setText((descuento == null) ? "" : descuento.getNombreDescuento());
        add(txtNombre, "Span 2");
        add(new JLabel("Ingresa la el porcentaje:"), "gapy 5,span 2");
        
        txtPorcentaje = new JTextField();
 
        txtPorcentaje.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "0.0");
        JLabel porcentaje = new JLabel("%");
        porcentaje.putClientProperty(FlatClientProperties.STYLE, "" + "border:0,8,0,0;");
        txtPorcentaje.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_COMPONENT, porcentaje);
        
        txtPorcentaje.setText((descuento == null) ? "" : String.valueOf(descuento.getPorcentajeDescuento()));
        
        add(txtPorcentaje, "Span 2, growx");

        JLabel fechaInicio = new JLabel("Fecha Inicio");
        JLabel fechaFin = new JLabel("Fecha fin");
        
        JFormattedTextField txtInicio = new JFormattedTextField();
        DatePicker pickerInicio = new DatePicker();
        pickerInicio.setEditor(txtInicio);
        JFormattedTextField txtFin = new JFormattedTextField();
        DatePicker pickerFin = new DatePicker();
        pickerFin.setEditor(txtFin);
        
        if (descuento != null) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String formatoFechaInicio = formato.format(descuento.getFechaInicio());
            String formatoFechaFin = formato.format(descuento.getFechaFin());

            txtInicio.setText(formatoFechaInicio);
            txtFin.setText(formatoFechaFin);
        }
        
        add(txtInicio);
        add(txtFin);
        
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
            Double porcentajeValor = Double.valueOf(txtPorcentaje.getText());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            
        if (idDescuento == 0) {
            try {
                Date fInicio = formatoFecha.parse(txtInicio.getText());
                Date fFin = formatoFecha.parse(txtFin.getText());
 
                controladora.crearDescuentos(nombre, porcentajeValor, fInicio, fFin);
                
                
                
            } catch (ParseException ex) {
                Logger.getLogger(agregarDescuento.class.getName()).log(Level.SEVERE, null, ex);
            }          
        }else{
           
            try {
                
                Descuento editDescuento = controladora.traerDescuento(idDescuento);
                Date fInicio = formatoFecha.parse(txtInicio.getText());
                Date fFin = formatoFecha.parse(txtFin.getText());
                editDescuento.setNombreDescuento(nombre);
                editDescuento.setPorcentajeDescuento(porcentajeValor);
                editDescuento.setFechaInicio(fInicio);
                editDescuento.setFechaFin(fFin);
                
                controladora.editarDescuento(editDescuento);
                
            } catch (ParseException e) {
                Logger.getLogger(agregarDescuento.class.getName()).log(Level.SEVERE, null, e);
            }
            
            
        }
            
            ModalBorderAction.getModalBorderAction(this).doAction(SimpleModalBorder.OK_OPTION);
        });

        add(cmdCancel, "grow 0");
        add(cmdPayment, "grow 0, al trailing");
    }
    
}
