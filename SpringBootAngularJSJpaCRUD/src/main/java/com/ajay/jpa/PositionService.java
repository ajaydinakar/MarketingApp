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
	@Autowired
	private PositionDaoService positiondao;
	private static final Logger log=(Logger)LoggerFactory.getLogger(PositionService.class);
	
	public void insertPosition(Position p)
	{
	
	repo.save(p);
	log.info("inserted position"+p);
	}
	
	public  Position getPosition(long id)
	{
       Optional<Position> positOpt=repo.findById(id);
		Position posit=positOpt.get();
		return posit;
	}
	public void removePosition(long id)
	{
       repo.deleteById(id);
				
	}
	
	public void clearList()
	{
       repo.deleteAll();
				
	}
	public List<Position> getAll()
	{
		List<Position> positionList=repo.findAll();
		return positionList;
	}
	
}
