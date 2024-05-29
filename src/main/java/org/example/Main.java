package org.example;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main{
    public static void main(String[] args){
        Song obj = new Song(1,"A");

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);

        SessionFactory sessionFactory =  configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();

        System.out.println("saved ...");
    }
}