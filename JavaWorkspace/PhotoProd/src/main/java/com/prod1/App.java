package com.prod1;

import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try
    	{
    		MongoClient mongo = new MongoClient("localhost",27017);
    		DB db = mongo.getDB("site");

			/**** Get collection / table from 'site' ****/
			// if collection doesn't exists, MongoDB will create it for you
			// DBCollection table = db.getCollection("user");
			DBCollection product =db.getCollection("product");
			/** insert query ***/
    		BasicDBObject doc = new BasicDBObject();
    		doc.put("product", "/Users/Ashok/Desktop/_MG_7894.CR2");
    		doc.put("photoId", 000002);
    		product.insert(doc);
    		
    	}
        catch(UnknownHostException e)
    	{
        	e.printStackTrace();
    	}
    	catch(MongoException e)
    	{
    		e.printStackTrace();
    	}
        
    }
}
