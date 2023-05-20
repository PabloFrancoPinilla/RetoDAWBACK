package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.PedidosService;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
@RestController
@RequestMapping("API")
public class Pedidoscontroller {
    @Autowired
    private PedidosService impl;
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/pedidos/consultar")
    public List<Pedidos> consultarPedidosQuery() {
        return impl.ConsultarPedidos();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/pedidos/buscar")
    public List<Pedidos> buscarPedidosQuery(@RequestParam(value = "id") Set<Integer> id) {
        return impl.BuscarPedidos(id);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/pedidos/crear")
    public void crearPedidosQuery(@RequestBody Pedidos Pedidos){
        impl.CrearPedidos(Pedidos.getId_producto(),Pedidos.getId_ubiacion(),Pedidos.getId_cliente(),Pedidos.getId_empleado(),Pedidos.getFecha_hora(),Pedidos.getTipo_pedido(),Pedidos.getMetodo_pago(),Pedidos.getEstado_pedido());

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/pedidos/modificar")
    public void modificarPedidosEstadoQuery(@RequestBody Pedidos Pedidos) {
        impl.ModificarPedidosEstadoValor(Pedidos.getId_pedido(), Pedidos.getEstado_pedido());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/pedidos/eliminar")
    public void eliminarPedidosQuery(@RequestBody Pedidos Pedidos) {
        impl.EliminarPedidos(Pedidos.getId_pedido());
    }

}
