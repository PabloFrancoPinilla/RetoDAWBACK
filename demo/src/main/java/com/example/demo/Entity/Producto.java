package com.example.demo.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;





    @Entity
    @Table (name = "producto")
    public class Producto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_producto")
        @JsonProperty("id_producto")
        private int id_producto;

        @Column(name = "nombre_prod")
        @JsonProperty("nombre_prod")
        private String nombre_prod;

        @Column(name = "descripcion")
        @JsonProperty("descripcion")
        private String descripcion;


        @Column(name = "precio")
        @JsonProperty("precio")
        private double precio;

        @Column(name = "categoria")
        @JsonProperty("categoria")
        private String categoria;

        public Producto(int id_producto, String nombre_prod, String descripcion, double precio, String categoria) {
            this.id_producto = id_producto;
            this.nombre_prod = nombre_prod;
            this.descripcion = descripcion;
            this.precio = precio;
            this.categoria = categoria;

        }
        public Producto(){

        }
        public int getId_producto() {
            return id_producto;
        }

        public void setId_producto(int id_producto) {
            this.id_producto = id_producto;
        }

        public String getNombre_prod() {
            return nombre_prod;
        }

        public void setNombre_prod(String nombre_prod) {
            this.nombre_prod = nombre_prod;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
        
    }

