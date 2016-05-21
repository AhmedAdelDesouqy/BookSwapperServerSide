/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Ragaie
 */
public class ConnectionFactory {
    static Session appAdminSession;
    static Session appUserSession;
    static Session bookSession;
    static Session userBookSession;
    static Session userBorrowBookSession;
    static Session userMessageSession;
    
    
 
    static SessionFactory sessionFactory;
    public ConnectionFactory(){
    
    }
    
        
      //get session factory   
     public static SessionFactory getFactorySession(){
         
         if(sessionFactory == null){
            sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
         }
            return sessionFactory;
        }
        
     
     public static Session getAppAdminSession(){
         if(appAdminSession ==null){
            appAdminSession=ConnectionFactory.getFactorySession().openSession();
         }
       return appAdminSession;
   }
  public static Session getAppUserSession(){
            if(appUserSession ==null){
                appUserSession=ConnectionFactory.getFactorySession().openSession();
            }
       return appUserSession;
   }  
  public static Session getBookSession(){
      if(bookSession == null){
       bookSession=ConnectionFactory.getFactorySession().openSession();
      }
       return bookSession;
   }
  
  //userBookSession
    public static Session getuserBookSession(){
   if(userBookSession ==null){
       userBookSession=ConnectionFactory.getFactorySession().openSession();
   }
       return userBookSession;
   }
     public static Session getUserBorrowBookSession(){
            if(userBookSession == null){
                userBorrowBookSession=ConnectionFactory.getFactorySession().openSession();
            }
       return userBorrowBookSession;
   }
   public static Session getUserMessageSession(){
       if(userMessageSession ==null){
            userMessageSession=ConnectionFactory.getFactorySession().openSession();
       }
       return userMessageSession;
   }  
    
}
