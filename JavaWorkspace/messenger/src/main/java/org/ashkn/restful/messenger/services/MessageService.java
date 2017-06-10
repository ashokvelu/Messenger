package org.ashkn.restful.messenger.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ashkn.restful.messenger.Model.Messages;


public class MessageService {

	
	public List<Messages> getAllMessages() throws ParseException{
		
		SimpleDateFormat fmt= new SimpleDateFormat("yyyy-mm-dd");
		Date date = fmt.parse("2016-11-11");
		Messages m1 = new Messages(11,"Hi Anna",date  , "Ashok");
		Messages m2 = new Messages(11,"Hello Ashok", date, "Anand");
		
		List<Messages> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
		
	}
}
