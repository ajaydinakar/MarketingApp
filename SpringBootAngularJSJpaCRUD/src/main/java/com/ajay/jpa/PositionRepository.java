package com.ajay.jpa;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.data.repository.CrudRepository;
@Repository
@RepositoryRestResource(collectionResourceRel = "posits", path = "posits")
public interface PositionRepository extends JpaRepository<Position, Long>

{
	
}
