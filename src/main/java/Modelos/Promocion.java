
package Modelos;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Promocion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPromocion;

    @ManyToOne
    @JoinColumn(name = "id_descuento", nullable = false)
    private Descuento descuento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    private String descripcion;

    @Column(nullable = false)
    private Date fechaInicio;

    @Column(nullable = false)
    private Date fechaFin;

    public Promocion() {
    }

    public Promocion(int idPromocion, Descuento descuento, Producto producto, String descripcion, Date fechaInicio, Date fechaFin) {
        this.idPromocion = idPromocion;
        this.descuento = descuento;
        this.producto = producto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    // Getters y Setters
    public int getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}

