/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Appuser;
import pojo.Userbook;

/**
 *
 * @author Ragaie
 */
public class AppUserDaos {
     static public boolean insertAppUser(Appuser user){
         Session session= ConnectionFactory.getAppUserSession();
         
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
            session.close();
        
        
    return true;
    }
    
   static public boolean updateAppUser(Appuser user){
         Session session= ConnectionFactory.getAppUserSession();
         
                  session.beginTransaction();
                  session.update(user);
                  session.getTransaction().commit();
                  session.close();
        
        
    return true;
    }
   static public boolean deleteAppUser(Appuser user){
         Session session= ConnectionFactory.getAppUserSession();
                session.beginTransaction();
                Query query = session.createQuery("delete from Books where id= :id");
		query.setInteger("id", user.getId());
		query.executeUpdate();
                session.getTransaction().commit();
                session.close();
       
        
        
    return true;
    }
   
}
