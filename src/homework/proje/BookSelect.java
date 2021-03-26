package homework.proje;


import homework.proje.Record;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import homework.proje.AccessMongoDB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.bson.Document;


@WebServlet(name = "select", urlPatterns = {"/select"})
public class BookSelect extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        List<Record> list = new ArrayList<>();
        AccesMongoDBBook accessMongoDB = new AccesMongoDBBook();
        FindIterable<Document> result = accessMongoDB.getCollection().find();

        
        MongoCursor<Document> cursor = result.iterator();

        while (cursor.hasNext()) {
            Document document = cursor.next();
            System.out.println(document.get("_id"));
            System.out.println(document.get("baskiSayisi"));
            System.out.println(document.get("sayfaSayisi"));
            System.out.println(document.get("cilttipi"));
            System.out.println(document.get("yazar"));
            System.out.println(document.get("path"));
            System.out.println(document.get("ad"));
            System.out.println(document.get("aciklama"));
            
          


            Record record = new Record();
            record.setId(document.get("_id").toString());
            record.setBaskiSayisi((String) document.get("baskiSayisi"));
            record.setCilttipi((String) document.get("cilttipi"));
            record.setYazar((String) document.get("yazar"));
            record.setSayfaSayisi((String) document.get("sayfaSayisi"));
            record.setAciklama((String) document.get("aciklama"));
            record.setPath((String) document.get("path"));
            record.setAd((String) document.get("ad"));
          

            list.add(record);
        }

        request.setAttribute("records", list);

        
        accessMongoDB.closeMongoClient();
        
        RequestDispatcher view = request.getRequestDispatcher("/booklist.jsp");
        view.forward(request, response);
    }

}
