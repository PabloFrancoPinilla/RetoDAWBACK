package com.example.demo.Repository;
import com.example.demo.Entity.Pedidos;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface PedidosRepo extends CrudRepository<Pedidos, Integer>{
     //consultar
     String getPedidosQuery = "SELECT * FROM pedidos ORDER BY id_cliente ASC";

     @Query(nativeQuery = true, value = getPedidosQuery)
     List<Pedidos> getPedidos();
 
     //buscar
     String getBuscarPedidosQuery = "SELECT * FROM pedidos WHERE id_pedidos = :id";
 
     @Query(nativeQuery = true, value = getBuscarPedidosQuery)
     List<Pedidos> getPedidosPorId(Set<Integer> id);

     String getBuscarPedidosUserQuery = "SELECT * FROM pedidos WHERE id_cliente = :id";
 
     @Query(nativeQuery = true, value = getBuscarPedidosUserQuery)
     List<Pedidos> getPedidosPorUser(Set<Integer> id);
 
     //crear
     String crearPedidosQuery = "INSERT INTO pedidos  (id_ubicacion,id_cliente,id_empleado,metodo_pago) VALUES (:id_ubicacion,:id_cliente,:id_empleado,:metodo_pago)";
 
     @Modifying
     @Query(nativeQuery = true, value = crearPedidosQuery)
     void crearPedidosQuery(Integer id_ubicacion,Integer id_cliente,Integer id_empleado, String metodo_pago);

     String crearPedidosUserQuery = "INSERT INTO pedidos  (id_cliente,metodo_pago) VALUES (:id_cliente,:metodo_pago)";
 
     @Modifying
     @Query(nativeQuery = true, value = crearPedidosUserQuery)
     void crearPedidosUserQuery(Integer id_cliente, String metodo_pago);
 
 
     //modificar
     String modificarPedidosEstadoQuery = "UPDATE pedidos  SET estado_pedido = :estado_pedido WHERE pedidos.id_pedido = :id_pedido";
 
     @Modifying
     @Query(nativeQuery = true, value = modificarPedidosEstadoQuery)
     void modificarPedidosEstadoPorId(Integer id_pedido, String estado_pedido);
 
     //borrar
     String borrarPedidosQuery = "DELETE FROM pedidos  WHERE id_pedidos = :id_pedidos";
 
     @Modifying
     @Query(nativeQuery = true, value = borrarPedidosQuery)
     void eliminarPedidosPorId(Integer id_pedidos);
}
