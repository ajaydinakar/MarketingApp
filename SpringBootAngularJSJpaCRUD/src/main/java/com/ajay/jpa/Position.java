package com.ajay.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;




@Entity
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE
	)
	@Column(name="No",nullable=false)
private	long id ;


	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	//@Version
	//private long version;
	@Column(name="recruiter",nullable=false )
	private	String recruiter ;
	
	@Column(name="vendor",nullable=false  )
	private	String vendor;
	@Column(name="vendorComp",nullable=false  )
	private String vendorCompany;
	@Column(name="contact" ,nullable=false )
	private String contact;
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Column(name="client",nullable=false  )
	private String client;
	@Column(name="location" ,nullable=false )
	private String location;
	
	
	
	protected Position() {}
	public Position(String recruiter, String vendor, String vendorCompany,String contact, String client, String location) {
		super();
		//this.id=id;
		this.recruiter = recruiter;
		this.vendor = vendor;
		this.vendorCompany = vendorCompany;
		this.client = client;
		this.contact=contact;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Position [id=" + id + ", recruiter=" + recruiter + ", vendor=" + vendor + ", vendorCompany="
				+ vendorCompany + ", client=" + client + ", location=" + location + "]";
	}
	
	public String getRecruiter() {
		return recruiter;
	}
	public void setRecruiter(String recruiter) {
		this.recruiter = recruiter;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getVendorCompany() {
		return vendorCompany;
	}
	public void setVendorCompany(String vendorCompany) {
		this.vendorCompany = vendorCompany;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
