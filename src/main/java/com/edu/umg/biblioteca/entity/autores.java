/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.biblioteca.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author caste
 */
@Entity
public class autores {
    
    @Id
    private int id;
    private String nombres;
    private String apellidos;
    private String nacionalidad;
    private String alias;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha_nacimiento;
    private String observaciones;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha_registro;

    public autores() {
    }

    public autores(int id, String nombres, String apellidos, String nacionalidad, String alias, Date fecha_nacimiento, String observaciones, Date fecha_registro) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.alias = alias;
        this.fecha_nacimiento = fecha_nacimiento;
        this.observaciones = observaciones;
        this.fecha_registro = fecha_registro;
    }


    
    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
    

    
}
