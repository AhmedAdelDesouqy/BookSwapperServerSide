/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import org.hibernate.Query;
import org.hibernate.Session;
import pojo.Appadmin;
import pojo.Appuser;

/**
 *
 * @author Ragaie
 */
public class AppAdminDaos {
       static public boolean insertAppAdmin(Appadmin admin){
         Session session= ConnectionFactory.getAppAdminSession();
         
            session.beginTransaction();
            session.persist(admin);
            session.getTransaction().commit();
            session.close();
        
        
    return true;
    }
    
   static public boolean updateAppAdmin(Appadmin admin){
         Session session= ConnectionFactory.getAppAdminSession();
         
                  session.beginTransaction();
                  session.update(admin);
                  session.getTransaction().commit();
                  session.close();
        
        
    return true;
    }
   static public boolean deleteAppAdmin(Appadmin admin){
         Session session= ConnectionFactory.getAppAdminSession();
                session.beginTransaction();
                Query query = session.createQuery("delete from Books where id= :id");
		query.setInteger("id", admin.getId());
		query.executeUpdate();
                session.getTransaction().commit();
                session.close();
       
        
        
    return true;
    }
    
}
