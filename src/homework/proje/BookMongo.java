package homework.proje;

import homework.proje.AccesMongoDBBook;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.bson.Document;

@WebServlet(name = "InsertBook", urlPatterns = {"/InsertBook"})
public class BookMongo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String insertMessage = "";
        
        String baskiSayisi = request.getParameter("baskiSayisi");
        String sayfaSayisi = request.getParameter("sayfaSayisi");
        String cilttipi = request.getParameter("cilttipi");
        String yazar = request.getParameter("yazar");
  
        String path = request.getParameter("path");
        String ad = request.getParameter("ad");
        
        String aciklama = request.getParameter("aciklama");
        AccesMongoDBBook accessMongoDB = new AccesMongoDBBook();

        try {
            accessMongoDB.getCollection().insertOne(
                    new Document()
                    .append("baskiSayisi", baskiSayisi)
                    .append("sayfaSayisi", sayfaSayisi)
                    .append("cilttipi", cilttipi)
                    .append("yazar", yazar)
                  
                    .append("path", path)
                    .append("ad", ad)
                    .append("aciklama", aciklama));
                    
                     
          
        } catch (Exception e) {
        	
           
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/blog.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        RequestDispatcher dispatcher = request.getRequestDispatcher("/InsertBook.jsp");
        dispatcher.forward(request, response);
    }
}
