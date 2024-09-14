/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.bliblioteca.dao;

import com.edu.umg.biblioteca.entity.tipos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 *
 * @author caste
 */
public class TipoDAO {
    private SessionFactory sessionFactory;

    public TipoDAO() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public List<tipos> getAllTipos() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<tipos> tipos = session.createQuery("from tipos", tipos.class).list();

        session.getTransaction().commit();
        session.close();

        return tipos;
    }

    public tipos getTipoById(int id) {
        Session session = sessionFactory.openSession();
        tipos tipo = session.get(tipos.class, id);
        session.close();
        return tipo;
    }

   public void addTipo(tipos tipo) {
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    try {
        session.save(tipo);
        transaction.commit();
    } catch (Exception e) {
        transaction.rollback();
        throw e;
    } finally {
        session.close();
    }
}

}