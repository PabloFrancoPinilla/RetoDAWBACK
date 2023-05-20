package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Cliente;



import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface ClienteRepo extends CrudRepository <Cliente, Integer> {
    String getClienteQuery = "SELECT * FROM cliente ORDER BY nombre_cliente ASC";

    @Query(nativeQuery = true, value = getClienteQuery)
    List<Cliente> getClientes();

    //buscar
    String getBuscarClienteQuery = "SELECT * FROM cliente WHERE id_cliente = :id";

    @Query(nativeQuery = true, value = getBuscarClienteQuery)
    List<Cliente> getClientePorId(Set<Integer> id);

    String getBuscarClienteLoginQuery = "SELECT * FROM cliente WHERE correo_electronico= :correo";

    @Query(nativeQuery = true, value = getBuscarClienteLoginQuery)
    List<Cliente> getClientePorCorreo(Set<String> correo);

    //crear
    String crearClienteQuery = "INSERT INTO cliente  (nombre_cliente,apellido_cliente,correo_electronico,telefono) VALUES (:nombre,:apellido,:correo,:telefono)";

    @Modifying
    @Query(nativeQuery = true, value = crearClienteQuery)
    void crearClienteQuery(String nombre,String apellido, String correo, String telefono);

    String crearClienteLoginQuery = "INSERT INTO cliente  (correo_electronico,contraseña) VALUES (:correo,:contraseña)";

    @Modifying
    @Query(nativeQuery = true, value = crearClienteLoginQuery)
    void crearClienteLoginQuery( String correo, String contraseña);

    //modificar nombre
    String modificarClienteNombreQuery = "UPDATE cliente  SET nombre_cliente = :nombre WHERE cliente.id_cliente = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarClienteNombreQuery)
    void modificarClienteNombrePorId(Integer id, String nombre);

     //modificar apellido
     String modificarClienteApellidoQuery = "UPDATE cliente  SET apellido_cliente = :apellido WHERE cliente.id_cliente = :id";

     @Modifying
     @Query(nativeQuery = true, value = modificarClienteApellidoQuery)
     void modificarClienteApellidoPorId(Integer id, String apellido);

    //borrar
    String borrarClienteQuery = "DELETE FROM cliente  WHERE id_cliente = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarClienteQuery)
    void eliminarClientePorId(Integer id);
}
