package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.Productoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class Productocontroller {
    @Autowired
    private Productoservice impl;

    // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/producto/consultar")
    public List<Producto> consultarProductoQuery() {
        return impl.ConsultarProducto();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/producto/buscar")
    public List<Producto> buscarProductoQuery(@RequestParam(value = "id") Set<Integer> id) {
        return impl.BuscarProducto(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/producto/crear")
    public void crearProductoQuery(@RequestBody Producto Producto){
        impl.CrearProducto( Producto.getNombre_prod(),Producto.getDescripcion(),Producto.getPrecio(),Producto.getCategoria());

    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/producto/modificar")
    public void modificarCategoriaQuery(@RequestBody Producto Producto) {
        impl.ModificarProductoValor(Producto.getId_producto(), Producto.getNombre_prod());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/producto/eliminar")
    public void eliminarProductoQuery(@RequestBody Producto Producto) {
        impl.EliminarProducto(Producto.getId_producto());
    }
}
