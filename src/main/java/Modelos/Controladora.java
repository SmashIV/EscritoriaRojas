
package Modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import persistencia.controladoraPersistencia;

public class Controladora {

    controladoraPersistencia control=new controladoraPersistencia();
    
    /*Controladora de la tabla Categoria*/
    
    public void crearCategoria(String nombre, String descripcion){
        
        Date fecha;
        
        Categoria categoria = new Categoria();
        
        categoria.setNombre(nombre);
        categoria.setDescripcion(descripcion);
        
        LocalDate ld=LocalDate.now();
        
        fecha = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
        categoria.setFechaCreacion(fecha);
        categoria.setFechaModificacion(fecha);
        
        control.crearCategoria(categoria);
    }
    
    public List<Categoria> getCategorias(){
        return control.getCategorias();
    }
    
    public void editarCategoria(Categoria categoria){
         control.editarCategoria(categoria);
    }
    public Categoria traerCategoria(int id){
        return control.traerCategoria(id);
    }
    public void eliminarCategoria(int id){
        control.borrarCategoria(id);
    }
    
    /*Controladora de la tabla Rol*/
    
    public List<Rol> getRoles(){
        return control.getRoles();   
    }
    public void crearRol(String nombre, String descripcion){
        Rol rol = new Rol();
        rol.setNombre(nombre);
        rol.setDescripcion(descripcion);
        control.crearRol(rol);
    }
    public void editarRol(Rol rol){
        control.editarRol(rol);
    }
    public Rol traerRol(int id){
        return control.traerRol(id);
    }
    public void eliminarRol(int id){
        control.borrarRol(id);
    }
    
    public Rol traerRolPorNombre(String nombre){
        return control.traerRolPorNombre(nombre);    
    }
    
    /*Controladora de la tabla Pago*/
    public List<Pago> getPagos(){
        return control.getPagos();   
    }
    public void crearPagos(String metodo, String descripcion, String estado){
        Pago pago = new Pago();
        pago.setDescripcion(descripcion);
        pago.setEstado(estado);
        pago.setMetodoPago(metodo);
        control.crearPago(pago);
    }
    
    public void editarPago(Pago pago){
        control.editarPago(pago);
    }
    public Pago traerPago(int id){
        return control.traerPago(id);
    }
    public void eliminarPago(int id){
        control.borrarPago(id);
    }
    
    /*Controladora de la tabla Descuento*/
    
    public List<Descuento> getDescuentos(){
        return control.getDescuentos();
    }
    public void crearDescuentos(String nombre, Double porDescuento, Date fechaInicio, Date fechaFin){
        Descuento desc = new Descuento();
        desc.setNombreDescuento(nombre);
        desc.setPorcentajeDescuento(porDescuento);
        
        java.sql.Date sqlInicio = new java.sql.Date(fechaInicio.getTime());
        java.sql.Date sqlFin = new java.sql.Date(fechaFin.getTime());

        desc.setFechaInicio(sqlInicio);
        desc.setFechaFin(sqlFin);
        
        control.crearDescuento(desc);
                
    }
    
    public void editarDescuento(Descuento descuento){
        control.editarDescuento(descuento);
    }
    public Descuento traerDescuento(int id){
        return control.traerDescuento(id);        
    }
    public void eliminarDescuento(int id){
        control.borrarDescuento(id);
    }
    
    /*Tabla Cliente*/
    
    public List<Cliente> getClientes(){
        return control.getClientes();
    }
    
    public void crearCliente(Cliente cliente){
        control.crearCliente(cliente);
    }
    public Cliente traerCliente(int id){
            return control.traerCliente(id);
    }
    public void editarCliente(Cliente cliente){
        control.editarCliente(cliente);
    }
    public void eliminarCliente(int id){
        control.borrarCliente(id);
    }
    
    /*Tabla Admin*/
    public List<Admin> getAdmins(){
        return control.getAdmins();
    }
    public void crearAdmin(Admin admin){
        control.crearAdmin(admin);
    }
    public Admin traerAdmin(int id){
        return control.traerAdmin(id);
    }
    public void editarAdmin(Admin admin){
        control.editarAdmin(admin);
    }
    public void eliminarAdmin(int id){
        control.borrarAdmin(id);
    }
    
    /*Usuario*/
    public void crearUsuario(Usuario usuario) {

        control.addUsuario(usuario);
    }
    public Usuario traerUsuarioNombre(String usuario){
        return control.traerUsuarioNombre(usuario);
    }
    public Usuario traerUsuario(int id){
        return control.traerUsuario(id);
    }
    
    public void editarUsuario(Usuario usuario){
        control.editarUsuario(usuario);
    }
    public void eliminarUsuario(int id){
        control.borrarUsuario(id);
    }
    public boolean autenticarUsuario(String usuario, String password){
        return control.autenticarUsuario(usuario, password);
    }
    
}
