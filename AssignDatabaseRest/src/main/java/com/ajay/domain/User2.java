package com.ajay.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component

public class User2 {
	
	public User2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User2( String name, String age) {
		super();
		
		this.name = name;
		this.age = age;
	}

	@Id
	
	
	String id;
	String name;
	
	String age;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
