/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventos;

import com.raven.table.model.TableRowData;

/**
 *
 * @author Rodrigo
 */
public class adminSupport extends TableRowData {
    
    private int id;
    private String nombreUsuario;
    private String password;
    private String correoElectronico;
    private String nombres;
    private String apellidos;
    private String area;

    public adminSupport(int id, String nombreUsuario, String password, String correoElectronico, String nombres, String apellidos, String area) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.correoElectronico = correoElectronico;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.area = area;
    }

    public adminSupport() {
    }

    public adminSupport(String nombreUsuario, String password, String correoElectronico, String nombres, String apellidos, String area) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.correoElectronico = correoElectronico;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public Object[] toTableRow() {
        return new Object[]{nombreUsuario, password, correoElectronico, nombres, apellidos, area};
    }
    
    
    
}
