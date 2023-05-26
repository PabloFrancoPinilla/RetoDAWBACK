package com.example.demo.Controller;


import com.example.demo.Entity.*;
import com.example.demo.Service.Clienteservice;
import com.example.demo.Service.Infopedidoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class Infopedidocontroller {
    @Autowired
    private Infopedidoservice impl;
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/infopedido/consultar")
    public List<Infopedido> consultarInfopedidoQuery() {
        return impl.ConsultarInfopedido();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/infopedido/buscar")
    public List<Infopedido> buscarInfopedidoQuery(@RequestParam(value = "id") Set<Integer> id) {
        return impl.BuscarInfopedido(id);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/infopedido/crear")
    public void crearInfopedidoQuery(@RequestBody Infopedido Infopedido){
        impl.CrearInfopedido(Infopedido.getId_producto(),Infopedido.getId_pedido());

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/infopedido/modificar")
    public void modificarInfopedidoEstadoQuery(@RequestBody Infopedido Infopedido) {
        impl.ModificarInfopedidoValor(Infopedido.getId_infopedido(),Infopedido.getId_pedido());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/infopedido/eliminar")
    public void eliminarinfopedidoQuery(@RequestBody Infopedido Infopedido) {
        impl.EliminarInfopedido(Infopedido.getId_infopedido());
    }
}
