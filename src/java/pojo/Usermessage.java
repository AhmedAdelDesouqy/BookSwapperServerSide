package pojo;
// Generated May 21, 2016 2:00:13 PM by Hibernate Tools 4.3.1



/**
 * Usermessage generated by hbm2java
 */
public class Usermessage  implements java.io.Serializable {


     private Integer id;
     private Appuser appuser;
     private String text;
     private String timestimp;

    public Usermessage() {
    }

    public Usermessage(Appuser appuser, String text, String timestimp) {
       this.appuser = appuser;
       this.text = text;
       this.timestimp = timestimp;
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
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    public String getTimestimp() {
        return this.timestimp;
    }
    
    public void setTimestimp(String timestimp) {
        this.timestimp = timestimp;
    }




}


