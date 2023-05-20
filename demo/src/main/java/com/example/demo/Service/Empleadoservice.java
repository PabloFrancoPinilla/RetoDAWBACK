package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class Empleadoservice {
    @Autowired
    private EmpleadoRepo EmpleadoRepo;

     //-----------------------------------------Categoria-----------------------------------------\\
     public List<Empleado> ConsultarEmpleado() {
        List<Empleado> listaEmpleado = EmpleadoRepo.getEmpleado();
        return listaEmpleado;
    }

    public List<Empleado> BuscarEmpleado(Set<Integer> id) {
        List<Empleado> listaEmpleado = EmpleadoRepo.getEmpleadoPorId(id);
        return listaEmpleado;
    }
    
    public void CrearEmpleado(Integer id_ubicacion,String nombre_empl,String apellido_empl, Date fe_nacimiento,String direccion,String correo_electronico,String puesto,Date fe_contratacion,Double salario) {
       EmpleadoRepo.crearEmpleadoQuery(id_ubicacion,nombre_empl,apellido_empl,fe_nacimiento,direccion,correo_electronico, puesto,fe_contratacion,salario);
    }

    public void ModificarEmpleadoNombreValor(Integer id, String nombre) {
        EmpleadoRepo.modificarEmpleadoNombrePorId(id, nombre);
    }

    public void ModificarEmpleadoApellidoValor(Integer id, String apellido) {
        EmpleadoRepo.modificarEmpleadoApellidoPorId(id, apellido);
    }

    public void EliminarEmpleado(Integer id) {
        EmpleadoRepo.eliminarEmpleadoPorId(id);
    }
}
