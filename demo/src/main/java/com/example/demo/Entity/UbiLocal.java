package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;





@Entity
@Table (name = "UbiLocal")
public class UbiLocal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubicacion")
    @JsonProperty("id_ubicacion")
    private int id_ubilocal;

    @Column(name = "nombre_loc")
    @JsonProperty("nombre_loc")
    private String nombre_loc;

    @Column(name = "direccion")
    @JsonProperty("direccion")
    private String direccion;


    @Column(name = "pais")
    @JsonProperty("pais")
    private String pais;

    @Column(name = "estado")
    @JsonProperty("estado")
    private String estado;

    @Column(name = "telefono")
    @JsonProperty("telefono")
    private String telefono;

    public UbiLocal(int id_ubilocal, String nombre_loc, String direccion, String pais, String estado, String telefono) {
        this.id_ubilocal = id_ubilocal;
        this.nombre_loc = nombre_loc;
        this.direccion = direccion;
        this.pais = pais;
        this.estado = estado;
        this.telefono = telefono;
    }

    public UbiLocal() {
    }

    public int getId_ubilocal() {
        return id_ubilocal;
    }

    public void setId_ubilocal(int id_ubilocal) {
        this.id_ubilocal = id_ubilocal;
    }

    public String getNombre_loc() {
        return nombre_loc;
    }

    public void setNombre_loc(String nombre_loc) {
        this.nombre_loc = nombre_loc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
