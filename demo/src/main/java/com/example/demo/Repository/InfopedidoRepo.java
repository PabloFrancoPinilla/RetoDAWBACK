package com.example.demo.Repository;
import com.example.demo.Entity.Infopedido;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface InfopedidoRepo extends CrudRepository<Infopedido, Integer> {
     //consultar
     String getInfopedidoQuery = "SELECT * FROM infopedido ORDER BY id_pedido ASC";

     @Query(nativeQuery = true, value = getInfopedidoQuery)
     List<Infopedido> getInfopedido();
 
     //buscar
     String getBuscarInfopedidoQuery = "SELECT * FROM infopedido WHERE id_infopedido = :id";
 
     @Query(nativeQuery = true, value = getBuscarInfopedidoQuery)
     List<Infopedido> getInfopedidoPorId(Set<Integer> id);
 
     //crear
     String crearInfopedidoQuery = "INSERT INTO infopedido  (id_producto,id_pedido) VALUES (:id_producto,:id_pedido)";
 
     @Modifying
     @Query(nativeQuery = true, value = crearInfopedidoQuery)
     void crearInfopedidoQuery(Integer id_producto,Integer id_pedido);
 
     //modificar
     String modificarInfopedidoQuery = "UPDATE infopedido  SET id_producto = :id_producto WHERE infopedido.id_infopedido = :id_infopedido";
 
     @Modifying
     @Query(nativeQuery = true, value = modificarInfopedidoQuery)
     void modificarInfopedidoPorId(Integer id_infopedido, Integer id_producto);
 
     //borrar
     String borrarInfopedidoQuery = "DELETE FROM infopedido  WHERE id_infopedido = :id_infopedido";
 
     @Modifying
     @Query(nativeQuery = true, value = borrarInfopedidoQuery)
     void eliminarInfopedidoPorId(Integer id_infopedido);
}

