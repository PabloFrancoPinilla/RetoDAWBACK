package com.example.demo.Controller;
import com.example.demo.Entity.*;
import com.example.demo.Service.Empleadoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.Date;

@RestController
@RequestMapping("API")
public class Empleadocontroller {
    @Autowired
    private Empleadoservice impl;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/empleado/consultar")
    public List<Empleado> consultarEmpleadoQuery() {
        return impl.ConsultarEmpleado();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/empleado/buscar")
    public List<Empleado> buscarEmpleadoQuery(@RequestParam(value = "id") Set<Integer> id) {
        return impl.BuscarEmpleado(id);
    }

    
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/empleado/buscarCorreo")
    public List<Empleado> buscarEmpleadoCorreoQuery(@RequestParam(value = "correo") Set<String> correo) {
        return impl.BuscarEmpleadoCorreo(correo);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/empleado/crear")
    public void crearEmpleadoQuery(@RequestBody Empleado Empleado){
        impl.CrearEmpleado( Empleado.getId_ubicacion(),Empleado.getNombre_empl(),Empleado.getApellido_empl(),Empleado.getFe_nacimiento(),Empleado.getDireccion(),Empleado.getCorreo_electronico(),Empleado.getPuesto(),Empleado.getFe_contratacion(),Empleado.getSalario(),Empleado.getContraseña());

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/empleado/modificar")
    public void modificarEmpleadoNombreQuery(@RequestBody Empleado Empleado) {
        impl.ModificarEmpleadoNombreValor(Empleado.getId_empleado(), Empleado.getNombre_empl());
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/empleado/modificar/apellido")
    public void modificarEmpleadoApellidoQuery(@RequestBody Empleado Empleado) {
        impl.ModificarEmpleadoApellidoValor(Empleado.getId_empleado(), Empleado.getApellido_empl());
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/empleado/eliminar")
    public void eliminarEmpleadoQuery(@RequestBody Empleado Empleado) {
        impl.EliminarEmpleado(Empleado.getId_empleado());
    }
}
