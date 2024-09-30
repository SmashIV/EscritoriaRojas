package Modelos;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_pago", nullable = false)
    private Pago pago;

    @Column(nullable = false)
    private Date fechaPedido;

    @Column(nullable = false, precision = 10, scale = 2)
    private double subtotal;

    @Column(nullable = false, precision = 10, scale = 2)
    private double pedidoTotal;

    @Column(nullable = false, length = 100)
    private String distrito;

    @Column(nullable = false, length = 50)
    private String estadoPedido;

    public Pedido() {
    }

    public Pedido(int idPedido, Cliente cliente, Pago pago, Date fechaPedido, double subtotal, double pedidoTotal, String distrito, String estadoPedido) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.pago = pago;
        this.fechaPedido = fechaPedido;
        this.subtotal = subtotal;
        this.pedidoTotal = pedidoTotal;
        this.distrito = distrito;
        this.estadoPedido = estadoPedido;
    }

    
    
    // Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPedidoTotal() {
        return pedidoTotal;
    }

    public void setPedidoTotal(double pedidoTotal) {
        this.pedidoTotal = pedidoTotal;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}

