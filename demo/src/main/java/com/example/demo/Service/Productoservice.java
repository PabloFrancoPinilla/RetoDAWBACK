package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class Productoservice {
    @Autowired
    private ProductoRepo ProductoRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<Producto> ConsultarProducto() {
        List<Producto> listaProducto = ProductoRepo.getProductos();
        return listaProducto;
    }

    public List<Producto> BuscarProducto(Set<Integer> id) {
        List<Producto> listaProducto = ProductoRepo.getProductoPorId(id);
        return listaProducto;
    }
    
    public void CrearProducto(String nombre,String desc, Double precio, String categoria, String foto) {
        ProductoRepo.crearProducto(nombre,desc,precio,categoria, foto);
    }

    public void ModificarProductoValor(Integer id, String nombre) {
        ProductoRepo.modificarProductoNombrePorId(id, nombre);
    }

    public void EliminarProducto(Integer id) {
        ProductoRepo.eliminarProductoPorId(id);
    }
}
    

