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
    public List<Pedidos> BuscarPedidosUser(Set<Integer> id) {
        List<Pedidos> listaPedidos = PedidosRepo.getPedidosPorUser(id);
        return listaPedidos;
    }
    
    public void CrearPedidos(Integer id_ubicacion,Integer id_cliente,Integer id_empleado, String metodo_pago) {
       PedidosRepo.crearPedidosQuery(id_ubicacion,id_cliente,id_empleado, metodo_pago );
    }

    public void CrearPedidosUser(Integer id_cliente, String metodo_pago) {
        PedidosRepo.crearPedidosUserQuery(id_cliente, metodo_pago );
     }
 

    public void ModificarPedidosEstadoValor(Integer id, String estado_pedido) {
        PedidosRepo.modificarPedidosEstadoPorId(id, estado_pedido);
    }

    public void EliminarPedidos(Integer id) {
        PedidosRepo.eliminarPedidosPorId(id);
    }
}
