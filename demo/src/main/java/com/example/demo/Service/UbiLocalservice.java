package com.example.demo.Service;


import com.example.demo.Entity.*;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UbiLocalservice {
    @Autowired
    private UbiLocalRepo UbiLocalRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<UbiLocal> ConsultarUbiLocal() {
        List<UbiLocal> listaUbiLocal = UbiLocalRepo.getUbiLocal();
        return listaUbiLocal;
    }

    public List<UbiLocal> BuscarUbiLocal(Set<Integer> id) {
        List<UbiLocal> listaUbiLocal = UbiLocalRepo.getUbiLocalPorId(id);
        return listaUbiLocal;
    }
    
    public void CrearUbiLocal(String nombre_loc,String direccion, String pais, String estado, String telefono) {
        UbiLocalRepo.crearUbiLocal(nombre_loc,direccion,pais,estado,telefono);
    }

    public void ModificarUbiLocalValor(Integer id, String nombre_loc) {
        UbiLocalRepo.modificarUbiLocalPorId(id, nombre_loc);
    }

    public void eliminarUbiLocal(Integer id) {
        UbiLocalRepo.eliminarUbiLocalPorId(id);
    }
}
