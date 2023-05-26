package com.example.demo.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "Infopedido")
public class Infopedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_infopedido")
    @JsonProperty("id_infopedido")
    private int id_infopedido;

    @Column(name = "id_producto")
    @JsonProperty("id_producto")
    private Integer id_producto;

    @Column(name = "id_pedido")
    @JsonProperty("id_pedido")
    private Integer id_pedido;



   

    public Infopedido(int id_infopedido, Integer id_producto, Integer id_ubiacion) {
        this.id_infopedido = id_infopedido;
        this.id_producto = id_producto;
        this.id_pedido = id_pedido;
    }

    public Infopedido() {
    }

    public int getId_infopedido() {
        return id_infopedido;
    }

    public void setId_infopedido(int id_infopedido) {
        this.id_infopedido = id_infopedido;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }




    
}
