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




    @Column(name = "id_cliente")
    @JsonProperty("id_cliente")
    private Integer id_cliente;

  
    @Column(name = "metodo_pago")
    @JsonProperty("metodo_pago")
    private String metodo_pago;

   

    public Pedidos(int id_pedido, Integer id_ubiacion, Integer id_cliente, Integer id_empleado,
            String fecha_hora, String tipo_pedido, String metodo_pago, String estado_pedido) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.metodo_pago = metodo_pago;
    }

    public Pedidos() {
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

   
    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

   

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

   

    
}
