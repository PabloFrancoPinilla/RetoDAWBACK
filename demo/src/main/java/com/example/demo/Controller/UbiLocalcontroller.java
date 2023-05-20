package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.UbiLocalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class UbiLocalcontroller {
    @Autowired
    private UbiLocalservice impl;

    // -----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/ubilocal/consultar")
    public List<UbiLocal> consultarUbiLocalQuery() {
        return impl.ConsultarUbiLocal();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/ubilocal/buscar")
    public List<UbiLocal> buscarUbiLocalQuery(@RequestParam(value = "id") Set<Integer> id) {
        return impl.BuscarUbiLocal(id);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/ubilocal/crear")
    public void crearUbiLocalQuery(@RequestBody UbiLocal UbiLocal){
        impl.CrearUbiLocal( UbiLocal.getNombre_loc(),UbiLocal.getDireccion(),UbiLocal.getPais(),UbiLocal.getEstado(),UbiLocal.getTelefono());

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PutMapping("/ubilocal/modificar")
    public void modificarUbiLocalNombreQuery(@RequestBody UbiLocal UbiLocal) {
        impl.ModificarUbiLocalValor(UbiLocal.getId_ubilocal() ,UbiLocal.getNombre_loc());
    }
    

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/ubilocal/eliminar")
    public void EliminarUbiLocalQuery(@RequestBody UbiLocal UbiLocal) {
        impl.eliminarUbiLocal(UbiLocal.getId_ubilocal());
    }
}