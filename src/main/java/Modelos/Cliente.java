/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import com.raven.table.model.TableRowData;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Cliente extends TableRowData  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(nullable = false, length = 255)
    private String direccion;
    @Column(nullable = false, length = 9)
    private String numeroCelular;

    public Cliente() {
    }

    public Cliente(int idCliente, Usuario usuario, String nombres, String apellidos, String direccion, String numeroCelular) {
        this.idCliente = idCliente;
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numeroCelular = numeroCelular;
    }

    
    
    // Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public Object[] toTableRow() {
        return new Object[]{idCliente, usuario.getNombreUsuario(), usuario.getCorreoElectronico(), usuario.getPassword() , nombres, apellidos, direccion, numeroCelular};
    }
}
