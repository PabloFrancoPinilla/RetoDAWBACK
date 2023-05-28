package com.example.demo.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Empleado;

import java.sql.Date;
import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface EmpleadoRepo extends CrudRepository<Empleado, Integer>{
      //consultar
      String getEmpleadoQuery = "SELECT * FROM empleado ORDER BY nombre_empl ASC";

      @Query(nativeQuery = true, value = getEmpleadoQuery)
      List<Empleado> getEmpleado();
  
      //buscar
      String getBuscarEmpleadoQuery = "SELECT * FROM empleado WHERE id_empleado = :id";
  
      @Query(nativeQuery = true, value = getBuscarEmpleadoQuery)
      List<Empleado> getEmpleadoPorId(Set<Integer> id);

      //buscar
      String getBuscarEmpleadoCorreoQuery = "SELECT * FROM empleado WHERE correo_electronico = :correo";
  
      @Query(nativeQuery = true, value = getBuscarEmpleadoCorreoQuery)
      List<Empleado> getEmpleadoPorCorreo(Set<String> correo);
  
      //crear
      String crearEmpleadoQuery = "INSERT INTO empleado  (id_ubicacion,nombre_empl,apellido_empl,fe_nacimiento,direccion,correo_electronico, puesto,fe_contratacion,salario,contraseña) VALUES (:id_ubicacion,:nombre_empl,:apellido_empl,:fe_nacimiento,:direccion,:correo_electronico,:puesto,:fe_contratacion,:salario,:contraseña)";
  
      @Modifying
      @Query(nativeQuery = true, value = crearEmpleadoQuery)
      void crearEmpleadoQuery(Integer id_ubicacion,String nombre_empl,String apellido_empl, Date fe_nacimiento,String direccion,String correo_electronico,String puesto,Date fe_contratacion,Double salario,String contraseña);
  
      //modificar
      String modificarEmpleadoNombreQuery = "UPDATE empleado  SET nombre_empl = :nombre_empl WHERE empleado.id_empleado = :id_empleado";
  
      @Modifying
      @Query(nativeQuery = true, value = modificarEmpleadoNombreQuery)
      void modificarEmpleadoNombrePorId(Integer id_empleado, String nombre_empl);

      String modificarEmpleadoApellidoQuery = "UPDATE empleado  SET apellido_empl = :apellido_empl WHERE empleado.id_empleado = :id_empleado";
  
      @Modifying
      @Query(nativeQuery = true, value = modificarEmpleadoApellidoQuery)
      void modificarEmpleadoApellidoPorId(Integer id_empleado, String apellido_empl);
  
      //borrar
      String borrarEmpleadoQuery = "DELETE FROM empleado  WHERE id_empleado = :id_empleado";
  
      @Modifying
      @Query(nativeQuery = true, value = borrarEmpleadoQuery)
      void eliminarEmpleadoPorId(Integer id_empleado);
}
