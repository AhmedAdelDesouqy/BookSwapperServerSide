/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import com.google.gson.Gson;
import java.awt.Image;
import java.awt.Label;
import java.io.File;
import javax.swing.ImageIcon;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import pojo.Appuser;
import pojo.Books;

/**
 * REST Web Service
 *
 * @author Ragaie
 */
@Path("/generic")
public class GenericResource {

 
    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

 /// example for test     
    /// url is == http://localhost:15980/BookSwapProject/BS/generic/todo/ffffffffff/fffff
    
@GET   
@Path("/todo/{varX}/{varY}")
@Produces(MediaType.APPLICATION_JSON)
public Books whatEverNameYouLike(@PathParam("varX") String varX, @PathParam("varY") String varY) {
        Books todo = new Books();
        todo.setName(varX);
        todo.setAuthorname(varY);
        return todo;
}


 /// example for test     
    /// url is == http://localhost:15980/BookSwapProject/BS/generic/todoj/{'id':null,'name':'ffffffffff','yearrelase':199,'authorname':'dfds'}

@GET   
@Path("/todoj/{varX}")
@Produces(MediaType.APPLICATION_JSON)
public Appuser EverNameYouLike(@PathParam("varX") String varX) throws JSONException {
        Appuser todo = new Appuser();
        todo.setName("helo my for the world");
        todo.setImageurl("hdjsdhjskj2");
        
        JSONObject jObject  = new JSONObject(varX);
        String projecname=(String) jObject.get("name");
        
       System.out.println("data type  ---------------    >  "+ (jObject.get("yearrelase")).getClass()) ;
        
        System.out.print("name is equal --------------------> "+projecname);
        
        
        System.out.println(varX);
        return todo;
}


    
    
    
    
    
    
    
    
    
    
    
 ///////////////////////  end sy hello  //////////////////// ///////////  
    
  /// url is == http://localhost:15980/BookSwapProject/BS/generic/login/{'id':null,'name':'helo my for the world','mail':null,'phone':null,'birthyear':null,'imageurl':'hdjsdhjskj2','password':null,'usermessages':[],'userborrowbooks':[],'userbooks':[]}
    
    @GET
    @Path ("/login/{varX}")
    
    @Produces(MediaType.APPLICATION_JSON)
    
    public Appuser loginMethod(@PathParam("varX") String varX) {
        
        Gson tempGson = new Gson();
         Appuser userlogin1 = tempGson.fromJson( varX, Appuser.class);
         System.out.println(userlogin1);
        
         ///   call your object data
         
      return userlogin1;
    }
    
    
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      /// url is == http://localhost:15980/BookSwapProject/BS/generic/register/{'id':null,'name':'helo my for the world','mail':null,'phone':null,'birthyear':null,'imageurl':'hdjsdhjskj2','password':null,'usermessages':[],'userborrowbooks':[],'userbooks':[]}
    @GET
    @Path ("/register/{varX}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public boolean registerMethod(@PathParam("varX") String varX) {
        //TODO return proper representation object
        /// json that represent user data...............
        
         Gson tempGson = new Gson();
         Appuser userlogin1 = tempGson.fromJson( varX, Appuser.class);
         System.out.println(userlogin1);
        /// insert object in dataBase
         
         ///   call your object data
      return true;
    }
   
    
    
/// url is == http://localhost:15980/BookSwapProject/BS/generic/home
    
    @GET
    @Path ("/home")
    @Produces(MediaType.APPLICATION_JSON)
    
    public String homeMethod() {
        //TODO return proper representation object
        
        Books ddd = new Books();
        
      return "{'id':23,'name':ragaey}";
    }
    
    
    
    
    @GET
    @Path ("/search/{varX}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public String searchMethod(@PathParam("varX") String varX) {
        //TODO return proper representation object
      return "<p>hello world</p>";
    }
    
    
    
    /// url is == http://localhost:15980/BookSwapProject/BS/generic/image
    
    @GET
    @Path ("/image")
    @Produces(MediaType.APPLICATION_JSON)
    
    public JSONObject testImage() throws JSONException {
        //TODO return proper representation object
        
            JSONObject obj = new JSONObject();
            File sgdh= new File("Desert.jpg");
            
           
            
           ImageIcon hhhh = new ImageIcon("Desert.jpg");
           
           obj.put("img", hhhh);
        
      return obj;
    }
    
    
   ////////////////////// change book status///////////////////////////////////////////////////
    @GET
    @Path ("/changeBookStatus")
    @Produces(MediaType.APPLICATION_JSON)
    
    public String changeBookStatusMethod() {
        //TODO return proper representation object
      return "<p>hello world</p>";
    }
    
    @GET
    @Path ("/addBook")
    @Produces(MediaType.APPLICATION_JSON)
    
    public String addBookMethod() {
        //TODO return proper representation object
      return "<p>hello world</p>";
    }
    
    
    
    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
