/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.biblioteca.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author caste
 */
@Entity
public class libros {

    @Id
    private int id;
    private String nombre;
    private int numero_paginas;
    private String isbn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha_publicacion;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha_ingreso;
    private String observaciones;
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private autores id_autor;
    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private tipos id_tipo;

    // getters and setters
    public libros() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public Date getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(Date fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public autores getId_autor() {
        return id_autor;
    }

    public void setId_autor(autores id_autor) {
        this.id_autor = id_autor;
    }

    public tipos getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(tipos id_tipo) {
        this.id_tipo = id_tipo;
    }

}
