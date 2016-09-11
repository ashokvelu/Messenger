package Mongo;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class App
{
    public static void main( String[] args )
    {
    	try{
        MongoClient mongoclient = new MongoClient("localhost",27017);
        //List mongoclient =(MongoClient) mongoclient.getDatabaseNames();
        
        DB db = mongoclient.getDB("site");
        DBCollection coll=  db.getCollection("product");
        BasicDBObject doc =new BasicDBObject();
        doc.put("product", "/Users/Ashok/Desktop/_MG_7894.CR2");
        doc.put("photoId","000002");
        coll.insert(doc);
        System.out.println("hello");
    	}
    	catch (UnknownHostException e) {
			e.printStackTrace();
    	}
    	catch (MongoException e) {
			e.printStackTrace();
    	}
    }
}
