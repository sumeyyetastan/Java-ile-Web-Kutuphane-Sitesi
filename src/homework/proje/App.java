
package homework.proje;

import homework.proje.AccessMongoDB;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@WebServlet(name = "dataInsert", urlPatterns = {"/dataInsert"})
public class App extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String insertMessage = "";
        
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
       
        AccessMongoDB accessMongoDB = new AccessMongoDB();
        
        try {
            accessMongoDB.getCollection().insertOne(
                    new Document()
                    .append("name", name)
                    .append("surname", surname)
                    .append("email", email));

        
          
        } catch (Exception e) {
           
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        RequestDispatcher dispatcher = request.getRequestDispatcher("/dataInsert.jsp");
        dispatcher.forward(request, response);
    }
}
