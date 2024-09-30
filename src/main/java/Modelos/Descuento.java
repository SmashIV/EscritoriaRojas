package Modelos;

import com.raven.table.model.TableRowData;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;  
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Descuento extends TableRowData implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDescuento;
    
    @Column(nullable = false, length = 100)
    private String nombreDescuento;
    
    @Column(nullable = false, precision = 5, scale = 2)
    private double porcentajeDescuento;
    
    @Column(nullable = false)
    private Date fechaInicio;
    
    @Column(nullable = false)
    private Date fechaFin;

    public Descuento() {
    }

    public Descuento(int idDescuento, String nombreDescuento, double porcentajeDescuento) {
        this.idDescuento = idDescuento;
        this.nombreDescuento = nombreDescuento;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    public Descuento(int idDescuento, String nombreDescuento, double porcentajeDescuento, Date fechaInicio, Date fechaFin) {
        this.idDescuento = idDescuento;
        this.nombreDescuento = nombreDescuento;
        this.porcentajeDescuento = porcentajeDescuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    
    
    // Getters y Setters
    public int getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public String getNombreDescuento() {
        return nombreDescuento;
    }

    public void setNombreDescuento(String nombreDescuento) {
        this.nombreDescuento = nombreDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
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

    @Override
    public Object[] toTableRow() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String inicioFormato = formato.format(fechaInicio);
        String finFormato = formato.format(fechaFin);
        return new Object[]{idDescuento, nombreDescuento, porcentajeDescuento, inicioFormato, finFormato};
    }
}
