package dev.jlkeesh.springframeworkcore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        SessionFactory sf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session currentSession = sf.getCurrentSession();
        Book book = new Book();
        book.setTitle("Spring in action");
        book.setAuthor("Place Holder");
        currentSession.getTransaction().begin();
        currentSession.persist(book);
        System.out.println("currentSession.createQuery(\"from Book \", Book.class).getResultList() = " + currentSession.createQuery("from Book ", Book.class).getResultList());

        currentSession.getTransaction().commit();
    }
}