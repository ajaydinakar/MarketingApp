package com.ajay.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.jboss.jandex.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@CrossOrigin
@RequestMapping("/")
public class ControllerClass {
	private static final Logger log=(Logger)LoggerFactory.getLogger(ControllerClass.class);
	
	@Autowired
   PositionService service;
	
	//****************************************************************************
		/* Redirect to home                                                       */
	//*********************************************************************************
	@RequestMapping(value="/")
	public String home(Model model)
	{
		
		return "app";
	}
	
	//****************************************************************************
	/* Insert new element                                                        */
	//*****************************************************************************
	
	//For inserting i:e; redirect to a form
	@RequestMapping("/insert")
public String newposition(Model model)
{
 Position posit=new Position();
 model.addAttribute("posit",posit);
return "insert";
}
	
	//for saving 
	@PostMapping(value="/save")
public String newposition(@ModelAttribute("posit") Position posit)
{	
		log.info("object is "+posit);
	service.insertPosition(posit);	
	log.info("object is "+posit);
return "redirect:/showall";
}
	//****************************************************************************
    //                   Edit a position                                  
   //******************************************************************************
	
	@RequestMapping("/edit/{id}")
public String editposition(@PathVariable("id") Long id ,Model model)
{
 Position posit=new Position();
 posit=service.getPosition(id);
 log.info("object in edit method is "+posit.getId());
 model.addAttribute("posit",posit);
return "update";

} 
//	@PutMapping(value="/update")
//public String updateposition(@ModelAttribute("posit") Position posit)
//{		
//	service.updatePosition(posit);;	
//	log.info("object in update method is "+posit.getId());
//return "redirect:/showall";
//}
	//****************************************************************************
    //                   Show all positons position                                  
   //******************************************************************************
	@RequestMapping(value="/showall")
	//@ResponseBody
	public String showAll(Model model)
	{
	
		return "home";
	}
	
	//****************************************************************************
    //                   Show all count position                                  
   //******************************************************************************
	@RequestMapping(value="/showcount")
	public Map<String,Long> showRcCount(Model model)
	{
		List<Position> positions = new ArrayList<Position>();
		
	        service.getAll().iterator().forEachRemaining(positions::add);
	        Map<String,Long> collect = positions.stream().collect(
	        		Collectors.groupingBy(Position::getRecruiter, Collectors.counting()));
	        
	        model.addAttribute("posits",collect);
		return collect;
	}

	//****************************************************************************
	/* Remove  selected position                                                  */
	//*****************************************************************************
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET )
	public String delete(@PathVariable("id") Long id)
	{
		service.removePosition(id);
		return "redirect:/showall";
	}
	//******************************************************************************
	/* Remove all positons */
	//******************************************************************************
	@RequestMapping(value="/clear" )
	public String deleteAll()
	{
		service.clearList();
		return "redirect:/showall";
	}
	
	
	
}
