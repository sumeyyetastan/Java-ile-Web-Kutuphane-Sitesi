package homework.proje;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class AccesMongoDBBook {
    MongoClient mongoClient;
    
    public MongoCollection getCollection() {
        mongoClient = new MongoClient();
        MongoDatabase mongoDatabase = mongoClient.getDatabase("Book");
        return mongoDatabase.getCollection("AddBook");
    }
    
    public void closeMongoClient(){
        mongoClient.close();
    }
}
