package com.example.demo.Entity;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    @JsonProperty("id_empleado")
    private int id_empleado;

    @Column(name = "id_ubicacion")
    @JsonProperty("id_ubicacion")
    private Integer id_ubicacion;

    @Column(name = "nombre_empl")
    @JsonProperty("nombre_empl")
    private String nombre_empl;


    @Column(name = "apellido_empl")
    @JsonProperty("apellido_empl")
    private String apellido_empl;

    @Column(name = "fe_nacimiento")
    @JsonProperty("fe_nacimiento")
    private Date fe_nacimiento;

    @Column(name = "direccion")
    @JsonProperty("direccion")
    private String direccion;

    @Column(name = "correo_electronico")
    @JsonProperty("correo_electronico")
    private String correo_electronico;

    @Column(name = "puesto")
    @JsonProperty("puesto")
    private String puesto;

    @Column(name = "fe_contratacion")
    @JsonProperty("fe_contratacion")
    private Date fe_contratacion;

    @Column(name = "salario")
    @JsonProperty("salario")
    private Double salario;

    public Empleado(int id_empleado, Integer id_ubicacion, String nombre_empl, String apellido_empl,
            Date fe_nacimiento, String direccion, String correo_electronico, String puesto, Date fe_contratacion,
            Double salario) {
        this.id_empleado = id_empleado;
        this.id_ubicacion = id_ubicacion;
        this.nombre_empl = nombre_empl;
        this.apellido_empl = apellido_empl;
        this.fe_nacimiento = fe_nacimiento;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.puesto = puesto;
        this.fe_contratacion = fe_contratacion;
        this.salario = salario;
    }

    public Empleado() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Integer getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(Integer id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getNombre_empl() {
        return nombre_empl;
    }

    public void setNombre_empl(String nombre_empl) {
        this.nombre_empl = nombre_empl;
    }

    public String getApellido_empl() {
        return apellido_empl;
    }

    public void setApellido_empl(String apellido_empl) {
        this.apellido_empl = apellido_empl;
    }

    public Date getFe_nacimiento() {
        return fe_nacimiento;
    }

    public void setFe_nacimiento(Date fe_nacimiento) {
        this.fe_nacimiento = fe_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getFe_contratacion() {
        return fe_contratacion;
    }

    public void setFe_contratacion(Date fe_contratacion) {
        this.fe_contratacion = fe_contratacion;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }



}
