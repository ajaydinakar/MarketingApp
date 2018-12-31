package com.ajay.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="egiantuser")
public class User {
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", savetype=" + savetype + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User( String name, String age) {
		super();
		
		this.name = name;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="sno", nullable=false)
	Long id;
	@Column(name="name",nullable=false)
	String name;
	@Column(name="age",nullable=false)
	String age;
	@Transient
	int savetype;
	
	
	public int getSavetype() {
		return savetype;
	}
	public void setSavetype(int savetype) {
		this.savetype = savetype;
	}
	public void setId(long id) {
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
	
	
}
