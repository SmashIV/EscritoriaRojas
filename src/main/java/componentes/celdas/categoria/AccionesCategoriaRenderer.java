
package componentes.celdas.categoria;


import Modelos.Controladora;
import componentes.agregar.agregarCategoria;
import componentes.agregar.agregarRol;
import forms.categoriasForm;
import forms.rolesForm;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import raven.modal.ModalDialog;
import raven.modal.component.SimpleModalBorder;

public class AccionesCategoriaRenderer extends AbstractCellEditor implements TableCellRenderer, TableCellEditor {

    private final JPanel panel;
    private JPanel panelPadre;
    private final JButton editButton;
    private final JButton deleteButton;
    private JTable table;
    Controladora controladora ;
    
    public AccionesCategoriaRenderer(JTable table, categoriasForm panelPadre) {
        controladora = new Controladora();
        this.panelPadre = panelPadre;
        this.table = table;
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 15));
        panel.setBorder(new EmptyBorder(0, 0, 0, 0));
        
        Dimension buttonSize = new Dimension(22, 22); 
        
        ImageIcon editIcon = new ImageIcon(getClass().getResource("/assets/edit.png"));
        ImageIcon deleteIcon = new ImageIcon(getClass().getResource("/assets/delete.png"));
        
        editButton = new JButton(editIcon);
        editButton.setPreferredSize(buttonSize);
        editButton.setContentAreaFilled(false);
        editButton.setBorderPainted(false);

        deleteButton = new JButton(deleteIcon);
        deleteButton.setPreferredSize(buttonSize);
        deleteButton.setContentAreaFilled(false); 
        deleteButton.setBorderPainted(false); 

        panel.add(editButton);
        panel.add(deleteButton);

        editButton.addActionListener(e -> {
            int row = table.getEditingRow();
            if (row >= 0 && row < table.getRowCount()) {
                int idCategoria = (int) table.getValueAt(row, 0);
                ModalDialog.showModal(panelPadre, new SimpleModalBorder(new agregarCategoria(controladora, idCategoria), "Editar Categorias", SimpleModalBorder.DEFAULT_OPTION, (controller, action) -> {
                    if (action == SimpleModalBorder.OK_OPTION) {
                        panelPadre.loadCategorias();
                    }
              }));
            }
        });
        
        deleteButton.addActionListener(e -> {
            int row = table.getEditingRow();
            if (row >= 0 && row < table.getRowCount()) {
                int idCategoria = (int) table.getValueAt(row, 0);
                stopCellEditing(); 
                controladora.eliminarCategoria(idCategoria);
                panelPadre.loadCategorias();
            }

        });
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return panel;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return panel;
    }

    @Override
    public Object getCellEditorValue() {
        return null; 
    }
}