/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Books;
import pojo.Usermessage;

/**
 *
 * @author Ragaie
 */
public class UserMessageDaos {
    
    static public boolean insertUserMessage(Usermessage usermessage ){
         Session session= ConnectionFactory.getUserMessageSession();
         
            session.beginTransaction();
            session.persist(usermessage);
            session.getTransaction().commit();
            session.close();
        
        
    return true;
    }
    
   static public boolean updateUserMessage(Usermessage usermessage ){
         Session session= ConnectionFactory.getBookSession();
         
                  session.beginTransaction();
                  session.update(usermessage);
                  session.getTransaction().commit();
                  session.close();
        
        
    return true;
    }
   static public boolean deleteUserMessage(Usermessage usermessage ){
         Session session= ConnectionFactory.getBookSession();
                session.beginTransaction();
                Query query = session.createQuery("delete from Books where id= :id");
		query.setInteger("id", usermessage.getId());
		query.executeUpdate();
                session.getTransaction().commit();
                session.close();
       
        
        
    return true;
    }
      
  
    
    
}
