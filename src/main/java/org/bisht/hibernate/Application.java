package org.bisht.hibernate;

import org.bisht.model.Address;
import org.bisht.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        UserDetails user = new UserDetails();
//        user.setUserId(105);
        user.setUsername("bisht");
        user.setDate(new Date());

        UserDetails user2 = new UserDetails();
//        user.setUserId(105);
        user2.setUsername("nitin");
        user2.setDate(new Date());
        Address address = new Address();
        newAddress(address);
        user2.setAddress(address);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.save(user2);
        session.getTransaction().commit();
        session.close();
    }

    private static void newAddress(Address address) {
        address.setCity("Roorkee");
        address.setState("UK");
//        address.setPincode("247667");
        address.setStreet("Dhandera");
    }
}
