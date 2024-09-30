/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import com.raven.table.model.TableRowData;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Usuario extends TableRowData implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    
    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;
   
    @Column(nullable = false, length = 100)
    private String nombreUsuario;
    
    @Column(nullable = false, length = 100)
    private String correoElectronico;
    
    @Column(nullable = false, length = 100)
    private String password;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String correoElectronico, String password) {
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }

    public Usuario(int idUsuario, Rol rol, String nombreUsuario, String correoElectronico, String password) {
        this.idUsuario = idUsuario;
        this.rol = rol;
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Object[] toTableRow() {
        return new Object[]{nombreUsuario,correoElectronico, password};
    }
}
