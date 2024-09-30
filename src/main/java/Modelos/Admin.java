package Modelos;
import com.raven.table.model.TableRowData;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Admin extends TableRowData implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(length = 100)
    private String area;

    public Admin() {
    }

    public Admin(Usuario usuario, String nombres, String apellidos, String area) {
        this();usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.area = area;
    }
    
    public Admin(int idAdmin, Usuario usuario, String nombres, String apellidos, String area) {
        this.idAdmin = idAdmin;
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.area = area;
    }
    
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public Object[] toTableRow() {
       return new Object []{idAdmin, usuario.getNombreUsuario(), usuario.getPassword(), usuario.getCorreoElectronico(), nombres, apellidos, area};
    }
    
}

