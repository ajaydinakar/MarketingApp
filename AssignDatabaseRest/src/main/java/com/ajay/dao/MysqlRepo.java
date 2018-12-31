package com.ajay.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ajay.domain.User;
@Repository

public interface MysqlRepo extends JpaRepository<User, Long> {

}


