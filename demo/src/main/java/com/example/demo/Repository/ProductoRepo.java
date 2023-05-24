package com.example.demo.Repository;

import com.example.demo.Entity.Producto;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductoRepo extends CrudRepository<Producto, Integer> {
    //consultar
    String getProductoQuery = "SELECT * FROM producto ORDER BY nombre_prod ASC";

    @Query(nativeQuery = true, value = getProductoQuery)
    List<Producto> getProductos();

    //buscar
    String getBuscarProductoQuery = "SELECT * FROM producto WHERE id_producto = :id";

    @Query(nativeQuery = true, value = getBuscarProductoQuery)
    List<Producto> getProductoPorId(Set<Integer> id);

    //crear
    String crearProductoQuery = "INSERT INTO producto  (nombre_prod,descripcion,precio,categoria,photo) VALUES (:nombre,:desc,:precio,:categoria,:foto)";

    @Modifying
    @Query(nativeQuery = true, value = crearProductoQuery)
    void crearProducto(String nombre,String desc, Double precio, String categoria, String foto);

    //modificar
    String modificarProductoNombreQuery = "UPDATE producto  SET nombre_prod = :nombre WHERE producto.id_producto = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoNombreQuery)
    void modificarProductoNombrePorId(Integer id, String nombre);

    //borrar
    String borrarProductoQuery = "DELETE FROM producto WHERE id_producto = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarProductoQuery)
    void eliminarProductoPorId(Integer id);
}
