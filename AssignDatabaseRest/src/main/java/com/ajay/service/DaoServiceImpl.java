package com.ajay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajay.dao.MongoRepo;
import com.ajay.dao.MysqlRepo;
import com.ajay.domain.User;
import com.ajay.domain.User2;


@Service
public class DaoServiceImpl {
@Autowired
MysqlRepo repo1;
@Autowired
MongoRepo repo2;


	
public User Retrive(long id) {
	// TODO Auto-generated method stub
		
		User u=repo1.findById(id).get();
	        return u;
}


	public void insertInMysql(User u) {
		// TODO Auto-generated method stub
           repo1.save(u);
		
	}


	public void insertInMongo(User2 u) {
		// TODO Auto-generated method stub
           repo2.save(u);
	}

}
