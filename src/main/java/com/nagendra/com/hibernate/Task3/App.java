package com.nagendra.com.hibernate.Task3;

import java.util.HashMap;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;



public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate-cfg.xml");
        System.out.println("Configuration Object Created Successfully");
        SessionFactory sf=cfg.buildSessionFactory();
        System.out.println("Session Factory Object Created");
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        
        Emp e=new Emp();
        e.setId("19");
        e.setName("Paschal Uchubilo");
        
        Map<String, PhoneNumber> mp = new HashMap<String, PhoneNumber>();
        
        PhoneNumber ph1=new PhoneNumber();
        ph1.setPid("20");
        ph1.setNetwork("AIRTEL");
        ph1.setPhonenumber("9900334422");
        PhoneNumber ph2=new PhoneNumber();
        ph2.setPid("21");
        ph2.setNetwork("IDEA");
        ph2.setPhonenumber("9900334433");
        PhoneNumber ph3=new PhoneNumber();
        ph3.setPid("22");
        ph3.setNetwork("JIO");
        ph3.setPhonenumber("9900334455");
        
        mp.put("home", ph1);
        mp.put("work", ph2);
        mp.put("personal", ph3);
        e.setPhoneno(mp);
        s.persist(e);
        tx.commit();
        s.close();
        sf.close();
     }
 }