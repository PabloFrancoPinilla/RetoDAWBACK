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
 
     //crear
     String crearPedidosQuery = "INSERT INTO pedidos  (id_producto,id_ubicacion,id_cliente,id_empleado,fecha_hora,tipo_pedido,metodo_pago, estado_pedido) VALUES (:id_producto,:id_ubicacion,:id_cliente,:id_empleado,:fecha_hora,:tipo_pedido,:metodo_pago,:estado_pedido)";
 
     @Modifying
     @Query(nativeQuery = true, value = crearPedidosQuery)
     void crearPedidosQuery(Integer id_producto,Integer id_ubicacion,Integer id_cliente,Integer id_empleado, String fecha_hora,String tipo_pedido,String metodo_pago,String estado_pedido);
 
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
