package com.ajay.controller;
import java.io.File;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ajay.domain.User;
import com.ajay.domain.User2;
import com.ajay.service.DaoServiceImpl;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api")
public class ControllerClass {
	private static final Logger log=(Logger)LoggerFactory.getLogger(ControllerClass.class);
@Autowired	
DaoServiceImpl service;
User user;
	
	
@PostMapping(value="/save",consumes="application/json",produces="application/json")
public	User method1(@RequestBody User user )
{
if (user.getSavetype()==1)
{
service.insertInMysql(user);
log.info("inserted"+user+"into mysql db");
}
else if(user.getSavetype()==2)
{
	User2 user2=new User2();
	user2.setAge(user.getAge());
	user2.setName(user.getName());
	log.info("trying to  insert"+user2+"into mongo  db");
	try {
		service.insertInMongo(user2);
		log.info("inserted"+user2+"into mongodb");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
		log.info("db off");
		
		ObjectMapper om=new ObjectMapper();	
		try {
			User u=om.readValue(new File("A://javaP/jpa/AssignDatabaseRest/src/main/resources/user.json"),User.class);
			log.info("db down user is:"+u+"from a file");
		} catch (JsonParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (JsonMappingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
	}	
}
return user;
}


}


