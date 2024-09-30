package persistencia;

import Modelos.Admin;
import Modelos.Categoria;
import Modelos.Cliente;
import Modelos.Descuento;
import Modelos.DetallePedidos;
import Modelos.Pago;
import Modelos.Pedido;
import Modelos.Producto;
import Modelos.Promocion;
import Modelos.Rol;
import Modelos.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controladoraPersistencia {

    RolJpaController rol = new RolJpaController();
    AdminJpaController admin = new AdminJpaController();
    CategoriaJpaController categoria = new CategoriaJpaController();
    ClienteJpaController cliente = new ClienteJpaController();
    DescuentoJpaController descuento = new DescuentoJpaController();
    DetallePedidosJpaController detallePedidos = new DetallePedidosJpaController();
    PagoJpaController pago = new PagoJpaController();
    PedidoJpaController pedido = new PedidoJpaController();
    ProductoJpaController  producto = new ProductoJpaController();
    PromocionJpaController promocion = new PromocionJpaController();
    UsuarioJpaController usuario = new UsuarioJpaController();
    
    /*Visualización de las tablas*/
    public List<Categoria> getCategorias(){
        return this.categoria.findCategoriaEntities();
    }
    public List<Rol> getRoles(){
        return rol.findRolEntities();
    }
    public List<Admin> getAdmins(){
        return admin.findAdminEntities();
    }    
    public List<Cliente> getClientes(){
        return cliente.findClienteEntities();
    }
    public List<Descuento> getDescuentos(){
        return descuento.findDescuentoEntities();
    }
    public List<DetallePedidos> getDetallesPedidos(){
        return detallePedidos.findDetallePedidosEntities();
    }
    public List<Pago> getPagos(){
        return pago.findPagoEntities();
    }
    public List<Pedido> getPedidos(){
        return pedido.findPedidoEntities();
    }
    public List<Producto> getProductos(){
        return producto.findProductoEntities();
    }
    public List<Promocion> getPromociones(){
        return promocion.findPromocionEntities();
    }
    public List<Usuario> getUsuarios(){
        return usuario.findUsuarioEntities();
    }
    /*Borrar filas de las tablas*/
    public void borrarUsuario(int id){
        try {
            usuario.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarRol(int id){
        try {
            rol.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarPromocion(int id){
        try {
            promocion.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarProducto(int id){
        try {
            producto.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarPedido(int id){
        try {
            pedido.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarPago(int id){
        try {
            pago.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarDetallePedido(int id){
        try {
            detallePedidos.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarDescuento(int id){
        try {
            descuento.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarCliente(int id){
        try {
            cliente.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarCategoria(int id){
        try {
            categoria.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void borrarAdmin(int id){
        try {
            admin.destroy(id);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    /*Crear filas*/
    public void crearAdmin(Admin admin){
        this.admin.create(admin);
    }
    public void crearCategoria(Categoria categoria){
        this.categoria.create(categoria);
    }
    public void crearCliente(Cliente cliente){
        this.cliente.create(cliente);
    }
    public void crearDescuento(Descuento descuento){
        this.descuento.create(descuento);
    }
    public void crearDetallePedidos(DetallePedidos detallePedidos){
        this.detallePedidos.create(detallePedidos);
    }
    public void crearPago(Pago pago){
        this.pago.create(pago);
    }
    public void crearPedido(Pedido pedido){
        this.pedido.create(pedido);
    }
    public void crearProducto(Producto producto){
        this.producto.create(producto);
    }
    public void crearPromocion(Promocion promocion){
        this.promocion.create(promocion);
    }
    public void crearRol(Rol rol){
        this.rol.create(rol);
    }
    /*public void crearUsuario(Usuario usuario){
        this.usuario.create(usuario);
    }*/
    public Usuario addUsuario(Usuario usuario){
        return this.usuario.addUsuario(usuario);
    }
    /*Traer usuario individual, para desplegarlo en la parte de editar*/
    public Usuario traerUsuario(int id){
        return this.usuario.findUsuario(id);
    }
    public Rol traerRol(int id){
        return this.rol.findRol(id);
    }
    public Promocion traerPromocion(int id){
        return this.promocion.findPromocion(id);
    }
    public Producto traerProducto(int id){
        return this.producto.findProducto(id);
    }
    public Pedido traerPedido(int id){
        return this.pedido.findPedido(id);
    }
    public Pago traerPago(int id){
        return this.pago.findPago(id);
    }
    public DetallePedidos traerDetallePedidos(int id){
        return this.detallePedidos.findDetallePedidos(id);
    }
    public Descuento traerDescuento(int id){
        return this.descuento.findDescuento(id);
    }
    public Cliente traerCliente(int id){
        return this.cliente.findCliente(id);
    }
    public Categoria traerCategoria(int id){
        return this.categoria.findCategoria(id);
    }
    public Admin traerAdmin(int id){
        return this.admin.findAdmin(id);
    }
    /*Editar filas*/
    public void editarAdmin(Admin admin){
        try {
           this.admin.edit(admin);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void editarCategoria(Categoria categoria){
        try {
           this.categoria.edit(categoria);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void editarCliente(Cliente cliente){
        try {
           this.cliente.edit(cliente);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void editarDescuento(Descuento descuento){
        try {
           this.descuento.edit(descuento);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void editarDetallePedidos(DetallePedidos detallePedidos){
        try {
           this.detallePedidos.edit(detallePedidos);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void editarPago(Pago pago){
        try {
           this.pago.edit(pago);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void editarPedido(Admin admin){
        try {
           this.admin.edit(admin);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void editarProducto(Producto producto){
        try {
           this.producto.edit(producto);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void editarPromocion(Promocion promocion){
        try {
           this.promocion.edit(promocion);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void editarRol(Rol rol){
        try {
           this.rol.edit(rol);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public Rol traerRolPorNombre(String nombre){
        
        return this.rol.traerRolPorNombre(nombre);
        
    }
    public void editarUsuario(Usuario usuario){
        try {
           this.usuario.edit(usuario);
        } 
        catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
            
        }
    }
    
         public Usuario traerUsuarioNombre(String nombre){
        return this.usuario.buscarUsuarioPorNombre(nombre);
    }
         
    public boolean autenticarUsuario(String usuario, String password){
        return this.usuario.autenticarUsuario(usuario, password);
    }       
}
