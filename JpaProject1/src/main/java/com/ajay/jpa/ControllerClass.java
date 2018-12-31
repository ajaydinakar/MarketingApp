package com.ajay.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class ControllerClass {
	private static final Logger log=(Logger)LoggerFactory.getLogger(ControllerClass.class);
	
	@Autowired
   PositionService service;
	
	@RequestMapping("/insert")
	@ResponseBody
public String newposition()
{
		Position p=new Position("pavan","madhulika","softniceinc","cts","newjersey");
	service.insertPosition(p);
	
	log.info("object is "+p);
return "inserted";
}
	@RequestMapping(value="/showall")
	@ResponseBody
	
	public List<Position> showAll()
	{
		
		return service.getAll();
	}
}
