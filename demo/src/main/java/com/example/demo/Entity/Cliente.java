package com.example.demo.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    @JsonProperty("id_cliente")
    private int id_cliente;

    @Column(name = "nombre_cliente")
    @JsonProperty("nombre_cliente")
    private String nombre_cliente;

    @Column(name = "apellido_cliente")
    @JsonProperty("apellido_cliente")
    private String apellido_cliente;


    @Column(name = "correo_electronico")
    @JsonProperty("correo_electronico")
    private String correo_electronico;

    @Column(name = "telefono")
    @JsonProperty("telefono")
    private String telefono;

    @Column(name = "contraseña")
    @JsonProperty("contraseña")
    private String contraseña;

    public Cliente(int id_cliente, String nombre_cliente, String apellido_cliente, String correo_electronico,
            String telefono, String contraseña) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
        this.contraseña= contraseña;
    }

    public Cliente() {
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
