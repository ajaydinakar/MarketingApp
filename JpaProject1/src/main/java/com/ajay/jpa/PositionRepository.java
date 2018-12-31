package com.ajay.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;
@Repository
public interface PositionRepository extends JpaRepository<Position, Long>

{

}
