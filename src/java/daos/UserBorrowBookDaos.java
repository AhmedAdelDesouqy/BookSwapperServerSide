/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Userborrowbook;
import pojo.Usermessage;

/**
 *
 * @author Ragaie
 */
public class UserBorrowBookDaos {
        
    static public boolean insertUserBorrowBook(Userborrowbook borrowbook ){
         Session session= ConnectionFactory.getUserBorrowBookSession();
         
            session.beginTransaction();
            session.persist(borrowbook);
            session.getTransaction().commit();
            session.close();
        
        
    return true;
    }
    
   static public boolean updateUserBorrowBook(Userborrowbook borrowbook ){
         Session session= ConnectionFactory.getUserBorrowBookSession();
         
                  session.beginTransaction();
                  session.update(borrowbook);
                  session.getTransaction().commit();
                  session.close();
        
        
    return true;
    }
   static public boolean deleteUserBorrowBook(Userborrowbook borrowbook ){
         Session session= ConnectionFactory.getUserBorrowBookSession();
                session.beginTransaction();
                Query query = session.createQuery("delete from Books where id= :id");
		query.setInteger("id", borrowbook.getId());
		query.executeUpdate();
                session.getTransaction().commit();
                session.close();
       
        
        
    return true;
    }
      
  
}
