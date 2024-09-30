
package Modelos;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class DetallePedidos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetallePedidos;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private Date fechaPago;

    private String identificadorTransaccion;

    public DetallePedidos() {
    }

    public DetallePedidos(int idDetallePedidos, Producto producto, Pedido pedido, int cantidad, Date fechaPago, String identificadorTransaccion) {
        this.idDetallePedidos = idDetallePedidos;
        this.producto = producto;
        this.pedido = pedido;
        this.cantidad = cantidad;
        this.fechaPago = fechaPago;
        this.identificadorTransaccion = identificadorTransaccion;
    }

    
    
    // Getters y Setters
    public int getIdDetallePedidos() {
        return idDetallePedidos;
    }

    public void setIdDetallePedidos(int idDetallePedidos) {
        this.idDetallePedidos = idDetallePedidos;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getIdentificadorTransaccion() {
        return identificadorTransaccion;
    }

    public void setIdentificadorTransaccion(String identificadorTransaccion) {
        this.identificadorTransaccion = identificadorTransaccion;
    }
}
