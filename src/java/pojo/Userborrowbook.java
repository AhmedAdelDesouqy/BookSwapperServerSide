package pojo;
// Generated May 21, 2016 2:00:13 PM by Hibernate Tools 4.3.1



/**
 * Userborrowbook generated by hbm2java
 */
public class Userborrowbook  implements java.io.Serializable {


     private Integer id;
     private Appuser appuser;
     private Userbook userbook;
     private String dateborrowed;

    public Userborrowbook() {
    }

    public Userborrowbook(Appuser appuser, Userbook userbook, String dateborrowed) {
       this.appuser = appuser;
       this.userbook = userbook;
       this.dateborrowed = dateborrowed;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Appuser getAppuser() {
        return this.appuser;
    }
    
    public void setAppuser(Appuser appuser) {
        this.appuser = appuser;
    }
    public Userbook getUserbook() {
        return this.userbook;
    }
    
    public void setUserbook(Userbook userbook) {
        this.userbook = userbook;
    }
    public String getDateborrowed() {
        return this.dateborrowed;
    }
    
    public void setDateborrowed(String dateborrowed) {
        this.dateborrowed = dateborrowed;
    }




}


