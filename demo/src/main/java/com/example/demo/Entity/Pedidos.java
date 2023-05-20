package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "Pedidos")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    @JsonProperty("id_pedido")
    private int id_pedido;

    @Column(name = "id_producto")
    @JsonProperty("id_producto")
    private Integer id_producto;

    @Column(name = "id_ubicacion")
    @JsonProperty("id_ubicacion")
    private Integer id_ubiacion;


    @Column(name = "id_cliente")
    @JsonProperty("id_cliente")
    private Integer id_cliente;

    @Column(name = "id_empleado")
    @JsonProperty("id_empleado")
    private Integer id_empleado;

    @Column(name = "fecha_hora")
    @JsonProperty("fecha_hora")
    private String fecha_hora;

    @Column(name = "tipo_pedido")
    @JsonProperty("tipo_pedido")
    private String tipo_pedido;

    @Column(name = "metodo_pago")
    @JsonProperty("metodo_pago")
    private String metodo_pago;

    @Column(name = "estado_pedido")
    @JsonProperty("estado_pedido")
    private String estado_pedido;

    public Pedidos(int id_pedido, Integer id_producto, Integer id_ubiacion, Integer id_cliente, Integer id_empleado,
            String fecha_hora, String tipo_pedido, String metodo_pago, String estado_pedido) {
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.id_ubiacion = id_ubiacion;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.fecha_hora = fecha_hora;
        this.tipo_pedido = tipo_pedido;
        this.metodo_pago = metodo_pago;
        this.estado_pedido = estado_pedido;
    }

    public Pedidos() {
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getId_ubiacion() {
        return id_ubiacion;
    }

    public void setId_ubiacion(Integer id_ubiacion) {
        this.id_ubiacion = id_ubiacion;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getTipo_pedido() {
        return tipo_pedido;
    }

    public void setTipo_pedido(String tipo_pedido) {
        this.tipo_pedido = tipo_pedido;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    
}
