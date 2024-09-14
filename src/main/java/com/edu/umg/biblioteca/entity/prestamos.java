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
@Table(name = "prestamos")
public class prestamos {

    @Id
    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private estudiantes id_estudiante;
    @ManyToOne
    @JoinColumn(name = "id_libro")
    private libros id_libro;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha_prestamo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha_devolucion;
    private String estado;
    private String observaciones;

    public prestamos() {
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public estudiantes getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(estudiantes id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public libros getId_libro() {
        return id_libro;
    }

    public void setId_libro(libros id_libro) {
        this.id_libro = id_libro;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

}
