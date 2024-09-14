/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.bliblioteca.dao;

import com.edu.umg.biblioteca.entity.autores;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author caste
 */
// AutorService.java
public class AutorDAO {

    private SessionFactory sessionFactory;

    public AutorDAO() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public List<autores> getAllAutores() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<autores> autores;
        autores = session.createQuery("from autores", autores.class).list();

        session.getTransaction().commit();
        session.close();

        return autores;
    }

    public autores getAutorById(int id) {
        Session session = sessionFactory.openSession();
        autores autor = session.get(autores.class, id);
        session.close();
        return autor;
    }

    public void addAutor(autores autor) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(autor);
        transaction.commit();
        session.close();
    }

}
