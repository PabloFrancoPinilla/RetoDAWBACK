package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Repository.UbiLocalRepo;
import com.example.demo.Entity.UbiLocal;


import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface UbiLocalRepo extends CrudRepository<UbiLocal, Integer> {
    //consultar
    String getUbiLocalQuery = "SELECT * FROM ubilocal ORDER BY nombre_loc ASC";

    @Query(nativeQuery = true, value = getUbiLocalQuery)
    List<UbiLocal> getUbiLocal();

    //buscar
    String getBuscarUbiLocalQuery = "SELECT * FROM ubilocal WHERE id_ubicacion = :id";

    @Query(nativeQuery = true, value = getBuscarUbiLocalQuery)
    List<UbiLocal> getUbiLocalPorId(Set<Integer> id);

    //crear
    String crearUbiLocalQuery = "INSERT INTO ubilocal  (nombre_loc,direccion,pais,estado,telefono) VALUES (:nombre_loc,:direccion,:pais,:estado,:telefono)";

    @Modifying
    @Query(nativeQuery = true, value = crearUbiLocalQuery)
    void crearUbiLocal(String nombre_loc,String direccion, String pais, String estado, String telefono);

    //modificar
    String modificarUbiLocalQuery = "UPDATE UbiLocal  SET nombre_loc = :nombre_loc WHERE ubiloc.id_ubicacion = :id_loc";

    @Modifying
    @Query(nativeQuery = true, value = modificarUbiLocalQuery)
    void modificarUbiLocalPorId(Integer id_loc, String nombre_loc);

    //borrar
    String borrarUbiLocalQuery = "DELETE FROM ubilocal  WHERE id_ubicacion = :id_loc";

    @Modifying
    @Query(nativeQuery = true, value = borrarUbiLocalQuery)
    void eliminarUbiLocalPorId(Integer id_loc);
}
