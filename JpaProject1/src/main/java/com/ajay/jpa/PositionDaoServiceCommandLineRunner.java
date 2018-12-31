package com.ajay.jpa;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class PositionDaoServiceCommandLineRunner implements CommandLineRunner{

	
	private static final Logger log=(Logger)LoggerFactory.getLogger(PositionDaoServiceCommandLineRunner.class);
	@Autowired
	private PositionDaoService positiondao;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Position position=new Position("sagar","sai","cynosure","tcs","michigan");
	positiondao.insertPosition(position);
		log.info("new position"+position);
		
	}

	
	
}
