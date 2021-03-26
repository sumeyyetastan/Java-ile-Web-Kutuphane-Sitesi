package homework.proje;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class AccessMongoDB {
    MongoClient mongoClient;
    
    public MongoCollection<Document> getCollection() {
        mongoClient = new MongoClient();
        MongoDatabase mongoDatabase = mongoClient.getDatabase("Proje");
        return mongoDatabase.getCollection("KullaniciKayit");
    }
    
    public void closeMongoClient(){
        mongoClient.close();
    }
}



