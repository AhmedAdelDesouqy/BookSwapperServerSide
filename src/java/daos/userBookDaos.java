/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Userbook;
import pojo.Userborrowbook;

/**
 *
 * @author Ragaie
 */
public class userBookDaos {
           
    static public boolean insertUserBookDaos(Userbook userbook ){
         Session session= ConnectionFactory.getuserBookSession();
         
            session.beginTransaction();
            session.persist(userbook );
            session.getTransaction().commit();
            session.close();
        
        
    return true;
    }
    
   static public boolean updateUserBookDaos(Userbook userbook){
         Session session= ConnectionFactory.getuserBookSession();
         
                  session.beginTransaction();
                  session.update(userbook );
                  session.getTransaction().commit();
                  session.close();
        
        
    return true;
    }
   static public boolean deleteUserBookDaos(Userbook userbook ){
         Session session= ConnectionFactory.getuserBookSession();
                session.beginTransaction();
                Query query = session.createQuery("delete from Books where id= :id");
		query.setInteger("id", userbook.getId());
		query.executeUpdate();
                session.getTransaction().commit();
                session.close();
       
        
        
    return true;
    }
   
}
