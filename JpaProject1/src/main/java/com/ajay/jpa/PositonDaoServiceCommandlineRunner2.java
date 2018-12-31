package com.ajay.jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class PositonDaoServiceCommandlineRunner2 implements CommandLineRunner{
	private static final Logger log=(Logger)LoggerFactory.getLogger(PositonDaoServiceCommandlineRunner2.class);
	@Autowired
	private PositionRepository positionrepo;
	@Override
	public void run(String... args) throws Exception 
	
	{
		// TODO Auto-generated method stub
		Position position2=new Position("madhu","lalitha","pyramid","hcl","texas");
		positionrepo.save(position2);
		log.info("new position"+position2);
		
		Optional<Position> withidone=positionrepo.findById(1L);
		
		log.info(" position with id :1"+withidone);
		
		List<Position> positionList=positionrepo.findAll();
		for(Position p :positionList)
			log.info("position:"+p);
		
	}
}
