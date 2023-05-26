package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Repository.InfopedidoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class Infopedidoservice {
    @Autowired
    private InfopedidoRepo InfopedidoRepo;
     //-----------------------------------------Categoria-----------------------------------------\\
     public List<Infopedido> ConsultarInfopedido() {
        List<Infopedido> listaInfopedido = InfopedidoRepo.getInfopedido();
        return listaInfopedido;
    }

    public List<Infopedido> BuscarInfopedido(Set<Integer> id) {
        List<Infopedido> listaInfopedido = InfopedidoRepo.getInfopedidoPorId(id);
        return listaInfopedido;
    }
    
    public void CrearInfopedido(Integer id_producto,Integer id_pedido) {
       InfopedidoRepo.crearInfopedidoQuery(id_producto,id_pedido);
    }

    public void ModificarInfopedidoValor(Integer id, Integer id_producto) {
        InfopedidoRepo.modificarInfopedidoPorId(id, id_producto);
    }

    public void EliminarInfopedido(Integer id) {
       InfopedidoRepo.eliminarInfopedidoPorId(id);
    }
}
