/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.bliblioteca.dao;

import com.edu.umg.biblioteca.entity.libros;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 *
 * @author caste
 */
public class LibroDAO {

    private SessionFactory sessionFactory;

    public LibroDAO() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public List<libros> getAllLibros() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<libros> libros = session.createQuery("from libros", libros.class).list();

        session.getTransaction().commit();
        session.close();

        return libros;
    }

    public libros getLibroById(int id) {
        Session session = sessionFactory.openSession();
        libros libro = session.get(libros.class, id);
        session.close();
        return libro;
    }

    public void addLibro(libros libro) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(libro);
        transaction.commit();
        session.close();
    }

}
