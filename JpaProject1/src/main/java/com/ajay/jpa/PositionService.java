package com.ajay.jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {

	@Autowired
	private PositionRepository repo;
	private static final Logger log=(Logger)LoggerFactory.getLogger(PositionService.class);
	
	public void insertPosition(Position p)
	{
	
	repo.save(p);
	log.info("inserted position"+p);
 
	}
	public Optional <Position> getPosition(long id)
	{
       Optional<Position> withidone=repo.findById(id);
		
		log.info(" position with id :1"+withidone);
		return withidone;
	}
	
	public List<Position> getAll()
	{
		List<Position> positionList=repo.findAll();
		return positionList;
	}
	
}
