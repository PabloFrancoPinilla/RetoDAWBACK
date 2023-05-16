package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PedidosService {
    @Autowired
    private PedidosRepo PedidosRepo;
     //-----------------------------------------Categoria-----------------------------------------\\
     public List<Pedidos> ConsultarPedidos() {
        List<Pedidos> listaPedidos = PedidosRepo.getPedidos();
        return listaPedidos;
    }

    public List<Pedidos> BuscarPedidos(Set<Integer> id) {
        List<Pedidos> listaPedidos = PedidosRepo.getPedidosPorId(id);
        return listaPedidos;
    }
    
    public void CrearPedidos(Integer id_producto,Integer id_ubicacion,Integer id_cliente, Integer id_empleado,String fecha_hora,String tipo_pedido,String metodo_pago,String estado_pedido) {
       PedidosRepo.crearPedidosQuery(id_producto,id_ubicacion,id_cliente, id_empleado,fecha_hora,tipo_pedido, metodo_pago, estado_pedido);
    }

    public void ModificarPedidosEstadoValor(Integer id, String estado_pedido) {
        PedidosRepo.modificarPedidosEstadoPorId(id, estado_pedido);
    }

    public void EliminarPedidos(Integer id) {
        PedidosRepo.eliminarPedidosPorId(id);
    }
}
