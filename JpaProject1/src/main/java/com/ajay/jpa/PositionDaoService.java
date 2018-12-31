package com.ajay.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PositionDaoService {
	@PersistenceContext
private EntityManager entitymanager;

public String insertPosition(Position position)
{
	entitymanager.persist(position);
     return position.getClient();
}
}

