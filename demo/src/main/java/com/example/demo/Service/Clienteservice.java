package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class Clienteservice {
    @Autowired
    private ClienteRepo ClienteRepo;

     //-----------------------------------------Categoria-----------------------------------------\\
     public List<Cliente> ConsultarCliente() {
        List<Cliente> listaCliente = ClienteRepo.getClientes();
        return listaCliente;
    }

    public List<Cliente> BuscarCliente(Set<Integer> id) {
        List<Cliente> listaCliente = ClienteRepo.getClientePorId(id);
        return listaCliente;
    }
    
    public void CrearCliente(String nombre,String apellido, String correo, String telefono) {
       ClienteRepo.crearClienteQuery(nombre,apellido,correo,telefono);
    }

    public void ModificarClienteNombreValor(Integer id, String nombre) {
        ClienteRepo.modificarClienteNombrePorId(id, nombre);
    }

    public void ModificarClienteApellidoValor(Integer id, String apellido) {
        ClienteRepo.modificarClienteApellidoPorId(id, apellido);
    }

    public void EliminarCliente(Integer id) {
        ClienteRepo.eliminarClientePorId(id);
    }
}
