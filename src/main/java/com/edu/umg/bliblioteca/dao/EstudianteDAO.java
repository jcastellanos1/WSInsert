/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.bliblioteca.dao;

import com.edu.umg.biblioteca.entity.estudiantes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EstudianteDAO {
    private SessionFactory sessionFactory;

    public EstudianteDAO() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public List<estudiantes> getAllEstudiantes() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<estudiantes> estudiantes = session.createQuery("from estudiantes", estudiantes.class).list();

        session.getTransaction().commit();
        session.close();

        return estudiantes;
    }

 public estudiantes getEstudianteById(int id) {
    Session session = sessionFactory.openSession();
    estudiantes estudiante = session.get(estudiantes.class, id);
    session.close();
    return estudiante;
}


    public void addEstudiante(estudiantes estudiante) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(estudiante);
        transaction.commit();
        session.close();
    }


}