package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by AlvinChiou on 2014/10/4.
 * com.util.HibernateUtil 是一個全域的 SessionFactory，所有應用程式應該共用一個SessionFactory
 * 此類別設計為Static Initializer，Singleton 只會直行一次，在大型系統環境之中經常被使用
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
        try{
            //根據hibernate.cfg.xml創建SessionFactory
            return new Configuration().configure().buildSessionFactory();
        }catch(Throwable ex){
            //此為記錄例外事件
            System.err.println("Initial SessionFactory creation failed."+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
