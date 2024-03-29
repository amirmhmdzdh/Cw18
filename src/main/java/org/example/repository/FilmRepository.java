package org.example.repository;

import org.example.connection.SessionFactorySingleton;
import org.example.model.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class FilmRepository {
//    StandardServiceRegistry build = new StandardServiceRegistryBuilder()
//            .configure()
//            .build();
//    SessionFactory sessionFactory = new MetadataSources(build)
//            .addAnnotatedClass(Film.class)
//            .buildMetadata()
//            .buildSessionFactory();

    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

//    public void save(Film film){
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(film);
//        transaction.commit();
//        session.close();
//    }

    //    todo : with singleton
    public void save(Film film) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(film);
        transaction.commit();
        session.close();
    }

    public Film findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Film film = session.get(Film.class, id);
        transaction.commit();
        session.close();
        return film;
    }

    public List<Film> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from Film";
        Query<Film> fromFilm = session.createQuery(hql, Film.class);
        List<Film> listOfFilm = fromFilm.list();
        transaction.commit();
        session.close();
        return listOfFilm;
    }

    public void remove(Film film) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(film);
        transaction.commit();
        session.close();
    }

    public void update(Film film) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(film);
        transaction.commit();
        session.close();
    }
}
