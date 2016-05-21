/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Books;

/**
 *
 * @author Ragaie
 */
public class BookDaos {
    
   
    
    static public boolean insertBook(Books book ){
         Session session= ConnectionFactory.getBookSession();
         
            session.beginTransaction();
            session.persist(book);
            session.getTransaction().commit();
            session.close();
        
        
    return true;
    }
    
   static public boolean updateBook(Books book ){
         Session session= ConnectionFactory.getBookSession();
         
                  session.beginTransaction();
                  session.update(book);
                  session.getTransaction().commit();
                  session.close();
        
        
    return true;
    }
   static public boolean deleteBook(Books book ){
         Session session= ConnectionFactory.getBookSession();
                session.beginTransaction();
                Query query = session.createQuery("delete from Books where id= :id");
		query.setInteger("id", book.getId());
		query.executeUpdate();
                session.getTransaction().commit();
                session.close();
       
        
        
    return true;
    }
      
    
}
