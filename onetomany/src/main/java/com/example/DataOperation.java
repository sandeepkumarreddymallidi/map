package com.example;

import java.util.*;
import javax.persistence.TypedQuery;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DataOperation {
    public static void mains(String args[]) {

        SessionFactory factory =Hibernate.getSessionFactory();
        Session session = factory.openSession();

        TypedQuery query = session.createQuery("from Question");
        List list = query.getResultList();
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Question q = (Question)itr.next();
            System.out.println("Question Name: " + q.getQname());
            List list2 = q.getAnswers();
            Iterator itr2 = list2.iterator();
            while (itr2.hasNext()) {
                Answer a = (Answer) itr2.next();
                System.out.println(a.getAnswername() + ":" + a.getPostedBy());
            }
        }
        session.close();
        System.out.println("success");
    }
}