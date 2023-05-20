package com.example.demo.Controller;



import com.example.demo.Entity.*;
import com.example.demo.Service.Clienteservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class Clientecontroller {
    @Autowired
    private Clienteservice impl;

    // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/cliente/consultar")
    public List<Cliente> consultarClienteQuery() {
        return impl.ConsultarCliente();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/cliente/buscar")
    public List<Cliente> buscarClienteQuery(@RequestParam(value = "id") Set<Integer> id) {
        return impl.BuscarCliente(id);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/cliente/buscarCorreo")
    public List<Cliente> buscarClienteLoginQuery(@RequestParam(value = "correo") Set<String> correo) {
        return impl.BuscarClientePorCorreo(correo);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/cliente/crear")
    public void crearClienteQuery(@RequestBody Cliente Cliente){
        impl.CrearCliente( Cliente.getNombre_cliente(),Cliente.getApellido_cliente(),Cliente.getCorreo_electronico(),Cliente.getTelefono());

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/cliente/crearLogin")
    public void crearClienteLoginQuery(@RequestBody Cliente Cliente){
        impl.CrearClienteLogin(Cliente.getCorreo_electronico(),Cliente.getContraseña());

    }


    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/cliente/modificar")
    public void modificarClienteNombreQuery(@RequestBody Cliente Cliente) {
        impl.ModificarClienteNombreValor(Cliente.getId_cliente(), Cliente.getNombre_cliente());
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/cliente/modificar/apellido")
    public void modificarClienteApellidoQuery(@RequestBody Cliente Cliente) {
        impl.ModificarClienteApellidoValor(Cliente.getId_cliente(), Cliente.getApellido_cliente());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/cliente/eliminar")
    public void eliminarClienteQuery(@RequestBody Cliente Cliente) {
        impl.EliminarCliente(Cliente.getId_cliente());
    }
}
