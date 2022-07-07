package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.Query;

public class Main {
    //public static void mains(String args) {

        SessionFactory factory=Hibernate.getSessionFactory();
        Session session=factory.openSession();

        Transaction t=session.beginTransaction();

        Answer ans1=new Answer();
        ans1.setAnswername("Java is a object oriented programming language");
        ans1.setPostedBy("sandeep");
        ArrayList<Answer> list1=new ArrayList<Answer>();
        list1.add(ans1);
        Question question1=new Question();
        String str="What is Java?";
        Query query=session.createQuery("from Question");
        List<Question> li=query.getResultList();
        Iterator<Question> it=li.iterator();
        while(it.hasNext())
        {
            Question que=(Question)it.next();
            if(str.equals(que.getAnswers())){

            }
        }
        question1.setQname(str);
        question1.setAnswers(list1);

        //Answer ans2=new Answer();
       // ans2.setAnswername("Java is a platform");
       // ans2.setPostedBy("Sudhir Kumar");

       // Answer ans3=new Answer();
        //ans3.setAnswername("Servlets are the Java programs that run on the Java-enabled web server ");
        //ans3.setPostedBy("sai");

        //Answer ans4=new Answer();
        //ans4.setAnswername("Servlet is an API");
        //ans4.setPostedBy("Arun");


       // list1.add(ans2);

       //ArrayList<Answer> list2=new ArrayList<Answer>();
        //list2.add(ans3);
        //list2.add(ans4);



        //Question question2=new Question();
      //question2.setQname("What is Servlet?");
        //question2.setAnswers(list2);

        session.persist(question1);
        session.persist(question2);

        t.commit();
        session.close();
        System.out.println("success");
    }
}

