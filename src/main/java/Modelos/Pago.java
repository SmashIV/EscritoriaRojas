package Modelos;

import com.raven.table.model.TableRowData;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.io.Serializable;

@Entity
public class Pago extends TableRowData implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    
    @Column(nullable = false, length = 100)
    private String metodoPago;
    
    private String descripcion;
    
    @Column(nullable = false, length = 50)
    private String estado;

    public Pago() {
    }

    public Pago(int idPago, String metodoPago, String descripcion, String estado) {
        this.idPago = idPago;
        this.metodoPago = metodoPago;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estadoPago) {
        this.estado = estadoPago;
    }

    @Override
    public Object[] toTableRow() {
        return new Object[]{idPago, metodoPago, descripcion, estado};
    }
}