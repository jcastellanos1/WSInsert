/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.bliblioteca.dao;

import com.edu.umg.biblioteca.entity.prestamos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
/**
 *
 * @author caste
 */
public class PrestamoDAO {
    private SessionFactory sessionFactory;

    public PrestamoDAO() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public List<prestamos> getAllPrestamos() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<prestamos> prestamos = session.createQuery("from prestamos", prestamos.class).list();

        session.getTransaction().commit();
        session.close();

        return prestamos;
    }

public prestamos getPrestamoById(int id) {
    Session session = sessionFactory.openSession();
    prestamos prestamo = session.get(prestamos.class, id);
    session.close();
    return prestamo;
}
    public void addPrestamo(prestamos prestamo) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(prestamo);
        transaction.commit();
        session.close();
    }

}