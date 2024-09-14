/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.biblioteca.entity;

/**
 *
 * @author caste
 */
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tipos {

    @Id
    private int id;
    private String nombre;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fecha_registro;

    public tipos() {
    }

    public tipos(int id, String nombre, Date fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_registro = fecha_registro;
    }

    // getters and setters
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

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

}
