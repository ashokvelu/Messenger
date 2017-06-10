package org.ashkn.restful.messenger.resources;

import java.text.ParseException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ashkn.restful.messenger.Database.MongoClass;
import org.ashkn.restful.messenger.Database.ProdDoc;
import org.ashkn.restful.messenger.Model.Messages;
import org.ashkn.restful.messenger.services.MessageService;
import org.bson.Document;

@Path("/messages")
public class MessageResource {

	MessageService messageServices = new MessageService();
	MongoClass mongo = new MongoClass();
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String writeMessages()
	{
		
		return mongo.insertMany();
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addMessage(ProdDoc doc){
		return mongo.insertOne(doc);
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdDoc> getAllMessages(){
		return mongo.getAllMessages();
	}
}
