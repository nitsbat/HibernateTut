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

        user.getAddressLists().add(newAddress1());
        user.getAddressLists().add(newAddress2());

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    private static Address newAddress1() {
        Address address = new Address();
        address.setCity("Roorkee");
        address.setState("UK");
//        address.setPincode("247667");
        address.setStreet("Dhandera");
        return address;
    }

    private static Address newAddress2() {
        Address address = new Address();
        address.setCity("Dehradun");
        address.setState("UKhand");
        address.setPincode("247667");
        address.setStreet("Premnagar");
        return address;
    }
}
